/**
 *  Copyright (c) 2020 Arthur Daussy.
 * 
 *  This program and the accompanying materials are made 
 *  available under the terms of the Eclipse Public License 2.0 
 *  which is available at https://www.eclipse.org/legal/epl-2.0/ 
 *  Contributors:
 *  Arthur Daussy - initial API and implementation.
 * 
 */
package fr.adaussy.permadeler.model.Permadeler.util;

import fr.adaussy.permadeler.model.Permadeler.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage
 * @generated
 */
public class PermadelerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PermadelerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermadelerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PermadelerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermadelerSwitch<Adapter> modelSwitch = new PermadelerSwitch<Adapter>() {
		@Override
		public Adapter caseRoot(Root object) {
			return createRootAdapter();
		}

		@Override
		public Adapter caseKnowledgeBase(KnowledgeBase object) {
			return createKnowledgeBaseAdapter();
		}

		@Override
		public Adapter caseSeedBank(SeedBank object) {
			return createSeedBankAdapter();
		}

		@Override
		public Adapter caseSeedItem(SeedItem object) {
			return createSeedItemAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter casePlantation(Plantation object) {
			return createPlantationAdapter();
		}

		@Override
		public Adapter caseImage(Image object) {
			return createImageAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseZone(Zone object) {
			return createZoneAdapter();
		}

		@Override
		public Adapter caseNursary(Nursary object) {
			return createNursaryAdapter();
		}

		@Override
		public Adapter caseTray(Tray object) {
			return createTrayAdapter();
		}

		@Override
		public Adapter caseRow(Row object) {
			return createRowAdapter();
		}

		@Override
		public Adapter caseCell(Cell object) {
			return createCellAdapter();
		}

		@Override
		public Adapter caseTrayZone(TrayZone object) {
			return createTrayZoneAdapter();
		}

		@Override
		public Adapter caseTrayOwner(TrayOwner object) {
			return createTrayOwnerAdapter();
		}

		@Override
		public Adapter caseGridBedRow(GridBedRow object) {
			return createGridBedRowAdapter();
		}

		@Override
		public Adapter caseGridBedCell(GridBedCell object) {
			return createGridBedCellAdapter();
		}

		@Override
		public Adapter casePlanfication(Planfication object) {
			return createPlanficationAdapter();
		}

		@Override
		public Adapter casePlanifier(Planifier object) {
			return createPlanifierAdapter();
		}

		@Override
		public Adapter caseSowPlanfication(SowPlanfication object) {
			return createSowPlanficationAdapter();
		}

		@Override
		public Adapter caseBackgroundImage(BackgroundImage object) {
			return createBackgroundImageAdapter();
		}

		@Override
		public Adapter casePlant(Plant object) {
			return createPlantAdapter();
		}

		@Override
		public Adapter caseProduction(Production object) {
			return createProductionAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseTemporalItem(TemporalItem object) {
			return createTemporalItemAdapter();
		}

		@Override
		public Adapter casePlantationPhase(PlantationPhase object) {
			return createPlantationPhaseAdapter();
		}

		@Override
		public Adapter caseReferencingElement(ReferencingElement object) {
			return createReferencingElementAdapter();
		}

		@Override
		public Adapter caseImageOwner(ImageOwner object) {
			return createImageOwnerAdapter();
		}

		@Override
		public Adapter caseSpecies(Species object) {
			return createSpeciesAdapter();
		}

		@Override
		public Adapter caseVariety(Variety object) {
			return createVarietyAdapter();
		}

		@Override
		public Adapter casePlantGroup(PlantGroup object) {
			return createPlantGroupAdapter();
		}

		@Override
		public Adapter caseIPlantGroup(IPlantGroup object) {
			return createIPlantGroupAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Root
	 * @generated
	 */
	public Adapter createRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.KnowledgeBase <em>Knowledge Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.KnowledgeBase
	 * @generated
	 */
	public Adapter createKnowledgeBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.SeedBank <em>Seed Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.SeedBank
	 * @generated
	 */
	public Adapter createSeedBankAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.SeedItem <em>Seed Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.SeedItem
	 * @generated
	 */
	public Adapter createSeedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Plantation <em>Plantation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation
	 * @generated
	 */
	public Adapter createPlantationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Zone
	 * @generated
	 */
	public Adapter createZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Nursary <em>Nursary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Nursary
	 * @generated
	 */
	public Adapter createNursaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Tray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Tray
	 * @generated
	 */
	public Adapter createTrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Cell
	 * @generated
	 */
	public Adapter createCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.TrayZone <em>Tray Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.TrayZone
	 * @generated
	 */
	public Adapter createTrayZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.TrayOwner <em>Tray Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.TrayOwner
	 * @generated
	 */
	public Adapter createTrayOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.GridBedRow <em>Grid Bed Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.GridBedRow
	 * @generated
	 */
	public Adapter createGridBedRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.GridBedCell <em>Grid Bed Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.GridBedCell
	 * @generated
	 */
	public Adapter createGridBedCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Planfication <em>Planfication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Planfication
	 * @generated
	 */
	public Adapter createPlanficationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Planifier <em>Planifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Planifier
	 * @generated
	 */
	public Adapter createPlanifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.SowPlanfication <em>Sow Planfication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.SowPlanfication
	 * @generated
	 */
	public Adapter createSowPlanficationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage <em>Background Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.BackgroundImage
	 * @generated
	 */
	public Adapter createBackgroundImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant
	 * @generated
	 */
	public Adapter createPlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Production <em>Production</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Production
	 * @generated
	 */
	public Adapter createProductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.TemporalItem <em>Temporal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.TemporalItem
	 * @generated
	 */
	public Adapter createTemporalItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.PlantationPhase <em>Plantation Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantationPhase
	 * @generated
	 */
	public Adapter createPlantationPhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.ReferencingElement <em>Referencing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.ReferencingElement
	 * @generated
	 */
	public Adapter createReferencingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.ImageOwner <em>Image Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.ImageOwner
	 * @generated
	 */
	public Adapter createImageOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Species <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species
	 * @generated
	 */
	public Adapter createSpeciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.Variety <em>Variety</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.Variety
	 * @generated
	 */
	public Adapter createVarietyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.PlantGroup <em>Plant Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantGroup
	 * @generated
	 */
	public Adapter createPlantGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.adaussy.permadeler.model.Permadeler.IPlantGroup <em>IPlant Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.adaussy.permadeler.model.Permadeler.IPlantGroup
	 * @generated
	 */
	public Adapter createIPlantGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PermadelerAdapterFactory
