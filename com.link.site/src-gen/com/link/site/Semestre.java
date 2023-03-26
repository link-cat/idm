/**
 */
package com.link.site;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.link.site.Semestre#getNom <em>Nom</em>}</li>
 *   <li>{@link com.link.site.Semestre#getUe <em>Ue</em>}</li>
 * </ul>
 *
 * @see com.link.site.SitePackage#getSemestre()
 * @model
 * @generated
 */
public interface Semestre extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see com.link.site.SitePackage#getSemestre_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link com.link.site.Semestre#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Ue</b></em>' containment reference list.
	 * The list contents are of type {@link com.link.site.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue</em>' containment reference list.
	 * @see com.link.site.SitePackage#getSemestre_Ue()
	 * @model containment="true"
	 * @generated
	 */
	EList<UE> getUe();

} // Semestre
