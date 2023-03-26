/**
 */
package api_rest.util;

import api_rest.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see api_rest.Api_restPackage
 * @generated
 */
public class Api_restValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Api_restValidator INSTANCE = new Api_restValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "api_rest";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Response' of 'Route'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ROUTE__UNIQUE_RESPONSE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Middleware Unique' of 'Middleware'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIDDLEWARE__MIDDLEWARE_UNIQUE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Unique Name Parameter' of 'Middleware'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIDDLEWARE__UNIQUE_NAME_PARAMETER = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nom Valide' of 'Middleware'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MIDDLEWARE__NOM_VALIDE = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Api_restValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Api_restPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Api_restPackage.SERVEUR:
			return validateServeur((Serveur) value, diagnostics, context);
		case Api_restPackage.ROUTE:
			return validateRoute((Route) value, diagnostics, context);
		case Api_restPackage.MIDDLEWARE:
			return validateMiddleware((Middleware) value, diagnostics, context);
		case Api_restPackage.RESPONSE:
			return validateResponse((Response) value, diagnostics, context);
		case Api_restPackage.PARAMETER:
			return validateParameter((Parameter) value, diagnostics, context);
		case Api_restPackage.CONNECTION:
			return validateConnection((Connection) value, diagnostics, context);
		case Api_restPackage.HTTP_METHOD:
			return validateHTTP_METHOD((HTTP_METHOD) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServeur(Serveur serveur, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serveur, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(route, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(route, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRoute_uniqueResponse(route, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueResponse constraint of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoute_uniqueResponse(Route route, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return route.uniqueResponse(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiddleware(Middleware middleware, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(middleware, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(middleware, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(middleware, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(middleware, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(middleware, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(middleware, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(middleware, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(middleware, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(middleware, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMiddleware_nomValide(middleware, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMiddleware_MiddlewareUnique(middleware, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMiddleware_uniqueNameParameter(middleware, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nomValide constraint of '<em>Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiddleware_nomValide(Middleware middleware, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return middleware.nomValide(diagnostics, context);
	}

	/**
	 * Validates the MiddlewareUnique constraint of '<em>Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiddleware_MiddlewareUnique(Middleware middleware, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return middleware.MiddlewareUnique(diagnostics, context);
	}

	/**
	 * Validates the uniqueNameParameter constraint of '<em>Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMiddleware_uniqueNameParameter(Middleware middleware, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return middleware.uniqueNameParameter(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponse(Response response, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(response, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTP_METHOD(HTTP_METHOD httP_METHOD, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Api_restValidator
