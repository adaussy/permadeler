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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Permadeler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/fr.adaussy.permadeler.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fr.adaussy.permadeler.model";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "permadeler";

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
	int NAMED_ELEMENT = 8;

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
	 * The feature id for the '<em><b>Seed Lib</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__SEED_LIB = NAMED_ELEMENT_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Add Compatibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT___ADD_COMPATIBILITY__GENUS_GENUS_INT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

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
	 * The feature id for the '<em><b>Compatibility Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE__COMPATIBILITY_MATRIX = 1;

	/**
	 * The number of structural features of the '<em>Knowledge Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASE_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl <em>Plant Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantNamedElementImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlantNamedElement()
	 * @generated
	 */
	int PLANT_NAMED_ELEMENT = 10;

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
	 * The feature id for the '<em><b>Common Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__COMMON_NAMES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__LATIN_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Representation Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT__REPRESENTATION_KEY = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Plant Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Plant Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NAMED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.GenusImpl <em>Genus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.GenusImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGenus()
	 * @generated
	 */
	int GENUS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__NAME = PLANT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__DESCRIPTION = PLANT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Common Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__COMMON_NAMES = PLANT_NAMED_ELEMENT__COMMON_NAMES;

	/**
	 * The feature id for the '<em><b>Latin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__LATIN_NAME = PLANT_NAMED_ELEMENT__LATIN_NAME;

	/**
	 * The feature id for the '<em><b>Representation Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__REPRESENTATION_KEY = PLANT_NAMED_ELEMENT__REPRESENTATION_KEY;

	/**
	 * The feature id for the '<em><b>Species</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__SPECIES = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__FAMILY = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Genus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__SUB_GENUS = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compatibility Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS__COMPATIBILITY_LINKS = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Genus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS_FEATURE_COUNT = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Genus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENUS_OPERATION_COUNT = PLANT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl <em>Species</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSpecies()
	 * @generated
	 */
	int SPECIES = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__NAME = PLANT_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__DESCRIPTION = PLANT_NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Common Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__COMMON_NAMES = PLANT_NAMED_ELEMENT__COMMON_NAMES;

	/**
	 * The feature id for the '<em><b>Latin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__LATIN_NAME = PLANT_NAMED_ELEMENT__LATIN_NAME;

	/**
	 * The feature id for the '<em><b>Representation Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__REPRESENTATION_KEY = PLANT_NAMED_ELEMENT__REPRESENTATION_KEY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__TYPE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usda Hardiness Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__USDA_HARDINESS_MIN = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lighting Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__LIGHTING_CONDITION = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soil Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__SOIL_TYPE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Moisture</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__MOISTURE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__REFERENCES = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Productive Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__PRODUCTIVE_MONTHS = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bloom Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__BLOOM_MONTHS = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fruit Conservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__FRUIT_CONSERVATION = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fruits Availability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__FRUITS_AVAILABILITY = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__IMAGES = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Grow Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__GROW_RATE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Wind</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__WIND = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__WIDTH = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__HEIGHT = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Eating Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__EATING_TYPE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Edible Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__EDIBLE_PARTS = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Usda Hardiness Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__USDA_HARDINESS_MAX = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Special Uses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__SPECIAL_USES = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Flower Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__FLOWER_COLOR = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Pruning Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__PRUNING_MONTHS = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Prune Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES__PRUNE_NOTE = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 21;

	/**
	 * The number of structural features of the '<em>Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES_FEATURE_COUNT = PLANT_NAMED_ELEMENT_FEATURE_COUNT + 22;

	/**
	 * The operation id for the '<em>Get All Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES___GET_ALL_NAMES = PLANT_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIES_OPERATION_COUNT = PLANT_NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.SeedItemImpl <em>Seed Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.SeedItemImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSeedItem()
	 * @generated
	 */
	int SEED_ITEM = 5;

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
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.AreaImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Plantations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__PLANTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Beds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__BEDS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__SUB_AREAS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Soil Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__SOIL_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__EVENTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get Actual Soil Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA___GET_ACTUAL_SOIL_TYPE = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantingImpl <em>Planting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantingImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlanting()
	 * @generated
	 */
	int PLANTING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTING__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Plantations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTING__PLANTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Beds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTING__BEDS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Areas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTING__AREAS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTING__START_TIME = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTING__END_TIME = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Planting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Planting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTING_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl <em>Plantation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantationImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlantation()
	 * @generated
	 */
	int PLANTATION = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Sow Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__SOW_EVENT = 1;

	/**
	 * The feature id for the '<em><b>Plantation Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__PLANTATION_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Removal Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__REMOVAL_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Plantation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Is Removed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION___IS_REMOVED = 0;

	/**
	 * The number of operations of the '<em>Plantation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NAME = SPECIES__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__DESCRIPTION = SPECIES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Common Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__COMMON_NAMES = SPECIES__COMMON_NAMES;

	/**
	 * The feature id for the '<em><b>Latin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LATIN_NAME = SPECIES__LATIN_NAME;

	/**
	 * The feature id for the '<em><b>Representation Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__REPRESENTATION_KEY = SPECIES__REPRESENTATION_KEY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__TYPE = SPECIES__TYPE;

	/**
	 * The feature id for the '<em><b>Usda Hardiness Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__USDA_HARDINESS_MIN = SPECIES__USDA_HARDINESS_MIN;

	/**
	 * The feature id for the '<em><b>Lighting Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LIGHTING_CONDITION = SPECIES__LIGHTING_CONDITION;

	/**
	 * The feature id for the '<em><b>Soil Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SOIL_TYPE = SPECIES__SOIL_TYPE;

	/**
	 * The feature id for the '<em><b>Moisture</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__MOISTURE = SPECIES__MOISTURE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__REFERENCES = SPECIES__REFERENCES;

	/**
	 * The feature id for the '<em><b>Productive Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PRODUCTIVE_MONTHS = SPECIES__PRODUCTIVE_MONTHS;

	/**
	 * The feature id for the '<em><b>Bloom Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__BLOOM_MONTHS = SPECIES__BLOOM_MONTHS;

	/**
	 * The feature id for the '<em><b>Fruit Conservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__FRUIT_CONSERVATION = SPECIES__FRUIT_CONSERVATION;

	/**
	 * The feature id for the '<em><b>Fruits Availability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__FRUITS_AVAILABILITY = SPECIES__FRUITS_AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__IMAGES = SPECIES__IMAGES;

	/**
	 * The feature id for the '<em><b>Grow Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__GROW_RATE = SPECIES__GROW_RATE;

	/**
	 * The feature id for the '<em><b>Wind</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__WIND = SPECIES__WIND;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__WIDTH = SPECIES__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__HEIGHT = SPECIES__HEIGHT;

	/**
	 * The feature id for the '<em><b>Eating Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__EATING_TYPE = SPECIES__EATING_TYPE;

	/**
	 * The feature id for the '<em><b>Edible Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__EDIBLE_PARTS = SPECIES__EDIBLE_PARTS;

	/**
	 * The feature id for the '<em><b>Usda Hardiness Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__USDA_HARDINESS_MAX = SPECIES__USDA_HARDINESS_MAX;

	/**
	 * The feature id for the '<em><b>Special Uses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SPECIAL_USES = SPECIES__SPECIAL_USES;

	/**
	 * The feature id for the '<em><b>Flower Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__FLOWER_COLOR = SPECIES__FLOWER_COLOR;

	/**
	 * The feature id for the '<em><b>Pruning Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PRUNING_MONTHS = SPECIES__PRUNING_MONTHS;

	/**
	 * The feature id for the '<em><b>Prune Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PRUNE_NOTE = SPECIES__PRUNE_NOTE;

	/**
	 * The feature id for the '<em><b>Sow Indoor Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SOW_INDOOR_MONTHS = SPECIES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sow Outdoor Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SOW_OUTDOOR_MONTHS = SPECIES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Life Cycle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LIFE_CYCLE = SPECIES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = SPECIES_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___GET_ALL_NAMES = SPECIES___GET_ALL_NAMES;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = SPECIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.TreeImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NAME = SPECIES__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__DESCRIPTION = SPECIES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Common Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__COMMON_NAMES = SPECIES__COMMON_NAMES;

	/**
	 * The feature id for the '<em><b>Latin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__LATIN_NAME = SPECIES__LATIN_NAME;

	/**
	 * The feature id for the '<em><b>Representation Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__REPRESENTATION_KEY = SPECIES__REPRESENTATION_KEY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__TYPE = SPECIES__TYPE;

	/**
	 * The feature id for the '<em><b>Usda Hardiness Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__USDA_HARDINESS_MIN = SPECIES__USDA_HARDINESS_MIN;

	/**
	 * The feature id for the '<em><b>Lighting Condition</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__LIGHTING_CONDITION = SPECIES__LIGHTING_CONDITION;

	/**
	 * The feature id for the '<em><b>Soil Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__SOIL_TYPE = SPECIES__SOIL_TYPE;

	/**
	 * The feature id for the '<em><b>Moisture</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__MOISTURE = SPECIES__MOISTURE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__REFERENCES = SPECIES__REFERENCES;

	/**
	 * The feature id for the '<em><b>Productive Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__PRODUCTIVE_MONTHS = SPECIES__PRODUCTIVE_MONTHS;

	/**
	 * The feature id for the '<em><b>Bloom Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__BLOOM_MONTHS = SPECIES__BLOOM_MONTHS;

	/**
	 * The feature id for the '<em><b>Fruit Conservation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__FRUIT_CONSERVATION = SPECIES__FRUIT_CONSERVATION;

	/**
	 * The feature id for the '<em><b>Fruits Availability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__FRUITS_AVAILABILITY = SPECIES__FRUITS_AVAILABILITY;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__IMAGES = SPECIES__IMAGES;

	/**
	 * The feature id for the '<em><b>Grow Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__GROW_RATE = SPECIES__GROW_RATE;

	/**
	 * The feature id for the '<em><b>Wind</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__WIND = SPECIES__WIND;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__WIDTH = SPECIES__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__HEIGHT = SPECIES__HEIGHT;

	/**
	 * The feature id for the '<em><b>Eating Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__EATING_TYPE = SPECIES__EATING_TYPE;

	/**
	 * The feature id for the '<em><b>Edible Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__EDIBLE_PARTS = SPECIES__EDIBLE_PARTS;

	/**
	 * The feature id for the '<em><b>Usda Hardiness Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__USDA_HARDINESS_MAX = SPECIES__USDA_HARDINESS_MAX;

	/**
	 * The feature id for the '<em><b>Special Uses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__SPECIAL_USES = SPECIES__SPECIAL_USES;

	/**
	 * The feature id for the '<em><b>Flower Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__FLOWER_COLOR = SPECIES__FLOWER_COLOR;

	/**
	 * The feature id for the '<em><b>Pruning Months</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__PRUNING_MONTHS = SPECIES__PRUNING_MONTHS;

	/**
	 * The feature id for the '<em><b>Prune Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__PRUNE_NOTE = SPECIES__PRUNE_NOTE;

	/**
	 * The feature id for the '<em><b>Rootstock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ROOTSTOCK = SPECIES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = SPECIES_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE___GET_ALL_NAMES = SPECIES___GET_ALL_NAMES;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_OPERATION_COUNT = SPECIES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.ReferenceImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LINK = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__ID = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE = 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.ImageImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 14;

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
	int EVENT = 15;

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
	int ZONE = 16;

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
	 * The feature id for the '<em><b>Plantings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__PLANTINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

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
	int TRAY_OWNER = 23;

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
	int NURSARY = 17;

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
	int TRAY = 18;

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
	int ROW = 19;

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
	int CELL = 20;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__SPECIES = 0;

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
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationOwnerImpl <em>Plantation Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantationOwnerImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlantationOwner()
	 * @generated
	 */
	int PLANTATION_OWNER = 21;

	/**
	 * The feature id for the '<em><b>Plantations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_OWNER__PLANTATIONS = 0;

	/**
	 * The feature id for the '<em><b>Beds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_OWNER__BEDS = 1;

	/**
	 * The number of structural features of the '<em>Plantation Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_OWNER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plantation Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANTATION_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TrayZoneImpl <em>Tray Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.TrayZoneImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTrayZone()
	 * @generated
	 */
	int TRAY_ZONE = 22;

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
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.BedImpl <em>Bed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.BedImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getBed()
	 * @generated
	 */
	int BED = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Bed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BED_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.GridBedImpl <em>Grid Bed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.GridBedImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGridBed()
	 * @generated
	 */
	int GRID_BED = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED__NAME = BED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED__DESCRIPTION = BED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED__ROWS = BED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grid Bed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED_FEATURE_COUNT = BED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Grid Bed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BED_OPERATION_COUNT = BED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.RowBedImpl <em>Row Bed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.RowBedImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRowBed()
	 * @generated
	 */
	int ROW_BED = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_BED__NAME = BED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_BED__DESCRIPTION = BED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_BED__ROWS = BED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_BED__TYPE = BED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Row Bed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_BED_FEATURE_COUNT = BED_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Row Bed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_BED_OPERATION_COUNT = BED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.GridBedRowImpl <em>Grid Bed Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.GridBedRowImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGridBedRow()
	 * @generated
	 */
	int GRID_BED_ROW = 27;

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
	int GRID_BED_CELL = 28;

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
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.RowBedRowImpl <em>Row Bed Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.RowBedRowImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRowBedRow()
	 * @generated
	 */
	int ROW_BED_ROW = 29;

	/**
	 * The feature id for the '<em><b>Plantations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_BED_ROW__PLANTATIONS = PLANTATION_OWNER__PLANTATIONS;

	/**
	 * The feature id for the '<em><b>Beds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_BED_ROW__BEDS = PLANTATION_OWNER__BEDS;

	/**
	 * The number of structural features of the '<em>Row Bed Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_BED_ROW_FEATURE_COUNT = PLANTATION_OWNER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Row Bed Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_BED_ROW_OPERATION_COUNT = PLANTATION_OWNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityLinkImpl <em>Compatibility Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityLinkImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getCompatibilityLink()
	 * @generated
	 */
	int COMPATIBILITY_LINK = 30;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_LINK__SPECIES = 0;

	/**
	 * The feature id for the '<em><b>Affinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_LINK__AFFINITY = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_LINK__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Compatibility Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Compatibility Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityMatrixImpl <em>Compatibility Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityMatrixImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getCompatibilityMatrix()
	 * @generated
	 */
	int COMPATIBILITY_MATRIX = 31;

	/**
	 * The feature id for the '<em><b>Compatibilties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_MATRIX__COMPATIBILTIES = 0;

	/**
	 * The number of structural features of the '<em>Compatibility Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_MATRIX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Compatibility Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlanficationImpl <em>Planfication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlanficationImpl
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlanfication()
	 * @generated
	 */
	int PLANFICATION = 32;

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
	int PLANIFIER = 33;

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
	int SOW_PLANFICATION = 34;

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
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Quantity <em>Quantity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Quantity
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getQuantity()
	 * @generated
	 */
	int QUANTITY = 35;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Lifecycle <em>Lifecycle</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Lifecycle
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getLifecycle()
	 * @generated
	 */
	int LIFECYCLE = 36;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Shade <em>Shade</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Shade
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getShade()
	 * @generated
	 */
	int SHADE = 37;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.SoilType <em>Soil Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.SoilType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSoilType()
	 * @generated
	 */
	int SOIL_TYPE = 38;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.PH <em>PH</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.PH
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPH()
	 * @generated
	 */
	int PH = 39;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Moisture <em>Moisture</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Moisture
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getMoisture()
	 * @generated
	 */
	int MOISTURE = 40;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Family <em>Family</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Family
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getFamily()
	 * @generated
	 */
	int FAMILY = 41;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.GrowRate <em>Grow Rate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.GrowRate
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGrowRate()
	 * @generated
	 */
	int GROW_RATE = 42;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.Wind <em>Wind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.Wind
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getWind()
	 * @generated
	 */
	int WIND = 43;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.EatingType <em>Eating Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.EatingType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getEatingType()
	 * @generated
	 */
	int EATING_TYPE = 44;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.EdiblePart <em>Edible Part</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.EdiblePart
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getEdiblePart()
	 * @generated
	 */
	int EDIBLE_PART = 45;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.SpecialUses <em>Special Uses</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.SpecialUses
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSpecialUses()
	 * @generated
	 */
	int SPECIAL_USES = 46;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.EventType <em>Event Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.EventType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 47;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.RowBedType <em>Row Bed Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.RowBedType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRowBedType()
	 * @generated
	 */
	int ROW_BED_TYPE = 48;

	/**
	 * The meta object id for the '{@link fr.adaussy.permadeler.model.Permadeler.SowType <em>Sow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.SowType
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSowType()
	 * @generated
	 */
	int SOW_TYPE = 49;

	/**
	 * The meta object id for the '<em>Month Week</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getMonthWeek()
	 * @generated
	 */
	int MONTH_WEEK = 50;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getURL()
	 * @generated
	 */
	int URL = 51;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.time.Instant
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 52;

	/**
	 * The meta object id for the '<em>Month Weeks</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getMonthWeeks()
	 * @generated
	 */
	int MONTH_WEEKS = 53;

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
	 * Returns the meta object for the containment reference '{@link fr.adaussy.permadeler.model.Permadeler.Root#getSeedLib <em>Seed Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seed Lib</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Root#getSeedLib()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_SeedLib();

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
	 * Returns the meta object for the '{@link fr.adaussy.permadeler.model.Permadeler.Root#addCompatibility(fr.adaussy.permadeler.model.Permadeler.Genus, fr.adaussy.permadeler.model.Permadeler.Genus, int) <em>Add Compatibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Compatibility</em>' operation.
	 * @see fr.adaussy.permadeler.model.Permadeler.Root#addCompatibility(fr.adaussy.permadeler.model.Permadeler.Genus, fr.adaussy.permadeler.model.Permadeler.Genus, int)
	 * @generated
	 */
	EOperation getRoot__AddCompatibility__Genus_Genus_int();

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
	 * Returns the meta object for the containment reference '{@link fr.adaussy.permadeler.model.Permadeler.KnowledgeBase#getCompatibilityMatrix <em>Compatibility Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compatibility Matrix</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.KnowledgeBase#getCompatibilityMatrix()
	 * @see #getKnowledgeBase()
	 * @generated
	 */
	EReference getKnowledgeBase_CompatibilityMatrix();

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
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Genus <em>Genus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genus</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Genus
	 * @generated
	 */
	EClass getGenus();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Genus#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Species</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Genus#getSpecies()
	 * @see #getGenus()
	 * @generated
	 */
	EReference getGenus_Species();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Genus#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Genus#getFamily()
	 * @see #getGenus()
	 * @generated
	 */
	EAttribute getGenus_Family();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Genus#getSubGenus <em>Sub Genus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Genus</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Genus#getSubGenus()
	 * @see #getGenus()
	 * @generated
	 */
	EReference getGenus_SubGenus();

	/**
	 * Returns the meta object for the reference list '{@link fr.adaussy.permadeler.model.Permadeler.Genus#getCompatibilityLinks <em>Compatibility Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compatibility Links</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Genus#getCompatibilityLinks()
	 * @see #getGenus()
	 * @generated
	 */
	EReference getGenus_CompatibilityLinks();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Species <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Species</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species
	 * @generated
	 */
	EClass getSpecies();

	/**
	 * Returns the meta object for the container reference '{@link fr.adaussy.permadeler.model.Permadeler.Species#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getType()
	 * @see #getSpecies()
	 * @generated
	 */
	EReference getSpecies_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Species#getUsdaHardinessMin <em>Usda Hardiness Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usda Hardiness Min</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getUsdaHardinessMin()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_UsdaHardinessMin();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getLightingCondition <em>Lighting Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lighting Condition</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getLightingCondition()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_LightingCondition();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getSoilType <em>Soil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Soil Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getSoilType()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_SoilType();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getMoisture <em>Moisture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Moisture</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getMoisture()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_Moisture();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getReferences()
	 * @see #getSpecies()
	 * @generated
	 */
	EReference getSpecies_References();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getProductiveMonths <em>Productive Months</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Productive Months</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getProductiveMonths()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_ProductiveMonths();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getBloomMonths <em>Bloom Months</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bloom Months</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getBloomMonths()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_BloomMonths();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Species#getFruitConservation <em>Fruit Conservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fruit Conservation</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getFruitConservation()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_FruitConservation();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getFruitsAvailability <em>Fruits Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fruits Availability</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getFruitsAvailability()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_FruitsAvailability();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getImages()
	 * @see #getSpecies()
	 * @generated
	 */
	EReference getSpecies_Images();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Species#getGrowRate <em>Grow Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grow Rate</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getGrowRate()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_GrowRate();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getWind <em>Wind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Wind</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getWind()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_Wind();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Species#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getWidth()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_Width();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Species#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getHeight()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_Height();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Species#getEatingType <em>Eating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eating Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getEatingType()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_EatingType();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getEdibleParts <em>Edible Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Edible Parts</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getEdibleParts()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_EdibleParts();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Species#getUsdaHardinessMax <em>Usda Hardiness Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usda Hardiness Max</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getUsdaHardinessMax()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_UsdaHardinessMax();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getSpecialUses <em>Special Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Special Uses</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getSpecialUses()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_SpecialUses();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Species#getFlowerColor <em>Flower Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flower Color</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getFlowerColor()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_FlowerColor();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Species#getPruningMonths <em>Pruning Months</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pruning Months</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getPruningMonths()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_PruningMonths();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Species#getPruneNote <em>Prune Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prune Note</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getPruneNote()
	 * @see #getSpecies()
	 * @generated
	 */
	EAttribute getSpecies_PruneNote();

	/**
	 * Returns the meta object for the '{@link fr.adaussy.permadeler.model.Permadeler.Species#getAllNames() <em>Get All Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Names</em>' operation.
	 * @see fr.adaussy.permadeler.model.Permadeler.Species#getAllNames()
	 * @generated
	 */
	EOperation getSpecies__GetAllNames();

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
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Area#getSubAreas <em>Sub Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Areas</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Area#getSubAreas()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_SubAreas();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Area#getSoilType <em>Soil Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Soil Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Area#getSoilType()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_SoilType();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Area#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Area#getEvents()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Events();

	/**
	 * Returns the meta object for the '{@link fr.adaussy.permadeler.model.Permadeler.Area#getActualSoilType() <em>Get Actual Soil Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Actual Soil Type</em>' operation.
	 * @see fr.adaussy.permadeler.model.Permadeler.Area#getActualSoilType()
	 * @generated
	 */
	EOperation getArea__GetActualSoilType();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Planting <em>Planting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planting</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Planting
	 * @generated
	 */
	EClass getPlanting();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Planting#getAreas <em>Areas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Areas</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Planting#getAreas()
	 * @see #getPlanting()
	 * @generated
	 */
	EReference getPlanting_Areas();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Planting#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Planting#getStartTime()
	 * @see #getPlanting()
	 * @generated
	 */
	EAttribute getPlanting_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Planting#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Planting#getEndTime()
	 * @see #getPlanting()
	 * @generated
	 */
	EAttribute getPlanting_EndTime();

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
	 * Returns the meta object for the containment reference '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getPlantationEvent <em>Plantation Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plantation Event</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#getPlantationEvent()
	 * @see #getPlantation()
	 * @generated
	 */
	EReference getPlantation_PlantationEvent();

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
	 * Returns the meta object for the containment reference '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getRemovalEvent <em>Removal Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Removal Event</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#getRemovalEvent()
	 * @see #getPlantation()
	 * @generated
	 */
	EReference getPlantation_RemovalEvent();

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
	 * Returns the meta object for the containment reference '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#getSowEvent <em>Sow Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sow Event</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#getSowEvent()
	 * @see #getPlantation()
	 * @generated
	 */
	EReference getPlantation_SowEvent();

	/**
	 * Returns the meta object for the '{@link fr.adaussy.permadeler.model.Permadeler.Plantation#isRemoved() <em>Is Removed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Removed</em>' operation.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plantation#isRemoved()
	 * @generated
	 */
	EOperation getPlantation__IsRemoved();

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
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getSowIndoorMonths <em>Sow Indoor Months</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sow Indoor Months</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getSowIndoorMonths()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_SowIndoorMonths();

	/**
	 * Returns the meta object for the attribute list '{@link fr.adaussy.permadeler.model.Permadeler.Plant#getSowOutdoorMonths <em>Sow Outdoor Months</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sow Outdoor Months</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Plant#getSowOutdoorMonths()
	 * @see #getPlant()
	 * @generated
	 */
	EAttribute getPlant_SowOutdoorMonths();

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
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Tree#getRootstock <em>Rootstock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rootstock</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Tree#getRootstock()
	 * @see #getTree()
	 * @generated
	 */
	EAttribute getTree_Rootstock();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Reference#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Reference#getLink()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Link();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Reference#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Reference#getId()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.Reference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Reference#getSource()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Source();

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
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.Zone#getPlantings <em>Plantings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plantings</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Zone#getPlantings()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Plantings();

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
	 * Returns the meta object for the reference '{@link fr.adaussy.permadeler.model.Permadeler.Cell#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Cell#getSpecies()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Species();

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
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.PlantationOwner <em>Plantation Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plantation Owner</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantationOwner
	 * @generated
	 */
	EClass getPlantationOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.PlantationOwner#getPlantations <em>Plantations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plantations</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantationOwner#getPlantations()
	 * @see #getPlantationOwner()
	 * @generated
	 */
	EReference getPlantationOwner_Plantations();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.PlantationOwner#getBeds <em>Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beds</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.PlantationOwner#getBeds()
	 * @see #getPlantationOwner()
	 * @generated
	 */
	EReference getPlantationOwner_Beds();

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
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.Bed <em>Bed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bed</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.Bed
	 * @generated
	 */
	EClass getBed();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.GridBed <em>Grid Bed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Bed</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.GridBed
	 * @generated
	 */
	EClass getGridBed();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.GridBed#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.GridBed#getRows()
	 * @see #getGridBed()
	 * @generated
	 */
	EReference getGridBed_Rows();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.RowBed <em>Row Bed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Bed</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.RowBed
	 * @generated
	 */
	EClass getRowBed();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.RowBed#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.RowBed#getRows()
	 * @see #getRowBed()
	 * @generated
	 */
	EReference getRowBed_Rows();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.RowBed#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.RowBed#getType()
	 * @see #getRowBed()
	 * @generated
	 */
	EAttribute getRowBed_Type();

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
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.RowBedRow <em>Row Bed Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Bed Row</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.RowBedRow
	 * @generated
	 */
	EClass getRowBedRow();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink <em>Compatibility Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compatibility Link</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.CompatibilityLink
	 * @generated
	 */
	EClass getCompatibilityLink();

	/**
	 * Returns the meta object for the reference list '{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Species</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getSpecies()
	 * @see #getCompatibilityLink()
	 * @generated
	 */
	EReference getCompatibilityLink_Species();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getAffinity <em>Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Affinity</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getAffinity()
	 * @see #getCompatibilityLink()
	 * @generated
	 */
	EAttribute getCompatibilityLink_Affinity();

	/**
	 * Returns the meta object for the attribute '{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.CompatibilityLink#getDescription()
	 * @see #getCompatibilityLink()
	 * @generated
	 */
	EAttribute getCompatibilityLink_Description();

	/**
	 * Returns the meta object for class '{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityMatrix <em>Compatibility Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compatibility Matrix</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.CompatibilityMatrix
	 * @generated
	 */
	EClass getCompatibilityMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.adaussy.permadeler.model.Permadeler.CompatibilityMatrix#getCompatibilties <em>Compatibilties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compatibilties</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.CompatibilityMatrix#getCompatibilties()
	 * @see #getCompatibilityMatrix()
	 * @generated
	 */
	EReference getCompatibilityMatrix_Compatibilties();

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
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.EatingType <em>Eating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eating Type</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.EatingType
	 * @generated
	 */
	EEnum getEatingType();

	/**
	 * Returns the meta object for enum '{@link fr.adaussy.permadeler.model.Permadeler.EdiblePart <em>Edible Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Edible Part</em>'.
	 * @see fr.adaussy.permadeler.model.Permadeler.EdiblePart
	 * @generated
	 */
	EEnum getEdiblePart();

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
		 * The meta object literal for the '<em><b>Seed Lib</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__SEED_LIB = eINSTANCE.getRoot_SeedLib();

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
		 * The meta object literal for the '<em><b>Add Compatibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOT___ADD_COMPATIBILITY__GENUS_GENUS_INT = eINSTANCE
				.getRoot__AddCompatibility__Genus_Genus_int();

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
		 * The meta object literal for the '<em><b>Compatibility Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE_BASE__COMPATIBILITY_MATRIX = eINSTANCE.getKnowledgeBase_CompatibilityMatrix();

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
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.GenusImpl <em>Genus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.GenusImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGenus()
		 * @generated
		 */
		EClass GENUS = eINSTANCE.getGenus();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENUS__SPECIES = eINSTANCE.getGenus_Species();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENUS__FAMILY = eINSTANCE.getGenus_Family();

		/**
		 * The meta object literal for the '<em><b>Sub Genus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENUS__SUB_GENUS = eINSTANCE.getGenus_SubGenus();

		/**
		 * The meta object literal for the '<em><b>Compatibility Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENUS__COMPATIBILITY_LINKS = eINSTANCE.getGenus_CompatibilityLinks();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl <em>Species</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.SpeciesImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getSpecies()
		 * @generated
		 */
		EClass SPECIES = eINSTANCE.getSpecies();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIES__TYPE = eINSTANCE.getSpecies_Type();

		/**
		 * The meta object literal for the '<em><b>Usda Hardiness Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__USDA_HARDINESS_MIN = eINSTANCE.getSpecies_UsdaHardinessMin();

		/**
		 * The meta object literal for the '<em><b>Lighting Condition</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__LIGHTING_CONDITION = eINSTANCE.getSpecies_LightingCondition();

		/**
		 * The meta object literal for the '<em><b>Soil Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__SOIL_TYPE = eINSTANCE.getSpecies_SoilType();

		/**
		 * The meta object literal for the '<em><b>Moisture</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__MOISTURE = eINSTANCE.getSpecies_Moisture();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIES__REFERENCES = eINSTANCE.getSpecies_References();

		/**
		 * The meta object literal for the '<em><b>Productive Months</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__PRODUCTIVE_MONTHS = eINSTANCE.getSpecies_ProductiveMonths();

		/**
		 * The meta object literal for the '<em><b>Bloom Months</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__BLOOM_MONTHS = eINSTANCE.getSpecies_BloomMonths();

		/**
		 * The meta object literal for the '<em><b>Fruit Conservation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__FRUIT_CONSERVATION = eINSTANCE.getSpecies_FruitConservation();

		/**
		 * The meta object literal for the '<em><b>Fruits Availability</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__FRUITS_AVAILABILITY = eINSTANCE.getSpecies_FruitsAvailability();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIES__IMAGES = eINSTANCE.getSpecies_Images();

		/**
		 * The meta object literal for the '<em><b>Grow Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__GROW_RATE = eINSTANCE.getSpecies_GrowRate();

		/**
		 * The meta object literal for the '<em><b>Wind</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__WIND = eINSTANCE.getSpecies_Wind();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__WIDTH = eINSTANCE.getSpecies_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__HEIGHT = eINSTANCE.getSpecies_Height();

		/**
		 * The meta object literal for the '<em><b>Eating Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__EATING_TYPE = eINSTANCE.getSpecies_EatingType();

		/**
		 * The meta object literal for the '<em><b>Edible Parts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__EDIBLE_PARTS = eINSTANCE.getSpecies_EdibleParts();

		/**
		 * The meta object literal for the '<em><b>Usda Hardiness Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__USDA_HARDINESS_MAX = eINSTANCE.getSpecies_UsdaHardinessMax();

		/**
		 * The meta object literal for the '<em><b>Special Uses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__SPECIAL_USES = eINSTANCE.getSpecies_SpecialUses();

		/**
		 * The meta object literal for the '<em><b>Flower Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__FLOWER_COLOR = eINSTANCE.getSpecies_FlowerColor();

		/**
		 * The meta object literal for the '<em><b>Pruning Months</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__PRUNING_MONTHS = eINSTANCE.getSpecies_PruningMonths();

		/**
		 * The meta object literal for the '<em><b>Prune Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIES__PRUNE_NOTE = eINSTANCE.getSpecies_PruneNote();

		/**
		 * The meta object literal for the '<em><b>Get All Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPECIES___GET_ALL_NAMES = eINSTANCE.getSpecies__GetAllNames();

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
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.AreaImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Sub Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__SUB_AREAS = eINSTANCE.getArea_SubAreas();

		/**
		 * The meta object literal for the '<em><b>Soil Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__SOIL_TYPE = eINSTANCE.getArea_SoilType();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__EVENTS = eINSTANCE.getArea_Events();

		/**
		 * The meta object literal for the '<em><b>Get Actual Soil Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AREA___GET_ACTUAL_SOIL_TYPE = eINSTANCE.getArea__GetActualSoilType();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantingImpl <em>Planting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantingImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlanting()
		 * @generated
		 */
		EClass PLANTING = eINSTANCE.getPlanting();

		/**
		 * The meta object literal for the '<em><b>Areas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTING__AREAS = eINSTANCE.getPlanting_Areas();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANTING__START_TIME = eINSTANCE.getPlanting_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANTING__END_TIME = eINSTANCE.getPlanting_EndTime();

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
		 * The meta object literal for the '<em><b>Plantation Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTATION__PLANTATION_EVENT = eINSTANCE.getPlantation_PlantationEvent();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTATION__EVENTS = eINSTANCE.getPlantation_Events();

		/**
		 * The meta object literal for the '<em><b>Removal Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTATION__REMOVAL_EVENT = eINSTANCE.getPlantation_RemovalEvent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANTATION__DESCRIPTION = eINSTANCE.getPlantation_Description();

		/**
		 * The meta object literal for the '<em><b>Sow Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTATION__SOW_EVENT = eINSTANCE.getPlantation_SowEvent();

		/**
		 * The meta object literal for the '<em><b>Is Removed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLANTATION___IS_REMOVED = eINSTANCE.getPlantation__IsRemoved();

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
		 * The meta object literal for the '<em><b>Representation Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_NAMED_ELEMENT__REPRESENTATION_KEY = eINSTANCE
				.getPlantNamedElement_RepresentationKey();

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
		 * The meta object literal for the '<em><b>Sow Indoor Months</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__SOW_INDOOR_MONTHS = eINSTANCE.getPlant_SowIndoorMonths();

		/**
		 * The meta object literal for the '<em><b>Sow Outdoor Months</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__SOW_OUTDOOR_MONTHS = eINSTANCE.getPlant_SowOutdoorMonths();

		/**
		 * The meta object literal for the '<em><b>Life Cycle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT__LIFE_CYCLE = eINSTANCE.getPlant_LifeCycle();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.TreeImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();

		/**
		 * The meta object literal for the '<em><b>Rootstock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE__ROOTSTOCK = eINSTANCE.getTree_Rootstock();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.ReferenceImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__LINK = eINSTANCE.getReference_Link();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__ID = eINSTANCE.getReference_Id();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__SOURCE = eINSTANCE.getReference_Source();

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
		 * The meta object literal for the '<em><b>Plantings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__PLANTINGS = eINSTANCE.getZone_Plantings();

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
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__SPECIES = eINSTANCE.getCell_Species();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__DATE = eINSTANCE.getCell_Date();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.PlantationOwnerImpl <em>Plantation Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PlantationOwnerImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getPlantationOwner()
		 * @generated
		 */
		EClass PLANTATION_OWNER = eINSTANCE.getPlantationOwner();

		/**
		 * The meta object literal for the '<em><b>Plantations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTATION_OWNER__PLANTATIONS = eINSTANCE.getPlantationOwner_Plantations();

		/**
		 * The meta object literal for the '<em><b>Beds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANTATION_OWNER__BEDS = eINSTANCE.getPlantationOwner_Beds();

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
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.BedImpl <em>Bed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.BedImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getBed()
		 * @generated
		 */
		EClass BED = eINSTANCE.getBed();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.GridBedImpl <em>Grid Bed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.GridBedImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getGridBed()
		 * @generated
		 */
		EClass GRID_BED = eINSTANCE.getGridBed();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_BED__ROWS = eINSTANCE.getGridBed_Rows();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.RowBedImpl <em>Row Bed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.RowBedImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRowBed()
		 * @generated
		 */
		EClass ROW_BED = eINSTANCE.getRowBed();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_BED__ROWS = eINSTANCE.getRowBed_Rows();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_BED__TYPE = eINSTANCE.getRowBed_Type();

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
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.RowBedRowImpl <em>Row Bed Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.RowBedRowImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getRowBedRow()
		 * @generated
		 */
		EClass ROW_BED_ROW = eINSTANCE.getRowBedRow();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityLinkImpl <em>Compatibility Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityLinkImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getCompatibilityLink()
		 * @generated
		 */
		EClass COMPATIBILITY_LINK = eINSTANCE.getCompatibilityLink();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBILITY_LINK__SPECIES = eINSTANCE.getCompatibilityLink_Species();

		/**
		 * The meta object literal for the '<em><b>Affinity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPATIBILITY_LINK__AFFINITY = eINSTANCE.getCompatibilityLink_Affinity();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPATIBILITY_LINK__DESCRIPTION = eINSTANCE.getCompatibilityLink_Description();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityMatrixImpl <em>Compatibility Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.CompatibilityMatrixImpl
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getCompatibilityMatrix()
		 * @generated
		 */
		EClass COMPATIBILITY_MATRIX = eINSTANCE.getCompatibilityMatrix();

		/**
		 * The meta object literal for the '<em><b>Compatibilties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBILITY_MATRIX__COMPATIBILTIES = eINSTANCE.getCompatibilityMatrix_Compatibilties();

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
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.EatingType <em>Eating Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.EatingType
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getEatingType()
		 * @generated
		 */
		EEnum EATING_TYPE = eINSTANCE.getEatingType();

		/**
		 * The meta object literal for the '{@link fr.adaussy.permadeler.model.Permadeler.EdiblePart <em>Edible Part</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.adaussy.permadeler.model.Permadeler.EdiblePart
		 * @see fr.adaussy.permadeler.model.Permadeler.impl.PermadelerPackageImpl#getEdiblePart()
		 * @generated
		 */
		EEnum EDIBLE_PART = eINSTANCE.getEdiblePart();

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

	}

} //PermadelerPackage
