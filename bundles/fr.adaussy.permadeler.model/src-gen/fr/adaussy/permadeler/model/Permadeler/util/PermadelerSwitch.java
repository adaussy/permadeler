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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.adaussy.permadeler.model.Permadeler.PermadelerPackage
 * @generated
 */
public class PermadelerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PermadelerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermadelerSwitch() {
		if (modelPackage == null) {
			modelPackage = PermadelerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PermadelerPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null)
					result = caseNamedElement(root);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.KNOWLEDGE_BASE: {
				KnowledgeBase knowledgeBase = (KnowledgeBase)theEObject;
				T result = caseKnowledgeBase(knowledgeBase);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.SEED_BANK: {
				SeedBank seedBank = (SeedBank)theEObject;
				T result = caseSeedBank(seedBank);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.SEED_ITEM: {
				SeedItem seedItem = (SeedItem)theEObject;
				T result = caseSeedItem(seedItem);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.PLANTATION: {
				Plantation plantation = (Plantation)theEObject;
				T result = casePlantation(plantation);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.PLANT_NAMED_ELEMENT: {
				PlantNamedElement plantNamedElement = (PlantNamedElement)theEObject;
				T result = casePlantNamedElement(plantNamedElement);
				if (result == null)
					result = caseNamedElement(plantNamedElement);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null)
					result = caseNamedElement(reference);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.IMAGE: {
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.ZONE: {
				Zone zone = (Zone)theEObject;
				T result = caseZone(zone);
				if (result == null)
					result = caseNamedElement(zone);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.NURSARY: {
				Nursary nursary = (Nursary)theEObject;
				T result = caseNursary(nursary);
				if (result == null)
					result = caseTrayOwner(nursary);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.TRAY: {
				Tray tray = (Tray)theEObject;
				T result = caseTray(tray);
				if (result == null)
					result = caseNamedElement(tray);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.CELL: {
				Cell cell = (Cell)theEObject;
				T result = caseCell(cell);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.TRAY_ZONE: {
				TrayZone trayZone = (TrayZone)theEObject;
				T result = caseTrayZone(trayZone);
				if (result == null)
					result = caseTrayOwner(trayZone);
				if (result == null)
					result = caseNamedElement(trayZone);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.TRAY_OWNER: {
				TrayOwner trayOwner = (TrayOwner)theEObject;
				T result = caseTrayOwner(trayOwner);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.GRID_BED_ROW: {
				GridBedRow gridBedRow = (GridBedRow)theEObject;
				T result = caseGridBedRow(gridBedRow);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.GRID_BED_CELL: {
				GridBedCell gridBedCell = (GridBedCell)theEObject;
				T result = caseGridBedCell(gridBedCell);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.PLANFICATION: {
				Planfication planfication = (Planfication)theEObject;
				T result = casePlanfication(planfication);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.PLANIFIER: {
				Planifier planifier = (Planifier)theEObject;
				T result = casePlanifier(planifier);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.SOW_PLANFICATION: {
				SowPlanfication sowPlanfication = (SowPlanfication)theEObject;
				T result = caseSowPlanfication(sowPlanfication);
				if (result == null)
					result = casePlanfication(sowPlanfication);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.BACKGROUND_IMAGE: {
				BackgroundImage backgroundImage = (BackgroundImage)theEObject;
				T result = caseBackgroundImage(backgroundImage);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.PLANT: {
				Plant plant = (Plant)theEObject;
				T result = casePlant(plant);
				if (result == null)
					result = casePlantNamedElement(plant);
				if (result == null)
					result = caseNamedElement(plant);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.PRODUCTION: {
				Production production = (Production)theEObject;
				T result = caseProduction(production);
				if (result == null)
					result = caseTemporalItem(production);
				if (result == null)
					result = caseNamedElement(production);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null)
					result = caseTemporalItem(action);
				if (result == null)
					result = caseNamedElement(action);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.TEMPORAL_ITEM: {
				TemporalItem temporalItem = (TemporalItem)theEObject;
				T result = caseTemporalItem(temporalItem);
				if (result == null)
					result = caseNamedElement(temporalItem);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			case PermadelerPackage.PLANTATION_PHASE: {
				PlantationPhase plantationPhase = (PlantationPhase)theEObject;
				T result = casePlantationPhase(plantationPhase);
				if (result == null)
					result = caseNamedElement(plantationPhase);
				if (result == null)
					result = defaultCase(theEObject);
				return result;
			}
			default:
				return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledgeBase(KnowledgeBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seed Bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seed Bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeedBank(SeedBank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seed Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seed Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeedItem(SeedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plantation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plantation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlantation(Plantation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlantNamedElement(PlantNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZone(Zone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nursary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nursary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNursary(Nursary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tray</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tray</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTray(Tray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCell(Cell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tray Zone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tray Zone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrayZone(TrayZone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tray Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tray Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrayOwner(TrayOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Bed Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Bed Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridBedRow(GridBedRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Bed Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Bed Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridBedCell(GridBedCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planfication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planfication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanfication(Planfication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanifier(Planifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sow Planfication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sow Planfication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSowPlanfication(SowPlanfication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackgroundImage(BackgroundImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlant(Plant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduction(Production object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalItem(TemporalItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plantation Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plantation Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlantationPhase(PlantationPhase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PermadelerSwitch
