/**
 */
package api_rest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see api_rest.Api_restFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Api_restPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "api_rest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/api_rest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "api_rest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Api_restPackage eINSTANCE = api_rest.impl.Api_restPackageImpl.init();

	/**
	 * The meta object id for the '{@link api_rest.impl.ServeurImpl <em>Serveur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see api_rest.impl.ServeurImpl
	 * @see api_rest.impl.Api_restPackageImpl#getServeur()
	 * @generated
	 */
	int SERVEUR = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__NOM = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__ROUTE = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__PORT = 4;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR__CONNECTION = 5;

	/**
	 * The number of structural features of the '<em>Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Serveur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link api_rest.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see api_rest.impl.RouteImpl
	 * @see api_rest.impl.Api_restPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 1;

	/**
	 * The feature id for the '<em><b>Chemin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__CHEMIN = 0;

	/**
	 * The feature id for the '<em><b>Methode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__METHODE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Middleware</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__MIDDLEWARE = 3;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Unique Response</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE___UNIQUE_RESPONSE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link api_rest.impl.MiddlewareImpl <em>Middleware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see api_rest.impl.MiddlewareImpl
	 * @see api_rest.impl.Api_restPackageImpl#getMiddleware()
	 * @generated
	 */
	int MIDDLEWARE = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE__RETURN = 3;

	/**
	 * The number of structural features of the '<em>Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Middleware Unique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE___MIDDLEWARE_UNIQUE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The operation id for the '<em>Unique Name Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE___UNIQUE_NAME_PARAMETER__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The operation id for the '<em>Nom Valide</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = 2;

	/**
	 * The number of operations of the '<em>Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDDLEWARE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link api_rest.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see api_rest.impl.ResponseImpl
	 * @see api_rest.impl.Api_restPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Corps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__CORPS = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link api_rest.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see api_rest.impl.ParameterImpl
	 * @see api_rest.impl.Api_restPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NOM = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__REQUIRED = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link api_rest.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see api_rest.impl.ConnectionImpl
	 * @see api_rest.impl.Api_restPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__HOST = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__USER = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DATABASE = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link api_rest.HTTP_METHOD <em>HTTP METHOD</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see api_rest.HTTP_METHOD
	 * @see api_rest.impl.Api_restPackageImpl#getHTTP_METHOD()
	 * @generated
	 */
	int HTTP_METHOD = 6;

	/**
	 * Returns the meta object for class '{@link api_rest.Serveur <em>Serveur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serveur</em>'.
	 * @see api_rest.Serveur
	 * @generated
	 */
	EClass getServeur();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Serveur#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see api_rest.Serveur#getNom()
	 * @see #getServeur()
	 * @generated
	 */
	EAttribute getServeur_Nom();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Serveur#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see api_rest.Serveur#getVersion()
	 * @see #getServeur()
	 * @generated
	 */
	EAttribute getServeur_Version();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Serveur#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see api_rest.Serveur#getDescription()
	 * @see #getServeur()
	 * @generated
	 */
	EAttribute getServeur_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link api_rest.Serveur#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route</em>'.
	 * @see api_rest.Serveur#getRoute()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Route();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Serveur#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see api_rest.Serveur#getPort()
	 * @see #getServeur()
	 * @generated
	 */
	EAttribute getServeur_Port();

	/**
	 * Returns the meta object for the containment reference '{@link api_rest.Serveur#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection</em>'.
	 * @see api_rest.Serveur#getConnection()
	 * @see #getServeur()
	 * @generated
	 */
	EReference getServeur_Connection();

	/**
	 * Returns the meta object for class '{@link api_rest.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see api_rest.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Route#getChemin <em>Chemin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chemin</em>'.
	 * @see api_rest.Route#getChemin()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Chemin();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Route#getMethode <em>Methode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Methode</em>'.
	 * @see api_rest.Route#getMethode()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Methode();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Route#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see api_rest.Route#getDescription()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link api_rest.Route#getMiddleware <em>Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Middleware</em>'.
	 * @see api_rest.Route#getMiddleware()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Middleware();

	/**
	 * Returns the meta object for the '{@link api_rest.Route#uniqueResponse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Response</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Response</em>' operation.
	 * @see api_rest.Route#uniqueResponse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRoute__UniqueResponse__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link api_rest.Middleware <em>Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Middleware</em>'.
	 * @see api_rest.Middleware
	 * @generated
	 */
	EClass getMiddleware();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Middleware#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see api_rest.Middleware#getNom()
	 * @see #getMiddleware()
	 * @generated
	 */
	EAttribute getMiddleware_Nom();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Middleware#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see api_rest.Middleware#getDescription()
	 * @see #getMiddleware()
	 * @generated
	 */
	EAttribute getMiddleware_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link api_rest.Middleware#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see api_rest.Middleware#getParameter()
	 * @see #getMiddleware()
	 * @generated
	 */
	EReference getMiddleware_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link api_rest.Middleware#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see api_rest.Middleware#getReturn()
	 * @see #getMiddleware()
	 * @generated
	 */
	EReference getMiddleware_Return();

	/**
	 * Returns the meta object for the '{@link api_rest.Middleware#MiddlewareUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Middleware Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Middleware Unique</em>' operation.
	 * @see api_rest.Middleware#MiddlewareUnique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMiddleware__MiddlewareUnique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link api_rest.Middleware#uniqueNameParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Unique Name Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unique Name Parameter</em>' operation.
	 * @see api_rest.Middleware#uniqueNameParameter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMiddleware__UniqueNameParameter__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link api_rest.Middleware#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nom Valide</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nom Valide</em>' operation.
	 * @see api_rest.Middleware#nomValide(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMiddleware__NomValide__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link api_rest.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see api_rest.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Response#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see api_rest.Response#getCode()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Code();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Response#getCorps <em>Corps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corps</em>'.
	 * @see api_rest.Response#getCorps()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Corps();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Response#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see api_rest.Response#getDescription()
	 * @see #getResponse()
	 * @generated
	 */
	EAttribute getResponse_Description();

	/**
	 * Returns the meta object for class '{@link api_rest.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see api_rest.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Parameter#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see api_rest.Parameter#getNom()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Nom();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see api_rest.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Parameter#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see api_rest.Parameter#isRequired()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Required();

	/**
	 * Returns the meta object for class '{@link api_rest.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see api_rest.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Connection#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see api_rest.Connection#getHost()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Host();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Connection#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see api_rest.Connection#getUser()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_User();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Connection#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see api_rest.Connection#getPassword()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Password();

	/**
	 * Returns the meta object for the attribute '{@link api_rest.Connection#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see api_rest.Connection#getDatabase()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Database();

	/**
	 * Returns the meta object for enum '{@link api_rest.HTTP_METHOD <em>HTTP METHOD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP METHOD</em>'.
	 * @see api_rest.HTTP_METHOD
	 * @generated
	 */
	EEnum getHTTP_METHOD();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Api_restFactory getApi_restFactory();

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
		 * The meta object literal for the '{@link api_rest.impl.ServeurImpl <em>Serveur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see api_rest.impl.ServeurImpl
		 * @see api_rest.impl.Api_restPackageImpl#getServeur()
		 * @generated
		 */
		EClass SERVEUR = eINSTANCE.getServeur();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVEUR__NOM = eINSTANCE.getServeur_Nom();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVEUR__VERSION = eINSTANCE.getServeur_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVEUR__DESCRIPTION = eINSTANCE.getServeur_Description();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__ROUTE = eINSTANCE.getServeur_Route();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVEUR__PORT = eINSTANCE.getServeur_Port();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVEUR__CONNECTION = eINSTANCE.getServeur_Connection();

		/**
		 * The meta object literal for the '{@link api_rest.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see api_rest.impl.RouteImpl
		 * @see api_rest.impl.Api_restPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Chemin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__CHEMIN = eINSTANCE.getRoute_Chemin();

		/**
		 * The meta object literal for the '<em><b>Methode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__METHODE = eINSTANCE.getRoute_Methode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__DESCRIPTION = eINSTANCE.getRoute_Description();

		/**
		 * The meta object literal for the '<em><b>Middleware</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__MIDDLEWARE = eINSTANCE.getRoute_Middleware();

		/**
		 * The meta object literal for the '<em><b>Unique Response</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROUTE___UNIQUE_RESPONSE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRoute__UniqueResponse__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link api_rest.impl.MiddlewareImpl <em>Middleware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see api_rest.impl.MiddlewareImpl
		 * @see api_rest.impl.Api_restPackageImpl#getMiddleware()
		 * @generated
		 */
		EClass MIDDLEWARE = eINSTANCE.getMiddleware();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDDLEWARE__NOM = eINSTANCE.getMiddleware_Nom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDDLEWARE__DESCRIPTION = eINSTANCE.getMiddleware_Description();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE__PARAMETER = eINSTANCE.getMiddleware_Parameter();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIDDLEWARE__RETURN = eINSTANCE.getMiddleware_Return();

		/**
		 * The meta object literal for the '<em><b>Middleware Unique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIDDLEWARE___MIDDLEWARE_UNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getMiddleware__MiddlewareUnique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Unique Name Parameter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIDDLEWARE___UNIQUE_NAME_PARAMETER__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getMiddleware__UniqueNameParameter__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nom Valide</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MIDDLEWARE___NOM_VALIDE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getMiddleware__NomValide__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link api_rest.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see api_rest.impl.ResponseImpl
		 * @see api_rest.impl.Api_restPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__CODE = eINSTANCE.getResponse_Code();

		/**
		 * The meta object literal for the '<em><b>Corps</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__CORPS = eINSTANCE.getResponse_Corps();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE__DESCRIPTION = eINSTANCE.getResponse_Description();

		/**
		 * The meta object literal for the '{@link api_rest.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see api_rest.impl.ParameterImpl
		 * @see api_rest.impl.Api_restPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NOM = eINSTANCE.getParameter_Nom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__REQUIRED = eINSTANCE.getParameter_Required();

		/**
		 * The meta object literal for the '{@link api_rest.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see api_rest.impl.ConnectionImpl
		 * @see api_rest.impl.Api_restPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__HOST = eINSTANCE.getConnection_Host();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__USER = eINSTANCE.getConnection_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PASSWORD = eINSTANCE.getConnection_Password();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DATABASE = eINSTANCE.getConnection_Database();

		/**
		 * The meta object literal for the '{@link api_rest.HTTP_METHOD <em>HTTP METHOD</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see api_rest.HTTP_METHOD
		 * @see api_rest.impl.Api_restPackageImpl#getHTTP_METHOD()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHTTP_METHOD();

	}

} //Api_restPackage
