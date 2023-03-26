/**
 */
package com.link.site.util;

import com.link.site.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.link.site.SitePackage
 * @generated
 */
public class SiteValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SiteValidator INSTANCE = new SiteValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.link.site";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Responsable Unique' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__RESPONSABLE_UNIQUE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Departement Unique' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__DEPARTEMENT_UNIQUE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nom Valide' of 'Departement'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPARTEMENT__NOM_VALIDE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Formation Unique' of 'Formation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMATION__FORMATION_UNIQUE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Specialite Dans Formation' of 'Formation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMATION__SPECIALITE_DANS_FORMATION = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Niveau Unique' of 'Formation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMATION__NIVEAU_UNIQUE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nom Valide' of 'Formation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMATION__NOM_VALIDE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nom Valide' of 'Specialite'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SPECIALITE__NOM_VALIDE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Code Valide' of 'UE'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int UE__CODE_VALIDE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nom Valide' of 'Responsable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESPONSABLE__NOM_VALIDE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nom Valide' of 'Ressource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESSOURCE__NOM_VALIDE = 11;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 11;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return SitePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case SitePackage.DEPARTEMENT:
			return validateDepartement((Departement) value, diagnostics, context);
		case SitePackage.FORMATION:
			return validateFormation((Formation) value, diagnostics, context);
		case SitePackage.NIVEAU:
			return validateNiveau((Niveau) value, diagnostics, context);
		case SitePackage.SPECIALITE:
			return validateSpecialite((Specialite) value, diagnostics, context);
		case SitePackage.SEMESTRE:
			return validateSemestre((Semestre) value, diagnostics, context);
		case SitePackage.UE:
			return validateUE((UE) value, diagnostics, context);
		case SitePackage.RESPONSABLE:
			return validateResponsable((Responsable) value, diagnostics, context);
		case SitePackage.RESSOURCE:
			return validateRessource((Ressource) value, diagnostics, context);
		case SitePackage.PROGRAMMATION:
			return validateProgrammation((Programmation) value, diagnostics, context);
		case SitePackage.SITE:
			return validateSite((Site) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement(Departement departement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(departement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDepartement_nomValide(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDepartement_responsableUnique(departement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDepartement_DepartementUnique(departement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nomValide constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_nomValide(Departement departement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return departement.nomValide(diagnostics, context);
	}

	/**
	 * Validates the responsableUnique constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_responsableUnique(Departement departement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return departement.responsableUnique(diagnostics, context);
	}

	/**
	 * Validates the DepartementUnique constraint of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartement_DepartementUnique(Departement departement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return departement.DepartementUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation(Formation formation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(formation, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFormation_nomValide(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFormation_FormationUnique(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFormation_specialiteDansFormation(formation, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFormation_NiveauUnique(formation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nomValide constraint of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation_nomValide(Formation formation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return formation.nomValide(diagnostics, context);
	}

	/**
	 * Validates the FormationUnique constraint of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation_FormationUnique(Formation formation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return formation.FormationUnique(diagnostics, context);
	}

	/**
	 * Validates the specialiteDansFormation constraint of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation_specialiteDansFormation(Formation formation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return formation.specialiteDansFormation(diagnostics, context);
	}

	/**
	 * Validates the NiveauUnique constraint of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormation_NiveauUnique(Formation formation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return formation.NiveauUnique(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNiveau(Niveau niveau, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niveau, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialite(Specialite specialite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(specialite, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(specialite, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(specialite, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(specialite, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(specialite, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(specialite, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(specialite, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(specialite, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(specialite, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSpecialite_nomValide(specialite, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nomValide constraint of '<em>Specialite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialite_nomValide(Specialite specialite, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return specialite.nomValide(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemestre(Semestre semestre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semestre, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUE(UE ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ue, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(ue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(ue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(ue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(ue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(ue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(ue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(ue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(ue, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateUE_codeValide(ue, diagnostics, context);
		return result;
	}

	/**
	 * Validates the codeValide constraint of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUE_codeValide(UE ue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ue.codeValide(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsable(Responsable responsable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(responsable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(responsable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(responsable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(responsable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(responsable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(responsable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(responsable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(responsable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(responsable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateResponsable_nomValide(responsable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nomValide constraint of '<em>Responsable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsable_nomValide(Responsable responsable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return responsable.nomValide(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource(Ressource ressource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ressource, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(ressource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(ressource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(ressource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(ressource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(ressource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(ressource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(ressource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(ressource, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRessource_nomValide(ressource, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nomValide constraint of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRessource_nomValide(Ressource ressource, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ressource.nomValide(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammation(Programmation programmation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programmation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSite(Site site, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(site, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SiteValidator
