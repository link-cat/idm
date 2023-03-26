/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /api_rest/model/api_rest.ecore
 * using:
 *   /api_rest/model/api_rest.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package api_rest;

// import api_rest.Api_restPackage;
// import api_rest.Api_restTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Api_restTables provides the dispatch tables for the api_rest for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Api_restTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Api_restPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_api_rest = IdManager.getNsURIPackageId("http://www.example.org/api_rest", null, Api_restPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = Api_restTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Connection = Api_restTables.PACKid_http_c_s_s_www_example_org_s_api_rest.getClassId("Connection", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Middleware = Api_restTables.PACKid_http_c_s_s_www_example_org_s_api_rest.getClassId("Middleware", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Parameter = Api_restTables.PACKid_http_c_s_s_www_example_org_s_api_rest.getClassId("Parameter", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Response = Api_restTables.PACKid_http_c_s_s_www_example_org_s_api_rest.getClassId("Response", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Route = Api_restTables.PACKid_http_c_s_s_www_example_org_s_api_rest.getClassId("Route", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Serveur = Api_restTables.PACKid_http_c_s_s_www_example_org_s_api_rest.getClassId("Serveur", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Api_restTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_HTTP_METHOD = Api_restTables.PACKid_http_c_s_s_www_example_org_s_api_rest.getEnumerationId("HTTP_METHOD");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Middleware = TypeId.ORDERED_SET.getSpecializedId(Api_restTables.CLSSid_Middleware);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(Api_restTables.CLSSid_Parameter);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Route = TypeId.ORDERED_SET.getSpecializedId(Api_restTables.CLSSid_Route);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Middleware = TypeId.SET.getSpecializedId(Api_restTables.CLSSid_Middleware);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Response = TypeId.SET.getSpecializedId(Api_restTables.CLSSid_Response);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Api_restTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Api_restTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Connection = new EcoreExecutorType(Api_restPackage.Literals.CONNECTION, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _HTTP_METHOD = new EcoreExecutorEnumeration(Api_restPackage.Literals.HTTP_METHOD, PACKAGE, 0);
		public static final EcoreExecutorType _Middleware = new EcoreExecutorType(Api_restPackage.Literals.MIDDLEWARE, PACKAGE, 0);
		public static final EcoreExecutorType _Parameter = new EcoreExecutorType(Api_restPackage.Literals.PARAMETER, PACKAGE, 0);
		public static final EcoreExecutorType _Response = new EcoreExecutorType(Api_restPackage.Literals.RESPONSE, PACKAGE, 0);
		public static final EcoreExecutorType _Route = new EcoreExecutorType(Api_restPackage.Literals.ROUTE, PACKAGE, 0);
		public static final EcoreExecutorType _Serveur = new EcoreExecutorType(Api_restPackage.Literals.SERVEUR, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Connection,
			_HTTP_METHOD,
			_Middleware,
			_Parameter,
			_Response,
			_Route,
			_Serveur
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Api_restTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Connection__Connection = new ExecutorFragment(Types._Connection, Api_restTables.Types._Connection);
		private static final ExecutorFragment _Connection__OclAny = new ExecutorFragment(Types._Connection, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Connection__OclElement = new ExecutorFragment(Types._Connection, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _HTTP_METHOD__HTTP_METHOD = new ExecutorFragment(Types._HTTP_METHOD, Api_restTables.Types._HTTP_METHOD);
		private static final ExecutorFragment _HTTP_METHOD__OclAny = new ExecutorFragment(Types._HTTP_METHOD, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HTTP_METHOD__OclElement = new ExecutorFragment(Types._HTTP_METHOD, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _HTTP_METHOD__OclEnumeration = new ExecutorFragment(Types._HTTP_METHOD, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _HTTP_METHOD__OclType = new ExecutorFragment(Types._HTTP_METHOD, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Middleware__Middleware = new ExecutorFragment(Types._Middleware, Api_restTables.Types._Middleware);
		private static final ExecutorFragment _Middleware__OclAny = new ExecutorFragment(Types._Middleware, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Middleware__OclElement = new ExecutorFragment(Types._Middleware, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, Api_restTables.Types._Parameter);

		private static final ExecutorFragment _Response__OclAny = new ExecutorFragment(Types._Response, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Response__OclElement = new ExecutorFragment(Types._Response, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Response__Response = new ExecutorFragment(Types._Response, Api_restTables.Types._Response);

		private static final ExecutorFragment _Route__OclAny = new ExecutorFragment(Types._Route, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Route__OclElement = new ExecutorFragment(Types._Route, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Route__Route = new ExecutorFragment(Types._Route, Api_restTables.Types._Route);

		private static final ExecutorFragment _Serveur__OclAny = new ExecutorFragment(Types._Serveur, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Serveur__OclElement = new ExecutorFragment(Types._Serveur, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Serveur__Serveur = new ExecutorFragment(Types._Serveur, Api_restTables.Types._Serveur);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Api_restTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Api_restTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Api_restTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Connection__database = new EcoreExecutorProperty(Api_restPackage.Literals.CONNECTION__DATABASE, Types._Connection, 0);
		public static final ExecutorProperty _Connection__host = new EcoreExecutorProperty(Api_restPackage.Literals.CONNECTION__HOST, Types._Connection, 1);
		public static final ExecutorProperty _Connection__password = new EcoreExecutorProperty(Api_restPackage.Literals.CONNECTION__PASSWORD, Types._Connection, 2);
		public static final ExecutorProperty _Connection__user = new EcoreExecutorProperty(Api_restPackage.Literals.CONNECTION__USER, Types._Connection, 3);
		public static final ExecutorProperty _Connection__Serveur__connection = new ExecutorPropertyWithImplementation("Serveur", Types._Connection, 4, new EcoreLibraryOppositeProperty(Api_restPackage.Literals.SERVEUR__CONNECTION));

		public static final ExecutorProperty _Middleware__description = new EcoreExecutorProperty(Api_restPackage.Literals.MIDDLEWARE__DESCRIPTION, Types._Middleware, 0);
		public static final ExecutorProperty _Middleware__nom = new EcoreExecutorProperty(Api_restPackage.Literals.MIDDLEWARE__NOM, Types._Middleware, 1);
		public static final ExecutorProperty _Middleware__parameter = new EcoreExecutorProperty(Api_restPackage.Literals.MIDDLEWARE__PARAMETER, Types._Middleware, 2);
		public static final ExecutorProperty _Middleware__return = new EcoreExecutorProperty(Api_restPackage.Literals.MIDDLEWARE__RETURN, Types._Middleware, 3);
		public static final ExecutorProperty _Middleware__Route__middleware = new ExecutorPropertyWithImplementation("Route", Types._Middleware, 4, new EcoreLibraryOppositeProperty(Api_restPackage.Literals.ROUTE__MIDDLEWARE));

		public static final ExecutorProperty _Parameter__nom = new EcoreExecutorProperty(Api_restPackage.Literals.PARAMETER__NOM, Types._Parameter, 0);
		public static final ExecutorProperty _Parameter__required = new EcoreExecutorProperty(Api_restPackage.Literals.PARAMETER__REQUIRED, Types._Parameter, 1);
		public static final ExecutorProperty _Parameter__type = new EcoreExecutorProperty(Api_restPackage.Literals.PARAMETER__TYPE, Types._Parameter, 2);
		public static final ExecutorProperty _Parameter__Middleware__parameter = new ExecutorPropertyWithImplementation("Middleware", Types._Parameter, 3, new EcoreLibraryOppositeProperty(Api_restPackage.Literals.MIDDLEWARE__PARAMETER));

		public static final ExecutorProperty _Response__code = new EcoreExecutorProperty(Api_restPackage.Literals.RESPONSE__CODE, Types._Response, 0);
		public static final ExecutorProperty _Response__corps = new EcoreExecutorProperty(Api_restPackage.Literals.RESPONSE__CORPS, Types._Response, 1);
		public static final ExecutorProperty _Response__description = new EcoreExecutorProperty(Api_restPackage.Literals.RESPONSE__DESCRIPTION, Types._Response, 2);
		public static final ExecutorProperty _Response__Middleware__return = new ExecutorPropertyWithImplementation("Middleware", Types._Response, 3, new EcoreLibraryOppositeProperty(Api_restPackage.Literals.MIDDLEWARE__RETURN));

		public static final ExecutorProperty _Route__chemin = new EcoreExecutorProperty(Api_restPackage.Literals.ROUTE__CHEMIN, Types._Route, 0);
		public static final ExecutorProperty _Route__description = new EcoreExecutorProperty(Api_restPackage.Literals.ROUTE__DESCRIPTION, Types._Route, 1);
		public static final ExecutorProperty _Route__methode = new EcoreExecutorProperty(Api_restPackage.Literals.ROUTE__METHODE, Types._Route, 2);
		public static final ExecutorProperty _Route__middleware = new EcoreExecutorProperty(Api_restPackage.Literals.ROUTE__MIDDLEWARE, Types._Route, 3);
		public static final ExecutorProperty _Route__Serveur__route = new ExecutorPropertyWithImplementation("Serveur", Types._Route, 4, new EcoreLibraryOppositeProperty(Api_restPackage.Literals.SERVEUR__ROUTE));

		public static final ExecutorProperty _Serveur__connection = new EcoreExecutorProperty(Api_restPackage.Literals.SERVEUR__CONNECTION, Types._Serveur, 0);
		public static final ExecutorProperty _Serveur__description = new EcoreExecutorProperty(Api_restPackage.Literals.SERVEUR__DESCRIPTION, Types._Serveur, 1);
		public static final ExecutorProperty _Serveur__nom = new EcoreExecutorProperty(Api_restPackage.Literals.SERVEUR__NOM, Types._Serveur, 2);
		public static final ExecutorProperty _Serveur__port = new EcoreExecutorProperty(Api_restPackage.Literals.SERVEUR__PORT, Types._Serveur, 3);
		public static final ExecutorProperty _Serveur__route = new EcoreExecutorProperty(Api_restPackage.Literals.SERVEUR__ROUTE, Types._Serveur, 4);
		public static final ExecutorProperty _Serveur__version = new EcoreExecutorProperty(Api_restPackage.Literals.SERVEUR__VERSION, Types._Serveur, 5);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Api_restTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Connection =
			{
				Fragments._Connection__OclAny /* 0 */,
				Fragments._Connection__OclElement /* 1 */,
				Fragments._Connection__Connection /* 2 */
			};
		private static final int /*@NonNull*/ [] __Connection = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _HTTP_METHOD =
			{
				Fragments._HTTP_METHOD__OclAny /* 0 */,
				Fragments._HTTP_METHOD__OclElement /* 1 */,
				Fragments._HTTP_METHOD__OclType /* 2 */,
				Fragments._HTTP_METHOD__OclEnumeration /* 3 */,
				Fragments._HTTP_METHOD__HTTP_METHOD /* 4 */
			};
		private static final int /*@NonNull*/ [] __HTTP_METHOD = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Middleware =
			{
				Fragments._Middleware__OclAny /* 0 */,
				Fragments._Middleware__OclElement /* 1 */,
				Fragments._Middleware__Middleware /* 2 */
			};
		private static final int /*@NonNull*/ [] __Middleware = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Parameter =
			{
				Fragments._Parameter__OclAny /* 0 */,
				Fragments._Parameter__OclElement /* 1 */,
				Fragments._Parameter__Parameter /* 2 */
			};
		private static final int /*@NonNull*/ [] __Parameter = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Response =
			{
				Fragments._Response__OclAny /* 0 */,
				Fragments._Response__OclElement /* 1 */,
				Fragments._Response__Response /* 2 */
			};
		private static final int /*@NonNull*/ [] __Response = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Route =
			{
				Fragments._Route__OclAny /* 0 */,
				Fragments._Route__OclElement /* 1 */,
				Fragments._Route__Route /* 2 */
			};
		private static final int /*@NonNull*/ [] __Route = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Serveur =
			{
				Fragments._Serveur__OclAny /* 0 */,
				Fragments._Serveur__OclElement /* 1 */,
				Fragments._Serveur__Serveur /* 2 */
			};
		private static final int /*@NonNull*/ [] __Serveur = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Connection.initFragments(_Connection, __Connection);
			Types._HTTP_METHOD.initFragments(_HTTP_METHOD, __HTTP_METHOD);
			Types._Middleware.initFragments(_Middleware, __Middleware);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._Response.initFragments(_Response, __Response);
			Types._Route.initFragments(_Route, __Route);
			Types._Serveur.initFragments(_Serveur, __Serveur);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Api_restTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Connection__Connection = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Connection__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Connection__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _HTTP_METHOD__HTTP_METHOD = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HTTP_METHOD__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HTTP_METHOD__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HTTP_METHOD__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HTTP_METHOD__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Middleware__Middleware = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Middleware__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Middleware__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__Parameter = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Parameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Response__Response = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Response__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Response__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Route__Route = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Route__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Route__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Serveur__Serveur = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Serveur__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Serveur__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Connection__Connection.initOperations(_Connection__Connection);
			Fragments._Connection__OclAny.initOperations(_Connection__OclAny);
			Fragments._Connection__OclElement.initOperations(_Connection__OclElement);

			Fragments._HTTP_METHOD__HTTP_METHOD.initOperations(_HTTP_METHOD__HTTP_METHOD);
			Fragments._HTTP_METHOD__OclAny.initOperations(_HTTP_METHOD__OclAny);
			Fragments._HTTP_METHOD__OclElement.initOperations(_HTTP_METHOD__OclElement);
			Fragments._HTTP_METHOD__OclEnumeration.initOperations(_HTTP_METHOD__OclEnumeration);
			Fragments._HTTP_METHOD__OclType.initOperations(_HTTP_METHOD__OclType);

			Fragments._Middleware__Middleware.initOperations(_Middleware__Middleware);
			Fragments._Middleware__OclAny.initOperations(_Middleware__OclAny);
			Fragments._Middleware__OclElement.initOperations(_Middleware__OclElement);

			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);

			Fragments._Response__OclAny.initOperations(_Response__OclAny);
			Fragments._Response__OclElement.initOperations(_Response__OclElement);
			Fragments._Response__Response.initOperations(_Response__Response);

			Fragments._Route__OclAny.initOperations(_Route__OclAny);
			Fragments._Route__OclElement.initOperations(_Route__OclElement);
			Fragments._Route__Route.initOperations(_Route__Route);

			Fragments._Serveur__OclAny.initOperations(_Serveur__OclAny);
			Fragments._Serveur__OclElement.initOperations(_Serveur__OclElement);
			Fragments._Serveur__Serveur.initOperations(_Serveur__Serveur);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Api_restTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Connection = {
			Api_restTables.Properties._Connection__database,
			Api_restTables.Properties._Connection__host,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Api_restTables.Properties._Connection__password,
			Api_restTables.Properties._Connection__user
		};

		private static final ExecutorProperty /*@NonNull*/ [] _HTTP_METHOD = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Middleware = {
			Api_restTables.Properties._Middleware__description,
			Api_restTables.Properties._Middleware__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Api_restTables.Properties._Middleware__parameter,
			Api_restTables.Properties._Middleware__return
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Parameter = {
			Api_restTables.Properties._Parameter__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Api_restTables.Properties._Parameter__required,
			Api_restTables.Properties._Parameter__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Response = {
			Api_restTables.Properties._Response__code,
			Api_restTables.Properties._Response__corps,
			Api_restTables.Properties._Response__description,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Route = {
			Api_restTables.Properties._Route__chemin,
			Api_restTables.Properties._Route__description,
			Api_restTables.Properties._Route__methode,
			Api_restTables.Properties._Route__middleware,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Serveur = {
			Api_restTables.Properties._Serveur__connection,
			Api_restTables.Properties._Serveur__description,
			Api_restTables.Properties._Serveur__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Api_restTables.Properties._Serveur__port,
			Api_restTables.Properties._Serveur__route,
			Api_restTables.Properties._Serveur__version
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Connection__Connection.initProperties(_Connection);
			Fragments._HTTP_METHOD__HTTP_METHOD.initProperties(_HTTP_METHOD);
			Fragments._Middleware__Middleware.initProperties(_Middleware);
			Fragments._Parameter__Parameter.initProperties(_Parameter);
			Fragments._Response__Response.initProperties(_Response);
			Fragments._Route__Route.initProperties(_Route);
			Fragments._Serveur__Serveur.initProperties(_Serveur);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Api_restTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _HTTP_METHOD__GET = new EcoreExecutorEnumerationLiteral(Api_restPackage.Literals.HTTP_METHOD.getEEnumLiteral("GET"), Types._HTTP_METHOD, 0);
		public static final EcoreExecutorEnumerationLiteral _HTTP_METHOD__POST = new EcoreExecutorEnumerationLiteral(Api_restPackage.Literals.HTTP_METHOD.getEEnumLiteral("POST"), Types._HTTP_METHOD, 1);
		public static final EcoreExecutorEnumerationLiteral _HTTP_METHOD__PUT = new EcoreExecutorEnumerationLiteral(Api_restPackage.Literals.HTTP_METHOD.getEEnumLiteral("PUT"), Types._HTTP_METHOD, 2);
		public static final EcoreExecutorEnumerationLiteral _HTTP_METHOD__DELETE = new EcoreExecutorEnumerationLiteral(Api_restPackage.Literals.HTTP_METHOD.getEEnumLiteral("DELETE"), Types._HTTP_METHOD, 3);
		public static final EcoreExecutorEnumerationLiteral _HTTP_METHOD__PATCH = new EcoreExecutorEnumerationLiteral(Api_restPackage.Literals.HTTP_METHOD.getEEnumLiteral("PATCH"), Types._HTTP_METHOD, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _HTTP_METHOD = {
			_HTTP_METHOD__GET,
			_HTTP_METHOD__POST,
			_HTTP_METHOD__PUT,
			_HTTP_METHOD__DELETE,
			_HTTP_METHOD__PATCH
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._HTTP_METHOD.initLiterals(_HTTP_METHOD);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Api_restTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Api_restTables();
	}

	private Api_restTables() {
		super(Api_restPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		Api_restPackage.Literals.MIDDLEWARE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
