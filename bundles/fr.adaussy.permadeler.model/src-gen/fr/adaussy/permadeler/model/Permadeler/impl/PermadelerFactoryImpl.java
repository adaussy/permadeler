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
			case PermadelerPackage.SEED_ITEM:
				return createSeedItem();
			case PermadelerPackage.PLANTATION:
				return createPlantation();
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
			case PermadelerPackage.GRID_BED_ROW:
				return createGridBedRow();
			case PermadelerPackage.GRID_BED_CELL:
				return createGridBedCell();
			case PermadelerPackage.PLANIFIER:
				return createPlanifier();
			case PermadelerPackage.SOW_PLANFICATION:
				return createSowPlanfication();
			case PermadelerPackage.BACKGROUND_IMAGE:
				return createBackgroundImage();
			case PermadelerPackage.PRODUCTION:
				return createProduction();
			case PermadelerPackage.ACTION:
				return createAction();
			case PermadelerPackage.TEMPORAL_ITEM:
				return createTemporalItem();
			case PermadelerPackage.PLANTATION_PHASE:
				return createPlantationPhase();
			case PermadelerPackage.SPECIES:
				return createSpecies();
			case PermadelerPackage.VARIETY:
				return createVariety();
			case PermadelerPackage.PLANT_GROUP:
				return createPlantGroup();
			default:
				throw new IllegalArgumentException(
						"The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
			case PermadelerPackage.SPECIAL_USES:
				return createSpecialUsesFromString(eDataType, initialValue);
			case PermadelerPackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case PermadelerPackage.ROW_BED_TYPE:
				return createRowBedTypeFromString(eDataType, initialValue);
			case PermadelerPackage.SOW_TYPE:
				return createSowTypeFromString(eDataType, initialValue);
			case PermadelerPackage.PRODUCTION_TYPE:
				return createProductionTypeFromString(eDataType, initialValue);
			case PermadelerPackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case PermadelerPackage.LAYER:
				return createLayerFromString(eDataType, initialValue);
			case PermadelerPackage.REPRESENTATION_KIND:
				return createRepresentationKindFromString(eDataType, initialValue);
			case PermadelerPackage.FOLIAGE_TYPE:
				return createFoliageTypeFromString(eDataType, initialValue);
			case PermadelerPackage.FOILAGE_SHADE:
				return createFoilageShadeFromString(eDataType, initialValue);
			case PermadelerPackage.DROUGHT_TOLERANCE:
				return createDroughtToleranceFromString(eDataType, initialValue);
			case PermadelerPackage.ROOT_TYPE:
				return createRootTypeFromString(eDataType, initialValue);
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
						"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
			case PermadelerPackage.SPECIAL_USES:
				return convertSpecialUsesToString(eDataType, instanceValue);
			case PermadelerPackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case PermadelerPackage.ROW_BED_TYPE:
				return convertRowBedTypeToString(eDataType, instanceValue);
			case PermadelerPackage.SOW_TYPE:
				return convertSowTypeToString(eDataType, instanceValue);
			case PermadelerPackage.PRODUCTION_TYPE:
				return convertProductionTypeToString(eDataType, instanceValue);
			case PermadelerPackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case PermadelerPackage.LAYER:
				return convertLayerToString(eDataType, instanceValue);
			case PermadelerPackage.REPRESENTATION_KIND:
				return convertRepresentationKindToString(eDataType, instanceValue);
			case PermadelerPackage.FOLIAGE_TYPE:
				return convertFoliageTypeToString(eDataType, instanceValue);
			case PermadelerPackage.FOILAGE_SHADE:
				return convertFoilageShadeToString(eDataType, instanceValue);
			case PermadelerPackage.DROUGHT_TOLERANCE:
				return convertDroughtToleranceToString(eDataType, instanceValue);
			case PermadelerPackage.ROOT_TYPE:
				return convertRootTypeToString(eDataType, instanceValue);
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
						"The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
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
		KnowledgeBaseCustomImpl knowledgeBase = new KnowledgeBaseCustomImpl();
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
	public SeedItem createSeedItem() {
		SeedItemImpl seedItem = new SeedItemImpl();
		return seedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plantation createPlantation() {
		PlantationImpl plantation = new PlantationImpl();
		return plantation;
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
		ZoneCustomImpl zone = new ZoneCustomImpl();
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
	public Production createProduction() {
		ProductionImpl production = new ProductionImpl();
		return production;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalItem createTemporalItem() {
		TemporalItemCustomImpl temporalItem = new TemporalItemCustomImpl();
		return temporalItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantationPhase createPlantationPhase() {
		PlantationPhaseImpl plantationPhase = new PlantationPhaseImpl();
		return plantationPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Species createSpecies() {
		SpeciesCustomImpl species = new SpeciesCustomImpl();
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variety createVariety() {
		VarietyCustomImpl variety = new VarietyCustomImpl();
		return variety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantGroup createPlantGroup() {
		PlantGroupCustomImpl plantGroup = new PlantGroupCustomImpl();
		return plantGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantityFromString(EDataType eDataType, String initialValue) {
		Quantity result = Quantity.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
	public SpecialUses createSpecialUsesFromString(EDataType eDataType, String initialValue) {
		SpecialUses result = SpecialUses.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
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
	public ProductionType createProductionTypeFromString(EDataType eDataType, String initialValue) {
		ProductionType result = ProductionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayerFromString(EDataType eDataType, String initialValue) {
		Layer result = Layer.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLayerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationKind createRepresentationKindFromString(EDataType eDataType, String initialValue) {
		RepresentationKind result = RepresentationKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRepresentationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoliageType createFoliageTypeFromString(EDataType eDataType, String initialValue) {
		FoliageType result = FoliageType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFoliageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoilageShade createFoilageShadeFromString(EDataType eDataType, String initialValue) {
		FoilageShade result = FoilageShade.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFoilageShadeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroughtTolerance createDroughtToleranceFromString(EDataType eDataType, String initialValue) {
		DroughtTolerance result = DroughtTolerance.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDroughtToleranceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootType createRootTypeFromString(EDataType eDataType, String initialValue) {
		RootType result = RootType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue //$NON-NLS-1$
					+ "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRootTypeToString(EDataType eDataType, Object instanceValue) {
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
