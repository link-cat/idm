/**
 */
package com.link.site;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.link.site.Niveau#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link com.link.site.Niveau#getSpecialite <em>Specialite</em>}</li>
 *   <li>{@link com.link.site.Niveau#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link com.link.site.Niveau#getDescription <em>Description</em>}</li>
 *   <li>{@link com.link.site.Niveau#getResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @see com.link.site.SitePackage#getNiveau()
 * @model
 * @generated
 */
public interface Niveau extends EObject {
	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see #setNiveau(String)
	 * @see com.link.site.SitePackage#getNiveau_Niveau()
	 * @model
	 * @generated
	 */
	String getNiveau();

	/**
	 * Sets the value of the '{@link com.link.site.Niveau#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(String value);

	/**
	 * Returns the value of the '<em><b>Specialite</b></em>' reference list.
	 * The list contents are of type {@link com.link.site.Specialite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialite</em>' reference list.
	 * @see com.link.site.SitePackage#getNiveau_Specialite()
	 * @model
	 * @generated
	 */
	EList<Specialite> getSpecialite();

	/**
	 * Returns the value of the '<em><b>Semestre</b></em>' containment reference list.
	 * The list contents are of type {@link com.link.site.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestre</em>' containment reference list.
	 * @see com.link.site.SitePackage#getNiveau_Semestre()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Semestre> getSemestre();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.link.site.SitePackage#getNiveau_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.link.site.Niveau#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Responsable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable</em>' reference.
	 * @see #setResponsable(Responsable)
	 * @see com.link.site.SitePackage#getNiveau_Responsable()
	 * @model required="true"
	 * @generated
	 */
	Responsable getResponsable();

	/**
	 * Sets the value of the '{@link com.link.site.Niveau#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Responsable value);

} // Niveau
