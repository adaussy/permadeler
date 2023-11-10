/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.model.utils;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.google.common.collect.Sets;

import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.util.PermadelerResourceFactoryImpl;

/**
 * Util method regarding ecore
 * 
 * @author Arthur Daussy
 */
public final class EMFUtils {

	private EMFUtils() {
	}

	/**
	 * Builds a resource set that can be used in standalone mode to manipulate {@link BlocksFitPackage}
	 * elements
	 * 
	 * @return a new {@link ResourceSet}
	 */
	public static ResourceSet buildStandaloneResourceSet() {
		ResourceSet rs = new ResourceSetImpl();

		rs.getLoadOptions().put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.FALSE);

		PermadelerPackage einstance = PermadelerPackage.eINSTANCE;
		einstance.setEFactoryInstance(PermadelerFactory.eINSTANCE);
		rs.getPackageRegistry().put(PermadelerPackage.eINSTANCE.getNsURI(), einstance);
		PermadelerResourceFactoryImpl resourceFactory = new PermadelerResourceFactoryImpl();
		rs.getResourceFactoryRegistry().getContentTypeToFactoryMap().put(PermadelerPackage.eCONTENT_TYPE,
				resourceFactory);
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(PermadelerPackage.eNS_PREFIX.toLowerCase(), resourceFactory);

