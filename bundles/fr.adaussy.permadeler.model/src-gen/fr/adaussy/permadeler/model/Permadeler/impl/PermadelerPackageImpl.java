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

import fr.adaussy.permadeler.model.Permadeler.Action;
import fr.adaussy.permadeler.model.Permadeler.ActionType;
import fr.adaussy.permadeler.model.Permadeler.BackgroundImage;
import fr.adaussy.permadeler.model.Permadeler.Cell;
import fr.adaussy.permadeler.model.Permadeler.DroughtTolerance;
import fr.adaussy.permadeler.model.Permadeler.Event;
import fr.adaussy.permadeler.model.Permadeler.EventType;
import fr.adaussy.permadeler.model.Permadeler.Family;
import fr.adaussy.permadeler.model.Permadeler.FoilageShade;
import fr.adaussy.permadeler.model.Permadeler.FoliageType;
import fr.adaussy.permadeler.model.Permadeler.GridBedCell;
import fr.adaussy.permadeler.model.Permadeler.GridBedRow;
import fr.adaussy.permadeler.model.Permadeler.GrowRate;
import fr.adaussy.permadeler.model.Permadeler.IPlantGroup;
import fr.adaussy.permadeler.model.Permadeler.Image;
import fr.adaussy.permadeler.model.Permadeler.ImageOwner;
import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.Layer;
import fr.adaussy.permadeler.model.Permadeler.Lifecycle;
import fr.adaussy.permadeler.model.Permadeler.Moisture;
import fr.adaussy.permadeler.model.Permadeler.NamedElement;
import fr.adaussy.permadeler.model.Permadeler.Nursary;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Planfication;
import fr.adaussy.permadeler.model.Permadeler.Planifier;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.PlantGroup;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.ProductionType;
import fr.adaussy.permadeler.model.Permadeler.Quantity;
import fr.adaussy.permadeler.model.Permadeler.ReferencingElement;
import fr.adaussy.permadeler.model.Permadeler.RepresentationKind;
import fr.adaussy.permadeler.model.Permadeler.Root;
import fr.adaussy.permadeler.model.Permadeler.RootType;
import fr.adaussy.permadeler.model.Permadeler.Row;
import fr.adaussy.permadeler.model.Permadeler.RowBedType;
import fr.adaussy.permadeler.model.Permadeler.SeedBank;
import fr.adaussy.permadeler.model.Permadeler.SeedItem;
import fr.adaussy.permadeler.model.Permadeler.Shade;
import fr.adaussy.permadeler.model.Permadeler.SoilType;
import fr.adaussy.permadeler.model.Permadeler.SowPlanfication;
import fr.adaussy.permadeler.model.Permadeler.SowType;
import fr.adaussy.permadeler.model.Permadeler.SpecialUses;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.Permadeler.TaggedElement;
import fr.adaussy.permadeler.model.Permadeler.TemporalItem;
import fr.adaussy.permadeler.model.Permadeler.Tray;
import fr.adaussy.permadeler.model.Permadeler.TrayOwner;
import fr.adaussy.permadeler.model.Permadeler.TrayZone;
import fr.adaussy.permadeler.model.Permadeler.Variety;
import fr.adaussy.permadeler.model.Permadeler.Wind;
import fr.adaussy.permadeler.model.Permadeler.Zone;

