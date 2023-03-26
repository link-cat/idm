/**
 */
package com.link.site.util;

import com.link.site.*;

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
 * @see com.link.site.SitePackage
 * @generated
 */
public class SiteSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SitePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteSwitch() {
		if (modelPackage == null) {
			modelPackage = SitePackage.eINSTANCE;
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
		case SitePackage.DEPARTEMENT: {
			Departement departement = (Departement) theEObject;
			T result = caseDepartement(departement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SitePackage.FORMATION: {
			Formation formation = (Formation) theEObject;
			T result = caseFormation(formation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SitePackage.NIVEAU: {
			Niveau niveau = (Niveau) theEObject;
			T result = caseNiveau(niveau);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SitePackage.SPECIALITE: {
			Specialite specialite = (Specialite) theEObject;
			T result = caseSpecialite(specialite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SitePackage.SEMESTRE: {
			Semestre semestre = (Semestre) theEObject;
			T result = caseSemestre(semestre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SitePackage.UE: {
			UE ue = (UE) theEObject;
			T result = caseUE(ue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SitePackage.RESPONSABLE: {
			Responsable responsable = (Responsable) theEObject;
			T result = caseResponsable(responsable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SitePackage.RESSOURCE: {
			Ressource ressource = (Ressource) theEObject;
			T result = caseRessource(ressource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SitePackage.PROGRAMMATION: {
			Programmation programmation = (Programmation) theEObject;
			T result = caseProgrammation(programmation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SitePackage.SITE: {
			Site site = (Site) theEObject;
			T result = caseSite(site);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Departement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartement(Departement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormation(Formation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Niveau</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Niveau</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNiveau(Niveau object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specialite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specialite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialite(Specialite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semestre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemestre(Semestre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUE(UE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsable(Responsable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessource(Ressource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programmation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programmation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgrammation(Programmation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSite(Site object) {
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

} //SiteSwitch