		return rs;
	}

	public static <T extends EObject> List<T> getInverse(EObject source, Class<T> expectedType,
			EReference ref, ECrossReferenceAdapter crossref) {
		return crossref.getInverseReferences(source, ref, true).stream()
				.filter(s -> expectedType.isInstance(s.getEObject()))
				.map(s -> expectedType.cast(s.getEObject())).toList();
	}

	public static ECrossReferenceAdapter getCrossReference(EObject source) {
		ECrossReferenceAdapter crossRef = getCrossRef(source);
		if (crossRef == null) {
			Resource eResource = source.eResource();
			crossRef = getCrossRef(eResource);
			if (crossRef == null) {
				crossRef = getCrossRef(eResource.getResourceSet());
			}
		}
		return crossRef;

	}

	private static ECrossReferenceAdapter getCrossRef(Notifier source) {
		return source.eAdapters().stream().filter(e -> e instanceof ECrossReferenceAdapter)
				.map(e -> (ECrossReferenceAdapter)e).findFirst().orElse(null);
	}

	/**
	 * Gets a stream composed from the object itself and all its content.
	 *
	 * @param r
	 *            a resource
	 * @return a stream
	 */
	public static Stream<Notifier> eAllContentSteamWithSelf(Resource r) {
		if (r == null) {
			return Stream.empty();
		}
		return Stream.concat(Stream.of(r), StreamSupport
				.stream(Spliterators.spliteratorUnknownSize(r.getAllContents(), Spliterator.NONNULL), false));
	}

	/**
	 * Gets a stream composed from the object itself and all its content.
	 *
	 * @param rs
	 *            a resource set
	 * @return a stream
	 */
	public static Stream<Notifier> eAllContentSteamWithSelf(ResourceSet rs) {
		if (rs == null) {
			return Stream.empty();
		}
		return Stream.concat(Stream.of(rs), StreamSupport.stream(
				Spliterators.spliteratorUnknownSize(rs.getAllContents(), Spliterator.NONNULL), false));
	}

	/**
	 * Gets all objects contained in the given notifier with the given type.
	 * <p>
	 * <i>If self if of the expected type then it belong to the returned stream </i>
	 * </p>
	 *
	 * @param self
	 *            a {@link Notifier} (EObject, Resource or ResourceSet)
	 * @param type
	 *            the type of the element in the returned stream
	 * @return a stream
	 * @param <T>
	 *            type of element in the returned stream
	 */
	public static <T extends EObject> Stream<T> allContainedObjectOfType(Notifier self, Class<T> type) {
		final Stream<T> result;
		if (self instanceof EObject) {
			result = eAllContentStreamWithSelf((EObject)self).filter(e -> type.isInstance(e))
					.map(e -> type.cast(e));
		} else if (self instanceof Resource) {
			result = eAllContentSteamWithSelf((Resource)self).filter(e -> type.isInstance(e))
					.map(e -> type.cast(e));
		} else if (self instanceof ResourceSet) {
			result = eAllContentSteamWithSelf((ResourceSet)self).filter(e -> type.isInstance(e))
					.map(e -> type.cast(e));
		} else {
			result = Stream.empty();
		}
		return result;
	}

	/**
	 * Gets the ancestor of given type starting from a specific element.
	 *
	 * @param object
	 *            an {@link EObject}
	 * @param type
	 *            expected type
	 * @param <T>
	 *            expected type
	 * @return a expected typed ancestor or <code>null</code>;
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T getAncestor(Class<T> type, EObject object) {
		if (object == null) {
			return null;
		}
		final T result;
		if (type.isInstance(object)) {
			result = (T)object;
		} else {
			result = getAncestor(type, object.eContainer());
		}
		return result;
	}

	/**
	 * Gets the first ancestor from the given object which match the predicated and has the expected type.
	 * 
	 * @param <T>
	 *            the expected type
	 * @param type
	 *            the expected type
	 * @param object
	 *            the source object
	 * @param ancestorPredicate
	 *            an optional {@link Predicate}
	 * @return an ancestor or <code>null</code>
	 */
	@SuppressWarnings("unchecked")
	public static <T extends EObject> List<T> getAncestors(Class<T> type, EObject object,
			Predicate<EObject> ancestorPredicate) {
		var current = object;
		List<T> results = new ArrayList<>();
		while (current != null) {
			if (type.isInstance(current) && (ancestorPredicate == null || ancestorPredicate.test(current))) {
				results.add((T)current);
			}
			current = current.eContainer();
		}
		return results;
	}

	/**
	 * Gets the first ancestor from the given object which match the predicated and has the expected type.
	 * 
	 * @param <T>
	 *            the expected type
	 * @param type
	 *            the expected type
	 * @param object
	 *            the source object
	 * @return an ancestor or <code>null</code>
	 */
	public static <T extends EObject> List<T> getAncestors(Class<T> type, EObject object) {
		return getAncestors(type, object, null);
	}

	/**
	 * Gets a stream composed from the object itself and all its content
	 * 
	 * @param o
	 *            an {@link EObject}
	 * @return a stream
	 */
	public static Stream<EObject> eAllContentStreamWithSelf(EObject o) {
		if (o == null) {
			return Stream.empty();
		}
		return Stream.concat(Stream.of(o), StreamSupport
				.stream(Spliterators.spliteratorUnknownSize(o.eAllContents(), Spliterator.NONNULL), false));
	}

	/**
	 * Gets a stream composed from the object itself and all its content
	 * 
	 * @param r
	 *            a resource
	 * @return a stream
	 */
	public static Stream<Notifier> eAllContentStreamWithSelf(Resource r) {
		if (r == null) {
			return Stream.empty();
		}
		return Stream.concat(Stream.of(r), StreamSupport
				.stream(Spliterators.spliteratorUnknownSize(r.getAllContents(), Spliterator.NONNULL), false));
	}

	/**
	 * Gets a stream composed from the object itself and all its content
	 * 
	 * @param rs
	 *            a resource set
	 * @return a stream
	 */
	public static Stream<Notifier> eAllContentStreamWithSelf(ResourceSet rs) {
		if (rs == null) {
			return Stream.empty();
		}
		return Stream.concat(Stream.of(rs), StreamSupport.stream(
				Spliterators.spliteratorUnknownSize(rs.getAllContents(), Spliterator.NONNULL), false));
	}

	/**
	 * Gets all object contained in the given notifier with the given type
	 * <p>
	 * <i>If self if of the expected type then it belong to the returned stream </i>
	 * </p>
	 * 
	 * @param parent
	 *            a {@link Notifier} (EObject, Resource or ResourceSet)
	 * @param childType
	 *            the type of the element in the returned stream
	 * @return a stream
	 * @param <T>
	 *            type of element in the returned stream
	 */
	public static <T extends EObject> Stream<T> getChildren(Notifier parent, Class<T> childType) {
		if (parent instanceof EObject) {
			return eAllContentStreamWithSelf((EObject)parent).filter(e -> childType.isInstance(e))
					.map(e -> childType.cast(e));

		} else if (parent instanceof Resource) {
			return eAllContentStreamWithSelf((Resource)parent).filter(e -> childType.isInstance(e))
					.map(e -> childType.cast(e));

		} else if (parent instanceof ResourceSet) {
			return eAllContentStreamWithSelf((ResourceSet)parent).filter(e -> childType.isInstance(e))
					.map(e -> childType.cast(e));
		} else {
			return Stream.empty();
		}
	}

	/**
	 * Gets an ordered list of all common EClass for the given EObject (best effort for getting first the most
	 * specialized EClass)
	 * 
	 * @param objects
	 *            a list of {@link EObject}
	 * @return the list of {@link EClass}
	 */
	public static List<EClass> getCommonEClasses(List<EObject> objects) {
		if (objects == null || objects.isEmpty()) {
			return Collections.emptyList();
		}
		List<EClass> common = objects.stream()//
				.<Set<EClass>> map(m -> selfAndSuperClass(m.eClass()).collect(toSet()))//
				.reduce((a, b) -> {
					return Sets.intersection(a, b);
				})
				.<List<EClass>> map(s -> s.stream()
						.sorted(Comparator.<EClass> comparingInt(eClass -> eClass.getEAllSuperTypes().size())
								.reversed()
								.thenComparing(Comparator.<EClass, String> comparing(EClass::getName)))
						.collect(toList()))
				.orElse(Collections.emptyList());

		common.add(EcorePackage.eINSTANCE.getEObject());

		return common;
	}

	/**
	 * Return a stream containing first self then all super types
	 * 
	 * @param self
	 *            an {@link EClass}
	 * @return all super classes + self
	 */
	public static Stream<EClass> selfAndSuperClass(EClass self) {

		if (self == null) {
			return Stream.empty();
		} else {
			EList<EClass> ancestors = self.getEAllSuperTypes();
			if (ancestors.isEmpty()) {
				return Stream.of(self);
			} else {
				return Stream.concat(Stream.of(self), ancestors.stream());
			}
		}
	}

	public static <T extends Adapter> Optional<T> getAdapter(Notifier notifier, Class<T> type) {
		return notifier.eAdapters().stream().filter(type::isInstance).map(type::cast).findFirst();
	}

}