import fr.adaussy.permadeler.model.utils.Color;

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
	private EClass seedItemEClass = null;

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
	private EClass backgroundImageEClass = null;

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
	private EClass productionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantationPhaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencingElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageOwnerEClass = null;

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
	private EClass varietyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPlantGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedElementEClass = null;

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
	private EEnum productionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum layerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum representationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum foliageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum foilageShadeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum droughtToleranceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rootTypeEEnum = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

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
	public EReference getRoot_KnowledgeBase() {
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
	public EClass getKnowledgeBase() {
		return knowledgeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeBase_Species() {
		return (EReference)knowledgeBaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledgeBase_Groups() {
		return (EReference)knowledgeBaseEClass.getEStructuralFeatures().get(0);
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
	public EReference getPlantation_Events() {
		return (EReference)plantationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantation_Description() {
		return (EAttribute)plantationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantation_PlantationDate() {
		return (EAttribute)plantationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantation_CurrentLayer() {
		return (EAttribute)plantationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantation_Rootstock() {
		return (EAttribute)plantationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantation_Id() {
		return (EAttribute)plantationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantation_Wireframe() {
		return (EAttribute)plantationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantation_RepresentationKind() {
		return (EAttribute)plantationEClass.getEStructuralFeatures().get(8);
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
	public EReference getZone_Phases() {
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
	public EReference getCell_Plant() {
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
	public EClass getBackgroundImage() {
		return backgroundImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImage_RelativePath() {
		return (EAttribute)backgroundImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImage_Scaling() {
		return (EAttribute)backgroundImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundImage_Transparency() {
		return (EAttribute)backgroundImageEClass.getEStructuralFeatures().get(2);
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
	public EReference getPlant_Actions() {
		return (EReference)plantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlant_IconKey() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlant_CommonNames() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlant_RepresentationKey() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlant_ShortName() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_Productions() {
		return (EReference)plantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetAllProductions() {
		return plantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetFullLatinName() {
		return plantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetDefaultLayer() {
		return plantEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetDefaultRepresentationKind() {
		return plantEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetRepresentation() {
		return plantEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetAllActions() {
		return plantEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetAllSpecialUses() {
		return plantEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetAllNames() {
		return plantEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetEffectiveIconKey() {
		return plantEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetEffectiveRepresentationKey() {
		return plantEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__GetLifeCycle() {
		return plantEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduction() {
		return productionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduction_Type() {
		return (EAttribute)productionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduction_Conservation() {
		return (EAttribute)productionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduction_Eatable() {
		return (EAttribute)productionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Type() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemporalItem() {
		return temporalItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemporalItem_Period() {
		return (EAttribute)temporalItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlantationPhase() {
		return plantationPhaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantationPhase_Plantations() {
		return (EReference)plantationPhaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantationPhase_BackgroundImage() {
		return (EReference)plantationPhaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencingElement() {
		return referencingElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencingElement_References() {
		return (EAttribute)referencingElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageOwner() {
		return imageOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageOwner_Images() {
		return (EReference)imageOwnerEClass.getEStructuralFeatures().get(0);
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
	public EReference getSpecies_Varieties() {
		return (EReference)speciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Species() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Genus() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Family() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_LifeCycle() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_RootType() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_FoilageType() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_DroughtTolerance() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_FoilageShade() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_ToleratedLightingCondition() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_LightingCondition() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Moisture() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_SoilType() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_MinTemperature() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Wind() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Width() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_SpecialUses() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_Height() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_GrowRate() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_DefaultLayer() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecies_DefaultRepresentationKind() {
		return (EAttribute)speciesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariety() {
		return varietyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariety_Species() {
		return (EReference)varietyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariety_Variety() {
		return (EAttribute)varietyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlantGroup() {
		return plantGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantGroup_Species() {
		return (EReference)plantGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantGroup_SubGroups() {
		return (EReference)plantGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPlantGroup() {
		return iPlantGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPlantGroup__GetAllPlants() {
		return iPlantGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaggedElement() {
		return taggedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaggedElement_Tags() {
		return (EAttribute)taggedElementEClass.getEStructuralFeatures().get(0);
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
	public EEnum getProductionType() {
		return productionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLayer() {
		return layerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRepresentationKind() {
		return representationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFoliageType() {
		return foliageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFoilageShade() {
		return foilageShadeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDroughtTolerance() {
		return droughtToleranceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRootType() {
		return rootTypeEEnum;
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
	public EDataType getColor() {
		return colorEDataType;
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
		createEReference(rootEClass, ROOT__KNOWLEDGE_BASE);
		createEReference(rootEClass, ROOT__SEEDBANK);
		createEReference(rootEClass, ROOT__ZONES);
		createEReference(rootEClass, ROOT__NURSARY);
		createEReference(rootEClass, ROOT__PLANIFIER);
		createEOperation(rootEClass, ROOT___ADD_SOW_PLANIFICATION__SEEDITEM_LIST_SOWTYPE);

		knowledgeBaseEClass = createEClass(KNOWLEDGE_BASE);
		createEReference(knowledgeBaseEClass, KNOWLEDGE_BASE__GROUPS);
		createEReference(knowledgeBaseEClass, KNOWLEDGE_BASE__SPECIES);

		seedBankEClass = createEClass(SEED_BANK);
		createEReference(seedBankEClass, SEED_BANK__ITEMS);

		seedItemEClass = createEClass(SEED_ITEM);
		createEReference(seedItemEClass, SEED_ITEM__TYPE);
		createEAttribute(seedItemEClass, SEED_ITEM__QUANTITY);
		createEAttribute(seedItemEClass, SEED_ITEM__BY_DATE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__DESCRIPTION);

		plantationEClass = createEClass(PLANTATION);
		createEReference(plantationEClass, PLANTATION__TYPE);
		createEReference(plantationEClass, PLANTATION__EVENTS);
		createEAttribute(plantationEClass, PLANTATION__DESCRIPTION);
		createEAttribute(plantationEClass, PLANTATION__PLANTATION_DATE);
		createEAttribute(plantationEClass, PLANTATION__CURRENT_LAYER);
		createEAttribute(plantationEClass, PLANTATION__ROOTSTOCK);
		createEAttribute(plantationEClass, PLANTATION__ID);
		createEAttribute(plantationEClass, PLANTATION__WIREFRAME);
		createEAttribute(plantationEClass, PLANTATION__REPRESENTATION_KIND);

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
		createEReference(zoneEClass, ZONE__PHASES);

		nursaryEClass = createEClass(NURSARY);
		createEReference(nursaryEClass, NURSARY__ZONES);

		trayEClass = createEClass(TRAY);
		createEReference(trayEClass, TRAY__ROWS);
		createEOperation(trayEClass, TRAY___GET_EMPTY_CELLS);

		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__CELLS);

		cellEClass = createEClass(CELL);
		createEReference(cellEClass, CELL__PLANT);
		createEAttribute(cellEClass, CELL__DATE);

		trayZoneEClass = createEClass(TRAY_ZONE);

		trayOwnerEClass = createEClass(TRAY_OWNER);
		createEReference(trayOwnerEClass, TRAY_OWNER__TRAYS);

		gridBedRowEClass = createEClass(GRID_BED_ROW);
		createEReference(gridBedRowEClass, GRID_BED_ROW__CELLS);

		gridBedCellEClass = createEClass(GRID_BED_CELL);
		createEReference(gridBedCellEClass, GRID_BED_CELL__PLANTATION);

		planficationEClass = createEClass(PLANFICATION);
		createEAttribute(planficationEClass, PLANFICATION__WEEKS);

		planifierEClass = createEClass(PLANIFIER);
		createEReference(planifierEClass, PLANIFIER__PLANFICATIONS);

		sowPlanficationEClass = createEClass(SOW_PLANFICATION);
		createEReference(sowPlanficationEClass, SOW_PLANFICATION__SEED);
		createEAttribute(sowPlanficationEClass, SOW_PLANFICATION__TYPE);

		backgroundImageEClass = createEClass(BACKGROUND_IMAGE);
		createEAttribute(backgroundImageEClass, BACKGROUND_IMAGE__RELATIVE_PATH);
		createEAttribute(backgroundImageEClass, BACKGROUND_IMAGE__SCALING);
		createEAttribute(backgroundImageEClass, BACKGROUND_IMAGE__TRANSPARENCY);

		plantEClass = createEClass(PLANT);
		createEReference(plantEClass, PLANT__ACTIONS);
		createEAttribute(plantEClass, PLANT__ICON_KEY);
		createEAttribute(plantEClass, PLANT__COMMON_NAMES);
		createEAttribute(plantEClass, PLANT__REPRESENTATION_KEY);
		createEAttribute(plantEClass, PLANT__SHORT_NAME);
		createEReference(plantEClass, PLANT__PRODUCTIONS);
		createEOperation(plantEClass, PLANT___GET_ALL_PRODUCTIONS);
		createEOperation(plantEClass, PLANT___GET_FULL_LATIN_NAME);
		createEOperation(plantEClass, PLANT___GET_DEFAULT_LAYER);
		createEOperation(plantEClass, PLANT___GET_DEFAULT_REPRESENTATION_KIND);
		createEOperation(plantEClass, PLANT___GET_REPRESENTATION);
		createEOperation(plantEClass, PLANT___GET_ALL_ACTIONS);
		createEOperation(plantEClass, PLANT___GET_ALL_SPECIAL_USES);
		createEOperation(plantEClass, PLANT___GET_ALL_NAMES);
		createEOperation(plantEClass, PLANT___GET_EFFECTIVE_ICON_KEY);
		createEOperation(plantEClass, PLANT___GET_EFFECTIVE_REPRESENTATION_KEY);
		createEOperation(plantEClass, PLANT___GET_LIFE_CYCLE);

		productionEClass = createEClass(PRODUCTION);
		createEAttribute(productionEClass, PRODUCTION__TYPE);
		createEAttribute(productionEClass, PRODUCTION__CONSERVATION);
		createEAttribute(productionEClass, PRODUCTION__EATABLE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__TYPE);

		temporalItemEClass = createEClass(TEMPORAL_ITEM);
		createEAttribute(temporalItemEClass, TEMPORAL_ITEM__PERIOD);

		plantationPhaseEClass = createEClass(PLANTATION_PHASE);
		createEReference(plantationPhaseEClass, PLANTATION_PHASE__PLANTATIONS);
		createEReference(plantationPhaseEClass, PLANTATION_PHASE__BACKGROUND_IMAGE);

		referencingElementEClass = createEClass(REFERENCING_ELEMENT);
		createEAttribute(referencingElementEClass, REFERENCING_ELEMENT__REFERENCES);

		imageOwnerEClass = createEClass(IMAGE_OWNER);
		createEReference(imageOwnerEClass, IMAGE_OWNER__IMAGES);

		speciesEClass = createEClass(SPECIES);
		createEReference(speciesEClass, SPECIES__VARIETIES);
		createEAttribute(speciesEClass, SPECIES__SPECIES);
		createEAttribute(speciesEClass, SPECIES__GENUS);
		createEAttribute(speciesEClass, SPECIES__FAMILY);
		createEAttribute(speciesEClass, SPECIES__LIFE_CYCLE);
		createEAttribute(speciesEClass, SPECIES__ROOT_TYPE);
		createEAttribute(speciesEClass, SPECIES__FOILAGE_TYPE);
		createEAttribute(speciesEClass, SPECIES__DROUGHT_TOLERANCE);
		createEAttribute(speciesEClass, SPECIES__FOILAGE_SHADE);
		createEAttribute(speciesEClass, SPECIES__TOLERATED_LIGHTING_CONDITION);
		createEAttribute(speciesEClass, SPECIES__LIGHTING_CONDITION);
		createEAttribute(speciesEClass, SPECIES__MOISTURE);
		createEAttribute(speciesEClass, SPECIES__SOIL_TYPE);
		createEAttribute(speciesEClass, SPECIES__MIN_TEMPERATURE);
		createEAttribute(speciesEClass, SPECIES__WIND);
		createEAttribute(speciesEClass, SPECIES__WIDTH);
		createEAttribute(speciesEClass, SPECIES__SPECIAL_USES);
		createEAttribute(speciesEClass, SPECIES__HEIGHT);
		createEAttribute(speciesEClass, SPECIES__GROW_RATE);
		createEAttribute(speciesEClass, SPECIES__DEFAULT_LAYER);
		createEAttribute(speciesEClass, SPECIES__DEFAULT_REPRESENTATION_KIND);

		varietyEClass = createEClass(VARIETY);
		createEReference(varietyEClass, VARIETY__SPECIES);
		createEAttribute(varietyEClass, VARIETY__VARIETY);

		plantGroupEClass = createEClass(PLANT_GROUP);
		createEReference(plantGroupEClass, PLANT_GROUP__SUB_GROUPS);
		createEReference(plantGroupEClass, PLANT_GROUP__SPECIES);

		iPlantGroupEClass = createEClass(IPLANT_GROUP);
		createEOperation(iPlantGroupEClass, IPLANT_GROUP___GET_ALL_PLANTS);

		taggedElementEClass = createEClass(TAGGED_ELEMENT);
		createEAttribute(taggedElementEClass, TAGGED_ELEMENT__TAGS);

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
		specialUsesEEnum = createEEnum(SPECIAL_USES);
		eventTypeEEnum = createEEnum(EVENT_TYPE);
		rowBedTypeEEnum = createEEnum(ROW_BED_TYPE);
		sowTypeEEnum = createEEnum(SOW_TYPE);
		productionTypeEEnum = createEEnum(PRODUCTION_TYPE);
		actionTypeEEnum = createEEnum(ACTION_TYPE);
		layerEEnum = createEEnum(LAYER);
		representationKindEEnum = createEEnum(REPRESENTATION_KIND);
		foliageTypeEEnum = createEEnum(FOLIAGE_TYPE);
		foilageShadeEEnum = createEEnum(FOILAGE_SHADE);
		droughtToleranceEEnum = createEEnum(DROUGHT_TOLERANCE);
		rootTypeEEnum = createEEnum(ROOT_TYPE);

		// Create data types
		monthWeekEDataType = createEDataType(MONTH_WEEK);
		urlEDataType = createEDataType(URL);
		dateEDataType = createEDataType(DATE);
		monthWeeksEDataType = createEDataType(MONTH_WEEKS);
		colorEDataType = createEDataType(COLOR);
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
		knowledgeBaseEClass.getESuperTypes().add(this.getIPlantGroup());
		zoneEClass.getESuperTypes().add(this.getNamedElement());
		nursaryEClass.getESuperTypes().add(this.getTrayOwner());
		trayEClass.getESuperTypes().add(this.getNamedElement());
		trayZoneEClass.getESuperTypes().add(this.getTrayOwner());
		trayZoneEClass.getESuperTypes().add(this.getNamedElement());
		sowPlanficationEClass.getESuperTypes().add(this.getPlanfication());
		plantEClass.getESuperTypes().add(this.getImageOwner());
		plantEClass.getESuperTypes().add(this.getNamedElement());
		plantEClass.getESuperTypes().add(this.getReferencingElement());
		plantEClass.getESuperTypes().add(this.getTaggedElement());
		productionEClass.getESuperTypes().add(this.getTemporalItem());
		actionEClass.getESuperTypes().add(this.getTemporalItem());
		temporalItemEClass.getESuperTypes().add(this.getNamedElement());
		plantationPhaseEClass.getESuperTypes().add(this.getNamedElement());
		plantationPhaseEClass.getESuperTypes().add(this.getIPlantGroup());
		speciesEClass.getESuperTypes().add(this.getPlant());
		varietyEClass.getESuperTypes().add(this.getPlant());
		plantGroupEClass.getESuperTypes().add(this.getNamedElement());
		plantGroupEClass.getESuperTypes().add(this.getIPlantGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRoot_KnowledgeBase(), this.getKnowledgeBase(), null, "knowledgeBase", null, 1, 1, //$NON-NLS-1$
				Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Seedbank(), this.getSeedBank(), null, "seedbank", null, 1, 1, Root.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Zones(), this.getZone(), null, "zones", null, 0, -1, Root.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Nursary(), this.getNursary(), null, "nursary", null, 1, 1, Root.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Planifier(), this.getPlanifier(), null, "planifier", null, 0, 1, Root.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRoot__AddSowPlanification__SeedItem_List_SowType(), null,
				"addSowPlanification", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getSeedItem(), "seedItem", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getMonthWeeks(), "weeks", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getSowType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(knowledgeBaseEClass, KnowledgeBase.class, "KnowledgeBase", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledgeBase_Groups(), this.getPlantGroup(), null, "groups", null, 0, -1, //$NON-NLS-1$
				KnowledgeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKnowledgeBase_Species(), this.getSpecies(), null, "species", null, 0, -1, //$NON-NLS-1$
				KnowledgeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seedBankEClass, SeedBank.class, "SeedBank", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeedBank_Items(), this.getSeedItem(), null, "items", null, 0, -1, SeedBank.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seedItemEClass, SeedItem.class, "SeedItem", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeedItem_Type(), this.getPlant(), null, "type", null, 1, 1, SeedItem.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeedItem_Quantity(), this.getQuantity(), "quantity", null, 0, 1, SeedItem.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSeedItem_ByDate(), ecorePackage.getEDate(), "byDate", null, 0, 1, SeedItem.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, //$NON-NLS-1$
				NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, //$NON-NLS-1$
				NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantationEClass, Plantation.class, "Plantation", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlantation_Type(), this.getPlant(), null, "type", null, 1, 1, Plantation.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantation_Events(), this.getEvent(), null, "events", null, 0, -1, Plantation.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantation_Description(), ecorePackage.getEString(), "description", null, 0, 1, //$NON-NLS-1$
				Plantation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantation_PlantationDate(), this.getDate(), "plantationDate", null, 0, 1, //$NON-NLS-1$
				Plantation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantation_CurrentLayer(), this.getLayer(), "currentLayer", "UNDERSTORY", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				Plantation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantation_Rootstock(), ecorePackage.getEString(), "rootstock", null, 0, 1, //$NON-NLS-1$
				Plantation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantation_Id(), ecorePackage.getEString(), "id", null, 0, 1, Plantation.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPlantation_Wireframe(), ecorePackage.getEBoolean(), "wireframe", null, 0, 1, //$NON-NLS-1$
				Plantation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantation_RepresentationKind(), this.getRepresentationKind(), "representationKind", //$NON-NLS-1$
				null, 0, 1, Plantation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Title(), ecorePackage.getEString(), "title", null, 0, 1, Image.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getImage_Source(), ecorePackage.getEString(), "source", null, 0, 1, Image.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getImage_Path(), ecorePackage.getEString(), "path", null, 0, 1, Image.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Date(), this.getDate(), "date", null, 1, 1, Event.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Description(), ecorePackage.getEString(), "description", null, 0, 1, //$NON-NLS-1$
				Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Images(), this.getImage(), null, "images", null, 0, -1, Event.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Type(), this.getEventType(), "type", null, 0, 1, Event.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zoneEClass, Zone.class, "Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getZone_Phases(), this.getPlantationPhase(), null, "phases", null, 0, -1, Zone.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nursaryEClass, Nursary.class, "Nursary", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNursary_Zones(), this.getTrayZone(), null, "zones", null, 0, -1, Nursary.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trayEClass, Tray.class, "Tray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getTray_Rows(), this.getRow(), null, "rows", null, 0, -1, Tray.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getTray__GetEmptyCells(), this.getCell(), "getEmptyCells", 0, -1, IS_UNIQUE, //$NON-NLS-1$
				IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRow_Cells(), this.getCell(), null, "cells", null, 0, -1, Row.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCell_Plant(), this.getPlant(), null, "plant", null, 0, 1, Cell.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Date(), this.getDate(), "date", null, 0, 1, Cell.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trayZoneEClass, TrayZone.class, "TrayZone", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(trayOwnerEClass, TrayOwner.class, "TrayOwner", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrayOwner_Trays(), this.getTray(), null, "trays", null, 0, -1, TrayOwner.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridBedRowEClass, GridBedRow.class, "GridBedRow", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGridBedRow_Cells(), this.getGridBedCell(), null, "cells", null, 0, -1, //$NON-NLS-1$
				GridBedRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridBedCellEClass, GridBedCell.class, "GridBedCell", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGridBedCell_Plantation(), this.getPlantation(), null, "plantation", null, 0, 1, //$NON-NLS-1$
				GridBedCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planficationEClass, Planfication.class, "Planfication", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlanfication_Weeks(), ecorePackage.getEInt(), "weeks", null, 0, -1, //$NON-NLS-1$
				Planfication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planifierEClass, Planifier.class, "Planifier", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanifier_Planfications(), this.getPlanfication(), null, "planfications", null, 0, //$NON-NLS-1$
				-1, Planifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sowPlanficationEClass, SowPlanfication.class, "SowPlanfication", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSowPlanfication_Seed(), this.getSeedItem(), null, "seed", null, 1, 1, //$NON-NLS-1$
				SowPlanfication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSowPlanfication_Type(), this.getSowType(), "type", null, 0, 1, //$NON-NLS-1$
				SowPlanfication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backgroundImageEClass, BackgroundImage.class, "BackgroundImage", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackgroundImage_RelativePath(), ecorePackage.getEString(), "relativePath", null, 1, //$NON-NLS-1$
				1, BackgroundImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackgroundImage_Scaling(), ecorePackage.getEFloat(), "scaling", null, 0, 1, //$NON-NLS-1$
				BackgroundImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBackgroundImage_Transparency(), ecorePackage.getEInt(), "transparency", "100", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				BackgroundImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantEClass, Plant.class, "Plant", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getPlant_Actions(), this.getAction(), null, "actions", null, 0, -1, Plant.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlant_IconKey(), ecorePackage.getEString(), "iconKey", null, 0, 1, Plant.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPlant_CommonNames(), ecorePackage.getEString(), "commonNames", null, 1, -1, //$NON-NLS-1$
				Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlant_RepresentationKey(), ecorePackage.getEString(), "representationKey", null, 0, //$NON-NLS-1$
				1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlant_ShortName(), ecorePackage.getEString(), "shortName", null, 0, 1, Plant.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPlant_Productions(), this.getProduction(), null, "productions", null, 0, -1, //$NON-NLS-1$
				Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlant__GetAllProductions(), this.getProduction(), "getAllProductions", 0, -1, //$NON-NLS-1$
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlant__GetFullLatinName(), ecorePackage.getEString(), "getFullLatinName", 0, 1, //$NON-NLS-1$
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlant__GetDefaultLayer(), this.getLayer(), "getDefaultLayer", 0, 1, IS_UNIQUE, //$NON-NLS-1$
				IS_ORDERED);

		initEOperation(getPlant__GetDefaultRepresentationKind(), this.getRepresentationKind(),
				"getDefaultRepresentationKind", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getPlant__GetRepresentation(), ecorePackage.getEString(), "getRepresentation", 1, 1, //$NON-NLS-1$
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlant__GetAllActions(), this.getAction(), "getAllActions", 0, -1, IS_UNIQUE, //$NON-NLS-1$
				IS_ORDERED);

		initEOperation(getPlant__GetAllSpecialUses(), this.getSpecialUses(), "getAllSpecialUses", 0, -1, //$NON-NLS-1$
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlant__GetAllNames(), ecorePackage.getEString(), "getAllNames", 0, -1, IS_UNIQUE, //$NON-NLS-1$
				IS_ORDERED);

		initEOperation(getPlant__GetEffectiveIconKey(), ecorePackage.getEString(), "getEffectiveIconKey", 0, //$NON-NLS-1$
				1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlant__GetEffectiveRepresentationKey(), ecorePackage.getEString(),
				"getEffectiveRepresentationKey", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getPlant__GetLifeCycle(), this.getLifecycle(), "getLifeCycle", 0, 1, IS_UNIQUE, //$NON-NLS-1$
				IS_ORDERED);

		initEClass(productionEClass, Production.class, "Production", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduction_Type(), this.getProductionType(), "type", null, 0, 1, Production.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getProduction_Conservation(), ecorePackage.getEInt(), "conservation", null, 0, 1, //$NON-NLS-1$
				Production.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduction_Eatable(), ecorePackage.getEBoolean(), "eatable", "false", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				Production.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Type(), this.getActionType(), "type", "Other", 0, 1, Action.class, //$NON-NLS-1$//$NON-NLS-2$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(temporalItemEClass, TemporalItem.class, "TemporalItem", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporalItem_Period(), this.getMonthWeeks(), "period", null, 0, 1, //$NON-NLS-1$
				TemporalItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantationPhaseEClass, PlantationPhase.class, "PlantationPhase", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlantationPhase_Plantations(), this.getPlantation(), null, "plantations", null, 0, //$NON-NLS-1$
				-1, PlantationPhase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantationPhase_BackgroundImage(), this.getBackgroundImage(), null,
				"backgroundImage", null, 0, 1, PlantationPhase.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(referencingElementEClass, ReferencingElement.class, "ReferencingElement", IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferencingElement_References(), ecorePackage.getEString(), "references", null, 0, //$NON-NLS-1$
				-1, ReferencingElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageOwnerEClass, ImageOwner.class, "ImageOwner", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageOwner_Images(), this.getImage(), null, "images", null, 0, -1, ImageOwner.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speciesEClass, Species.class, "Species", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecies_Varieties(), this.getVariety(), this.getVariety_Species(), "varieties", //$NON-NLS-1$
				null, 0, -1, Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_Species(), ecorePackage.getEString(), "species", null, 0, 1, Species.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_Genus(), ecorePackage.getEString(), "genus", null, 0, 1, Species.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_Family(), this.getFamily(), "family", null, 0, 1, Species.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_LifeCycle(), this.getLifecycle(), "lifeCycle", null, 0, 1, Species.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_RootType(), this.getRootType(), "rootType", null, 0, 1, Species.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_FoilageType(), this.getFoliageType(), "foilageType", null, 0, 1, //$NON-NLS-1$
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_DroughtTolerance(), this.getDroughtTolerance(), "droughtTolerance", null, 0, //$NON-NLS-1$
				1, Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_FoilageShade(), this.getFoilageShade(), "foilageShade", null, 0, 1, //$NON-NLS-1$
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_ToleratedLightingCondition(), this.getShade(), "toleratedLightingCondition", //$NON-NLS-1$
				null, 0, -1, Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_LightingCondition(), this.getShade(), "lightingCondition", null, 0, -1, //$NON-NLS-1$
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_Moisture(), this.getMoisture(), "moisture", null, 0, -1, Species.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_SoilType(), this.getSoilType(), "soilType", null, 0, -1, Species.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_MinTemperature(), ecorePackage.getEInt(), "minTemperature", null, 0, 1, //$NON-NLS-1$
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_Wind(), this.getWind(), "wind", null, 0, -1, Species.class, !IS_TRANSIENT, //$NON-NLS-1$
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, Species.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_SpecialUses(), this.getSpecialUses(), "specialUses", null, 0, -1, //$NON-NLS-1$
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, Species.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_GrowRate(), this.getGrowRate(), "growRate", null, 0, 1, Species.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSpecies_DefaultLayer(), this.getLayer(), "defaultLayer", "UNDERSTORY", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				Species.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecies_DefaultRepresentationKind(), this.getRepresentationKind(),
				"defaultRepresentationKind", "TREE_CROWN", 0, 1, Species.class, !IS_TRANSIENT, !IS_VOLATILE, //$NON-NLS-1$//$NON-NLS-2$
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varietyEClass, Variety.class, "Variety", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariety_Species(), this.getSpecies(), this.getSpecies_Varieties(), "species", null, //$NON-NLS-1$
				1, 1, Variety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariety_Variety(), ecorePackage.getEString(), "variety", null, 0, 1, Variety.class, //$NON-NLS-1$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(plantGroupEClass, PlantGroup.class, "PlantGroup", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlantGroup_SubGroups(), this.getPlantGroup(), null, "subGroups", null, 0, -1, //$NON-NLS-1$
				PlantGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlantGroup_Species(), this.getSpecies(), null, "species", null, 0, -1, //$NON-NLS-1$
				PlantGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iPlantGroupEClass, IPlantGroup.class, "IPlantGroup", IS_ABSTRACT, IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIPlantGroup__GetAllPlants(), this.getPlant(), "getAllPlants", 0, -1, IS_UNIQUE, //$NON-NLS-1$
				IS_ORDERED);

		initEClass(taggedElementEClass, TaggedElement.class, "TaggedElement", IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggedElement_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, //$NON-NLS-1$
				TaggedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(quantityEEnum, Quantity.class, "Quantity"); //$NON-NLS-1$
		addEEnumLiteral(quantityEEnum, Quantity.UNKNOWN);
		addEEnumLiteral(quantityEEnum, Quantity.EMPTY);
		addEEnumLiteral(quantityEEnum, Quantity.LOW);
		addEEnumLiteral(quantityEEnum, Quantity.MEDIUM);
		addEEnumLiteral(quantityEEnum, Quantity.HIGHT);

		initEEnum(lifecycleEEnum, Lifecycle.class, "Lifecycle"); //$NON-NLS-1$
		addEEnumLiteral(lifecycleEEnum, Lifecycle.UNKNOWN);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.ANNUAL);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.BIENNIAL);
		addEEnumLiteral(lifecycleEEnum, Lifecycle.PERENNIAL);

		initEEnum(shadeEEnum, Shade.class, "Shade"); //$NON-NLS-1$
		addEEnumLiteral(shadeEEnum, Shade.UNKNOWN);
		addEEnumLiteral(shadeEEnum, Shade.FULL_SHADE);
		addEEnumLiteral(shadeEEnum, Shade.SEMI);
		addEEnumLiteral(shadeEEnum, Shade.FULL_SUN);

		initEEnum(soilTypeEEnum, SoilType.class, "SoilType"); //$NON-NLS-1$
		addEEnumLiteral(soilTypeEEnum, SoilType.UNKNOWN);
		addEEnumLiteral(soilTypeEEnum, SoilType.LIGHT_SANDY);
		addEEnumLiteral(soilTypeEEnum, SoilType.MEDIUM_LOAM);
		addEEnumLiteral(soilTypeEEnum, SoilType.HEAVY);
		addEEnumLiteral(soilTypeEEnum, SoilType.HEAVY_CLAY);
		addEEnumLiteral(soilTypeEEnum, SoilType.POOR_SOIL);
		addEEnumLiteral(soilTypeEEnum, SoilType.WATER);

		initEEnum(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.class, "PH"); //$NON-NLS-1$
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.UNKNOWN);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.VERY_ACID);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.ACID);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.NEUTRAL);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.ALKALINE);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.VERY_ALKALINE);
		addEEnumLiteral(phEEnum, fr.adaussy.permadeler.model.Permadeler.PH.SALINE);

		initEEnum(moistureEEnum, Moisture.class, "Moisture"); //$NON-NLS-1$
		addEEnumLiteral(moistureEEnum, Moisture.UNKNOWN);
		addEEnumLiteral(moistureEEnum, Moisture.DRY_SOIL);
		addEEnumLiteral(moistureEEnum, Moisture.MOIST_SOIL);
		addEEnumLiteral(moistureEEnum, Moisture.WET);
		addEEnumLiteral(moistureEEnum, Moisture.WATER_PLANT);
		addEEnumLiteral(moistureEEnum, Moisture.WELL_DRAINED);
		addEEnumLiteral(moistureEEnum, Moisture.TOLERATE_GROUGHT);

		initEEnum(familyEEnum, Family.class, "Family"); //$NON-NLS-1$
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

		initEEnum(growRateEEnum, GrowRate.class, "GrowRate"); //$NON-NLS-1$
		addEEnumLiteral(growRateEEnum, GrowRate.UNKOWN);
		addEEnumLiteral(growRateEEnum, GrowRate.SLOW);
		addEEnumLiteral(growRateEEnum, GrowRate.MEDIUM);
		addEEnumLiteral(growRateEEnum, GrowRate.FAST);

		initEEnum(windEEnum, Wind.class, "Wind"); //$NON-NLS-1$
		addEEnumLiteral(windEEnum, Wind.TOLERATE_MARTIME_WIND);
		addEEnumLiteral(windEEnum, Wind.TOLERATE_STRONG_WIND);
		addEEnumLiteral(windEEnum, Wind.NOT_WIND_TOLERANT);

		initEEnum(specialUsesEEnum, SpecialUses.class, "SpecialUses"); //$NON-NLS-1$
		addEEnumLiteral(specialUsesEEnum, SpecialUses.NITROGEN_FIXER);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.SCENTED_PLANTS);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.FOOD_FOREST);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.CARDON_FARMING);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.ATTRACTS_WILDLIFE);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.HEDGE);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.DYNAMIC_ACCUMULATOR);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.GROUND_COVER);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.BIOMASS_PRODUCTION);
		addEEnumLiteral(specialUsesEEnum, SpecialUses.HONEY_PLANT);

		initEEnum(eventTypeEEnum, EventType.class, "EventType"); //$NON-NLS-1$
		addEEnumLiteral(eventTypeEEnum, EventType.GENERAL);
		addEEnumLiteral(eventTypeEEnum, EventType.HARVEST);
		addEEnumLiteral(eventTypeEEnum, EventType.PRUNE);
		addEEnumLiteral(eventTypeEEnum, EventType.DISEASE);

		initEEnum(rowBedTypeEEnum, RowBedType.class, "RowBedType"); //$NON-NLS-1$
		addEEnumLiteral(rowBedTypeEEnum, RowBedType.VERTICAL);
		addEEnumLiteral(rowBedTypeEEnum, RowBedType.HORIZONTAL);

		initEEnum(sowTypeEEnum, SowType.class, "SowType"); //$NON-NLS-1$
		addEEnumLiteral(sowTypeEEnum, SowType.INDOOR);
		addEEnumLiteral(sowTypeEEnum, SowType.OUTDOOR);

		initEEnum(productionTypeEEnum, ProductionType.class, "ProductionType"); //$NON-NLS-1$
		addEEnumLiteral(productionTypeEEnum, ProductionType.OTHER);
		addEEnumLiteral(productionTypeEEnum, ProductionType.FRUIT);
		addEEnumLiteral(productionTypeEEnum, ProductionType.LEAVES);
		addEEnumLiteral(productionTypeEEnum, ProductionType.FLOWER);
		addEEnumLiteral(productionTypeEEnum, ProductionType.SHOOTS);
		addEEnumLiteral(productionTypeEEnum, ProductionType.MANNA);
		addEEnumLiteral(productionTypeEEnum, ProductionType.SAP);
		addEEnumLiteral(productionTypeEEnum, ProductionType.APICAL_BUD);
		addEEnumLiteral(productionTypeEEnum, ProductionType.SEED);
		addEEnumLiteral(productionTypeEEnum, ProductionType.POLLEN);
		addEEnumLiteral(productionTypeEEnum, ProductionType.NECTAR);
		addEEnumLiteral(productionTypeEEnum, ProductionType.STEM);
		addEEnumLiteral(productionTypeEEnum, ProductionType.INNER_BARK);
		addEEnumLiteral(productionTypeEEnum, ProductionType.OIL);
		addEEnumLiteral(productionTypeEEnum, ProductionType.ROOT);
		addEEnumLiteral(productionTypeEEnum, ProductionType.WOOD);

		initEEnum(actionTypeEEnum, ActionType.class, "ActionType"); //$NON-NLS-1$
		addEEnumLiteral(actionTypeEEnum, ActionType.OTHER);
		addEEnumLiteral(actionTypeEEnum, ActionType.PRUNING);
		addEEnumLiteral(actionTypeEEnum, ActionType.SOW_INDOOR);
		addEEnumLiteral(actionTypeEEnum, ActionType.SOW_OUTDOOR);
		addEEnumLiteral(actionTypeEEnum, ActionType.MULTIPLICATION);
		addEEnumLiteral(actionTypeEEnum, ActionType.HARVEST);

		initEEnum(layerEEnum, Layer.class, "Layer"); //$NON-NLS-1$
		addEEnumLiteral(layerEEnum, Layer.CANOPY);
		addEEnumLiteral(layerEEnum, Layer.UNDERSTORY);
		addEEnumLiteral(layerEEnum, Layer.SHRUB);
		addEEnumLiteral(layerEEnum, Layer.HERB);
		addEEnumLiteral(layerEEnum, Layer.ROOT);
		addEEnumLiteral(layerEEnum, Layer.GROUND_COVER);
		addEEnumLiteral(layerEEnum, Layer.VINE);
		addEEnumLiteral(layerEEnum, Layer.OTHER);

		initEEnum(representationKindEEnum, RepresentationKind.class, "RepresentationKind"); //$NON-NLS-1$
		addEEnumLiteral(representationKindEEnum, RepresentationKind.ICON);
		addEEnumLiteral(representationKindEEnum, RepresentationKind.TREE_CROWN);

		initEEnum(foliageTypeEEnum, FoliageType.class, "FoliageType"); //$NON-NLS-1$
		addEEnumLiteral(foliageTypeEEnum, FoliageType.UNKNOWN);
		addEEnumLiteral(foliageTypeEEnum, FoliageType.EVERGREEN);
		addEEnumLiteral(foliageTypeEEnum, FoliageType.DECIDUOUS);
		addEEnumLiteral(foliageTypeEEnum, FoliageType.SEMI_EVERGREEN);

		initEEnum(foilageShadeEEnum, FoilageShade.class, "FoilageShade"); //$NON-NLS-1$
		addEEnumLiteral(foilageShadeEEnum, FoilageShade.UNKOWN);
		addEEnumLiteral(foilageShadeEEnum, FoilageShade.LIGHT);
		addEEnumLiteral(foilageShadeEEnum, FoilageShade.MEDIUM);
		addEEnumLiteral(foilageShadeEEnum, FoilageShade.DENSE);

		initEEnum(droughtToleranceEEnum, DroughtTolerance.class, "DroughtTolerance"); //$NON-NLS-1$
		addEEnumLiteral(droughtToleranceEEnum, DroughtTolerance.UNKNOWN);
		addEEnumLiteral(droughtToleranceEEnum, DroughtTolerance.VERY_HIGHT);
		addEEnumLiteral(droughtToleranceEEnum, DroughtTolerance.HIGHT);
		addEEnumLiteral(droughtToleranceEEnum, DroughtTolerance.MEDIUM);
		addEEnumLiteral(droughtToleranceEEnum, DroughtTolerance.LOW);

		initEEnum(rootTypeEEnum, RootType.class, "RootType"); //$NON-NLS-1$
		addEEnumLiteral(rootTypeEEnum, RootType.UNKNOWN);
		addEEnumLiteral(rootTypeEEnum, RootType.TAP);
		addEEnumLiteral(rootTypeEEnum, RootType.FLAT);
		addEEnumLiteral(rootTypeEEnum, RootType.HEART);
		addEEnumLiteral(rootTypeEEnum, RootType.MIXT);

		// Initialize data types
		initEDataType(monthWeekEDataType, int.class, "MonthWeek", IS_SERIALIZABLE, //$NON-NLS-1$
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(urlEDataType, java.net.URL.class, "URL", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(dateEDataType, Instant.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(monthWeeksEDataType, List.class, "MonthWeeks", IS_SERIALIZABLE, //$NON-NLS-1$
				!IS_GENERATED_INSTANCE_CLASS, "java.util.List<java.lang.Integer>"); //$NON-NLS-1$
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //PermadelerPackageImpl
