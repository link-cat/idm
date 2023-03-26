/**
 */
package com.link.site;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see com.link.site.SiteFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface SitePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "site";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/site";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "site";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SitePackage eINSTANCE = com.link.site.impl.SitePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.link.site.impl.DepartementImpl <em>Departement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.link.site.impl.DepartementImpl
	 * @see com.link.site.impl.SitePackageImpl#getDepartement()
	 * @generated
	 */
	int DEPARTEMENT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__NOM = 0;

	/**
	 * The feature id for the '<em><b>Formation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__FORMATION = 1;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__RESPONSABLE = 2;

	/**
	 * The number of structural features of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Responsable Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___RESPONSABLE_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Departement Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___DEPARTEMENT_UNIQUE__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Nom Valide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.link.site.impl.FormationImpl <em>Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.link.site.impl.FormationImpl
	 * @see com.link.site.impl.SitePackageImpl#getFormation()
	 * @generated
	 */
	int FORMATION = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NIVEAU = 2;

	/**
	 * The feature id for the '<em><b>Specialite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__SPECIALITE = 3;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Formation Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION___FORMATION_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Specialite Dans Formation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION___SPECIALITE_DANS_FORMATION__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Niveau Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION___NIVEAU_UNIQUE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The operation id for the '<em>Nom Valide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = 3;

	/**
	 * The number of operations of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.link.site.impl.NiveauImpl <em>Niveau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.link.site.impl.NiveauImpl
	 * @see com.link.site.impl.SitePackageImpl#getNiveau()
	 * @generated
	 */
	int NIVEAU = 2;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__NIVEAU = 0;

	/**
	 * The feature id for the '<em><b>Specialite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__SPECIALITE = 1;

	/**
	 * The feature id for the '<em><b>Semestre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__SEMESTRE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU__RESPONSABLE = 4;

	/**
	 * The number of structural features of the '<em>Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Niveau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NIVEAU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.link.site.impl.SpecialiteImpl <em>Specialite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.link.site.impl.SpecialiteImpl
	 * @see com.link.site.impl.SitePackageImpl#getSpecialite()
	 * @generated
	 */
	int SPECIALITE = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Specialite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Nom Valide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Specialite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALITE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.link.site.impl.SemestreImpl <em>Semestre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.link.site.impl.SemestreImpl
	 * @see com.link.site.impl.SitePackageImpl#getSemestre()
	 * @generated
	 */
	int SEMESTRE = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Ue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__UE = 1;

	/**
	 * The number of structural features of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.link.site.impl.UEImpl <em>UE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.link.site.impl.UEImpl
	 * @see com.link.site.impl.SitePackageImpl#getUE()
	 * @generated
	 */
	int UE = 5;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__LIBELLE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Programmation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__PROGRAMMATION = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__CREDITS = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__RESPONSABLE = 6;

	/**
	 * The feature id for the '<em><b>Ressource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__RESSOURCE = 7;

	/**
	 * The number of structural features of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Code Valide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE___CODE_VALIDE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.link.site.impl.ResponsableImpl <em>Responsable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.link.site.impl.ResponsableImpl
	 * @see com.link.site.impl.SitePackageImpl#getResponsable()
	 * @generated
	 */
	int RESPONSABLE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__PRENOM = 1;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE__GRADE = 2;

	/**
	 * The number of structural features of the '<em>Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Nom Valide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Responsable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.link.site.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.link.site.impl.RessourceImpl
	 * @see com.link.site.impl.SitePackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 7;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__LIEN = 3;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Nom Valide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.link.site.impl.ProgrammationImpl <em>Programmation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.link.site.impl.ProgrammationImpl
	 * @see com.link.site.impl.SitePackageImpl#getProgrammation()
	 * @generated
	 */
	int PROGRAMMATION = 8;

	/**
	 * The feature id for the '<em><b>Jour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__JOUR = 0;

	/**
	 * The feature id for the '<em><b>Salle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__SALLE = 1;

	/**
	 * The feature id for the '<em><b>Heure Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__HEURE_DEBUT = 2;

	/**
	 * The feature id for the '<em><b>Heure Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION__HEURE_FIN = 3;

	/**
	 * The number of structural features of the '<em>Programmation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Programmation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.link.site.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.link.site.impl.SiteImpl
	 * @see com.link.site.impl.SitePackageImpl#getSite()
	 * @generated
	 */
	int SITE = 9;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Departement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__DEPARTEMENT = 1;

	/**
	 * The feature id for the '<em><b>Responsable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__RESPONSABLE = 2;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.link.site.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departement</em>'.
	 * @see com.link.site.Departement
	 * @generated
	 */
	EClass getDepartement();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Departement#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see com.link.site.Departement#getNom()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link com.link.site.Departement#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formation</em>'.
	 * @see com.link.site.Departement#getFormation()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Formation();

	/**
	 * Returns the meta object for the reference '{@link com.link.site.Departement#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see com.link.site.Departement#getResponsable()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Responsable();

	/**
	 * Returns the meta object for the '{@link com.link.site.Departement#responsableUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Responsable Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Responsable Unique</em>' operation.
	 * @see com.link.site.Departement#responsableUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__ResponsableUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.link.site.Departement#DepartementUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Departement Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Departement Unique</em>' operation.
	 * @see com.link.site.Departement#DepartementUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__DepartementUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.link.site.Departement#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nom Valide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nom Valide</em>' operation.
	 * @see com.link.site.Departement#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDepartement__NomValide__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.link.site.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formation</em>'.
	 * @see com.link.site.Formation
	 * @generated
	 */
	EClass getFormation();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Formation#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see com.link.site.Formation#getNom()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Nom();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Formation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.link.site.Formation#getDescription()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.link.site.Formation#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Niveau</em>'.
	 * @see com.link.site.Formation#getNiveau()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Niveau();

	/**
	 * Returns the meta object for the containment reference list '{@link com.link.site.Formation#getSpecialite <em>Specialite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specialite</em>'.
	 * @see com.link.site.Formation#getSpecialite()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Specialite();

	/**
	 * Returns the meta object for the '{@link com.link.site.Formation#FormationUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Formation Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Formation Unique</em>' operation.
	 * @see com.link.site.Formation#FormationUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormation__FormationUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.link.site.Formation#specialiteDansFormation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Specialite Dans Formation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Specialite Dans Formation</em>' operation.
	 * @see com.link.site.Formation#specialiteDansFormation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormation__SpecialiteDansFormation__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.link.site.Formation#NiveauUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Niveau Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Niveau Unique</em>' operation.
	 * @see com.link.site.Formation#NiveauUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormation__NiveauUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link com.link.site.Formation#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nom Valide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nom Valide</em>' operation.
	 * @see com.link.site.Formation#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFormation__NomValide__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.link.site.Niveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Niveau</em>'.
	 * @see com.link.site.Niveau
	 * @generated
	 */
	EClass getNiveau();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Niveau#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Niveau</em>'.
	 * @see com.link.site.Niveau#getNiveau()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Niveau();

	/**
	 * Returns the meta object for the reference list '{@link com.link.site.Niveau#getSpecialite <em>Specialite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialite</em>'.
	 * @see com.link.site.Niveau#getSpecialite()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Specialite();

	/**
	 * Returns the meta object for the containment reference list '{@link com.link.site.Niveau#getSemestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semestre</em>'.
	 * @see com.link.site.Niveau#getSemestre()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Semestre();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Niveau#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.link.site.Niveau#getDescription()
	 * @see #getNiveau()
	 * @generated
	 */
	EAttribute getNiveau_Description();

	/**
	 * Returns the meta object for the reference '{@link com.link.site.Niveau#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see com.link.site.Niveau#getResponsable()
	 * @see #getNiveau()
	 * @generated
	 */
	EReference getNiveau_Responsable();

	/**
	 * Returns the meta object for class '{@link com.link.site.Specialite <em>Specialite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialite</em>'.
	 * @see com.link.site.Specialite
	 * @generated
	 */
	EClass getSpecialite();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Specialite#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see com.link.site.Specialite#getNom()
	 * @see #getSpecialite()
	 * @generated
	 */
	EAttribute getSpecialite_Nom();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Specialite#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.link.site.Specialite#getDescription()
	 * @see #getSpecialite()
	 * @generated
	 */
	EAttribute getSpecialite_Description();

	/**
	 * Returns the meta object for the '{@link com.link.site.Specialite#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nom Valide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nom Valide</em>' operation.
	 * @see com.link.site.Specialite#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSpecialite__NomValide__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.link.site.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semestre</em>'.
	 * @see com.link.site.Semestre
	 * @generated
	 */
	EClass getSemestre();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Semestre#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see com.link.site.Semestre#getNom()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link com.link.site.Semestre#getUe <em>Ue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ue</em>'.
	 * @see com.link.site.Semestre#getUe()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_Ue();

	/**
	 * Returns the meta object for class '{@link com.link.site.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UE</em>'.
	 * @see com.link.site.UE
	 * @generated
	 */
	EClass getUE();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.UE#getLibelle <em>Libelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libelle</em>'.
	 * @see com.link.site.UE#getLibelle()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Libelle();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.UE#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.link.site.UE#getCode()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Code();

	/**
	 * Returns the meta object for the reference list '{@link com.link.site.UE#getProgrammation <em>Programmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Programmation</em>'.
	 * @see com.link.site.UE#getProgrammation()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Programmation();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.UE#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see com.link.site.UE#isRequired()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Required();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.UE#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see com.link.site.UE#getCredits()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Credits();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.UE#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.link.site.UE#getDescription()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Description();

	/**
	 * Returns the meta object for the reference '{@link com.link.site.UE#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable</em>'.
	 * @see com.link.site.UE#getResponsable()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Responsable();

	/**
	 * Returns the meta object for the containment reference list '{@link com.link.site.UE#getRessource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressource</em>'.
	 * @see com.link.site.UE#getRessource()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Ressource();

	/**
	 * Returns the meta object for the '{@link com.link.site.UE#codeValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Code Valide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Code Valide</em>' operation.
	 * @see com.link.site.UE#codeValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getUE__CodeValide__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.link.site.Responsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsable</em>'.
	 * @see com.link.site.Responsable
	 * @generated
	 */
	EClass getResponsable();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Responsable#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see com.link.site.Responsable#getNom()
	 * @see #getResponsable()
	 * @generated
	 */
	EAttribute getResponsable_Nom();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Responsable#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see com.link.site.Responsable#getPrenom()
	 * @see #getResponsable()
	 * @generated
	 */
	EAttribute getResponsable_Prenom();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Responsable#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see com.link.site.Responsable#getGrade()
	 * @see #getResponsable()
	 * @generated
	 */
	EAttribute getResponsable_Grade();

	/**
	 * Returns the meta object for the '{@link com.link.site.Responsable#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nom Valide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nom Valide</em>' operation.
	 * @see com.link.site.Responsable#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getResponsable__NomValide__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.link.site.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see com.link.site.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Ressource#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see com.link.site.Ressource#getNom()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Nom();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Ressource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.link.site.Ressource#getDescription()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Ressource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.link.site.Ressource#getType()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Ressource#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lien</em>'.
	 * @see com.link.site.Ressource#getLien()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Lien();

	/**
	 * Returns the meta object for the '{@link com.link.site.Ressource#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nom Valide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nom Valide</em>' operation.
	 * @see com.link.site.Ressource#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRessource__NomValide__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link com.link.site.Programmation <em>Programmation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programmation</em>'.
	 * @see com.link.site.Programmation
	 * @generated
	 */
	EClass getProgrammation();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Programmation#getJour <em>Jour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jour</em>'.
	 * @see com.link.site.Programmation#getJour()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_Jour();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Programmation#getSalle <em>Salle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salle</em>'.
	 * @see com.link.site.Programmation#getSalle()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_Salle();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Programmation#getHeureDebut <em>Heure Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Debut</em>'.
	 * @see com.link.site.Programmation#getHeureDebut()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_HeureDebut();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Programmation#getHeureFin <em>Heure Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Fin</em>'.
	 * @see com.link.site.Programmation#getHeureFin()
	 * @see #getProgrammation()
	 * @generated
	 */
	EAttribute getProgrammation_HeureFin();

	/**
	 * Returns the meta object for class '{@link com.link.site.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see com.link.site.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the attribute '{@link com.link.site.Site#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see com.link.site.Site#getNom()
	 * @see #getSite()
	 * @generated
	 */
	EAttribute getSite_Nom();

	/**
	 * Returns the meta object for the containment reference list '{@link com.link.site.Site#getDepartement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departement</em>'.
	 * @see com.link.site.Site#getDepartement()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Departement();

	/**
	 * Returns the meta object for the containment reference list '{@link com.link.site.Site#getResponsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Responsable</em>'.
	 * @see com.link.site.Site#getResponsable()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Responsable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SiteFactory getSiteFactory();

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
		 * The meta object literal for the '{@link com.link.site.impl.DepartementImpl <em>Departement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.link.site.impl.DepartementImpl
		 * @see com.link.site.impl.SitePackageImpl#getDepartement()
		 * @generated
		 */
		EClass DEPARTEMENT = eINSTANCE.getDepartement();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__NOM = eINSTANCE.getDepartement_Nom();

		/**
		 * The meta object literal for the '<em><b>Formation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__FORMATION = eINSTANCE.getDepartement_Formation();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__RESPONSABLE = eINSTANCE.getDepartement_Responsable();

		/**
		 * The meta object literal for the '<em><b>Responsable Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___RESPONSABLE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDepartement__ResponsableUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Departement Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___DEPARTEMENT_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDepartement__DepartementUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nom Valide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPARTEMENT___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDepartement__NomValide__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.link.site.impl.FormationImpl <em>Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.link.site.impl.FormationImpl
		 * @see com.link.site.impl.SitePackageImpl#getFormation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getFormation();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NOM = eINSTANCE.getFormation_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__DESCRIPTION = eINSTANCE.getFormation_Description();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__NIVEAU = eINSTANCE.getFormation_Niveau();

		/**
		 * The meta object literal for the '<em><b>Specialite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__SPECIALITE = eINSTANCE.getFormation_Specialite();

		/**
		 * The meta object literal for the '<em><b>Formation Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMATION___FORMATION_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getFormation__FormationUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Specialite Dans Formation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMATION___SPECIALITE_DANS_FORMATION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getFormation__SpecialiteDansFormation__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Niveau Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMATION___NIVEAU_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getFormation__NiveauUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nom Valide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FORMATION___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getFormation__NomValide__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.link.site.impl.NiveauImpl <em>Niveau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.link.site.impl.NiveauImpl
		 * @see com.link.site.impl.SitePackageImpl#getNiveau()
		 * @generated
		 */
		EClass NIVEAU = eINSTANCE.getNiveau();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__NIVEAU = eINSTANCE.getNiveau_Niveau();

		/**
		 * The meta object literal for the '<em><b>Specialite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__SPECIALITE = eINSTANCE.getNiveau_Specialite();

		/**
		 * The meta object literal for the '<em><b>Semestre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__SEMESTRE = eINSTANCE.getNiveau_Semestre();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NIVEAU__DESCRIPTION = eINSTANCE.getNiveau_Description();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NIVEAU__RESPONSABLE = eINSTANCE.getNiveau_Responsable();

		/**
		 * The meta object literal for the '{@link com.link.site.impl.SpecialiteImpl <em>Specialite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.link.site.impl.SpecialiteImpl
		 * @see com.link.site.impl.SitePackageImpl#getSpecialite()
		 * @generated
		 */
		EClass SPECIALITE = eINSTANCE.getSpecialite();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALITE__NOM = eINSTANCE.getSpecialite_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALITE__DESCRIPTION = eINSTANCE.getSpecialite_Description();

		/**
		 * The meta object literal for the '<em><b>Nom Valide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPECIALITE___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSpecialite__NomValide__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.link.site.impl.SemestreImpl <em>Semestre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.link.site.impl.SemestreImpl
		 * @see com.link.site.impl.SitePackageImpl#getSemestre()
		 * @generated
		 */
		EClass SEMESTRE = eINSTANCE.getSemestre();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__NOM = eINSTANCE.getSemestre_Nom();

		/**
		 * The meta object literal for the '<em><b>Ue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__UE = eINSTANCE.getSemestre_Ue();

		/**
		 * The meta object literal for the '{@link com.link.site.impl.UEImpl <em>UE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.link.site.impl.UEImpl
		 * @see com.link.site.impl.SitePackageImpl#getUE()
		 * @generated
		 */
		EClass UE = eINSTANCE.getUE();

		/**
		 * The meta object literal for the '<em><b>Libelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__LIBELLE = eINSTANCE.getUE_Libelle();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__CODE = eINSTANCE.getUE_Code();

		/**
		 * The meta object literal for the '<em><b>Programmation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__PROGRAMMATION = eINSTANCE.getUE_Programmation();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__REQUIRED = eINSTANCE.getUE_Required();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__CREDITS = eINSTANCE.getUE_Credits();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__DESCRIPTION = eINSTANCE.getUE_Description();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__RESPONSABLE = eINSTANCE.getUE_Responsable();

		/**
		 * The meta object literal for the '<em><b>Ressource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__RESSOURCE = eINSTANCE.getUE_Ressource();

		/**
		 * The meta object literal for the '<em><b>Code Valide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UE___CODE_VALIDE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getUE__CodeValide__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.link.site.impl.ResponsableImpl <em>Responsable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.link.site.impl.ResponsableImpl
		 * @see com.link.site.impl.SitePackageImpl#getResponsable()
		 * @generated
		 */
		EClass RESPONSABLE = eINSTANCE.getResponsable();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSABLE__NOM = eINSTANCE.getResponsable_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSABLE__PRENOM = eINSTANCE.getResponsable_Prenom();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSABLE__GRADE = eINSTANCE.getResponsable_Grade();

		/**
		 * The meta object literal for the '<em><b>Nom Valide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESPONSABLE___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getResponsable__NomValide__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.link.site.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.link.site.impl.RessourceImpl
		 * @see com.link.site.impl.SitePackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__NOM = eINSTANCE.getRessource_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__DESCRIPTION = eINSTANCE.getRessource_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__TYPE = eINSTANCE.getRessource_Type();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__LIEN = eINSTANCE.getRessource_Lien();

		/**
		 * The meta object literal for the '<em><b>Nom Valide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESSOURCE___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRessource__NomValide__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link com.link.site.impl.ProgrammationImpl <em>Programmation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.link.site.impl.ProgrammationImpl
		 * @see com.link.site.impl.SitePackageImpl#getProgrammation()
		 * @generated
		 */
		EClass PROGRAMMATION = eINSTANCE.getProgrammation();

		/**
		 * The meta object literal for the '<em><b>Jour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__JOUR = eINSTANCE.getProgrammation_Jour();

		/**
		 * The meta object literal for the '<em><b>Salle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__SALLE = eINSTANCE.getProgrammation_Salle();

		/**
		 * The meta object literal for the '<em><b>Heure Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__HEURE_DEBUT = eINSTANCE.getProgrammation_HeureDebut();

		/**
		 * The meta object literal for the '<em><b>Heure Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMATION__HEURE_FIN = eINSTANCE.getProgrammation_HeureFin();

		/**
		 * The meta object literal for the '{@link com.link.site.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.link.site.impl.SiteImpl
		 * @see com.link.site.impl.SitePackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SITE__NOM = eINSTANCE.getSite_Nom();

		/**
		 * The meta object literal for the '<em><b>Departement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__DEPARTEMENT = eINSTANCE.getSite_Departement();

		/**
		 * The meta object literal for the '<em><b>Responsable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__RESPONSABLE = eINSTANCE.getSite_Responsable();

	}

} //SitePackage
