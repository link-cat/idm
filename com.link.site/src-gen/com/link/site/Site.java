/**
 */
package com.link.site;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.link.site.Site#getNom <em>Nom</em>}</li>
 *   <li>{@link com.link.site.Site#getDepartement <em>Departement</em>}</li>
 *   <li>{@link com.link.site.Site#getResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @see com.link.site.SitePackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see com.link.site.SitePackage#getSite_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link com.link.site.Site#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Departement</b></em>' containment reference list.
	 * The list contents are of type {@link com.link.site.Departement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departement</em>' containment reference list.
	 * @see com.link.site.SitePackage#getSite_Departement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Departement> getDepartement();

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' containment reference list.
	 * The list contents are of type {@link com.link.site.Responsable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' containment reference list.
	 * @see com.link.site.SitePackage#getSite_Responsable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Responsable> getResponsable();

} // Site
