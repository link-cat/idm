/**
 */
package api_rest;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Middleware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link api_rest.Middleware#getNom <em>Nom</em>}</li>
 *   <li>{@link api_rest.Middleware#getDescription <em>Description</em>}</li>
 *   <li>{@link api_rest.Middleware#getParameter <em>Parameter</em>}</li>
 *   <li>{@link api_rest.Middleware#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see api_rest.Api_restPackage#getMiddleware()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nomValide'"
 * @generated
 */
public interface Middleware extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see api_rest.Api_restPackage#getMiddleware_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link api_rest.Middleware#getNom <em>Nom</em>}' attribute.
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
	 * @see api_rest.Api_restPackage#getMiddleware_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link api_rest.Middleware#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link api_rest.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see api_rest.Api_restPackage#getMiddleware_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(Response)
	 * @see api_rest.Api_restPackage#getMiddleware_Return()
	 * @model containment="true"
	 * @generated
	 */
	Response getReturn();

	/**
	 * Sets the value of the '{@link api_rest.Middleware#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(Response value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Middleware.allInstances() -&gt; forAll(m1, m2 | m1 &lt;&gt; m2 implies m1.nom &lt;&gt; m2.nom)'"
	 * @generated
	 */
	boolean MiddlewareUnique(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.parameter -&gt; forAll (p1, p2 | p1 &lt;&gt; p2 implies p1.nom &lt;&gt; p2.nom)'"
	 * @generated
	 */
	boolean uniqueNameParameter(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.nom &lt;&gt; null and self.nom.size()&gt;0'"
	 * @generated
	 */
	boolean nomValide(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Middleware
