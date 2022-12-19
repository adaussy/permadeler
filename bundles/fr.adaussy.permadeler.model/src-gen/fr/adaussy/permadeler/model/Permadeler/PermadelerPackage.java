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
package fr.adaussy.permadeler.model.Permadeler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerFactory
 * @model kind="package"
 * @generated
 */
public interface PermadelerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Permadeler"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/fr.adaussy.permadeler.model"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fr.adaussy.permadeler.model"; //$NON-NLS-1$

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "permadeler"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PermadelerPackage eINSTANCE = fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.NamedElementImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.RootImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Knowledge Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__KNOWLEDGE_BASE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Seedbank</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SEEDBANK = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ZONES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nursary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__NURSARY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Planifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__PLANIFIER = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Sow Planification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT___ADD_SOW_PLANIFICATION__SEEDITEM_LIST_SOWTYPE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.KnowledgeBaseImpl <em>Knowledge Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.KnowledgeBaseImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getKnowledgeBase()
	 * @generated
	 */
	int KNOWLEDGE_BASE = 1;

	/**
	 * The feature id for the '<em><b>Plant Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE__PLANT_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Knowledge Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Knowledge Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.SeedBankImpl <em>Seed Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.SeedBankImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSeedBank()
	 * @generated
	 */
	int SEED_BANK = 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_BANK__ITEMS = 0;

	/**
	 * The number of structural features of the '<em>Seed Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_BANK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Seed Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_BANK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.SeedItemImpl <em>Seed Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.SeedItemImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSeedItem()
	 * @generated
	 */
	int SEED_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_ITEM__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_ITEM__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>By Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_ITEM__BY_DATE = 2;

	/**
	 * The number of structural features of the '<em>Seed Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_ITEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Seed Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEED_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl <em>Plantation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlantation()
	 * @generated
	 */
	int PLANTATION = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Plantation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__PLANTATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Current Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__CURRENT_LAYER = 4;

	/**
	 * The feature id for the '<em><b>Rootstock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__ROOTSTOCK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__ID = 6;

	/**
	 * The feature id for the '<em><b>Wireframe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__WIREFRAME = 7;

	/**
	 * The number of structural features of the '<em>Plantation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Plantation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl <em>Plant Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlantNamedElement()
	 * @generated
	 */
	int PLANT_NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__REFERENCES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Common Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__COMMON_NAMES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Latin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__LATIN_NAME = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Icon Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__ICON_KEY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Genus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__GENUS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__SPECIES = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Variety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__VARIETY = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Representation Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__REPRESENTATION_KEY = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Plant Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Plant Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.ImageImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PATH = 2;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.EventImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 8;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DATE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IMAGES = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.ZoneImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Phases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__PHASES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TrayOwnerImpl <em>Tray Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.TrayOwnerImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTrayOwner()
	 * @generated
	 */
	int TRAY_OWNER = 15;

	/**
	 * The feature id for the '<em><b>Trays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_OWNER__TRAYS = 0;

	/**
	 * The number of structural features of the '<em>Tray Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tray Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.NursaryImpl <em>Nursary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.NursaryImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getNursary()
	 * @generated
	 */
	int NURSARY = 10;

	/**
	 * The feature id for the '<em><b>Trays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSARY__TRAYS = TRAY_OWNER__TRAYS;

	/**
	 * The feature id for the '<em><b>Zones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSARY__ZONES = TRAY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nursary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSARY_FEATURE_COUNT = TRAY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nursary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NURSARY_OPERATION_COUNT = TRAY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TrayImpl <em>Tray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.TrayImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTray()
	 * @generated
	 */
	int TRAY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__ROWS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Empty Cells</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY___GET_EMPTY_CELLS = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.RowImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 12;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.CellImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 13;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__PLANT = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__DATE = 1;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TrayZoneImpl <em>Tray Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.TrayZoneImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTrayZone()
	 * @generated
	 */
	int TRAY_ZONE = 14;

	/**
	 * The feature id for the '<em><b>Trays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_ZONE__TRAYS = TRAY_OWNER__TRAYS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_ZONE__NAME = TRAY_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_ZONE__DESCRIPTION = TRAY_OWNER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tray Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_ZONE_FEATURE_COUNT = TRAY_OWNER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tray Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_ZONE_OPERATION_COUNT = TRAY_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.GridBedRowImpl <em>Grid Bed Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.GridBedRowImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGridBedRow()
	 * @generated
	 */
	int GRID_BED_ROW = 16;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED_ROW__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Grid Bed Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED_ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Grid Bed Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.GridBedCellImpl <em>Grid Bed Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.GridBedCellImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGridBedCell()
	 * @generated
	 */
	int GRID_BED_CELL = 17;

	/**
	 * The feature id for the '<em><b>Plantation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED_CELL__PLANTATION = 0;

	/**
	 * The number of structural features of the '<em>Grid Bed Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED_CELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Grid Bed Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED_CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlanficationImpl <em>Planfication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlanficationImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlanfication()
	 * @generated
	 */
	int PLANFICATION = 18;

	/**
	 * The feature id for the '<em><b>Weeks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANFICATION__WEEKS = 0;

	/**
	 * The number of structural features of the '<em>Planfication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Planfication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlanifierImpl <em>Planifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlanifierImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlanifier()
	 * @generated
	 */
	int PLANIFIER = 19;

	/**
	 * The feature id for the '<em><b>Planfications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFIER__PLANFICATIONS = 0;

	/**
	 * The number of structural features of the '<em>Planifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFIER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Planifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.SowPlanficationImpl <em>Sow Planfication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.SowPlanficationImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSowPlanfication()
	 * @generated
	 */
	int SOW_PLANFICATION = 20;

	/**
	 * The feature id for the '<em><b>Weeks</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOW_PLANFICATION__WEEKS = PLANFICATION__WEEKS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOW_PLANFICATION__SEED = PLANFICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOW_PLANFICATION__TYPE = PLANFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sow Planfication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOW_PLANFICATION_FEATURE_COUNT = PLANFICATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sow Planfication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOW_PLANFICATION_OPERATION_COUNT = PLANFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.BackgroundImageImpl <em>Background Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.BackgroundImageImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getBackgroundImage()
	 * @generated
	 */
	int BACKGROUND_IMAGE = 21;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE__RELATIVE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE__SCALING = 1;

	/**
	 * The feature id for the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE__TRANSPARENCY = 2;

	/**
	 * The number of structural features of the '<em>Background Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Background Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_IMAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NAME = PLANT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__DESCRIPTION = PLANT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__REFERENCES = PLANT_NAMED_ELEMENT__REFERENCES;

	/**
	 * The feature id for the '<em><b>Common Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__COMMON_NAMES = PLANT_NAMED_ELEMENT__COMMON_NAMES;

	/**
	 * The feature id for the '<em><b>Latin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LATIN_NAME = PLANT_NAMED_ELEMENT__LATIN_NAME;

	/**
	 * The feature id for the '<em><b>Icon Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__ICON_KEY = PLANT_NAMED_ELEMENT__ICON_KEY;

	/**
	 * The feature id for the '<em><b>Genus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__GENUS = PLANT_NAMED_ELEMENT__GENUS;

	/**
	 * The feature id for the '<em><b>Species</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SPECIES = PLANT_NAMED_ELEMENT__SPECIES;

	/**
	 * The feature id for the '<em><b>Variety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__VARIETY = PLANT_NAMED_ELEMENT__VARIETY;

	/**
	 * The feature id for the '<em><b>Representation Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__REPRESENTATION_KEY = PLANT_NAMED_ELEMENT__REPRESENTATION_KEY;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__WIDTH = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Soil Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SOIL_TYPE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__IMAGES = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lighting Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LIGHTING_CONDITION = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__HEIGHT = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__MIN_TEMPERATURE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Moisture</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__MOISTURE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Special Uses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SPECIAL_USES = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Grow Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__GROW_RATE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Wind</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__WIND = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Productions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PRODUCTIONS = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__ACTIONS = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Life Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LIFE_CYCLE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__FAMILY = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Get All Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___GET_ALL_NAMES = PLANT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = PLANT_NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TemporalItemImpl <em>Temporal Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.TemporalItemImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTemporalItem()
	 * @generated
	 */
	int TEMPORAL_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_ITEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_ITEM__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_ITEM__PERIOD = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temporal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temporal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_ITEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ProductionImpl <em>Production</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.ProductionImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getProduction()
	 * @generated
	 */
	int PRODUCTION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__NAME = TEMPORAL_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__DESCRIPTION = TEMPORAL_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__PERIOD = TEMPORAL_ITEM__PERIOD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__TYPE = TEMPORAL_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION__CONSERVATION = TEMPORAL_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Production</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_FEATURE_COUNT = TEMPORAL_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Production</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_OPERATION_COUNT = TEMPORAL_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.ActionImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = TEMPORAL_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = TEMPORAL_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__PERIOD = TEMPORAL_ITEM__PERIOD;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TYPE = TEMPORAL_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = TEMPORAL_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = TEMPORAL_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationPhaseImpl <em>Plantation Phase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantationPhaseImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlantationPhase()
	 * @generated
	 */
	int PLANTATION_PHASE = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_PHASE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_PHASE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Plantations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_PHASE__PLANTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Background Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_PHASE__BACKGROUND_IMAGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Plantation Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_PHASE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plantation Phase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_PHASE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ReferencingElementImpl <em>Referencing Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.ReferencingElementImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getReferencingElement()
	 * @generated
	 */
	int REFERENCING_ELEMENT = 27;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCING_ELEMENT__REFERENCES = 0;

	/**
	 * The number of structural features of the '<em>Referencing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCING_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Referencing Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCING_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Quantity <em>Quantity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Quantity
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 28;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Lifecycle <em>Lifecycle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Lifecycle
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getLifecycle()
	 * @generated
	 */
	int LIFECYCLE = 29;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Shade <em>Shade</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Shade
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getShade()
	 * @generated
	 */
	int SHADE = 30;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.SoilType <em>Soil Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.SoilType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSoilType()
	 * @generated
	 */
	int SOIL_TYPE = 31;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.PH <em>PH</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.PH
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPH()
	 * @generated
	 */
	int PH = 32;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Moisture <em>Moisture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Moisture
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getMoisture()
	 * @generated
	 */
	int MOISTURE = 33;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Family <em>Family</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Family
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 34;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.GrowRate <em>Grow Rate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.GrowRate
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGrowRate()
	 * @generated
	 */
	int GROW_RATE = 35;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Wind <em>Wind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Wind
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getWind()
	 * @generated
	 */
	int WIND = 36;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.SpecialUses <em>Special Uses</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.SpecialUses
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSpecialUses()
	 * @generated
	 */
	int SPECIAL_USES = 37;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.EventType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 38;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.RowBedType <em>Row Bed Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.RowBedType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRowBedType()
	 * @generated
	 */
	int ROW_BED_TYPE = 39;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.SowType <em>Sow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.SowType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSowType()
	 * @generated
	 */
	int SOW_TYPE = 40;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.ProductionType <em>Production Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.ProductionType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getProductionType()
	 * @generated
	 */
	int PRODUCTION_TYPE = 41;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.ActionType <em>Action Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.ActionType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 42;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Layer <em>Layer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Layer
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 43;

	/**
	 * The meta object id for the '<em>Month Week</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getMonthWeek()
	 * @generated
	 */
	int MONTH_WEEK = 44;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getURL()
	 * @generated
	 */
	int URL = 45;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Instant
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 46;

	/**
	 * The meta object id for the '<em>Month Weeks</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getMonthWeeks()
	 * @generated
	 */
	int MONTH_WEEKS = 47;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.utils.Color
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 48;

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference '{@link fr.adaussy.permadeler.model.Permadeler.Root#getKnowledgeBase <em>Knowledge Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Knowledge Base</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Root#getKnowledgeBase()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_KnowledgeBase();

	/**
	 * Returns the meta object for the containment reference '{@link fr.adaussy.permadeler.model.Permadeler.Root#getSeedbank <em>Seedbank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seedbank</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Root#getSeedbank()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Seedbank();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Root#getZones <em>Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zones</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Root#getZones()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Zones();

	/**
	 * Returns the meta object for the containment reference '{@link fr.adaussy.permadeler.model.Permadeler.Root#getNursary <em>Nursary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nursary</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Root#getNursary()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Nursary();

	/**
	 * Returns the meta object for the containment reference '{@link fr.adaussy.permadeler.model.Permadeler.Root#getPlanifier <em>Planifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planifier</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Root#getPlanifier()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Planifier();

	/**
	 * Returns the meta object for the '{@link fr.adaussy.permadeler.model.Permadeler.Root#addSowPlanification(fr.adaussy.permadeler.model.Permadeler.SeedItem, java.util.List, fr.adaussy.permadeler.model.Permadeler.SowType) <em>Add Sow Planification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Sow Planification</em>' operation.
	 * @see fr.adaussy.permadeler.model.Permadeler.Root#addSowPlanification(fr.adaussy.permadeler.model.Permadeler.SeedItem, java.util.List, fr.adaussy.permadeler.model.Permadeler.SowType)
	 * @generated
	 */
	EOperation getRoot__AddSowPlanification__SeedItem_List_SowType();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.KnowledgeBase <em>Knowledge Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Base</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.KnowledgeBase
	 * @generated
	 */
	EClass getKnowledgeBase();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.KnowledgeBase#getPlantTypes <em>Plant Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plant Types</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.KnowledgeBase#getPlantTypes()
	 * @see #getKnowledgeBase()
	 * @generated
	 */
	EReference getKnowledgeBase_PlantTypes();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.SeedBank <em>Seed Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seed Bank</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SeedBank
	 * @generated
	 */
	EClass getSeedBank();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.SeedBank#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SeedBank#getItems()
	 * @see #getSeedBank()
	 * @generated
	 */
	EReference getSeedBank_Items();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.SeedItem <em>Seed Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seed Item</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SeedItem
	 * @generated
	 */
	EClass getSeedItem();

	/**
	 * Returns the meta object for the reference '{@link fr.adaussy.permadeler.model.Permadeler.SeedItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SeedItem#getType()
	 * @see #getSeedItem()
	 * @generated
	 */
	EReference getSeedItem_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.SeedItem#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SeedItem#getQuantity()
	 * @see #getSeedItem()
	 * @generated
	 */
	EAttribute getSeedItem_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.SeedItem#getByDate <em>By Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>By Date</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SeedItem#getByDate()
	 * @see #getSeedItem()
	 * @generated
	 */
	EAttribute getSeedItem_ByDate();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.NamedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.NamedElement#getDescription()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Description();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Plantation <em>Plantation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plantation</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation
	 * @generated
	 */
	EClass getPlantation();

	/**
	 * Returns the meta object for the reference '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#getType()
	 * @see #getPlantation()
	 * @generated
	 */
	EReference getPlantation_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#getEvents()
	 * @see #getPlantation()
	 * @generated
	 */
	EReference getPlantation_Events();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#getDescription()
	 * @see #getPlantation()
	 * @generated
	 */
	EAttribute getPlantation_Description();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getPlantationDate <em>Plantation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plantation Date</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#getPlantationDate()
	 * @see #getPlantation()
	 * @generated
	 */
	EAttribute getPlantation_PlantationDate();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getCurrentLayer <em>Current Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Layer</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#getCurrentLayer()
	 * @see #getPlantation()
	 * @generated
	 */
	EAttribute getPlantation_CurrentLayer();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getRootstock <em>Rootstock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rootstock</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#getRootstock()
	 * @see #getPlantation()
	 * @generated
	 */
	EAttribute getPlantation_Rootstock();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#getId()
	 * @see #getPlantation()
	 * @generated
	 */
	EAttribute getPlantation_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#isWireframe <em>Wireframe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wireframe</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#isWireframe()
	 * @see #getPlantation()
	 * @generated
	 */
	EAttribute getPlantation_Wireframe();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement <em>Plant Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Named Element</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantNamedElement
	 * @generated
	 */
	EClass getPlantNamedElement();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getCommonNames <em>Common Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Common Names</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getCommonNames()
	 * @see #getPlantNamedElement()
	 * @generated
	 */
	EAttribute getPlantNamedElement_CommonNames();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getLatinName <em>Latin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latin Name</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getLatinName()
	 * @see #getPlantNamedElement()
	 * @generated
	 */
	EAttribute getPlantNamedElement_LatinName();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getIconKey <em>Icon Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Key</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getIconKey()
	 * @see #getPlantNamedElement()
	 * @generated
	 */
	EAttribute getPlantNamedElement_IconKey();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getGenus <em>Genus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genus</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getGenus()
	 * @see #getPlantNamedElement()
	 * @generated
	 */
	EAttribute getPlantNamedElement_Genus();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Species</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getSpecies()
	 * @see #getPlantNamedElement()
	 * @generated
	 */
	EAttribute getPlantNamedElement_Species();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getVariety <em>Variety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variety</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getVariety()
	 * @see #getPlantNamedElement()
	 * @generated
	 */
	EAttribute getPlantNamedElement_Variety();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getRepresentationKey <em>Representation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation Key</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantNamedElement#getRepresentationKey()
	 * @see #getPlantNamedElement()
	 * @generated
	 */
	EAttribute getPlantNamedElement_RepresentationKey();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Image#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Image#getTitle()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Title();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Image#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Image#getSource()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Source();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Image#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Image#getPath()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Path();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Event#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Event#getDate()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Date();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Event#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Event#getDescription()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Event#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Event#getImages()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Images();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Event#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Event#getType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Type();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Zone#getPhases <em>Phases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phases</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Zone#getPhases()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Phases();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Nursary <em>Nursary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nursary</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Nursary
	 * @generated
	 */
	EClass getNursary();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Nursary#getZones <em>Zones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zones</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Nursary#getZones()
	 * @see #getNursary()
	 * @generated
	 */
	EReference getNursary_Zones();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Tray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tray</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Tray
	 * @generated
	 */
	EClass getTray();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Tray#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Tray#getRows()
	 * @see #getTray()
	 * @generated
	 */
	EReference getTray_Rows();

	/**
	 * Returns the meta object for the '{@link fr.adaussy.permadeler.model.Permadeler.Tray#getEmptyCells() <em>Get Empty Cells</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Empty Cells</em>' operation.
	 * @see fr.adaussy.permadeler.model.Permadeler.Tray#getEmptyCells()
	 * @generated
	 */
	EOperation getTray__GetEmptyCells();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Row#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Row#getCells()
	 * @see #getRow()
	 * @generated
	 */
	EReference getRow_Cells();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the reference '{@link fr.adaussy.permadeler.model.Permadeler.Cell#getPlant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plant</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Cell#getPlant()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Plant();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Cell#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Cell#getDate()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Date();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.TrayZone <em>Tray Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tray Zone</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.TrayZone
	 * @generated
	 */
	EClass getTrayZone();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.TrayOwner <em>Tray Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tray Owner</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.TrayOwner
	 * @generated
	 */
	EClass getTrayOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.TrayOwner#getTrays <em>Trays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trays</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.TrayOwner#getTrays()
	 * @see #getTrayOwner()
	 * @generated
	 */
	EReference getTrayOwner_Trays();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.GridBedRow <em>Grid Bed Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Bed Row</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.GridBedRow
	 * @generated
	 */
	EClass getGridBedRow();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.GridBedRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.GridBedRow#getCells()
	 * @see #getGridBedRow()
	 * @generated
	 */
	EReference getGridBedRow_Cells();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.GridBedCell <em>Grid Bed Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Bed Cell</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.GridBedCell
	 * @generated
	 */
	EClass getGridBedCell();

	/**
	 * Returns the meta object for the reference '{@link fr.adaussy.permadeler.model.Permadeler.GridBedCell#getPlantation <em>Plantation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plantation</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.GridBedCell#getPlantation()
	 * @see #getGridBedCell()
	 * @generated
	 */
	EReference getGridBedCell_Plantation();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Planfication <em>Planfication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planfication</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Planfication
	 * @generated
	 */
	EClass getPlanfication();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Planfication#getWeeks <em>Weeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Weeks</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Planfication#getWeeks()
	 * @see #getPlanfication()
	 * @generated
	 */
	EAttribute getPlanfication_Weeks();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Planifier <em>Planifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planifier</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Planifier
	 * @generated
	 */
	EClass getPlanifier();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Planifier#getPlanfications <em>Planfications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Planfications</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Planifier#getPlanfications()
	 * @see #getPlanifier()
	 * @generated
	 */
	EReference getPlanifier_Planfications();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.SowPlanfication <em>Sow Planfication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sow Planfication</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SowPlanfication
	 * @generated
	 */
	EClass getSowPlanfication();

	/**
	 * Returns the meta object for the reference '{@link fr.adaussy.permadeler.model.Permadeler.SowPlanfication#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seed</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SowPlanfication#getSeed()
	 * @see #getSowPlanfication()
	 * @generated
	 */
	EReference getSowPlanfication_Seed();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.SowPlanfication#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SowPlanfication#getType()
	 * @see #getSowPlanfication()
	 * @generated
	 */
	EAttribute getSowPlanfication_Type();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage <em>Background Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Image</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.BackgroundImage
	 * @generated
	 */
	EClass getBackgroundImage();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getRelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Path</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getRelativePath()
	 * @see #getBackgroundImage()
	 * @generated
	 */
	EAttribute getBackgroundImage_RelativePath();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getScaling <em>Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scaling</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getScaling()
	 * @see #getBackgroundImage()
	 * @generated
	 */
	EAttribute getBackgroundImage_Scaling();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getTransparency <em>Transparency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transparency</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.BackgroundImage#getTransparency()
	 * @see #getBackgroundImage()
	 * @generated
	 */
	EAttribute getBackgroundImage_Transparency();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getWidth()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Width();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getSoilType <em>Soil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Soil Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getSoilType()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_SoilType();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getImages()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Images();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getLightingCondition <em>Lighting Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lighting Condition</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getLightingCondition()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_LightingCondition();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getHeight()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Height();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getMinTemperature <em>Min Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Temperature</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getMinTemperature()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_MinTemperature();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getMoisture <em>Moisture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Moisture</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getMoisture()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Moisture();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getSpecialUses <em>Special Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Special Uses</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getSpecialUses()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_SpecialUses();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getGrowRate <em>Grow Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grow Rate</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getGrowRate()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_GrowRate();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getWind <em>Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Wind</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getWind()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Wind();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getProductions <em>Productions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productions</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getProductions()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Productions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getActions()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Actions();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getLifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Life Cycle</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getLifeCycle()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_LifeCycle();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getFamily()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_Family();

	/**
	 * Returns the meta object for the '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getAllNames() <em>Get All Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Names</em>' operation.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getAllNames()
	 * @generated
	 */
	EOperation getPlant__GetAllNames();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Production <em>Production</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Production
	 * @generated
	 */
	EClass getProduction();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Production#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Production#getType()
	 * @see #getProduction()
	 * @generated
	 */
	EAttribute getProduction_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Production#getConservation <em>Conservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conservation</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Production#getConservation()
	 * @see #getProduction()
	 * @generated
	 */
	EAttribute getProduction_Conservation();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Action#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Action#getType()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Type();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.TemporalItem <em>Temporal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal Item</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.TemporalItem
	 * @generated
	 */
	EClass getTemporalItem();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.TemporalItem#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.TemporalItem#getPeriod()
	 * @see #getTemporalItem()
	 * @generated
	 */
	EAttribute getTemporalItem_Period();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.PlantationPhase <em>Plantation Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plantation Phase</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantationPhase
	 * @generated
	 */
	EClass getPlantationPhase();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.PlantationPhase#getPlantations <em>Plantations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plantations</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantationPhase#getPlantations()
	 * @see #getPlantationPhase()
	 * @generated
	 */
	EReference getPlantationPhase_Plantations();

	/**
	 * Returns the meta object for the containment reference '{@link fr.adaussy.permadeler.model.Permadeler.PlantationPhase#getBackgroundImage <em>Background Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Background Image</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantationPhase#getBackgroundImage()
	 * @see #getPlantationPhase()
	 * @generated
	 */
	EReference getPlantationPhase_BackgroundImage();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.ReferencingElement <em>Referencing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referencing Element</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.ReferencingElement
	 * @generated
	 */
	EClass getReferencingElement();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.ReferencingElement#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.ReferencingElement#getReferences()
	 * @see #getReferencingElement()
	 * @generated
	 */
	EAttribute getReferencingElement_References();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantity</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Quantity
	 * @generated
	 */
	EEnum getQuantity();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.Lifecycle <em>Lifecycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lifecycle</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Lifecycle
	 * @generated
	 */
	EEnum getLifecycle();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.Shade <em>Shade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shade</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Shade
	 * @generated
	 */
	EEnum getShade();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.SoilType <em>Soil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Soil Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SoilType
	 * @generated
	 */
	EEnum getSoilType();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.PH <em>PH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PH</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PH
	 * @generated
	 */
	EEnum getPH();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.Moisture <em>Moisture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Moisture</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Moisture
	 * @generated
	 */
	EEnum getMoisture();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.Family <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Family</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Family
	 * @generated
	 */
	EEnum getFamily();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.GrowRate <em>Grow Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grow Rate</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.GrowRate
	 * @generated
	 */
	EEnum getGrowRate();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.Wind <em>Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wind</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Wind
	 * @generated
	 */
	EEnum getWind();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.SpecialUses <em>Special Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Special Uses</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SpecialUses
	 * @generated
	 */
	EEnum getSpecialUses();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.EventType
	 * @generated
	 */
	EEnum getEventType();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.RowBedType <em>Row Bed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Row Bed Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.RowBedType
	 * @generated
	 */
	EEnum getRowBedType();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.SowType <em>Sow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sow Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.SowType
	 * @generated
	 */
	EEnum getSowType();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.ProductionType <em>Production Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Production Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.ProductionType
	 * @generated
	 */
	EEnum getProductionType();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.ActionType
	 * @generated
	 */
	EEnum getActionType();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layer</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Layer
	 * @generated
	 */
	EEnum getLayer();

	/**
	 * Returns the meta object for data type '<em>Month Week</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Month Week</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getMonthWeek();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the meta object for data type '{@link java.time.Instant <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.time.Instant
	 * @model instanceClass="java.time.Instant"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Month Weeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Month Weeks</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List&lt;java.lang.Integer&gt;"
	 * @generated
	 */
	EDataType getMonthWeeks();

	/**
	 * Returns the meta object for data type '{@link fr.adaussy.permadeler.model.utils.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see fr.adaussy.permadeler.model.utils.Color
	 * @model instanceClass="fr.adaussy.permadeler.model.utils.Color"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PermadelerFactory getPermadelerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.RootImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Knowledge Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__KNOWLEDGE_BASE = eINSTANCE.getRoot_KnowledgeBase();

		/**
		 * The meta object literal for the '<em><b>Seedbank</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SEEDBANK = eINSTANCE.getRoot_Seedbank();

		/**
		 * The meta object literal for the '<em><b>Zones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ZONES = eINSTANCE.getRoot_Zones();

		/**
		 * The meta object literal for the '<em><b>Nursary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__NURSARY = eINSTANCE.getRoot_Nursary();

		/**
		 * The meta object literal for the '<em><b>Planifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__PLANIFIER = eINSTANCE.getRoot_Planifier();

		/**
		 * The meta object literal for the '<em><b>Add Sow Planification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT___ADD_SOW_PLANIFICATION__SEEDITEM_LIST_SOWTYPE = eINSTANCE
				.getRoot__AddSowPlanification__SeedItem_List_SowType();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.KnowledgeBaseImpl <em>Knowledge Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.KnowledgeBaseImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getKnowledgeBase()
		 * @generated
		 */
		EClass KNOWLEDGE_BASE = eINSTANCE.getKnowledgeBase();

		/**
		 * The meta object literal for the '<em><b>Plant Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_BASE__PLANT_TYPES = eINSTANCE.getKnowledgeBase_PlantTypes();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.SeedBankImpl <em>Seed Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.SeedBankImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSeedBank()
		 * @generated
		 */
		EClass SEED_BANK = eINSTANCE.getSeedBank();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEED_BANK__ITEMS = eINSTANCE.getSeedBank_Items();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.SeedItemImpl <em>Seed Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.SeedItemImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSeedItem()
		 * @generated
		 */
		EClass SEED_ITEM = eINSTANCE.getSeedItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEED_ITEM__TYPE = eINSTANCE.getSeedItem_Type();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEED_ITEM__QUANTITY = eINSTANCE.getSeedItem_Quantity();

		/**
		 * The meta object literal for the '<em><b>By Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEED_ITEM__BY_DATE = eINSTANCE.getSeedItem_ByDate();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.NamedElementImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl <em>Plantation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlantation()
		 * @generated
		 */
		EClass PLANTATION = eINSTANCE.getPlantation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTATION__TYPE = eINSTANCE.getPlantation_Type();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTATION__EVENTS = eINSTANCE.getPlantation_Events();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANTATION__DESCRIPTION = eINSTANCE.getPlantation_Description();

		/**
		 * The meta object literal for the '<em><b>Plantation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANTATION__PLANTATION_DATE = eINSTANCE.getPlantation_PlantationDate();

		/**
		 * The meta object literal for the '<em><b>Current Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANTATION__CURRENT_LAYER = eINSTANCE.getPlantation_CurrentLayer();

		/**
		 * The meta object literal for the '<em><b>Rootstock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANTATION__ROOTSTOCK = eINSTANCE.getPlantation_Rootstock();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANTATION__ID = eINSTANCE.getPlantation_Id();

		/**
		 * The meta object literal for the '<em><b>Wireframe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANTATION__WIREFRAME = eINSTANCE.getPlantation_Wireframe();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl <em>Plant Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlantNamedElement()
		 * @generated
		 */
		EClass PLANT_NAMED_ELEMENT = eINSTANCE.getPlantNamedElement();

		/**
		 * The meta object literal for the '<em><b>Common Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_NAMED_ELEMENT__COMMON_NAMES = eINSTANCE.getPlantNamedElement_CommonNames();

		/**
		 * The meta object literal for the '<em><b>Latin Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_NAMED_ELEMENT__LATIN_NAME = eINSTANCE.getPlantNamedElement_LatinName();

		/**
		 * The meta object literal for the '<em><b>Icon Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_NAMED_ELEMENT__ICON_KEY = eINSTANCE.getPlantNamedElement_IconKey();

		/**
		 * The meta object literal for the '<em><b>Genus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_NAMED_ELEMENT__GENUS = eINSTANCE.getPlantNamedElement_Genus();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_NAMED_ELEMENT__SPECIES = eINSTANCE.getPlantNamedElement_Species();

		/**
		 * The meta object literal for the '<em><b>Variety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_NAMED_ELEMENT__VARIETY = eINSTANCE.getPlantNamedElement_Variety();

		/**
		 * The meta object literal for the '<em><b>Representation Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_NAMED_ELEMENT__REPRESENTATION_KEY = eINSTANCE
				.getPlantNamedElement_RepresentationKey();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.ImageImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__TITLE = eINSTANCE.getImage_Title();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__SOURCE = eINSTANCE.getImage_Source();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PATH = eINSTANCE.getImage_Path();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.EventImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DATE = eINSTANCE.getEvent_Date();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__DESCRIPTION = eINSTANCE.getEvent_Description();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__IMAGES = eINSTANCE.getEvent_Images();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TYPE = eINSTANCE.getEvent_Type();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.ZoneImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Phases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__PHASES = eINSTANCE.getZone_Phases();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.NursaryImpl <em>Nursary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.NursaryImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getNursary()
		 * @generated
		 */
		EClass NURSARY = eINSTANCE.getNursary();

		/**
		 * The meta object literal for the '<em><b>Zones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NURSARY__ZONES = eINSTANCE.getNursary_Zones();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TrayImpl <em>Tray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.TrayImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTray()
		 * @generated
		 */
		EClass TRAY = eINSTANCE.getTray();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAY__ROWS = eINSTANCE.getTray_Rows();

		/**
		 * The meta object literal for the '<em><b>Get Empty Cells</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAY___GET_EMPTY_CELLS = eINSTANCE.getTray__GetEmptyCells();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.RowImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW__CELLS = eINSTANCE.getRow_Cells();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.CellImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__PLANT = eINSTANCE.getCell_Plant();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__DATE = eINSTANCE.getCell_Date();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TrayZoneImpl <em>Tray Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.TrayZoneImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTrayZone()
		 * @generated
		 */
		EClass TRAY_ZONE = eINSTANCE.getTrayZone();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TrayOwnerImpl <em>Tray Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.TrayOwnerImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTrayOwner()
		 * @generated
		 */
		EClass TRAY_OWNER = eINSTANCE.getTrayOwner();

		/**
		 * The meta object literal for the '<em><b>Trays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAY_OWNER__TRAYS = eINSTANCE.getTrayOwner_Trays();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.GridBedRowImpl <em>Grid Bed Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.GridBedRowImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGridBedRow()
		 * @generated
		 */
		EClass GRID_BED_ROW = eINSTANCE.getGridBedRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_BED_ROW__CELLS = eINSTANCE.getGridBedRow_Cells();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.GridBedCellImpl <em>Grid Bed Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.GridBedCellImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGridBedCell()
		 * @generated
		 */
		EClass GRID_BED_CELL = eINSTANCE.getGridBedCell();

		/**
		 * The meta object literal for the '<em><b>Plantation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_BED_CELL__PLANTATION = eINSTANCE.getGridBedCell_Plantation();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlanficationImpl <em>Planfication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlanficationImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlanfication()
		 * @generated
		 */
		EClass PLANFICATION = eINSTANCE.getPlanfication();

		/**
		 * The meta object literal for the '<em><b>Weeks</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANFICATION__WEEKS = eINSTANCE.getPlanfication_Weeks();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlanifierImpl <em>Planifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlanifierImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlanifier()
		 * @generated
		 */
		EClass PLANIFIER = eINSTANCE.getPlanifier();

		/**
		 * The meta object literal for the '<em><b>Planfications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANIFIER__PLANFICATIONS = eINSTANCE.getPlanifier_Planfications();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.SowPlanficationImpl <em>Sow Planfication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.SowPlanficationImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSowPlanfication()
		 * @generated
		 */
		EClass SOW_PLANFICATION = eINSTANCE.getSowPlanfication();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOW_PLANFICATION__SEED = eINSTANCE.getSowPlanfication_Seed();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOW_PLANFICATION__TYPE = eINSTANCE.getSowPlanfication_Type();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.BackgroundImageImpl <em>Background Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.BackgroundImageImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getBackgroundImage()
		 * @generated
		 */
		EClass BACKGROUND_IMAGE = eINSTANCE.getBackgroundImage();

		/**
		 * The meta object literal for the '<em><b>Relative Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND_IMAGE__RELATIVE_PATH = eINSTANCE.getBackgroundImage_RelativePath();

		/**
		 * The meta object literal for the '<em><b>Scaling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND_IMAGE__SCALING = eINSTANCE.getBackgroundImage_Scaling();

		/**
		 * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND_IMAGE__TRANSPARENCY = eINSTANCE.getBackgroundImage_Transparency();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__WIDTH = eINSTANCE.getPlant_Width();

		/**
		 * The meta object literal for the '<em><b>Soil Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__SOIL_TYPE = eINSTANCE.getPlant_SoilType();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__IMAGES = eINSTANCE.getPlant_Images();

		/**
		 * The meta object literal for the '<em><b>Lighting Condition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__LIGHTING_CONDITION = eINSTANCE.getPlant_LightingCondition();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__HEIGHT = eINSTANCE.getPlant_Height();

		/**
		 * The meta object literal for the '<em><b>Min Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__MIN_TEMPERATURE = eINSTANCE.getPlant_MinTemperature();

		/**
		 * The meta object literal for the '<em><b>Moisture</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__MOISTURE = eINSTANCE.getPlant_Moisture();

		/**
		 * The meta object literal for the '<em><b>Special Uses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__SPECIAL_USES = eINSTANCE.getPlant_SpecialUses();

		/**
		 * The meta object literal for the '<em><b>Grow Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__GROW_RATE = eINSTANCE.getPlant_GrowRate();

		/**
		 * The meta object literal for the '<em><b>Wind</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__WIND = eINSTANCE.getPlant_Wind();

		/**
		 * The meta object literal for the '<em><b>Productions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__PRODUCTIONS = eINSTANCE.getPlant_Productions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__ACTIONS = eINSTANCE.getPlant_Actions();

		/**
		 * The meta object literal for the '<em><b>Life Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__LIFE_CYCLE = eINSTANCE.getPlant_LifeCycle();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__FAMILY = eINSTANCE.getPlant_Family();

		/**
		 * The meta object literal for the '<em><b>Get All Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLANT___GET_ALL_NAMES = eINSTANCE.getPlant__GetAllNames();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ProductionImpl <em>Production</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.ProductionImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getProduction()
		 * @generated
		 */
		EClass PRODUCTION = eINSTANCE.getProduction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION__TYPE = eINSTANCE.getProduction_Type();

		/**
		 * The meta object literal for the '<em><b>Conservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION__CONSERVATION = eINSTANCE.getProduction_Conservation();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.ActionImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__TYPE = eINSTANCE.getAction_Type();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TemporalItemImpl <em>Temporal Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.TemporalItemImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTemporalItem()
		 * @generated
		 */
		EClass TEMPORAL_ITEM = eINSTANCE.getTemporalItem();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL_ITEM__PERIOD = eINSTANCE.getTemporalItem_Period();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationPhaseImpl <em>Plantation Phase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantationPhaseImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlantationPhase()
		 * @generated
		 */
		EClass PLANTATION_PHASE = eINSTANCE.getPlantationPhase();

		/**
		 * The meta object literal for the '<em><b>Plantations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTATION_PHASE__PLANTATIONS = eINSTANCE.getPlantationPhase_Plantations();

		/**
		 * The meta object literal for the '<em><b>Background Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTATION_PHASE__BACKGROUND_IMAGE = eINSTANCE.getPlantationPhase_BackgroundImage();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ReferencingElementImpl <em>Referencing Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.ReferencingElementImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getReferencingElement()
		 * @generated
		 */
		EClass REFERENCING_ELEMENT = eINSTANCE.getReferencingElement();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCING_ELEMENT__REFERENCES = eINSTANCE.getReferencingElement_References();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.Quantity <em>Quantity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.Quantity
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getQuantity()
		 * @generated
		 */
		EEnum QUANTITY = eINSTANCE.getQuantity();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.Lifecycle <em>Lifecycle</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.Lifecycle
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getLifecycle()
		 * @generated
		 */
		EEnum LIFECYCLE = eINSTANCE.getLifecycle();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.Shade <em>Shade</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.Shade
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getShade()
		 * @generated
		 */
		EEnum SHADE = eINSTANCE.getShade();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.SoilType <em>Soil Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.SoilType
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSoilType()
		 * @generated
		 */
		EEnum SOIL_TYPE = eINSTANCE.getSoilType();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.PH <em>PH</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.PH
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPH()
		 * @generated
		 */
		EEnum PH = eINSTANCE.getPH();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.Moisture <em>Moisture</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.Moisture
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getMoisture()
		 * @generated
		 */
		EEnum MOISTURE = eINSTANCE.getMoisture();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.Family <em>Family</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.Family
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getFamily()
		 * @generated
		 */
		EEnum FAMILY = eINSTANCE.getFamily();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.GrowRate <em>Grow Rate</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.GrowRate
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGrowRate()
		 * @generated
		 */
		EEnum GROW_RATE = eINSTANCE.getGrowRate();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.Wind <em>Wind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.Wind
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getWind()
		 * @generated
		 */
		EEnum WIND = eINSTANCE.getWind();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.SpecialUses <em>Special Uses</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.SpecialUses
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSpecialUses()
		 * @generated
		 */
		EEnum SPECIAL_USES = eINSTANCE.getSpecialUses();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.EventType <em>Event Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.EventType
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getEventType()
		 * @generated
		 */
		EEnum EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.RowBedType <em>Row Bed Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.RowBedType
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRowBedType()
		 * @generated
		 */
		EEnum ROW_BED_TYPE = eINSTANCE.getRowBedType();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.SowType <em>Sow Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.SowType
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSowType()
		 * @generated
		 */
		EEnum SOW_TYPE = eINSTANCE.getSowType();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.ProductionType <em>Production Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.ProductionType
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getProductionType()
		 * @generated
		 */
		EEnum PRODUCTION_TYPE = eINSTANCE.getProductionType();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.ActionType <em>Action Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.ActionType
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getActionType()
		 * @generated
		 */
		EEnum ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.Layer <em>Layer</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.Layer
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getLayer()
		 * @generated
		 */
		EEnum LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em>Month Week</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getMonthWeek()
		 * @generated
		 */
		EDataType MONTH_WEEK = eINSTANCE.getMonthWeek();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.time.Instant
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Month Weeks</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getMonthWeeks()
		 * @generated
		 */
		EDataType MONTH_WEEKS = eINSTANCE.getMonthWeeks();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.utils.Color
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

	}

} //PermadelerPackage
