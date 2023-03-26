/**
 */
package api_rest;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link api_rest.Route#getChemin <em>Chemin</em>}</li>
 *   <li>{@link api_rest.Route#getMethode <em>Methode</em>}</li>
 *   <li>{@link api_rest.Route#getDescription <em>Description</em>}</li>
 *   <li>{@link api_rest.Route#getMiddleware <em>Middleware</em>}</li>
 * </ul>
 *
 * @see api_rest.Api_restPackage#getRoute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueResponse'"
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chemin</em>' attribute.
	 * @see #setChemin(String)
	 * @see api_rest.Api_restPackage#getRoute_Chemin()
	 * @model
	 * @generated
	 */
	String getChemin();

	/**
	 * Sets the value of the '{@link api_rest.Route#getChemin <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chemin</em>' attribute.
	 * @see #getChemin()
	 * @generated
	 */
	void setChemin(String value);

	/**
	 * Returns the value of the '<em><b>Methode</b></em>' attribute.
	 * The literals are from the enumeration {@link api_rest.HTTP_METHOD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methode</em>' attribute.
	 * @see api_rest.HTTP_METHOD
	 * @see #setMethode(HTTP_METHOD)
	 * @see api_rest.Api_restPackage#getRoute_Methode()
	 * @model
	 * @generated
	 */
	HTTP_METHOD getMethode();

	/**
	 * Sets the value of the '{@link api_rest.Route#getMethode <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methode</em>' attribute.
	 * @see api_rest.HTTP_METHOD
	 * @see #getMethode()
	 * @generated
	 */
	void setMethode(HTTP_METHOD value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see api_rest.Api_restPackage#getRoute_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link api_rest.Route#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Middleware</b></em>' containment reference list.
	 * The list contents are of type {@link api_rest.Middleware}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middleware</em>' containment reference list.
	 * @see api_rest.Api_restPackage#getRoute_Middleware()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Middleware> getMiddleware();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.middleware -&gt; forAll (m1, m2 | m1 &lt;&gt; m2 implies m1.return-&gt;isEmpty() or m2.return-&gt;isEmpty())'"
	 * @generated
	 */
	boolean uniqueResponse(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Route
