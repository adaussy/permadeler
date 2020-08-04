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
package fr.adaussy.permadeler.model.Permadeler.impl;

import fr.adaussy.permadeler.model.Permadeler.Area;
import fr.adaussy.permadeler.model.Permadeler.Bed;
import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.CompatibilityLink;
import fr.adaussy.permadeler.model.Permadeler.CompatibilityMatrix;
import fr.adaussy.permadeler.model.Permadeler.EatingType;
import fr.adaussy.permadeler.model.Permadeler.EdiblePart;
import fr.adaussy.permadeler.model.Permadeler.Event;
import fr.adaussy.permadeler.model.Permadeler.EventType;
import fr.adaussy.permadeler.model.Permadeler.Family;
import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.GridBed;
import fr.adaussy.permadeler.model.Permadeler.GridBedCell;
import fr.adaussy.permadeler.model.Permadeler.GridBedRow;
import fr.adaussy.permadeler.model.Permadeler.GrowRate;
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Lifecycle;
import fr.adaussy.permadeler.model.Permadeler.Moisture;
import fr.adaussy.permadeler.model.Permadeler.NamedElement;
import fr.adaussy.permadeler.model.Permadeler.Nursary;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Planfication;
import fr.adaussy.permadeler.model.Permadeler.Planifier;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.PlantNamedElement;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationOwner;
import fr.adaussy.permadeler.model.Permadeler.Planting;
import fr.adaussy.permadeler.model.Permadeler.Quantity;
import fr.adaussy.permadeler.model.Permadeler.Reference;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.Row;
import fr.adaussy.permadeler.model.Permadeler.RowBed;
import fr.adaussy.permadeler.model.Permadeler.RowBedRow;
import fr.adaussy.permadeler.model.Permadeler.RowBedType;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.Shade;
import fr.adaussy.permadeler.model.Permadeler.SoilType;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.Permadeler.SowType;
import fr.adaussy.permadeler.model.Permadeler.SpecialUses;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.Permadeler.TrayOwner;
import fr.adaussy.permadeler.model.Permadeler.TrayZone;
import fr.adaussy.permadeler.model.Permadeler.Tree;
import fr.adaussy.permadeler.model.Permadeler.Wind;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import java.time.Instant;

