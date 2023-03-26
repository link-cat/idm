/**
 */
package api_rest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link api_rest.Response#getCode <em>Code</em>}</li>
 *   <li>{@link api_rest.Response#getCorps <em>Corps</em>}</li>
 *   <li>{@link api_rest.Response#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see api_rest.Api_restPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(int)
	 * @see api_rest.Api_restPackage#getResponse_Code()
	 * @model required="true"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link api_rest.Response#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Corps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corps</em>' attribute.
	 * @see #setCorps(String)
	 * @see api_rest.Api_restPackage#getResponse_Corps()
	 * @model
	 * @generated
	 */
	String getCorps();

	/**
	 * Sets the value of the '{@link api_rest.Response#getCorps <em>Corps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corps</em>' attribute.
	 * @see #getCorps()
	 * @generated
	 */
	void setCorps(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see api_rest.Api_restPackage#getResponse_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link api_rest.Response#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Response
