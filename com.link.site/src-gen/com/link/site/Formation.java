/**
 */
package com.link.site;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.link.site.Formation#getNom <em>Nom</em>}</li>
 *   <li>{@link com.link.site.Formation#getDescription <em>Description</em>}</li>
 *   <li>{@link com.link.site.Formation#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link com.link.site.Formation#getSpecialite <em>Specialite</em>}</li>
 * </ul>
 *
 * @see com.link.site.SitePackage#getFormation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nomValide'"
 * @generated
 */
public interface Formation extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see com.link.site.SitePackage#getFormation_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link com.link.site.Formation#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.link.site.SitePackage#getFormation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.link.site.Formation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' containment reference list.
	 * The list contents are of type {@link com.link.site.Niveau}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' containment reference list.
	 * @see com.link.site.SitePackage#getFormation_Niveau()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Niveau> getNiveau();

	/**
	 * Returns the value of the '<em><b>Specialite</b></em>' containment reference list.
	 * The list contents are of type {@link com.link.site.Specialite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialite</em>' containment reference list.
	 * @see com.link.site.SitePackage#getFormation_Specialite()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialite> getSpecialite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Formation.allInstances() -&gt; forAll(f1, f2 | f1 &lt;&gt; f2 implies f1.nom &lt;&gt; f2.nom)'"
	 * @generated
	 */
	boolean FormationUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.niveau -&gt; forAll(n | n.specialite -&gt; isEmpty() or self.specialite -&gt; includesAll(n.specialite))'"
	 * @generated
	 */
	boolean specialiteDansFormation(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.niveau-&gt;isUnique(niveau)'"
	 * @generated
	 */
	boolean NiveauUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.nom &lt;&gt; null and self.nom.size()&gt;0'"
	 * @generated
	 */
	boolean nomValide(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Formation