import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PermadelerPackageImpl extends EPackageImpl implements PermadelerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seedBankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nursaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantationOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trayZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trayOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridBedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowBedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridBedRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridBedCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowBedRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compatibilityLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compatibilityMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planficationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sowPlanficationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifecycleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shadeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum soilTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum phEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moistureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum familyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum growRateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eatingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ediblePartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specialUsesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rowBedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sowTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType monthWeekEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType monthWeeksEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PermadelerPackageImpl() {
		super(eNS_URI, PermadelerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PermadelerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PermadelerPackage init() {
		if (isInited)
			return (PermadelerPackage)EPackage.Registry.INSTANCE.getEPackage(PermadelerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPermadelerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PermadelerPackageImpl thePermadelerPackage = registeredPermadelerPackage instanceof PermadelerPackageImpl
				? (PermadelerPackageImpl)registeredPermadelerPackage
				: new PermadelerPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePermadelerPackage.createPackageContents();

		// Initialize created meta-data
		thePermadelerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePermadelerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PermadelerPackage.eNS_URI, thePermadelerPackage);
		return thePermadelerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_SeedLib() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Seedbank() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Zones() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Nursary() {
		return (EReference)rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Planifier() {
		return (EReference)rootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoot__AddSowPlanification__SeedItem_List_SowType() {
		return rootEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoot__AddCompatibility__Genus_Genus_int() {
		return rootEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledgeBase() {
		return knowledgeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeBase_PlantTypes() {
		return (EReference)knowledgeBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeBase_CompatibilityMatrix() {
		return (EReference)knowledgeBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeedBank() {
		return seedBankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeedBank_Items() {
		return (EReference)seedBankEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenus() {
		return genusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenus_Species() {
		return (EReference)genusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenus_Family() {
		return (EAttribute)genusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenus_SubGenus() {
		return (EReference)genusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenus_CompatibilityLinks() {
		return (EReference)genusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecies() {
		return speciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecies_Type() {
		return (EReference)speciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_UsdaHardinessMin() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_LightingCondition() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_SoilType() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Moisture() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecies_References() {
		return (EReference)speciesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_ProductiveMonths() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_BloomMonths() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_FruitConservation() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_FruitsAvailability() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecies_Images() {
		return (EReference)speciesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_GrowRate() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Wind() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Width() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Height() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_EatingType() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_EdibleParts() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_UsdaHardinessMax() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_SpecialUses() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_FlowerColor() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_PruningMonths() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_PruneNote() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSpecies__GetAllNames() {
		return speciesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeedItem() {
		return seedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeedItem_Type() {
		return (EReference)seedItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeedItem_Quantity() {
		return (EAttribute)seedItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeedItem_ByDate() {
		return (EAttribute)seedItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_SubAreas() {
		return (EReference)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArea_SoilType() {
		return (EAttribute)areaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Events() {
		return (EReference)areaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getArea__GetActualSoilType() {
		return areaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanting() {
		return plantingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanting_Areas() {
		return (EReference)plantingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanting_StartTime() {
		return (EAttribute)plantingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanting_EndTime() {
		return (EAttribute)plantingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Description() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlantation() {
		return plantationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantation_Type() {
		return (EReference)plantationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantation_PlantationEvent() {
		return (EReference)plantationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantation_Events() {
		return (EReference)plantationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantation_RemovalEvent() {
		return (EReference)plantationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantation_Description() {
		return (EAttribute)plantationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantation_SowEvent() {
		return (EReference)plantationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlantation__IsRemoved() {
		return plantationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlantNamedElement() {
		return plantNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantNamedElement_CommonNames() {
		return (EAttribute)plantNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantNamedElement_LatinName() {
		return (EAttribute)plantNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantNamedElement_RepresentationKey() {
		return (EAttribute)plantNamedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlant() {
		return plantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlant_SowIndoorMonths() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlant_SowOutdoorMonths() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlant_LifeCycle() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTree() {
		return treeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTree_Rootstock() {
		return (EAttribute)treeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Link() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Id() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReference_Source() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Title() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Source() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Path() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Date() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Description() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Images() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Type() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZone() {
		return zoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZone_Plantings() {
		return (EReference)zoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNursary() {
		return nursaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNursary_Zones() {
		return (EReference)nursaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTray() {
		return trayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTray_Rows() {
		return (EReference)trayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTray__GetEmptyCells() {
		return trayEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_Cells() {
		return (EReference)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCell_Species() {
		return (EReference)cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCell_Date() {
		return (EAttribute)cellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlantationOwner() {
		return plantationOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantationOwner_Plantations() {
		return (EReference)plantationOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantationOwner_Beds() {
		return (EReference)plantationOwnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrayZone() {
		return trayZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrayOwner() {
		return trayOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrayOwner_Trays() {
		return (EReference)trayOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBed() {
		return bedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridBed() {
		return gridBedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridBed_Rows() {
		return (EReference)gridBedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowBed() {
		return rowBedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRowBed_Rows() {
		return (EReference)rowBedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRowBed_Type() {
		return (EAttribute)rowBedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridBedRow() {
		return gridBedRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridBedRow_Cells() {
		return (EReference)gridBedRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGridBedCell() {
		return gridBedCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGridBedCell_Plantation() {
		return (EReference)gridBedCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowBedRow() {
		return rowBedRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompatibilityLink() {
		return compatibilityLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibilityLink_Species() {
		return (EReference)compatibilityLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompatibilityLink_Affinity() {
		return (EAttribute)compatibilityLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompatibilityLink_Description() {
		return (EAttribute)compatibilityLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompatibilityMatrix() {
		return compatibilityMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibilityMatrix_Compatibilties() {
		return (EReference)compatibilityMatrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanfication() {
		return planficationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanfication_Weeks() {
		return (EAttribute)planficationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanifier() {
		return planifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlanifier_Planfications() {
		return (EReference)planifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSowPlanfication() {
		return sowPlanficationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSowPlanfication_Seed() {
		return (EReference)sowPlanficationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSowPlanfication_Type() {
		return (EAttribute)sowPlanficationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantity() {
		return quantityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLifecycle() {
		return lifecycleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShade() {
		return shadeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSoilType() {
		return soilTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPH() {
		return phEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMoisture() {
		return moistureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFamily() {
		return familyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGrowRate() {
		return growRateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWind() {
		return windEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEatingType() {
		return eatingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEdiblePart() {
		return ediblePartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecialUses() {
		return specialUsesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventType() {
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRowBedType() {
		return rowBedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSowType() {
		return sowTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMonthWeek() {
		return monthWeekEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURL() {
		return urlEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMonthWeeks() {
		return monthWeeksEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermadelerFactory getPermadelerFactory() {
		return (PermadelerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__SEED_LIB);
		createEReference(rootEClass, ROOT__SEEDBANK);
		createEReference(rootEClass, ROOT__ZONES);
		createEReference(rootEClass, ROOT__NURSARY);
		createEReference(rootEClass, ROOT__PLANIFIER);
		createEOperation(rootEClass, ROOT___ADD_SOW_PLANIFICATION__SEEDITEM_LIST_SOWTYPE);
		createEOperation(rootEClass, ROOT___ADD_COMPATIBILITY__GENUS_GENUS_INT);

		knowledgeBaseEClass = createEClass(KNOWLEDGE_BASE);
		createEReference(knowledgeBaseEClass, KNOWLEDGE_BASE__PLANT_TYPES);
		createEReference(knowledgeBaseEClass, KNOWLEDGE_BASE__COMPATIBILITY_MATRIX);

		seedBankEClass = createEClass(SEED_BANK);
		createEReference(seedBankEClass, SEED_BANK__ITEMS);

		genusEClass = createEClass(GENUS);
		createEReference(genusEClass, GENUS__SPECIES);
		createEAttribute(genusEClass, GENUS__FAMILY);
		createEReference(genusEClass, GENUS__SUB_GENUS);
		createEReference(genusEClass, GENUS__COMPATIBILITY_LINKS);

		speciesEClass = createEClass(SPECIES);
		createEReference(speciesEClass, SPECIES__TYPE);
		createEAttribute(speciesEClass, SPECIES__USDA_HARDINESS_MIN);
		createEAttribute(speciesEClass, SPECIES__LIGHTING_CONDITION);
		createEAttribute(speciesEClass, SPECIES__SOIL_TYPE);
		createEAttribute(speciesEClass, SPECIES__MOISTURE);
		createEReference(speciesEClass, SPECIES__REFERENCES);
		createEAttribute(speciesEClass, SPECIES__PRODUCTIVE_MONTHS);
		createEAttribute(speciesEClass, SPECIES__BLOOM_MONTHS);
		createEAttribute(speciesEClass, SPECIES__FRUIT_CONSERVATION);
		createEAttribute(speciesEClass, SPECIES__FRUITS_AVAILABILITY);
		createEReference(speciesEClass, SPECIES__IMAGES);
		createEAttribute(speciesEClass, SPECIES__GROW_RATE);
		createEAttribute(speciesEClass, SPECIES__WIND);
		createEAttribute(speciesEClass, SPECIES__WIDTH);
		createEAttribute(speciesEClass, SPECIES__HEIGHT);
		createEAttribute(speciesEClass, SPECIES__EATING_TYPE);
		createEAttribute(speciesEClass, SPECIES__EDIBLE_PARTS);
		createEAttribute(speciesEClass, SPECIES__USDA_HARDINESS_MAX);
		createEAttribute(speciesEClass, SPECIES__SPECIAL_USES);
		createEAttribute(speciesEClass, SPECIES__FLOWER_COLOR);
		createEAttribute(speciesEClass, SPECIES__PRUNING_MONTHS);
		createEAttribute(speciesEClass, SPECIES__PRUNE_NOTE);
		createEOperation(speciesEClass, SPECIES___GET_ALL_NAMES);

		seedItemEClass = createEClass(SEED_ITEM);
		createEReference(seedItemEClass, SEED_ITEM__TYPE);
		createEAttribute(seedItemEClass, SEED_ITEM__QUANTITY);
		createEAttribute(seedItemEClass, SEED_ITEM__BY_DATE);

		areaEClass = createEClass(AREA);
		createEReference(areaEClass, AREA__SUB_AREAS);
		createEAttribute(areaEClass, AREA__SOIL_TYPE);
		createEReference(areaEClass, AREA__EVENTS);
		createEOperation(areaEClass, AREA___GET_ACTUAL_SOIL_TYPE);

		plantingEClass = createEClass(PLANTING);
		createEReference(plantingEClass, PLANTING__AREAS);
		createEAttribute(plantingEClass, PLANTING__START_TIME);
		createEAttribute(plantingEClass, PLANTING__END_TIME);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__DESCRIPTION);

		plantationEClass = createEClass(PLANTATION);
		createEReference(plantationEClass, PLANTATION__TYPE);
		createEReference(plantationEClass, PLANTATION__SOW_EVENT);
		createEReference(plantationEClass, PLANTATION__PLANTATION_EVENT);
		createEReference(plantationEClass, PLANTATION__EVENTS);
		createEReference(plantationEClass, PLANTATION__REMOVAL_EVENT);
		createEAttribute(plantationEClass, PLANTATION__DESCRIPTION);
		createEOperation(plantationEClass, PLANTATION___IS_REMOVED);

		plantNamedElementEClass = createEClass(PLANT_NAMED_ELEMENT);
		createEAttribute(plantNamedElementEClass, PLANT_NAMED_ELEMENT__COMMON_NAMES);
		createEAttribute(plantNamedElementEClass, PLANT_NAMED_ELEMENT__LATIN_NAME);
		createEAttribute(plantNamedElementEClass, PLANT_NAMED_ELEMENT__REPRESENTATION_KEY);

		plantEClass = createEClass(PLANT);
		createEAttribute(plantEClass, PLANT__SOW_INDOOR_MONTHS);
		createEAttribute(plantEClass, PLANT__SOW_OUTDOOR_MONTHS);
		createEAttribute(plantEClass, PLANT__LIFE_CYCLE);

		treeEClass = createEClass(TREE);
		createEAttribute(treeEClass, TREE__ROOTSTOCK);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__LINK);
		createEAttribute(referenceEClass, REFERENCE__ID);
		createEAttribute(referenceEClass, REFERENCE__SOURCE);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__TITLE);
		createEAttribute(imageEClass, IMAGE__SOURCE);
		createEAttribute(imageEClass, IMAGE__PATH);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__DATE);
		createEAttribute(eventEClass, EVENT__DESCRIPTION);
		createEReference(eventEClass, EVENT__IMAGES);
		createEAttribute(eventEClass, EVENT__TYPE);

		zoneEClass = createEClass(ZONE);
		createEReference(zoneEClass, ZONE__PLANTINGS);

		nursaryEClass = createEClass(NURSARY);
		createEReference(nursaryEClass, NURSARY__ZONES);

		trayEClass = createEClass(TRAY);
		createEReference(trayEClass, TRAY__ROWS);
		createEOperation(trayEClass, TRAY___GET_EMPTY_CELLS);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__CELLS);

		cellEClass = createEClass(CELL);
		createEReference(cellEClass, CELL__SPECIES);
		createEAttribute(cellEClass, CELL__DATE);

		plantationOwnerEClass = createEClass(PLANTATION_OWNER);
		createEReference(plantationOwnerEClass, PLANTATION_OWNER__PLANTATIONS);
		createEReference(plantationOwnerEClass, PLANTATION_OWNER__BEDS);

		trayZoneEClass = createEClass(TRAY_ZONE);

		trayOwnerEClass = createEClass(TRAY_OWNER);
		createEReference(trayOwnerEClass, TRAY_OWNER__TRAYS);

		bedEClass = createEClass(BED);

		gridBedEClass = createEClass(GRID_BED);
		createEReference(gridBedEClass, GRID_BED__ROWS);

		rowBedEClass = createEClass(ROW_BED);
		createEReference(rowBedEClass, ROW_BED__ROWS);
		createEAttribute(rowBedEClass, ROW_BED__TYPE);

		gridBedRowEClass = createEClass(GRID_BED_ROW);
		createEReference(gridBedRowEClass, GRID_BED_ROW__CELLS);

		gridBedCellEClass = createEClass(GRID_BED_CELL);
		createEReference(gridBedCellEClass, GRID_BED_CELL__PLANTATION);

		rowBedRowEClass = createEClass(ROW_BED_ROW);

		compatibilityLinkEClass = createEClass(COMPATIBILITY_LINK);
		createEReference(compatibilityLinkEClass, COMPATIBILITY_LINK__SPECIES);
		createEAttribute(compatibilityLinkEClass, COMPATIBILITY_LINK__AFFINITY);
		createEAttribute(compatibilityLinkEClass, COMPATIBILITY_LINK__DESCRIPTION);

		compatibilityMatrixEClass = createEClass(COMPATIBILITY_MATRIX);
		createEReference(compatibilityMatrixEClass, COMPATIBILITY_MATRIX__COMPATIBILTIES);

		planficationEClass = createEClass(PLANFICATION);
		createEAttribute(planficationEClass, PLANFICATION__WEEKS);

		planifierEClass = createEClass(PLANIFIER);
		createEReference(planifierEClass, PLANIFIER__PLANFICATIONS);

		sowPlanficationEClass = createEClass(SOW_PLANFICATION);
		createEReference(sowPlanficationEClass, SOW_PLANFICATION__SEED);
		createEAttribute(sowPlanficationEClass, SOW_PLANFICATION__TYPE);

		// Create enums
		quantityEEnum = createEEnum(QUANTITY);
		lifecycleEEnum = createEEnum(LIFECYCLE);
		shadeEEnum = createEEnum(SHADE);
		soilTypeEEnum = createEEnum(SOIL_TYPE);
		phEEnum = createEEnum(PH);
		moistureEEnum = createEEnum(MOISTURE);
		familyEEnum = createEEnum(FAMILY);
		growRateEEnum = createEEnum(GROW_RATE);
		windEEnum = createEEnum(WIND);
		eatingTypeEEnum = createEEnum(EATING_TYPE);
		ediblePartEEnum = createEEnum(EDIBLE_PART);
		specialUsesEEnum = createEEnum(SPECIAL_USES);
		eventTypeEEnum = createEEnum(EVENT_TYPE);
		rowBedTypeEEnum = createEEnum(ROW_BED_TYPE);
		sowTypeEEnum = createEEnum(SOW_TYPE);

		// Create data types
		monthWeekEDataType = createEDataType(MONTH_WEEK);
		urlEDataType = createEDataType(URL);
		dateEDataType = createEDataType(DATE);
		monthWeeksEDataType = createEDataType(MONTH_WEEKS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rootEClass.getESuperTypes().add(this.getNamedElement());
		genusEClass.getESuperTypes().add(this.getPlantNamedElement());
		speciesEClass.getESuperTypes().add(this.getPlantNamedElement());
		areaEClass.getESuperTypes().add(this.getNamedElement());
		areaEClass.getESuperTypes().add(this.getPlantationOwner());
		plantingEClass.getESuperTypes().add(this.getNamedElement());
		plantingEClass.getESuperTypes().add(this.getPlantationOwner());
		plantNamedElementEClass.getESuperTypes().add(this.getNamedElement());
		plantEClass.getESuperTypes().add(this.getSpecies());
		treeEClass.getESuperTypes().add(this.getSpecies());
		zoneEClass.getESuperTypes().add(this.getNamedElement());
		nursaryEClass.getESuperTypes().add(this.getTrayOwner());
		trayEClass.getESuperTypes().add(this.getNamedElement());
		trayZoneEClass.getESuperTypes().add(this.getTrayOwner());
		trayZoneEClass.getESuperTypes().add(this.getNamedElement());
		bedEClass.getESuperTypes().add(this.getNamedElement());
		gridBedEClass.getESuperTypes().add(this.getBed());
		rowBedEClass.getESuperTypes().add(this.getBed());
		rowBedRowEClass.getESuperTypes().add(this.getPlantationOwner());
		sowPlanficationEClass.getESuperTypes().add(this.getPlanfication());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_SeedLib(), this.getKnowledgeBase(), null, "seedLib", null, 1, 1, Root.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Seedbank(), this.getSeedBank(), null, "seedbank", null, 1, 1, Root.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Zones(), this.getZone(), null, "zones", null, 0, -1, Root.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Nursary(), this.getNursary(), null, "nursary", null, 1, 1, Root.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Planifier(), this.getPlanifier(), null, "planifier", null, 0, 1, Root.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRoot__AddSowPlanification__SeedItem_List_SowType(), null,
				"addSowPlanification", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSeedItem(), "seedItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMonthWeeks(), "weeks", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSowType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRoot__AddCompatibility__Genus_Genus_int(), this.getCompatibilityLink(),
				"addCompatibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGenus(), "source", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGenus(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "cmp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(knowledgeBaseEClass, KnowledgeBase.class, "KnowledgeBase", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeBase_PlantTypes(), this.getGenus(), null, "plantTypes", null, 0, -1,
				KnowledgeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeBase_CompatibilityMatrix(), this.getCompatibilityMatrix(), null,
				"compatibilityMatrix", null, 0, 1, KnowledgeBase.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(seedBankEClass, SeedBank.class, "SeedBank", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeedBank_Items(), this.getSeedItem(), null, "items", null, 0, -1, SeedBank.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genusEClass, Genus.class, "Genus", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenus_Species(), this.getSpecies(), this.getSpecies_Type(), "species", null, 0, -1,
				Genus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenus_Family(), this.getFamily(), "family", null, 0, 1, Genus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenus_SubGenus(), this.getGenus(), null, "subGenus", null, 0, -1, Genus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenus_CompatibilityLinks(), this.getCompatibilityLink(),
				this.getCompatibilityLink_Species(), "compatibilityLinks", null, 0, -1, Genus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speciesEClass, Species.class, "Species", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecies_Type(), this.getGenus(), this.getGenus_Species(), "type", null, 1, 1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_UsdaHardinessMin(), ecorePackage.getEInt(), "usdaHardinessMin", null, 0, 1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_LightingCondition(), this.getShade(), "lightingCondition", null, 0, -1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_SoilType(), this.getSoilType(), "soilType", null, 0, -1, Species.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_Moisture(), this.getMoisture(), "moisture", null, 0, -1, Species.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSpecies_References(), this.getReference(), null, "references", null, 0, -1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_ProductiveMonths(), this.getMonthWeek(), "productiveMonths", null, 0, 12,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_BloomMonths(), this.getMonthWeek(), "bloomMonths", null, 0, 12,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_FruitConservation(), ecorePackage.getEInt(), "fruitConservation", "0", 0, 1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_FruitsAvailability(), this.getMonthWeek(), "fruitsAvailability", null, 0,
				-1, Species.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSpecies_Images(), this.getImage(), null, "images", null, 0, -1, Species.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_GrowRate(), this.getGrowRate(), "growRate", null, 0, 1, Species.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_Wind(), this.getWind(), "wind", null, 0, -1, Species.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, Species.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, Species.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_EatingType(), this.getEatingType(), "eatingType", null, 0, 1, Species.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_EdibleParts(), this.getEdiblePart(), "edibleParts", null, 0, -1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_UsdaHardinessMax(), ecorePackage.getEInt(), "usdaHardinessMax", null, 0, 1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_SpecialUses(), this.getSpecialUses(), "specialUses", null, 0, -1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_FlowerColor(), ecorePackage.getEString(), "flowerColor", null, 0, 1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_PruningMonths(), this.getMonthWeek(), "pruningMonths", null, 0, -1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_PruneNote(), ecorePackage.getEString(), "pruneNote", null, 0, 1,
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getSpecies__GetAllNames(), ecorePackage.getEString(), "getAllNames", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(seedItemEClass, SeedItem.class, "SeedItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeedItem_Type(), this.getSpecies(), null, "type", null, 1, 1, SeedItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeedItem_Quantity(), this.getQuantity(), "quantity", null, 0, 1, SeedItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSeedItem_ByDate(), ecorePackage.getEDate(), "byDate", null, 0, 1, SeedItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArea_SubAreas(), this.getArea(), null, "subAreas", null, 0, -1, Area.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArea_SoilType(), this.getSoilType(), "soilType", null, 0, 1, Area.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getArea_Events(), this.getEvent(), null, "events", null, 0, -1, Area.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getArea__GetActualSoilType(), this.getSoilType(), "getActualSoilType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(plantingEClass, Planting.class, "Planting", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanting_Areas(), this.getArea(), null, "areas", null, 0, -1, Planting.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanting_StartTime(), ecorePackage.getEDate(), "startTime", null, 0, 1,
				Planting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlanting_EndTime(), ecorePackage.getEDate(), "endTime", null, 0, 1, Planting.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantationEClass, Plantation.class, "Plantation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlantation_Type(), this.getSpecies(), null, "type", null, 0, 1, Plantation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantation_SowEvent(), this.getEvent(), null, "sowEvent", null, 0, 1,
				Plantation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantation_PlantationEvent(), this.getEvent(), null, "plantationEvent", null, 1, 1,
				Plantation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantation_Events(), this.getEvent(), null, "events", null, 0, -1, Plantation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantation_RemovalEvent(), this.getEvent(), null, "removalEvent", null, 0, 1,
				Plantation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantation_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Plantation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlantation__IsRemoved(), ecorePackage.getEBoolean(), "isRemoved", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(plantNamedElementEClass, PlantNamedElement.class, "PlantNamedElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlantNamedElement_CommonNames(), ecorePackage.getEString(), "commonNames", null, 1,
				-1, PlantNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantNamedElement_LatinName(), ecorePackage.getEString(), "latinName", null, 1, 1,
				PlantNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantNamedElement_RepresentationKey(), ecorePackage.getEString(),
				"representationKey", null, 0, 1, PlantNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantEClass, Plant.class, "Plant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlant_SowIndoorMonths(), this.getMonthWeek(), "sowIndoorMonths", null, 0, 12,
				Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlant_SowOutdoorMonths(), this.getMonthWeek(), "sowOutdoorMonths", null, 0, 12,
				Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlant_LifeCycle(), this.getLifecycle(), "lifeCycle", null, 0, 1, Plant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTree_Rootstock(), ecorePackage.getEString(), "rootstock", null, 0, 1, Tree.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Link(), this.getURL(), "link", null, 0, 1, Reference.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReference_Id(), ecorePackage.getEString(), "id", null, 0, 1, Reference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getReference_Source(), ecorePackage.getEString(), "source", null, 0, 1,
				Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Image.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getImage_Source(), ecorePackage.getEString(), "source", null, 0, 1, Image.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getImage_Path(), ecorePackage.getEString(), "path", null, 0, 1, Image.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Date(), this.getDate(), "date", null, 1, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Images(), this.getImage(), null, "images", null, 0, -1, Event.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Type(), this.getEventType(), "type", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneEClass, Zone.class, "Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZone_Plantings(), this.getPlanting(), null, "plantings", null, 0, -1, Zone.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nursaryEClass, Nursary.class, "Nursary", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNursary_Zones(), this.getTrayZone(), null, "zones", null, 0, -1, Nursary.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trayEClass, Tray.class, "Tray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTray_Rows(), this.getRow(), null, "rows", null, 0, -1, Tray.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getTray__GetEmptyCells(), this.getCell(), "getEmptyCells", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_Cells(), this.getCell(), null, "cells", null, 0, -1, Row.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCell_Species(), this.getSpecies(), null, "species", null, 0, 1, Cell.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Date(), this.getDate(), "date", null, 0, 1, Cell.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantationOwnerEClass, PlantationOwner.class, "PlantationOwner", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlantationOwner_Plantations(), this.getPlantation(), null, "plantations", null, 0,
				-1, PlantationOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantationOwner_Beds(), this.getBed(), null, "beds", null, 0, -1,
				PlantationOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trayZoneEClass, TrayZone.class, "TrayZone", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(trayOwnerEClass, TrayOwner.class, "TrayOwner", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrayOwner_Trays(), this.getTray(), null, "trays", null, 0, -1, TrayOwner.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bedEClass, Bed.class, "Bed", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gridBedEClass, GridBed.class, "GridBed", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGridBed_Rows(), this.getGridBedRow(), null, "rows", null, 0, -1, GridBed.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowBedEClass, RowBed.class, "RowBed", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRowBed_Rows(), this.getRowBedRow(), null, "rows", null, 0, -1, RowBed.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRowBed_Type(), this.getRowBedType(), "type", null, 0, 1, RowBed.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(gridBedRowEClass, GridBedRow.class, "GridBedRow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGridBedRow_Cells(), this.getGridBedCell(), null, "cells", null, 0, -1,
				GridBedRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridBedCellEClass, GridBedCell.class, "GridBedCell", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGridBedCell_Plantation(), this.getPlantation(), null, "plantation", null, 0, 1,
				GridBedCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowBedRowEClass, RowBedRow.class, "RowBedRow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(compatibilityLinkEClass, CompatibilityLink.class, "CompatibilityLink", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompatibilityLink_Species(), this.getGenus(), this.getGenus_CompatibilityLinks(),
				"species", null, 0, 2, CompatibilityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompatibilityLink_Affinity(), ecorePackage.getEInt(), "affinity", null, 0, 1,
				CompatibilityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompatibilityLink_Description(), ecorePackage.getEString(), "description", null, 0,
				1, CompatibilityLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compatibilityMatrixEClass, CompatibilityMatrix.class, "CompatibilityMatrix", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompatibilityMatrix_Compatibilties(), this.getCompatibilityLink(), null,
				"compatibilties", null, 0, -1, CompatibilityMatrix.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(planficationEClass, Planfication.class, "Planfication", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanfication_Weeks(), ecorePackage.getEInt(), "weeks", null, 0, -1,
				Planfication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planifierEClass, Planifier.class, "Planifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanifier_Planfications(), this.getPlanfication(), null, "planfications", null, 0,
				-1, Planifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sowPlanficationEClass, SowPlanfication.class, "SowPlanfication", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSowPlanfication_Seed(), this.getSeedItem(), null, "seed", null, 1, 1,
				SowPlanfication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSowPlanfication_Type(), this.getSowType(), "type", null, 0, 1,
				SowPlanfication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(quantityEEnum, Quantity.class, "Quantity");
		addEEnumLiteral(quantityEEnum, Quantity.UNKNOWN);
		addEEnumLiteral(quantityEEnum, Quantity.EMPTY);
		addEEnumLiteral(quantityEEnum, Quantity.LOW);
		addEEnumLiteral(quantityEEnum, Quantity.MEDIUM);
		addEEnumLiteral(quantityEEnum, Quantity.HIGHT);

		initEEnum(lifecycleEEnum, Lifecycle.class, "Lifecycle");
		addEEnumLiteral(lifecycleEEnum, Lifecycle.UNKNOWN);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.ANNUAL);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.BIENNIAL);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.PERENNIAL);

		initEEnum(shadeEEnum, Shade.class, "Shade");
		addEEnumLiteral(shadeEEnum, Shade.UNKNOWN);
		addEEnumLiteral(shadeEEnum, Shade.FULL_SHADE);
		addEEnumLiteral(shadeEEnum, Shade.SEMI);
		addEEnumLiteral(shadeEEnum, Shade.FULL_SUN);

		initEEnum(soilTypeEEnum, SoilType.class, "SoilType");
		addEEnumLiteral(soilTypeEEnum, SoilType.UNKNOWN);
		addEEnumLiteral(soilTypeEEnum, SoilType.LIGHT_SANDY);
		addEEnumLiteral(soilTypeEEnum, SoilType.MEDIUM_LOAM);
		addEEnumLiteral(soilTypeEEnum, SoilType.HEAVY);
		addEEnumLiteral(soilTypeEEnum, SoilType.HEAVY_CLAY);
		addEEnumLiteral(soilTypeEEnum, SoilType.POOR_SOIL);
		addEEnumLiteral(soilTypeEEnum, SoilType.WATER);

		initEEnum(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.class, "PH");
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.UNKNOWN);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.VERY_ACID);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.ACID);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.NEUTRAL);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.ALKALINE);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.VERY_ALKALINE);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.SALINE);

		initEEnum(moistureEEnum, Moisture.class, "Moisture");
		addEEnumLiteral(moistureEEnum, Moisture.UNKNOWN);
		addEEnumLiteral(moistureEEnum, Moisture.DRY_SOIL);
		addEEnumLiteral(moistureEEnum, Moisture.MOIST_SOIL);
		addEEnumLiteral(moistureEEnum, Moisture.WET);
		addEEnumLiteral(moistureEEnum, Moisture.WATER_PLANT);
		addEEnumLiteral(moistureEEnum, Moisture.WELL_DRAINED);
		addEEnumLiteral(moistureEEnum, Moisture.TOLERATE_GROUGHT);

		initEEnum(familyEEnum, Family.class, "Family");
		addEEnumLiteral(familyEEnum, Family.UNKNOWN);
		addEEnumLiteral(familyEEnum, Family.ACANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.ACHARIACEAE);
		addEEnumLiteral(familyEEnum, Family.ACHATOCARPACEAE);
		addEEnumLiteral(familyEEnum, Family.ACORACEAE);
		addEEnumLiteral(familyEEnum, Family.ACROBOLBACEAE);
		addEEnumLiteral(familyEEnum, Family.ACTINIDIACEAE);
		addEEnumLiteral(familyEEnum, Family.ADELANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.ADIANTACEAE);
		addEEnumLiteral(familyEEnum, Family.ADOXACEAE);
		addEEnumLiteral(familyEEnum, Family.AEXTOXICACEAE);
		addEEnumLiteral(familyEEnum, Family.AIZOACEAE);
		addEEnumLiteral(familyEEnum, Family.AKANIACEAE);
		addEEnumLiteral(familyEEnum, Family.ALISMATACEAE);
		addEEnumLiteral(familyEEnum, Family.ALLISONIACEAE);
		addEEnumLiteral(familyEEnum, Family.ALSEUOSMIACEAE);
		addEEnumLiteral(familyEEnum, Family.ALSTROEMERIACEAE);
		addEEnumLiteral(familyEEnum, Family.ALTINGIACEAE);
		addEEnumLiteral(familyEEnum, Family.ALZATEACEAE);
		addEEnumLiteral(familyEEnum, Family.AMARANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.AMARYLLIDACEAE);
		addEEnumLiteral(familyEEnum, Family.AMBLYSTEGIACEAE);
		addEEnumLiteral(familyEEnum, Family.AMBORELLACEAE);
		addEEnumLiteral(familyEEnum, Family.ANACARDIACEAE);
		addEEnumLiteral(familyEEnum, Family.ANARTHRIACEAE);
		addEEnumLiteral(familyEEnum, Family.ANASTROPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.ANCISTROCLADACEAE);
		addEEnumLiteral(familyEEnum, Family.ANDREAEACEAE);
		addEEnumLiteral(familyEEnum, Family.ANEURACEAE);
		addEEnumLiteral(familyEEnum, Family.ANISOPHYLLEACEAE);
		addEEnumLiteral(familyEEnum, Family.ANNONACEAE);
		addEEnumLiteral(familyEEnum, Family.ANTHELIACEAE);
		addEEnumLiteral(familyEEnum, Family.ANTHOCEROTACEAE);
		addEEnumLiteral(familyEEnum, Family.APHANOPETALACEAE);
		addEEnumLiteral(familyEEnum, Family.APHLOIACEAE);
		addEEnumLiteral(familyEEnum, Family.APIACEAE);
		addEEnumLiteral(familyEEnum, Family.APOCYNACEAE);
		addEEnumLiteral(familyEEnum, Family.APODANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.APONOGETONACEAE);
		addEEnumLiteral(familyEEnum, Family.AQUIFOLIACEAE);
		addEEnumLiteral(familyEEnum, Family.ARACEAE);
		addEEnumLiteral(familyEEnum, Family.ARALIACEAE);
		addEEnumLiteral(familyEEnum, Family.ARAUCARIACEAE);
		addEEnumLiteral(familyEEnum, Family.ARCHIDIACEAE);
		addEEnumLiteral(familyEEnum, Family.ARECACEAE);
		addEEnumLiteral(familyEEnum, Family.ARGOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.ARISTOLOCHIACEAE);
		addEEnumLiteral(familyEEnum, Family.ARNELLIACEAE);
		addEEnumLiteral(familyEEnum, Family.ASPARAGACEAE);
		addEEnumLiteral(familyEEnum, Family.ASPLENIACEAE);
		addEEnumLiteral(familyEEnum, Family.ASTELIACEAE);
		addEEnumLiteral(familyEEnum, Family.ASTEROPEIACEAE);
		addEEnumLiteral(familyEEnum, Family.ATHEROSPERMATACEAE);
		addEEnumLiteral(familyEEnum, Family.AULACOMNIACEAE);
		addEEnumLiteral(familyEEnum, Family.AUSTROBAILEYACEAE);
		addEEnumLiteral(familyEEnum, Family.AYTONIACEAE);
		addEEnumLiteral(familyEEnum, Family.BALANOPACEAE);
		addEEnumLiteral(familyEEnum, Family.BALANOPHORACEAE);
		addEEnumLiteral(familyEEnum, Family.BALANTIOPSACEAE);
		addEEnumLiteral(familyEEnum, Family.BALSAMINACEAE);
		addEEnumLiteral(familyEEnum, Family.BARBEUIACEAE);
		addEEnumLiteral(familyEEnum, Family.BARBEYACEAE);
		addEEnumLiteral(familyEEnum, Family.BARTRAMIACEAE);
		addEEnumLiteral(familyEEnum, Family.BASELLACEAE);
		addEEnumLiteral(familyEEnum, Family.BATACEAE);
		addEEnumLiteral(familyEEnum, Family.BEGONIACEAE);
		addEEnumLiteral(familyEEnum, Family.BERBERIDACEAE);
		addEEnumLiteral(familyEEnum, Family.BERBERIDOPSIDACEAE);
		addEEnumLiteral(familyEEnum, Family.BETULACEAE);
		addEEnumLiteral(familyEEnum, Family.BIEBERSTEINIACEAE);
		addEEnumLiteral(familyEEnum, Family.BIGNONIACEAE);
		addEEnumLiteral(familyEEnum, Family.BIXACEAE);
		addEEnumLiteral(familyEEnum, Family.BLANDFORDIACEAE);
		addEEnumLiteral(familyEEnum, Family.BLECHNACEAE);
		addEEnumLiteral(familyEEnum, Family.BONNETIACEAE);
		addEEnumLiteral(familyEEnum, Family.BORAGINACEAE);
		addEEnumLiteral(familyEEnum, Family.BORYACEAE);
		addEEnumLiteral(familyEEnum, Family.BOWENIACEAE);
		addEEnumLiteral(familyEEnum, Family.BRACHYTHECIACEAE);
		addEEnumLiteral(familyEEnum, Family.BRASSICACEAE);
		addEEnumLiteral(familyEEnum, Family.BREVIANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.BROMELIACEAE);
		addEEnumLiteral(familyEEnum, Family.BRUCHIACEAE);
		addEEnumLiteral(familyEEnum, Family.BRUNELLIACEAE);
		addEEnumLiteral(familyEEnum, Family.BRUNIACEAE);
		addEEnumLiteral(familyEEnum, Family.BRYACEAE);
		addEEnumLiteral(familyEEnum, Family.BRYOBARTRAMIACEAE);
		addEEnumLiteral(familyEEnum, Family.BRYOXIPHIACEAE);
		addEEnumLiteral(familyEEnum, Family.BURMANNIACEAE);
		addEEnumLiteral(familyEEnum, Family.BURSERACEAE);
		addEEnumLiteral(familyEEnum, Family.BUTOMACEAE);
		addEEnumLiteral(familyEEnum, Family.BUXACEAE);
		addEEnumLiteral(familyEEnum, Family.BUXBAUMIACEAE);
		addEEnumLiteral(familyEEnum, Family.BYBLIDACEAE);
		addEEnumLiteral(familyEEnum, Family.CABOMBACEAE);
		addEEnumLiteral(familyEEnum, Family.CACTACEAE);
		addEEnumLiteral(familyEEnum, Family.CALCEOLARIACEAE);
		addEEnumLiteral(familyEEnum, Family.CALOMNIACEAE);
		addEEnumLiteral(familyEEnum, Family.CALOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.CALYCANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.CALYCERACEAE);
		addEEnumLiteral(familyEEnum, Family.CALYMPERACEAE);
		addEEnumLiteral(familyEEnum, Family.CALYPOGEIACEAE);
		addEEnumLiteral(familyEEnum, Family.CAMPANULACEAE);
		addEEnumLiteral(familyEEnum, Family.CAMPYNEUMATACEAE);
		addEEnumLiteral(familyEEnum, Family.CANELLACEAE);
		addEEnumLiteral(familyEEnum, Family.CANNABACEAE);
		addEEnumLiteral(familyEEnum, Family.CANNACEAE);
		addEEnumLiteral(familyEEnum, Family.CAPPARACEAE);
		addEEnumLiteral(familyEEnum, Family.CAPRIFOLIACEAE);
		addEEnumLiteral(familyEEnum, Family.CARDIOPTERIDACEAE);
		addEEnumLiteral(familyEEnum, Family.CARICACEAE);
		addEEnumLiteral(familyEEnum, Family.CARLEMANNIACEAE);
		addEEnumLiteral(familyEEnum, Family.CARYOCARACEAE);
		addEEnumLiteral(familyEEnum, Family.CARYOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.CASUARINACEAE);
		addEEnumLiteral(familyEEnum, Family.CATAGONIACEAE);
		addEEnumLiteral(familyEEnum, Family.CATOSCOPIACEAE);
		addEEnumLiteral(familyEEnum, Family.CELASTRACEAE);
		addEEnumLiteral(familyEEnum, Family.CENTROLEPIDACEAE);
		addEEnumLiteral(familyEEnum, Family.CENTROPLACACEAE);
		addEEnumLiteral(familyEEnum, Family.CEPHALOTACEAE);
		addEEnumLiteral(familyEEnum, Family.CEPHALOTAXACEAE);
		addEEnumLiteral(familyEEnum, Family.CEPHALOZIACEAE);
		addEEnumLiteral(familyEEnum, Family.CEPHALOZIELLACEAE);
		addEEnumLiteral(familyEEnum, Family.CERATOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.CERCIDIPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.CHAETOPHYLLOPSACEAE);
		addEEnumLiteral(familyEEnum, Family.CHLORANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.CHONECOLEACEAE);
		addEEnumLiteral(familyEEnum, Family.CHRYSOBALANACEAE);
		addEEnumLiteral(familyEEnum, Family.CINCLIDOTACEAE);
		addEEnumLiteral(familyEEnum, Family.CIRCAEASTERACEAE);
		addEEnumLiteral(familyEEnum, Family.CISTACEAE);
		addEEnumLiteral(familyEEnum, Family.CLEOMACEAE);
		addEEnumLiteral(familyEEnum, Family.CLETHRACEAE);
		addEEnumLiteral(familyEEnum, Family.CLEVEACEAE);
		addEEnumLiteral(familyEEnum, Family.CLIMACIACEAE);
		addEEnumLiteral(familyEEnum, Family.CLUSIACEAE);
		addEEnumLiteral(familyEEnum, Family.COLCHICACEAE);
		addEEnumLiteral(familyEEnum, Family.COLUMELLIACEAE);
		addEEnumLiteral(familyEEnum, Family.COMBRETACEAE);
		addEEnumLiteral(familyEEnum, Family.COMMELINACEAE);
		addEEnumLiteral(familyEEnum, Family.COMPOSITAE);
		addEEnumLiteral(familyEEnum, Family.CONNARACEAE);
		addEEnumLiteral(familyEEnum, Family.CONOCEPHALACEAE);
		addEEnumLiteral(familyEEnum, Family.CONVOLVULACEAE);
		addEEnumLiteral(familyEEnum, Family.CORIARIACEAE);
		addEEnumLiteral(familyEEnum, Family.CORNACEAE);
		addEEnumLiteral(familyEEnum, Family.CORSIACEAE);
		addEEnumLiteral(familyEEnum, Family.CORSINIACEAE);
		addEEnumLiteral(familyEEnum, Family.CORYNOCARPACEAE);
		addEEnumLiteral(familyEEnum, Family.COSTACEAE);
		addEEnumLiteral(familyEEnum, Family.CRASSULACEAE);
		addEEnumLiteral(familyEEnum, Family.CROSSOSOMATACEAE);
		addEEnumLiteral(familyEEnum, Family.CRYPHAEACEAE);
		addEEnumLiteral(familyEEnum, Family.CRYPTERONIACEAE);
		addEEnumLiteral(familyEEnum, Family.CTENOLOPHONACEAE);
		addEEnumLiteral(familyEEnum, Family.CUCURBITACEAE);
		addEEnumLiteral(familyEEnum, Family.CUNONIACEAE);
		addEEnumLiteral(familyEEnum, Family.CUPRESSACEAE);
		addEEnumLiteral(familyEEnum, Family.CURTISIACEAE);
		addEEnumLiteral(familyEEnum, Family.CYATHEACEAE);
		addEEnumLiteral(familyEEnum, Family.CYCADACEAE);
		addEEnumLiteral(familyEEnum, Family.CYCLANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.CYMODOCEACEAE);
		addEEnumLiteral(familyEEnum, Family.CYNOMORIACEAE);
		addEEnumLiteral(familyEEnum, Family.CYPERACEAE);
		addEEnumLiteral(familyEEnum, Family.CYRILLACEAE);
		addEEnumLiteral(familyEEnum, Family.CYRTOPODACEAE);
		addEEnumLiteral(familyEEnum, Family.CYTINACEAE);
		addEEnumLiteral(familyEEnum, Family.DALTONIACEAE);
		addEEnumLiteral(familyEEnum, Family.DAPHNIPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.DASYPOGONACEAE);
		addEEnumLiteral(familyEEnum, Family.DATISCACEAE);
		addEEnumLiteral(familyEEnum, Family.DAVALLIACEAE);
		addEEnumLiteral(familyEEnum, Family.DEGENERIACEAE);
		addEEnumLiteral(familyEEnum, Family.DENDROCEROTACEAE);
		addEEnumLiteral(familyEEnum, Family.DENNSTAEDTIACEAE);
		addEEnumLiteral(familyEEnum, Family.DIAPENSIACEAE);
		addEEnumLiteral(familyEEnum, Family.DICHAPETALACEAE);
		addEEnumLiteral(familyEEnum, Family.DICKSONIACEAE);
		addEEnumLiteral(familyEEnum, Family.DICNEMONACEAE);
		addEEnumLiteral(familyEEnum, Family.DICRANACEAE);
		addEEnumLiteral(familyEEnum, Family.DIDIEREACEAE);
		addEEnumLiteral(familyEEnum, Family.DILLENIACEAE);
		addEEnumLiteral(familyEEnum, Family.DIONCOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.DIOSCOREACEAE);
		addEEnumLiteral(familyEEnum, Family.DIPENTODONTACEAE);
		addEEnumLiteral(familyEEnum, Family.DIPTERIDACEAE);
		addEEnumLiteral(familyEEnum, Family.DIPTEROCARPACEAE);
		addEEnumLiteral(familyEEnum, Family.DIRACHMACEAE);
		addEEnumLiteral(familyEEnum, Family.DISCELIACEAE);
		addEEnumLiteral(familyEEnum, Family.DITRICHACEAE);
		addEEnumLiteral(familyEEnum, Family.DORYANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.DROSERACEAE);
		addEEnumLiteral(familyEEnum, Family.DROSOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.DRYOPTERIDACEAE);
		addEEnumLiteral(familyEEnum, Family.EBENACEAE);
		addEEnumLiteral(familyEEnum, Family.ECDEIOCOLEACEAE);
		addEEnumLiteral(familyEEnum, Family.ECHINODIACEAE);
		addEEnumLiteral(familyEEnum, Family.ELAEAGNACEAE);
		addEEnumLiteral(familyEEnum, Family.ELAEOCARPACEAE);
		addEEnumLiteral(familyEEnum, Family.ELATINACEAE);
		addEEnumLiteral(familyEEnum, Family.EMBLINGIACEAE);
		addEEnumLiteral(familyEEnum, Family.ENCALYPTACEAE);
		addEEnumLiteral(familyEEnum, Family.ENTODONTACEAE);
		addEEnumLiteral(familyEEnum, Family.EPHEDRACEAE);
		addEEnumLiteral(familyEEnum, Family.EPHEMERACEAE);
		addEEnumLiteral(familyEEnum, Family.EQUISETACEAE);
		addEEnumLiteral(familyEEnum, Family.ERICACEAE);
		addEEnumLiteral(familyEEnum, Family.ERIOCAULACEAE);
		addEEnumLiteral(familyEEnum, Family.ERPODIACEAE);
		addEEnumLiteral(familyEEnum, Family.ERYTHROXYLACEAE);
		addEEnumLiteral(familyEEnum, Family.ESCALLONIACEAE);
		addEEnumLiteral(familyEEnum, Family.EUCOMMIACEAE);
		addEEnumLiteral(familyEEnum, Family.EUPHORBIACEAE);
		addEEnumLiteral(familyEEnum, Family.EUPHRONIACEAE);
		addEEnumLiteral(familyEEnum, Family.EUPOMATIACEAE);
		addEEnumLiteral(familyEEnum, Family.EUPTELEACEAE);
		addEEnumLiteral(familyEEnum, Family.EUSTICHIACEAE);
		addEEnumLiteral(familyEEnum, Family.EXORMOTHECACEAE);
		addEEnumLiteral(familyEEnum, Family.FABRONIACEAE);
		addEEnumLiteral(familyEEnum, Family.FAGACEAE);
		addEEnumLiteral(familyEEnum, Family.FISSIDENTACEAE);
		addEEnumLiteral(familyEEnum, Family.FLAGELLARIACEAE);
		addEEnumLiteral(familyEEnum, Family.FONTINALACEAE);
		addEEnumLiteral(familyEEnum, Family.FONTINALIACEAE);
		addEEnumLiteral(familyEEnum, Family.FOSSOMBRONIACEAE);
		addEEnumLiteral(familyEEnum, Family.FOUQUIERIACEAE);
		addEEnumLiteral(familyEEnum, Family.FRANKENIACEAE);
		addEEnumLiteral(familyEEnum, Family.FUNARIACEAE);
		addEEnumLiteral(familyEEnum, Family.GARRYACEAE);
		addEEnumLiteral(familyEEnum, Family.GEISSOLOMATACEAE);
		addEEnumLiteral(familyEEnum, Family.GELSEMIACEAE);
		addEEnumLiteral(familyEEnum, Family.GENTIANACEAE);
		addEEnumLiteral(familyEEnum, Family.GEOCALYCACEAE);
		addEEnumLiteral(familyEEnum, Family.GERANIACEAE);
		addEEnumLiteral(familyEEnum, Family.GESNERIACEAE);
		addEEnumLiteral(familyEEnum, Family.GIGASPERMACEAE);
		addEEnumLiteral(familyEEnum, Family.GINKGOACEAE);
		addEEnumLiteral(familyEEnum, Family.GISEKIACEAE);
		addEEnumLiteral(familyEEnum, Family.GLEICHENIACEAE);
		addEEnumLiteral(familyEEnum, Family.GNETACEAE);
		addEEnumLiteral(familyEEnum, Family.GOEBELIELLACEAE);
		addEEnumLiteral(familyEEnum, Family.GOMORTEGACEAE);
		addEEnumLiteral(familyEEnum, Family.GOODENIACEAE);
		addEEnumLiteral(familyEEnum, Family.GOUPIACEAE);
		addEEnumLiteral(familyEEnum, Family.GRAMMITIDACEAE);
		addEEnumLiteral(familyEEnum, Family.GRIMMIACEAE);
		addEEnumLiteral(familyEEnum, Family.GRISELINIACEAE);
		addEEnumLiteral(familyEEnum, Family.GROSSULARIACEAE);
		addEEnumLiteral(familyEEnum, Family.GRUBBIACEAE);
		addEEnumLiteral(familyEEnum, Family.GUNNERACEAE);
		addEEnumLiteral(familyEEnum, Family.GYMNOMITRIACEAE);
		addEEnumLiteral(familyEEnum, Family.GYROSTEMONACEAE);
		addEEnumLiteral(familyEEnum, Family.HAEMODORACEAE);
		addEEnumLiteral(familyEEnum, Family.HALOPHYTACEAE);
		addEEnumLiteral(familyEEnum, Family.HALORAGACEAE);
		addEEnumLiteral(familyEEnum, Family.HAMAMELIDACEAE);
		addEEnumLiteral(familyEEnum, Family.HANGUANACEAE);
		addEEnumLiteral(familyEEnum, Family.HAPLOMITRIACEAE);
		addEEnumLiteral(familyEEnum, Family.HAPTANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.HEDWIGIACEAE);
		addEEnumLiteral(familyEEnum, Family.HELICONIACEAE);
		addEEnumLiteral(familyEEnum, Family.HELICOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.HELWINGIACEAE);
		addEEnumLiteral(familyEEnum, Family.HERBERTACEAE);
		addEEnumLiteral(familyEEnum, Family.HERNANDIACEAE);
		addEEnumLiteral(familyEEnum, Family.HIMANTANDRACEAE);
		addEEnumLiteral(familyEEnum, Family.HOOKERIACEAE);
		addEEnumLiteral(familyEEnum, Family.HUACEAE);
		addEEnumLiteral(familyEEnum, Family.HUMIRIACEAE);
		addEEnumLiteral(familyEEnum, Family.HYDATELLACEAE);
		addEEnumLiteral(familyEEnum, Family.HYDNORACEAE);
		addEEnumLiteral(familyEEnum, Family.HYDRANGEACEAE);
		addEEnumLiteral(familyEEnum, Family.HYDROCHARITACEAE);
		addEEnumLiteral(familyEEnum, Family.HYDROLEACEAE);
		addEEnumLiteral(familyEEnum, Family.HYDROSTACHYACEAE);
		addEEnumLiteral(familyEEnum, Family.HYLOCOMIACEAE);
		addEEnumLiteral(familyEEnum, Family.HYMENOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.HYMENOPHYLLOPSIDACEAE);
		addEEnumLiteral(familyEEnum, Family.HYMENOPHYTACEAE);
		addEEnumLiteral(familyEEnum, Family.HYPERICACEAE);
		addEEnumLiteral(familyEEnum, Family.HYPNACEAE);
		addEEnumLiteral(familyEEnum, Family.HYPNODENDRACEAE);
		addEEnumLiteral(familyEEnum, Family.HYPOPTERYGIACEAE);
		addEEnumLiteral(familyEEnum, Family.HYPOXIDACEAE);
		addEEnumLiteral(familyEEnum, Family.ICACINACEAE);
		addEEnumLiteral(familyEEnum, Family.IRIDACEAE);
		addEEnumLiteral(familyEEnum, Family.IRVINGIACEAE);
		addEEnumLiteral(familyEEnum, Family.ISOETACEAE);
		addEEnumLiteral(familyEEnum, Family.ITEACEAE);
		addEEnumLiteral(familyEEnum, Family.IXIOLIRIACEAE);
		addEEnumLiteral(familyEEnum, Family.IXONANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.JACKIELLACEAE);
		addEEnumLiteral(familyEEnum, Family.JOINVILLEACEAE);
		addEEnumLiteral(familyEEnum, Family.JUBULACEAE);
		addEEnumLiteral(familyEEnum, Family.JUBULOPSACEAE);
		addEEnumLiteral(familyEEnum, Family.JUGLANDACEAE);
		addEEnumLiteral(familyEEnum, Family.JUNCACEAE);
		addEEnumLiteral(familyEEnum, Family.JUNCAGINACEAE);
		addEEnumLiteral(familyEEnum, Family.JUNGERMANNIACEAE);
		addEEnumLiteral(familyEEnum, Family.KIRKIACEAE);
		addEEnumLiteral(familyEEnum, Family.KOEBERLINIACEAE);
		addEEnumLiteral(familyEEnum, Family.KRAMERIACEAE);
		addEEnumLiteral(familyEEnum, Family.LACISTEMATACEAE);
		addEEnumLiteral(familyEEnum, Family.LACTORIDACEAE);
		addEEnumLiteral(familyEEnum, Family.LAMIACEAE);
		addEEnumLiteral(familyEEnum, Family.LANARIACEAE);
		addEEnumLiteral(familyEEnum, Family.LARDIZABALACEAE);
		addEEnumLiteral(familyEEnum, Family.LAURACEAE);
		addEEnumLiteral(familyEEnum, Family.LECYTHIDACEAE);
		addEEnumLiteral(familyEEnum, Family.LEGUMINOSAE);
		addEEnumLiteral(familyEEnum, Family.LEJEUNEACEAE);
		addEEnumLiteral(familyEEnum, Family.LEMBOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.LENTIBULARIACEAE);
		addEEnumLiteral(familyEEnum, Family.LEPICOLEACEAE);
		addEEnumLiteral(familyEEnum, Family.LEPIDOBOTRYACEAE);
		addEEnumLiteral(familyEEnum, Family.LEPIDOLAENACEAE);
		addEEnumLiteral(familyEEnum, Family.LEPIDOZIACEAE);
		addEEnumLiteral(familyEEnum, Family.LEPTODONTACEAE);
		addEEnumLiteral(familyEEnum, Family.LEPYRODONTACEAE);
		addEEnumLiteral(familyEEnum, Family.LESKEACEAE);
		addEEnumLiteral(familyEEnum, Family.LEUCODONTACEAE);
		addEEnumLiteral(familyEEnum, Family.LEUCOMIACEAE);
		addEEnumLiteral(familyEEnum, Family.LILIACEAE);
		addEEnumLiteral(familyEEnum, Family.LIMEACEAE);
		addEEnumLiteral(familyEEnum, Family.LIMNANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.LINACEAE);
		addEEnumLiteral(familyEEnum, Family.LINDERNIACEAE);
		addEEnumLiteral(familyEEnum, Family.LOASACEAE);
		addEEnumLiteral(familyEEnum, Family.LOGANIACEAE);
		addEEnumLiteral(familyEEnum, Family.LOMARIOPSIDACEAE);
		addEEnumLiteral(familyEEnum, Family.LOPHIOCARPACEAE);
		addEEnumLiteral(familyEEnum, Family.LOPHOCOLEACEAE);
		addEEnumLiteral(familyEEnum, Family.LOPHOZIACEAE);
		addEEnumLiteral(familyEEnum, Family.LORANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.LOWIACEAE);
		addEEnumLiteral(familyEEnum, Family.LOXSOMATACEAE);
		addEEnumLiteral(familyEEnum, Family.LUNULARIACEAE);
		addEEnumLiteral(familyEEnum, Family.LYCOPODIACEAE);
		addEEnumLiteral(familyEEnum, Family.LYTHRACEAE);
		addEEnumLiteral(familyEEnum, Family.MAGNOLIACEAE);
		addEEnumLiteral(familyEEnum, Family.MAKINOACEAE);
		addEEnumLiteral(familyEEnum, Family.MALPIGHIACEAE);
		addEEnumLiteral(familyEEnum, Family.MALVACEAE);
		addEEnumLiteral(familyEEnum, Family.MARANTACEAE);
		addEEnumLiteral(familyEEnum, Family.MARATTIACEAE);
		addEEnumLiteral(familyEEnum, Family.MARCGRAVIACEAE);
		addEEnumLiteral(familyEEnum, Family.MARCHANTIACEAE);
		addEEnumLiteral(familyEEnum, Family.MARSILEACEAE);
		addEEnumLiteral(familyEEnum, Family.MARTYNIACEAE);
		addEEnumLiteral(familyEEnum, Family.MASTIGOPHORACEAE);
		addEEnumLiteral(familyEEnum, Family.MATONIACEAE);
		addEEnumLiteral(familyEEnum, Family.MAYACACEAE);
		addEEnumLiteral(familyEEnum, Family.MEESIACEAE);
		addEEnumLiteral(familyEEnum, Family.MELANTHIACEAE);
		addEEnumLiteral(familyEEnum, Family.MELASTOMATACEAE);
		addEEnumLiteral(familyEEnum, Family.MELIACEAE);
		addEEnumLiteral(familyEEnum, Family.MELIANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.MENISPERMACEAE);
		addEEnumLiteral(familyEEnum, Family.MENYANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.MESOPTYCHIACEAE);
		addEEnumLiteral(familyEEnum, Family.METAXYACEAE);
		addEEnumLiteral(familyEEnum, Family.METEORIACEAE);
		addEEnumLiteral(familyEEnum, Family.METTENIUSACEAE);
		addEEnumLiteral(familyEEnum, Family.METZGERIACEAE);
		addEEnumLiteral(familyEEnum, Family.MISODENDRACEAE);
		addEEnumLiteral(familyEEnum, Family.MITRASTEMONACEAE);
		addEEnumLiteral(familyEEnum, Family.MITTENIACEAE);
		addEEnumLiteral(familyEEnum, Family.MNIACEAE);
		addEEnumLiteral(familyEEnum, Family.MOLLUGINACEAE);
		addEEnumLiteral(familyEEnum, Family.MONIMIACEAE);
		addEEnumLiteral(familyEEnum, Family.MONOCARPACEAE);
		addEEnumLiteral(familyEEnum, Family.MONTIACEAE);
		addEEnumLiteral(familyEEnum, Family.MONTINIACEAE);
		addEEnumLiteral(familyEEnum, Family.MORACEAE);
		addEEnumLiteral(familyEEnum, Family.MORINGACEAE);
		addEEnumLiteral(familyEEnum, Family.MUNTINGIACEAE);
		addEEnumLiteral(familyEEnum, Family.MUSACEAE);
		addEEnumLiteral(familyEEnum, Family.MYLIACEAE);
		addEEnumLiteral(familyEEnum, Family.MYODOCARPACEAE);
		addEEnumLiteral(familyEEnum, Family.MYRICACEAE);
		addEEnumLiteral(familyEEnum, Family.MYRINIACEAE);
		addEEnumLiteral(familyEEnum, Family.MYRISTICACEAE);
		addEEnumLiteral(familyEEnum, Family.MYROTHAMNACEAE);
		addEEnumLiteral(familyEEnum, Family.MYRTACEAE);
		addEEnumLiteral(familyEEnum, Family.MYURIACEAE);
		addEEnumLiteral(familyEEnum, Family.NARTHECIACEAE);
		addEEnumLiteral(familyEEnum, Family.NECKERACEAE);
		addEEnumLiteral(familyEEnum, Family.NELUMBONACEAE);
		addEEnumLiteral(familyEEnum, Family.NEOTRICHOCOLEACEAE);
		addEEnumLiteral(familyEEnum, Family.NEPENTHACEAE);
		addEEnumLiteral(familyEEnum, Family.NEURADACEAE);
		addEEnumLiteral(familyEEnum, Family.NITRARIACEAE);
		addEEnumLiteral(familyEEnum, Family.NOTHOFAGACEAE);
		addEEnumLiteral(familyEEnum, Family.NOTOTHYLADACEAE);
		addEEnumLiteral(familyEEnum, Family.NYCTAGINACEAE);
		addEEnumLiteral(familyEEnum, Family.NYMPHAEACEAE);
		addEEnumLiteral(familyEEnum, Family.OCHNACEAE);
		addEEnumLiteral(familyEEnum, Family.OCTOBLEPHARACEAE);
		addEEnumLiteral(familyEEnum, Family.OEDIPODIACEAE);
		addEEnumLiteral(familyEEnum, Family.OLACACEAE);
		addEEnumLiteral(familyEEnum, Family.OLEACEAE);
		addEEnumLiteral(familyEEnum, Family.OLEANDRACEAE);
		addEEnumLiteral(familyEEnum, Family.ONAGRACEAE);
		addEEnumLiteral(familyEEnum, Family.ONCOTHECACEAE);
		addEEnumLiteral(familyEEnum, Family.OPHIOGLOSSACEAE);
		addEEnumLiteral(familyEEnum, Family.OPILIACEAE);
		addEEnumLiteral(familyEEnum, Family.ORCHIDACEAE);
		addEEnumLiteral(familyEEnum, Family.OROBANCHACEAE);
		addEEnumLiteral(familyEEnum, Family.ORTHORRHYNCHIACEAE);
		addEEnumLiteral(familyEEnum, Family.ORTHOTRICHACEAE);
		addEEnumLiteral(familyEEnum, Family.OSMUNDACEAE);
		addEEnumLiteral(familyEEnum, Family.OXALIDACEAE);
		addEEnumLiteral(familyEEnum, Family.OXYMITRACEAE);
		addEEnumLiteral(familyEEnum, Family.PAEONIACEAE);
		addEEnumLiteral(familyEEnum, Family.PALLAVICINIACEAE);
		addEEnumLiteral(familyEEnum, Family.PANDACEAE);
		addEEnumLiteral(familyEEnum, Family.PANDANACEAE);
		addEEnumLiteral(familyEEnum, Family.PAPAVERACEAE);
		addEEnumLiteral(familyEEnum, Family.PARACRYPHIACEAE);
		addEEnumLiteral(familyEEnum, Family.PASSIFLORACEAE);
		addEEnumLiteral(familyEEnum, Family.PAULOWNIACEAE);
		addEEnumLiteral(familyEEnum, Family.PEDALIACEAE);
		addEEnumLiteral(familyEEnum, Family.PELLIACEAE);
		addEEnumLiteral(familyEEnum, Family.PENAEACEAE);
		addEEnumLiteral(familyEEnum, Family.PENTADIPLANDRACEAE);
		addEEnumLiteral(familyEEnum, Family.PENTAPHRAGMATACEAE);
		addEEnumLiteral(familyEEnum, Family.PENTAPHYLACACEAE);
		addEEnumLiteral(familyEEnum, Family.PENTHORACEAE);
		addEEnumLiteral(familyEEnum, Family.PERACEAE);
		addEEnumLiteral(familyEEnum, Family.PERIDISCACEAE);
		addEEnumLiteral(familyEEnum, Family.PETERMANNIACEAE);
		addEEnumLiteral(familyEEnum, Family.PETROSAVIACEAE);
		addEEnumLiteral(familyEEnum, Family.PHILESIACEAE);
		addEEnumLiteral(familyEEnum, Family.PHILYDRACEAE);
		addEEnumLiteral(familyEEnum, Family.PHRYMACEAE);
		addEEnumLiteral(familyEEnum, Family.PHYLLANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.PHYLLODREPANIACEAE);
		addEEnumLiteral(familyEEnum, Family.PHYLLOGONIACEAE);
		addEEnumLiteral(familyEEnum, Family.PHYLLONOMACEAE);
		addEEnumLiteral(familyEEnum, Family.PHYSENACEAE);
		addEEnumLiteral(familyEEnum, Family.PHYTOLACCACEAE);
		addEEnumLiteral(familyEEnum, Family.PICRAMNIACEAE);
		addEEnumLiteral(familyEEnum, Family.PICRODENDRACEAE);
		addEEnumLiteral(familyEEnum, Family.PILOTRICHACEAE);
		addEEnumLiteral(familyEEnum, Family.PINACEAE);
		addEEnumLiteral(familyEEnum, Family.PIPERACEAE);
		addEEnumLiteral(familyEEnum, Family.PITTOSPORACEAE);
		addEEnumLiteral(familyEEnum, Family.PLAGIOCHILACEAE);
		addEEnumLiteral(familyEEnum, Family.PLAGIOGYRIACEAE);
		addEEnumLiteral(familyEEnum, Family.PLAGIOTHECIACEAE);
		addEEnumLiteral(familyEEnum, Family.PLANTAGINACEAE);
		addEEnumLiteral(familyEEnum, Family.PLATANACEAE);
		addEEnumLiteral(familyEEnum, Family.PLEUROZIACEAE);
		addEEnumLiteral(familyEEnum, Family.PLEUROZIOPSACEAE);
		addEEnumLiteral(familyEEnum, Family.PLOCOSPERMATACEAE);
		addEEnumLiteral(familyEEnum, Family.PLUMBAGINACEAE);
		addEEnumLiteral(familyEEnum, Family.POACEAE);
		addEEnumLiteral(familyEEnum, Family.PODOCARPACEAE);
		addEEnumLiteral(familyEEnum, Family.PODOSTEMACEAE);
		addEEnumLiteral(familyEEnum, Family.POLEMONIACEAE);
		addEEnumLiteral(familyEEnum, Family.POLYGALACEAE);
		addEEnumLiteral(familyEEnum, Family.POLYGONACEAE);
		addEEnumLiteral(familyEEnum, Family.POLYPODIACEAE);
		addEEnumLiteral(familyEEnum, Family.POLYTRICHACEAE);
		addEEnumLiteral(familyEEnum, Family.PONTEDERIACEAE);
		addEEnumLiteral(familyEEnum, Family.PORELLACEAE);
		addEEnumLiteral(familyEEnum, Family.PORTULACACEAE);
		addEEnumLiteral(familyEEnum, Family.POSIDONIACEAE);
		addEEnumLiteral(familyEEnum, Family.POTAMOGETONACEAE);
		addEEnumLiteral(familyEEnum, Family.POTTIACEAE);
		addEEnumLiteral(familyEEnum, Family.PRIMULACEAE);
		addEEnumLiteral(familyEEnum, Family.PRIONODONTACEAE);
		addEEnumLiteral(familyEEnum, Family.PROTEACEAE);
		addEEnumLiteral(familyEEnum, Family.PSEUDOLEPICOLEACEAE);
		addEEnumLiteral(familyEEnum, Family.PSILOTACEAE);
		addEEnumLiteral(familyEEnum, Family.PTERIDACEAE);
		addEEnumLiteral(familyEEnum, Family.PTERIGYNANDRACEAE);
		addEEnumLiteral(familyEEnum, Family.PTEROBRYACEAE);
		addEEnumLiteral(familyEEnum, Family.PTILIDIACEAE);
		addEEnumLiteral(familyEEnum, Family.PTYCHOMITRIACEAE);
		addEEnumLiteral(familyEEnum, Family.PTYCHOMNIACEAE);
		addEEnumLiteral(familyEEnum, Family.PUTRANJIVACEAE);
		addEEnumLiteral(familyEEnum, Family.QUILLAJACEAE);
		addEEnumLiteral(familyEEnum, Family.RACOPILACEAE);
		addEEnumLiteral(familyEEnum, Family.RADULACEAE);
		addEEnumLiteral(familyEEnum, Family.RAFFLESIACEAE);
		addEEnumLiteral(familyEEnum, Family.RANUNCULACEAE);
		addEEnumLiteral(familyEEnum, Family.RAPATEACEAE);
		addEEnumLiteral(familyEEnum, Family.REGMATODONTACEAE);
		addEEnumLiteral(familyEEnum, Family.RESEDACEAE);
		addEEnumLiteral(familyEEnum, Family.RESTIONACEAE);
		addEEnumLiteral(familyEEnum, Family.RHABDODENDRACEAE);
		addEEnumLiteral(familyEEnum, Family.RHABDOWEISIACEAE);
		addEEnumLiteral(familyEEnum, Family.RHACHITHECIACEAE);
		addEEnumLiteral(familyEEnum, Family.RHACOCARPACEAE);
		addEEnumLiteral(familyEEnum, Family.RHAMNACEAE);
		addEEnumLiteral(familyEEnum, Family.RHIPOGONACEAE);
		addEEnumLiteral(familyEEnum, Family.RHIZOGONIACEAE);
		addEEnumLiteral(familyEEnum, Family.RHIZOPHORACEAE);
		addEEnumLiteral(familyEEnum, Family.RICCIACEAE);
		addEEnumLiteral(familyEEnum, Family.RIELLACEAE);
		addEEnumLiteral(familyEEnum, Family.RIGODIACEAE);
		addEEnumLiteral(familyEEnum, Family.RORIDULACEAE);
		addEEnumLiteral(familyEEnum, Family.ROSACEAE);
		addEEnumLiteral(familyEEnum, Family.ROUSSEACEAE);
		addEEnumLiteral(familyEEnum, Family.RUBIACEAE);
		addEEnumLiteral(familyEEnum, Family.RUPPIACEAE);
		addEEnumLiteral(familyEEnum, Family.RUTACEAE);
		addEEnumLiteral(familyEEnum, Family.RUTENBERGIACEAE);
		addEEnumLiteral(familyEEnum, Family.SABIACEAE);
		addEEnumLiteral(familyEEnum, Family.SALICACEAE);
		addEEnumLiteral(familyEEnum, Family.SALVADORACEAE);
		addEEnumLiteral(familyEEnum, Family.SALVINIACEAE);
		addEEnumLiteral(familyEEnum, Family.SANTALACEAE);
		addEEnumLiteral(familyEEnum, Family.SAPINDACEAE);
		addEEnumLiteral(familyEEnum, Family.SAPOTACEAE);
		addEEnumLiteral(familyEEnum, Family.SARCOBATACEAE);
		addEEnumLiteral(familyEEnum, Family.SARCOLAENACEAE);
		addEEnumLiteral(familyEEnum, Family.SARRACENIACEAE);
		addEEnumLiteral(familyEEnum, Family.SAURURACEAE);
		addEEnumLiteral(familyEEnum, Family.SAXIFRAGACEAE);
		addEEnumLiteral(familyEEnum, Family.SCAPANIACEAE);
		addEEnumLiteral(familyEEnum, Family.SCHEUCHZERIACEAE);
		addEEnumLiteral(familyEEnum, Family.SCHISANDRACEAE);
		addEEnumLiteral(familyEEnum, Family.SCHISTOCHILACEAE);
		addEEnumLiteral(familyEEnum, Family.SCHISTOSTEGACEAE);
		addEEnumLiteral(familyEEnum, Family.SCHIZAEACEAE);
		addEEnumLiteral(familyEEnum, Family.SCHLEGELIACEAE);
		addEEnumLiteral(familyEEnum, Family.SCHOEPFIACEAE);
		addEEnumLiteral(familyEEnum, Family.SCORPIDIACEAE);
		addEEnumLiteral(familyEEnum, Family.SCROPHULARIACEAE);
		addEEnumLiteral(familyEEnum, Family.SELAGINELLACEAE);
		addEEnumLiteral(familyEEnum, Family.SELIGERIACEAE);
		addEEnumLiteral(familyEEnum, Family.SEMATOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.SERPOTORTELLACEAE);
		addEEnumLiteral(familyEEnum, Family.SETCHELLANTHACEAE);
		addEEnumLiteral(familyEEnum, Family.SIMAROUBACEAE);
		addEEnumLiteral(familyEEnum, Family.SIMMONDSIACEAE);
		addEEnumLiteral(familyEEnum, Family.SIPARUNACEAE);
		addEEnumLiteral(familyEEnum, Family.SLADENIACEAE);
		addEEnumLiteral(familyEEnum, Family.SMILACACEAE);
		addEEnumLiteral(familyEEnum, Family.SOLANACEAE);
		addEEnumLiteral(familyEEnum, Family.SPHAEROSEPALACEAE);
		addEEnumLiteral(familyEEnum, Family.SPHAGNACEAE);
		addEEnumLiteral(familyEEnum, Family.SPHENOCLEACEAE);
		addEEnumLiteral(familyEEnum, Family.SPIRIDENTACEAE);
		addEEnumLiteral(familyEEnum, Family.SPLACHNACEAE);
		addEEnumLiteral(familyEEnum, Family.SPLACHNOBRYACEAE);
		addEEnumLiteral(familyEEnum, Family.STACHYURACEAE);
		addEEnumLiteral(familyEEnum, Family.STAPHYLEACEAE);
		addEEnumLiteral(familyEEnum, Family.STEGNOSPERMATACEAE);
		addEEnumLiteral(familyEEnum, Family.STEMONACEAE);
		addEEnumLiteral(familyEEnum, Family.STEMONURACEAE);
		addEEnumLiteral(familyEEnum, Family.STEREOPHYLLACEAE);
		addEEnumLiteral(familyEEnum, Family.STILBACEAE);
		addEEnumLiteral(familyEEnum, Family.STRASBURGERIACEAE);
		addEEnumLiteral(familyEEnum, Family.STRELITZIACEAE);
		addEEnumLiteral(familyEEnum, Family.STYLIDIACEAE);
		addEEnumLiteral(familyEEnum, Family.STYRACACEAE);
		addEEnumLiteral(familyEEnum, Family.SURIANACEAE);
		addEEnumLiteral(familyEEnum, Family.SYMPLOCACEAE);
		addEEnumLiteral(familyEEnum, Family.TAKAKIACEAE);
		addEEnumLiteral(familyEEnum, Family.TALINACEAE);
		addEEnumLiteral(familyEEnum, Family.TAMARICACEAE);
		addEEnumLiteral(familyEEnum, Family.TAPISCIACEAE);
		addEEnumLiteral(familyEEnum, Family.TARGIONIACEAE);
		addEEnumLiteral(familyEEnum, Family.TAXACEAE);
		addEEnumLiteral(familyEEnum, Family.TAXODIACEAE);
		addEEnumLiteral(familyEEnum, Family.TECOPHILAEACEAE);
		addEEnumLiteral(familyEEnum, Family.TETRACHONDRACEAE);
		addEEnumLiteral(familyEEnum, Family.TETRAMELACEAE);
		addEEnumLiteral(familyEEnum, Family.TETRAMERISTACEAE);
		addEEnumLiteral(familyEEnum, Family.TETRAPHIDACEAE);
		addEEnumLiteral(familyEEnum, Family.THAMNOBRYACEAE);
		addEEnumLiteral(familyEEnum, Family.THEACEAE);
		addEEnumLiteral(familyEEnum, Family.THELIACEAE);
		addEEnumLiteral(familyEEnum, Family.THELYPTERIDACEAE);
		addEEnumLiteral(familyEEnum, Family.THOMANDERSIACEAE);
		addEEnumLiteral(familyEEnum, Family.THUIDIACEAE);
		addEEnumLiteral(familyEEnum, Family.THURNIACEAE);
		addEEnumLiteral(familyEEnum, Family.THYMELAEACEAE);
		addEEnumLiteral(familyEEnum, Family.TICODENDRACEAE);
		addEEnumLiteral(familyEEnum, Family.TIMMIACEAE);
		addEEnumLiteral(familyEEnum, Family.TOFIELDIACEAE);
		addEEnumLiteral(familyEEnum, Family.TORRICELLIACEAE);
		addEEnumLiteral(familyEEnum, Family.TOVARIACEAE);
		addEEnumLiteral(familyEEnum, Family.TRACHYPODACEAE);
		addEEnumLiteral(familyEEnum, Family.TREUBIACEAE);
		addEEnumLiteral(familyEEnum, Family.TRICHOCOLEACEAE);
		addEEnumLiteral(familyEEnum, Family.TRIGONIACEAE);
		addEEnumLiteral(familyEEnum, Family.TRIURIDACEAE);
		addEEnumLiteral(familyEEnum, Family.TROCHODENDRACEAE);
		addEEnumLiteral(familyEEnum, Family.TROPAEOLACEAE);
		addEEnumLiteral(familyEEnum, Family.TYPHACEAE);
		addEEnumLiteral(familyEEnum, Family.ULMACEAE);
		addEEnumLiteral(familyEEnum, Family.URTICACEAE);
		addEEnumLiteral(familyEEnum, Family.VAHLIACEAE);
		addEEnumLiteral(familyEEnum, Family.VELLOZIACEAE);
		addEEnumLiteral(familyEEnum, Family.VERBENACEAE);
		addEEnumLiteral(familyEEnum, Family.VETAFORMACEAE);
		addEEnumLiteral(familyEEnum, Family.VIOLACEAE);
		addEEnumLiteral(familyEEnum, Family.VITACEAE);
		addEEnumLiteral(familyEEnum, Family.VITTARIACEAE);
		addEEnumLiteral(familyEEnum, Family.VIVIANIACEAE);
		addEEnumLiteral(familyEEnum, Family.VOCHYSIACEAE);
		addEEnumLiteral(familyEEnum, Family.WARDIACEAE);
		addEEnumLiteral(familyEEnum, Family.WELWITSCHIACEAE);
		addEEnumLiteral(familyEEnum, Family.WIESNERELLACEAE);
		addEEnumLiteral(familyEEnum, Family.WINTERACEAE);
		addEEnumLiteral(familyEEnum, Family.WOODSIACEAE);
		addEEnumLiteral(familyEEnum, Family.XANTHORRHOEACEAE);
		addEEnumLiteral(familyEEnum, Family.XERONEMATACEAE);
		addEEnumLiteral(familyEEnum, Family.XYRIDACEAE);
		addEEnumLiteral(familyEEnum, Family.ZAMIACEAE);
		addEEnumLiteral(familyEEnum, Family.ZINGIBERACEAE);
		addEEnumLiteral(familyEEnum, Family.ZOSTERACEAE);
		addEEnumLiteral(familyEEnum, Family.ZYGOPHYLLACEAE);

		initEEnum(growRateEEnum, GrowRate.class, "GrowRate");
		addEEnumLiteral(growRateEEnum, GrowRate.UNKOWN);
		addEEnumLiteral(growRateEEnum, GrowRate.SLOW);
		addEEnumLiteral(growRateEEnum, GrowRate.MEDIUM);
		addEEnumLiteral(growRateEEnum, GrowRate.FAST);

		initEEnum(windEEnum, Wind.class, "Wind");
		addEEnumLiteral(windEEnum, Wind.TOLERATE_MARTIME_WIND);
		addEEnumLiteral(windEEnum, Wind.TOLERATE_STRONG_WIND);
		addEEnumLiteral(windEEnum, Wind.NOT_WIND_TOLERANT);

		initEEnum(eatingTypeEEnum, EatingType.class, "EatingType");
		addEEnumLiteral(eatingTypeEEnum, EatingType.UNKOWN);
		addEEnumLiteral(eatingTypeEEnum, EatingType.FRUIT);
		addEEnumLiteral(eatingTypeEEnum, EatingType.VEGETABLE);
		addEEnumLiteral(eatingTypeEEnum, EatingType.AROMATIC_PLANT);
		addEEnumLiteral(eatingTypeEEnum, EatingType.NONE);
		addEEnumLiteral(eatingTypeEEnum, EatingType.FLOWER);

		initEEnum(ediblePartEEnum, EdiblePart.class, "EdiblePart");
		addEEnumLiteral(ediblePartEEnum, EdiblePart.UNKOWN);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.APICAL_BUD);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.LEAVES);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.POLLEN);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.FLOWERS);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.MANNA);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.ROOT);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.SHOOTS);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.FRUIT);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.NECTAR);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.SAP);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.STEM);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.INNER_BARK);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.OIL);
		addEEnumLiteral(ediblePartEEnum, EdiblePart.SEED);

		initEEnum(specialUsesEEnum, SpecialUses.class, "SpecialUses");
		addEEnumLiteral(specialUsesEEnum, SpecialUses.NITROGEN_FIXER);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.SCENTED_PLANTS);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.FOOD_FOREST);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.CARDON_FARMING);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.ATTRACTS_WILDLIFE);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.HEDGE);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.DYNAMIC_ACCUMULATOR);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.GROUND_COVER);

		initEEnum(eventTypeEEnum, EventType.class, "EventType");
		addEEnumLiteral(eventTypeEEnum, EventType.GENERAL);
		addEEnumLiteral(eventTypeEEnum, EventType.HARVEST);
		addEEnumLiteral(eventTypeEEnum, EventType.PRUNE);
		addEEnumLiteral(eventTypeEEnum, EventType.DISEASE);

		initEEnum(rowBedTypeEEnum, RowBedType.class, "RowBedType");
		addEEnumLiteral(rowBedTypeEEnum, RowBedType.VERTICAL);
		addEEnumLiteral(rowBedTypeEEnum, RowBedType.HORIZONTAL);

		initEEnum(sowTypeEEnum, SowType.class, "SowType");
		addEEnumLiteral(sowTypeEEnum, SowType.INDOOR);
		addEEnumLiteral(sowTypeEEnum, SowType.OUTDOOR);

		// Initialize data types
		initEDataType(monthWeekEDataType, int.class, "MonthWeek", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(urlEDataType, java.net.URL.class, "URL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Instant.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(monthWeeksEDataType, List.class, "MonthWeeks", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS, "java.util.List<java.lang.Integer>");

		// Create resource
		createResource(eNS_URI);
	}

} //PermadelerPackageImpl
