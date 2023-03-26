/**
 */
package com.link.site;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.link.site.UE#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link com.link.site.UE#getCode <em>Code</em>}</li>
 *   <li>{@link com.link.site.UE#getProgrammation <em>Programmation</em>}</li>
 *   <li>{@link com.link.site.UE#isRequired <em>Required</em>}</li>
 *   <li>{@link com.link.site.UE#getCredits <em>Credits</em>}</li>
 *   <li>{@link com.link.site.UE#getDescription <em>Description</em>}</li>
 *   <li>{@link com.link.site.UE#getResponsable <em>Responsable</em>}</li>
 *   <li>{@link com.link.site.UE#getRessource <em>Ressource</em>}</li>
 * </ul>
 *
 * @see com.link.site.SitePackage#getUE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='codeValide'"
 * @generated
 */
public interface UE extends EObject {
	/**
	 * Returns the value of the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle</em>' attribute.
	 * @see #setLibelle(String)
	 * @see com.link.site.SitePackage#getUE_Libelle()
	 * @model
	 * @generated
	 */
	String getLibelle();

	/**
	 * Sets the value of the '{@link com.link.site.UE#getLibelle <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle</em>' attribute.
	 * @see #getLibelle()
	 * @generated
	 */
	void setLibelle(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see com.link.site.SitePackage#getUE_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link com.link.site.UE#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Programmation</b></em>' reference list.
	 * The list contents are of type {@link com.link.site.Programmation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmation</em>' reference list.
	 * @see com.link.site.SitePackage#getUE_Programmation()
	 * @model
	 * @generated
	 */
	EList<Programmation> getProgrammation();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see com.link.site.SitePackage#getUE_Required()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link com.link.site.UE#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(int)
	 * @see com.link.site.SitePackage#getUE_Credits()
	 * @model required="true"
	 * @generated
	 */
	int getCredits();

	/**
	 * Sets the value of the '{@link com.link.site.UE#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.link.site.SitePackage#getUE_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.link.site.UE#getDescription <em>Description</em>}' attribute.
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
	 * @see com.link.site.SitePackage#getUE_Responsable()
	 * @model required="true"
	 * @generated
	 */
	Responsable getResponsable();

	/**
	 * Sets the value of the '{@link com.link.site.UE#getResponsable <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable</em>' reference.
	 * @see #getResponsable()
	 * @generated
	 */
	void setResponsable(Responsable value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' containment reference list.
	 * The list contents are of type {@link com.link.site.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' containment reference list.
	 * @see com.link.site.SitePackage#getUE_Ressource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getRessource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.code &lt;&gt; null and self.code.size()&gt;0'"
	 * @generated
	 */
	boolean codeValide(DiagnosticChain diagnostics, Map<Object, Object> context);

} // UE
