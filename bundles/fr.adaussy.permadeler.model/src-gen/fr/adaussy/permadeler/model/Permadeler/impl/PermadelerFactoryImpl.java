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

import fr.adaussy.permadeler.model.Permadeler.*;

import fr.adaussy.permadeler.model.utils.Color;

import java.net.URL;

import java.time.Instant;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PermadelerFactoryImpl extends EFactoryImpl implements PermadelerFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = " Copyright (c) 2020 Arthur Daussy.\n\n This program and the accompanying materials are made \n available under the terms of the Eclipse Public License 2.0 \n which is available at https://www.eclipse.org/legal/epl-2.0/ \n Contributors:\n Arthur Daussy - initial API and implementation.\n";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PermadelerFactory init() {
		try {
			PermadelerFactory thePermadelerFactory = (PermadelerFactory)EPackage.Registry.INSTANCE
					.getEFactory(PermadelerPackage.eNS_URI);
			if (thePermadelerFactory != null) {
				return thePermadelerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PermadelerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermadelerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PermadelerPackage.ROOT:
				return createRoot();
			case PermadelerPackage.KNOWLEDGE_BASE:
				return createKnowledgeBase();
			case PermadelerPackage.SEED_BANK:
				return createSeedBank();
			case PermadelerPackage.GENUS:
				return createGenus();
			case PermadelerPackage.SEED_ITEM:
				return createSeedItem();
			case PermadelerPackage.AREA:
				return createArea();
			case PermadelerPackage.PLANTING:
				return createPlanting();
			case PermadelerPackage.PLANTATION:
				return createPlantation();
			case PermadelerPackage.PLANT:
				return createPlant();
			case PermadelerPackage.TREE:
				return createTree();
			case PermadelerPackage.REFERENCE:
				return createReference();
			case PermadelerPackage.IMAGE:
				return createImage();
			case PermadelerPackage.EVENT:
				return createEvent();
			case PermadelerPackage.ZONE:
				return createZone();
			case PermadelerPackage.NURSARY:
				return createNursary();
			case PermadelerPackage.TRAY:
				return createTray();
			case PermadelerPackage.ROW:
				return createRow();
			case PermadelerPackage.CELL:
				return createCell();
			case PermadelerPackage.TRAY_ZONE:
				return createTrayZone();
			case PermadelerPackage.GRID_BED:
				return createGridBed();
			case PermadelerPackage.ROW_BED:
				return createRowBed();
			case PermadelerPackage.GRID_BED_ROW:
				return createGridBedRow();
			case PermadelerPackage.GRID_BED_CELL:
				return createGridBedCell();
			case PermadelerPackage.ROW_BED_ROW:
				return createRowBedRow();
			case PermadelerPackage.COMPATIBILITY_LINK:
				return createCompatibilityLink();
			case PermadelerPackage.COMPATIBILITY_MATRIX:
				return createCompatibilityMatrix();
			case PermadelerPackage.PLANIFIER:
				return createPlanifier();
			case PermadelerPackage.SOW_PLANFICATION:
				return createSowPlanfication();
			case PermadelerPackage.BACKGROUND_IMAGE:
				return createBackgroundImage();
			default:
				throw new IllegalArgumentException(
						"The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PermadelerPackage.QUANTITY:
				return createQuantityFromString(eDataType, initialValue);
			case PermadelerPackage.LIFECYCLE:
				return createLifecycleFromString(eDataType, initialValue);
			case PermadelerPackage.SHADE:
				return createShadeFromString(eDataType, initialValue);
			case PermadelerPackage.SOIL_TYPE:
				return createSoilTypeFromString(eDataType, initialValue);
			case PermadelerPackage.PH:
				return createPHFromString(eDataType, initialValue);
			case PermadelerPackage.MOISTURE:
				return createMoistureFromString(eDataType, initialValue);
			case PermadelerPackage.FAMILY:
				return createFamilyFromString(eDataType, initialValue);
			case PermadelerPackage.GROW_RATE:
				return createGrowRateFromString(eDataType, initialValue);
			case PermadelerPackage.WIND:
				return createWindFromString(eDataType, initialValue);
			case PermadelerPackage.EATING_TYPE:
				return createEatingTypeFromString(eDataType, initialValue);
			case PermadelerPackage.EDIBLE_PART:
				return createEdiblePartFromString(eDataType, initialValue);
			case PermadelerPackage.SPECIAL_USES:
				return createSpecialUsesFromString(eDataType, initialValue);
			case PermadelerPackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case PermadelerPackage.ROW_BED_TYPE:
				return createRowBedTypeFromString(eDataType, initialValue);
			case PermadelerPackage.SOW_TYPE:
				return createSowTypeFromString(eDataType, initialValue);
			case PermadelerPackage.MONTH_WEEK:
				return createMonthWeekFromString(eDataType, initialValue);
			case PermadelerPackage.URL:
				return createURLFromString(eDataType, initialValue);
			case PermadelerPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case PermadelerPackage.MONTH_WEEKS:
				return createMonthWeeksFromString(eDataType, initialValue);
			case PermadelerPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException(
						"The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PermadelerPackage.QUANTITY:
				return convertQuantityToString(eDataType, instanceValue);
			case PermadelerPackage.LIFECYCLE:
				return convertLifecycleToString(eDataType, instanceValue);
			case PermadelerPackage.SHADE:
				return convertShadeToString(eDataType, instanceValue);
			case PermadelerPackage.SOIL_TYPE:
				return convertSoilTypeToString(eDataType, instanceValue);
			case PermadelerPackage.PH:
				return convertPHToString(eDataType, instanceValue);
			case PermadelerPackage.MOISTURE:
				return convertMoistureToString(eDataType, instanceValue);
			case PermadelerPackage.FAMILY:
				return convertFamilyToString(eDataType, instanceValue);
			case PermadelerPackage.GROW_RATE:
				return convertGrowRateToString(eDataType, instanceValue);
			case PermadelerPackage.WIND:
				return convertWindToString(eDataType, instanceValue);
			case PermadelerPackage.EATING_TYPE:
				return convertEatingTypeToString(eDataType, instanceValue);
			case PermadelerPackage.EDIBLE_PART:
				return convertEdiblePartToString(eDataType, instanceValue);
			case PermadelerPackage.SPECIAL_USES:
				return convertSpecialUsesToString(eDataType, instanceValue);
			case PermadelerPackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case PermadelerPackage.ROW_BED_TYPE:
				return convertRowBedTypeToString(eDataType, instanceValue);
			case PermadelerPackage.SOW_TYPE:
				return convertSowTypeToString(eDataType, instanceValue);
			case PermadelerPackage.MONTH_WEEK:
				return convertMonthWeekToString(eDataType, instanceValue);
			case PermadelerPackage.URL:
				return convertURLToString(eDataType, instanceValue);
			case PermadelerPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case PermadelerPackage.MONTH_WEEKS:
				return convertMonthWeeksToString(eDataType, instanceValue);
			case PermadelerPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException(
						"The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootCustomImpl root = new RootCustomImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnowledgeBase createKnowledgeBase() {
		KnowledgeBaseImpl knowledgeBase = new KnowledgeBaseImpl();
		return knowledgeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeedBank createSeedBank() {
		SeedBankImpl seedBank = new SeedBankImpl();
		return seedBank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Genus createGenus() {
		GenusCustomImpl genus = new GenusCustomImpl();
		return genus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeedItem createSeedItem() {
		SeedItemImpl seedItem = new SeedItemImpl();
		return seedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planting createPlanting() {
		PlantingImpl planting = new PlantingImpl();
		return planting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plantation createPlantation() {
		PlantationCustomImpl plantation = new PlantationCustomImpl();
		return plantation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant createPlant() {
		PlantImpl plant = new PlantImpl();
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone createZone() {
		ZoneImpl zone = new ZoneImpl();
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nursary createNursary() {
		NursaryImpl nursary = new NursaryImpl();
		return nursary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray createTray() {
		TrayCustomImpl tray = new TrayCustomImpl();
		return tray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrayZone createTrayZone() {
		TrayZoneImpl trayZone = new TrayZoneImpl();
		return trayZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridBed createGridBed() {
		GridBedImpl gridBed = new GridBedImpl();
		return gridBed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowBed createRowBed() {
		RowBedImpl rowBed = new RowBedImpl();
		return rowBed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridBedRow createGridBedRow() {
		GridBedRowImpl gridBedRow = new GridBedRowImpl();
		return gridBedRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridBedCell createGridBedCell() {
		GridBedCellImpl gridBedCell = new GridBedCellImpl();
		return gridBedCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowBedRow createRowBedRow() {
		RowBedRowImpl rowBedRow = new RowBedRowImpl();
		return rowBedRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibilityLink createCompatibilityLink() {
		CompatibilityLinkImpl compatibilityLink = new CompatibilityLinkImpl();
		return compatibilityLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibilityMatrix createCompatibilityMatrix() {
		CompatibilityMatrixImpl compatibilityMatrix = new CompatibilityMatrixImpl();
		return compatibilityMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planifier createPlanifier() {
		PlanifierImpl planifier = new PlanifierImpl();
		return planifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SowPlanfication createSowPlanfication() {
		SowPlanficationImpl sowPlanfication = new SowPlanficationImpl();
		return sowPlanfication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BackgroundImage createBackgroundImage() {
		BackgroundImageImpl backgroundImage = new BackgroundImageImpl();
		return backgroundImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantityFromString(EDataType eDataType, String initialValue) {
		Quantity result = Quantity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifecycle createLifecycleFromString(EDataType eDataType, String initialValue) {
		Lifecycle result = Lifecycle.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLifecycleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shade createShadeFromString(EDataType eDataType, String initialValue) {
		Shade result = Shade.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShadeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoilType createSoilTypeFromString(EDataType eDataType, String initialValue) {
		SoilType result = SoilType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSoilTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PH createPHFromString(EDataType eDataType, String initialValue) {
		PH result = PH.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPHToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moisture createMoistureFromString(EDataType eDataType, String initialValue) {
		Moisture result = Moisture.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMoistureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Family createFamilyFromString(EDataType eDataType, String initialValue) {
		Family result = Family.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFamilyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrowRate createGrowRateFromString(EDataType eDataType, String initialValue) {
		GrowRate result = GrowRate.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGrowRateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wind createWindFromString(EDataType eDataType, String initialValue) {
		Wind result = Wind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EatingType createEatingTypeFromString(EDataType eDataType, String initialValue) {
		EatingType result = EatingType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEatingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdiblePart createEdiblePartFromString(EDataType eDataType, String initialValue) {
		EdiblePart result = EdiblePart.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdiblePartToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialUses createSpecialUsesFromString(EDataType eDataType, String initialValue) {
		SpecialUses result = SpecialUses.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialUsesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowBedType createRowBedTypeFromString(EDataType eDataType, String initialValue) {
		RowBedType result = RowBedType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRowBedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SowType createSowTypeFromString(EDataType eDataType, String initialValue) {
		SowType result = SowType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createMonthWeekFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthWeekToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL createURLFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createDateFromString(EDataType eDataType, String initialValue) {
		return (Instant)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Integer> createMonthWeeksFromString(EDataType eDataType, String initialValue) {
		return (List<Integer>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonthWeeksToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColor(final String it) {
		return fr.adaussy.permadeler.model.utils.Color.decode(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return createColor(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColor(final Color it) {
		return fr.adaussy.permadeler.model.utils.Color.encode(it);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return convertColor((Color)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermadelerPackage getPermadelerPackage() {
		return (PermadelerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PermadelerPackage getPackage() {
		return PermadelerPackage.eINSTANCE;
	}

} //PermadelerFactoryImpl
