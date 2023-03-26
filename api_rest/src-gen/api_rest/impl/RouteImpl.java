/**
 */
package api_rest.impl;

import api_rest.Api_restPackage;
import api_rest.Api_restTables;
import api_rest.HTTP_METHOD;
import api_rest.Middleware;
import api_rest.Response;
import api_rest.Route;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorMultipleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractSimpleOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link api_rest.impl.RouteImpl#getChemin <em>Chemin</em>}</li>
 *   <li>{@link api_rest.impl.RouteImpl#getMethode <em>Methode</em>}</li>
 *   <li>{@link api_rest.impl.RouteImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link api_rest.impl.RouteImpl#getMiddleware <em>Middleware</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
	 * The default value of the '{@link #getChemin() <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemin()
	 * @generated
	 * @ordered
	 */
	protected static final String CHEMIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChemin() <em>Chemin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemin()
	 * @generated
	 * @ordered
	 */
	protected String chemin = CHEMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethode() <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethode()
	 * @generated
	 * @ordered
	 */
	protected static final HTTP_METHOD METHODE_EDEFAULT = HTTP_METHOD.GET;

	/**
	 * The cached value of the '{@link #getMethode() <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethode()
	 * @generated
	 * @ordered
	 */
	protected HTTP_METHOD methode = METHODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMiddleware() <em>Middleware</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddleware()
	 * @generated
	 * @ordered
	 */
	protected EList<Middleware> middleware;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Api_restPackage.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChemin() {
		return chemin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChemin(String newChemin) {
		String oldChemin = chemin;
		chemin = newChemin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Api_restPackage.ROUTE__CHEMIN, oldChemin, chemin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTP_METHOD getMethode() {
		return methode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethode(HTTP_METHOD newMethode) {
		HTTP_METHOD oldMethode = methode;
		methode = newMethode == null ? METHODE_EDEFAULT : newMethode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Api_restPackage.ROUTE__METHODE, oldMethode, methode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Api_restPackage.ROUTE__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Middleware> getMiddleware() {
		if (middleware == null) {
			middleware = new EObjectContainmentEList<Middleware>(Middleware.class, this,
					Api_restPackage.ROUTE__MIDDLEWARE);
		}
		return middleware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean uniqueResponse(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Route::uniqueResponse";
		try {
			/**
			 *
			 * inv uniqueResponse:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.middleware->forAll(m1, m2 | m1 <> m2 implies
			 *           m1.return->isEmpty() or
			 *           m2.return->isEmpty())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Api_restPackage.Literals.ROUTE___UNIQUE_RESPONSE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Api_restTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_6;
			if (le) {
				local_6 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Middleware> middleware = this.getMiddleware();
					final /*@NonInvalid*/ OrderedSetValue BOXED_middleware = idResolver
							.createOrderedSetOfAll(Api_restTables.ORD_CLSSid_Middleware, middleware);
					final org.eclipse.ocl.pivot.Class TYPE_result_0 = executor.getStaticTypeOfValue(null,
							BOXED_middleware);
					final LibraryIterationExtension IMPL_result_0 = (LibraryIterationExtension) TYPE_result_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Collection__1_forAll);
					final /*@NonNull*/ Object ACC_result_0 = IMPL_result_0.createAccumulatorValue(executor,
							TypeId.BOOLEAN, TypeId.BOOLEAN);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractSimpleOperation BODY_result_0 = new AbstractSimpleOperation() {
						/**
						 * m1 <> m2 implies m1.return->isEmpty() or m2.return->isEmpty()
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object /*@NonNull*/ [] sourceAndArgumentValues) {
							final /*@NonInvalid*/ OrderedSetValue BOXED_middleware = (OrderedSetValue) sourceAndArgumentValues[0];
							final /*@NonInvalid*/ Object m1 = sourceAndArgumentValues[1];
							final /*@NonInvalid*/ Object m2 = sourceAndArgumentValues[2];
							/*@Caught*/ Object CAUGHT_implies;
							try {
								final /*@NonInvalid*/ Middleware local_0 = (Middleware) m1;
								final /*@NonInvalid*/ Middleware local_1 = (Middleware) m2;
								final /*@NonInvalid*/ boolean ne = (local_0 != null) ? !local_0.equals(local_1)
										: (local_1 != null);
								final /*@Thrown*/ Boolean implies;
								if (!ne) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_or;
									try {
										/*@Caught*/ Object CAUGHT_isEmpty;
										try {
											if (local_0 == null) {
												throw new InvalidValueException(
														"Null source for \'\'http://www.example.org/api_rest\'::Middleware::return\'");
											}
											final /*@Thrown*/ Response local_3 = local_0.getReturn();
											final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE
													.evaluate(executor, Api_restTables.SET_CLSSid_Response, local_3);
											final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
													.evaluate(oclAsSet).booleanValue();
											CAUGHT_isEmpty = isEmpty;
										} catch (Exception e) {
											CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean or;
										if (CAUGHT_isEmpty == ValueUtil.TRUE_VALUE) {
											or = ValueUtil.TRUE_VALUE;
										} else {
											/*@Caught*/ Object CAUGHT_isEmpty_0;
											try {
												if (local_1 == null) {
													throw new InvalidValueException(
															"Null source for \'\'http://www.example.org/api_rest\'::Middleware::return\'");
												}
												final /*@Thrown*/ Response local_5 = local_1.getReturn();
												final /*@Thrown*/ SetValue oclAsSet_0 = OclAnyOclAsSetOperation.INSTANCE
														.evaluate(executor, Api_restTables.SET_CLSSid_Response,
																local_5);
												final /*@Thrown*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE
														.evaluate(oclAsSet_0).booleanValue();
												CAUGHT_isEmpty_0 = isEmpty_0;
											} catch (Exception e) {
												CAUGHT_isEmpty_0 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_isEmpty_0 == ValueUtil.TRUE_VALUE) {
												or = ValueUtil.TRUE_VALUE;
											} else {
												if (CAUGHT_isEmpty instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_isEmpty;
												}
												if (CAUGHT_isEmpty_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_isEmpty_0;
												}
												or = ValueUtil.FALSE_VALUE;
											}
										}
										CAUGHT_or = or;
									} catch (Exception e) {
										CAUGHT_or = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_or instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_or;
										}
										if (CAUGHT_or == null) {
											implies = null;
										} else {
											implies = ValueUtil.FALSE_VALUE;
										}
									}
								}
								CAUGHT_implies = implies;
							} catch (Exception e) {
								CAUGHT_implies = ValueUtil.createInvalidValue(e);
							}
							return CAUGHT_implies;
						}
					};
					final ExecutorMultipleIterationManager MGR_result_0 = new ExecutorMultipleIterationManager(executor,
							2, TypeId.BOOLEAN, BODY_result_0, BOXED_middleware, ACC_result_0);
					final /*@Thrown*/ Boolean result = (Boolean) IMPL_result_0.evaluateIteration(MGR_result_0);
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Api_restTables.INT_0)
						.booleanValue();
				local_6 = logDiagnostic;
			}
			return local_6;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Api_restPackage.ROUTE__MIDDLEWARE:
			return ((InternalEList<?>) getMiddleware()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Api_restPackage.ROUTE__CHEMIN:
			return getChemin();
		case Api_restPackage.ROUTE__METHODE:
			return getMethode();
		case Api_restPackage.ROUTE__DESCRIPTION:
			return getDescription();
		case Api_restPackage.ROUTE__MIDDLEWARE:
			return getMiddleware();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Api_restPackage.ROUTE__CHEMIN:
			setChemin((String) newValue);
			return;
		case Api_restPackage.ROUTE__METHODE:
			setMethode((HTTP_METHOD) newValue);
			return;
		case Api_restPackage.ROUTE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case Api_restPackage.ROUTE__MIDDLEWARE:
			getMiddleware().clear();
			getMiddleware().addAll((Collection<? extends Middleware>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Api_restPackage.ROUTE__CHEMIN:
			setChemin(CHEMIN_EDEFAULT);
			return;
		case Api_restPackage.ROUTE__METHODE:
			setMethode(METHODE_EDEFAULT);
			return;
		case Api_restPackage.ROUTE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case Api_restPackage.ROUTE__MIDDLEWARE:
			getMiddleware().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Api_restPackage.ROUTE__CHEMIN:
			return CHEMIN_EDEFAULT == null ? chemin != null : !CHEMIN_EDEFAULT.equals(chemin);
		case Api_restPackage.ROUTE__METHODE:
			return methode != METHODE_EDEFAULT;
		case Api_restPackage.ROUTE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case Api_restPackage.ROUTE__MIDDLEWARE:
			return middleware != null && !middleware.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Api_restPackage.ROUTE___UNIQUE_RESPONSE__DIAGNOSTICCHAIN_MAP:
			return uniqueResponse((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (chemin: ");
		result.append(chemin);
		result.append(", methode: ");
		result.append(methode);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
