/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /com.link.site/model/site.ecore
 * using:
 *   /com.link.site/model/site.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package com.link.site;

// import com.link.site.SitePackage;
// import com.link.site.SiteTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
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
 * SiteTables provides the dispatch tables for the site for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class SiteTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(SitePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_site = IdManager.getNsURIPackageId("http://www.example.org/site", null, SitePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = SiteTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Departement = SiteTables.PACKid_http_c_s_s_www_example_org_s_site.getClassId("Departement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Formation = SiteTables.PACKid_http_c_s_s_www_example_org_s_site.getClassId("Formation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Niveau = SiteTables.PACKid_http_c_s_s_www_example_org_s_site.getClassId("Niveau", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Programmation = SiteTables.PACKid_http_c_s_s_www_example_org_s_site.getClassId("Programmation", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Responsable = SiteTables.PACKid_http_c_s_s_www_example_org_s_site.getClassId("Responsable", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Ressource = SiteTables.PACKid_http_c_s_s_www_example_org_s_site.getClassId("Ressource", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Semestre = SiteTables.PACKid_http_c_s_s_www_example_org_s_site.getClassId("Semestre", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Site = SiteTables.PACKid_http_c_s_s_www_example_org_s_site.getClassId("Site", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Specialite = SiteTables.PACKid_http_c_s_s_www_example_org_s_site.getClassId("Specialite", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UE = SiteTables.PACKid_http_c_s_s_www_example_org_s_site.getClassId("UE", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = SiteTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Departement = TypeId.BAG.getSpecializedId(SiteTables.CLSSid_Departement);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Niveau = TypeId.BAG.getSpecializedId(SiteTables.CLSSid_Niveau);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_UE = TypeId.BAG.getSpecializedId(SiteTables.CLSSid_UE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Departement = TypeId.ORDERED_SET.getSpecializedId(SiteTables.CLSSid_Departement);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Formation = TypeId.ORDERED_SET.getSpecializedId(SiteTables.CLSSid_Formation);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Niveau = TypeId.ORDERED_SET.getSpecializedId(SiteTables.CLSSid_Niveau);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Programmation = TypeId.ORDERED_SET.getSpecializedId(SiteTables.CLSSid_Programmation);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Responsable = TypeId.ORDERED_SET.getSpecializedId(SiteTables.CLSSid_Responsable);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Ressource = TypeId.ORDERED_SET.getSpecializedId(SiteTables.CLSSid_Ressource);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Semestre = TypeId.ORDERED_SET.getSpecializedId(SiteTables.CLSSid_Semestre);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Specialite = TypeId.ORDERED_SET.getSpecializedId(SiteTables.CLSSid_Specialite);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_UE = TypeId.ORDERED_SET.getSpecializedId(SiteTables.CLSSid_UE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Departement = TypeId.SET.getSpecializedId(SiteTables.CLSSid_Departement);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Formation = TypeId.SET.getSpecializedId(SiteTables.CLSSid_Formation);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			SiteTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SiteTables::TypeParameters and all preceding sub-packages.
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

		public static final EcoreExecutorType _Departement = new EcoreExecutorType(SitePackage.Literals.DEPARTEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Formation = new EcoreExecutorType(SitePackage.Literals.FORMATION, PACKAGE, 0);
		public static final EcoreExecutorType _Niveau = new EcoreExecutorType(SitePackage.Literals.NIVEAU, PACKAGE, 0);
		public static final EcoreExecutorType _Programmation = new EcoreExecutorType(SitePackage.Literals.PROGRAMMATION, PACKAGE, 0);
		public static final EcoreExecutorType _Responsable = new EcoreExecutorType(SitePackage.Literals.RESPONSABLE, PACKAGE, 0);
		public static final EcoreExecutorType _Ressource = new EcoreExecutorType(SitePackage.Literals.RESSOURCE, PACKAGE, 0);
		public static final EcoreExecutorType _Semestre = new EcoreExecutorType(SitePackage.Literals.SEMESTRE, PACKAGE, 0);
		public static final EcoreExecutorType _Site = new EcoreExecutorType(SitePackage.Literals.SITE, PACKAGE, 0);
		public static final EcoreExecutorType _Specialite = new EcoreExecutorType(SitePackage.Literals.SPECIALITE, PACKAGE, 0);
		public static final EcoreExecutorType _UE = new EcoreExecutorType(SitePackage.Literals.UE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Departement,
			_Formation,
			_Niveau,
			_Programmation,
			_Responsable,
			_Ressource,
			_Semestre,
			_Site,
			_Specialite,
			_UE
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SiteTables::Types and all preceding sub-packages.
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

		private static final ExecutorFragment _Departement__Departement = new ExecutorFragment(Types._Departement, SiteTables.Types._Departement);
		private static final ExecutorFragment _Departement__OclAny = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Departement__OclElement = new ExecutorFragment(Types._Departement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Formation__Formation = new ExecutorFragment(Types._Formation, SiteTables.Types._Formation);
		private static final ExecutorFragment _Formation__OclAny = new ExecutorFragment(Types._Formation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Formation__OclElement = new ExecutorFragment(Types._Formation, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Niveau__Niveau = new ExecutorFragment(Types._Niveau, SiteTables.Types._Niveau);
		private static final ExecutorFragment _Niveau__OclAny = new ExecutorFragment(Types._Niveau, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Niveau__OclElement = new ExecutorFragment(Types._Niveau, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Programmation__OclAny = new ExecutorFragment(Types._Programmation, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Programmation__OclElement = new ExecutorFragment(Types._Programmation, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Programmation__Programmation = new ExecutorFragment(Types._Programmation, SiteTables.Types._Programmation);

		private static final ExecutorFragment _Responsable__OclAny = new ExecutorFragment(Types._Responsable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Responsable__OclElement = new ExecutorFragment(Types._Responsable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Responsable__Responsable = new ExecutorFragment(Types._Responsable, SiteTables.Types._Responsable);

		private static final ExecutorFragment _Ressource__OclAny = new ExecutorFragment(Types._Ressource, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Ressource__OclElement = new ExecutorFragment(Types._Ressource, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Ressource__Ressource = new ExecutorFragment(Types._Ressource, SiteTables.Types._Ressource);

		private static final ExecutorFragment _Semestre__OclAny = new ExecutorFragment(Types._Semestre, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Semestre__OclElement = new ExecutorFragment(Types._Semestre, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Semestre__Semestre = new ExecutorFragment(Types._Semestre, SiteTables.Types._Semestre);

		private static final ExecutorFragment _Site__OclAny = new ExecutorFragment(Types._Site, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Site__OclElement = new ExecutorFragment(Types._Site, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Site__Site = new ExecutorFragment(Types._Site, SiteTables.Types._Site);

		private static final ExecutorFragment _Specialite__OclAny = new ExecutorFragment(Types._Specialite, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Specialite__OclElement = new ExecutorFragment(Types._Specialite, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Specialite__Specialite = new ExecutorFragment(Types._Specialite, SiteTables.Types._Specialite);

		private static final ExecutorFragment _UE__OclAny = new ExecutorFragment(Types._UE, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UE__OclElement = new ExecutorFragment(Types._UE, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UE__UE = new ExecutorFragment(Types._UE, SiteTables.Types._UE);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SiteTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of SiteTables::Parameters and all preceding sub-packages.
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
		 * Force initialization of the fields of SiteTables::Operations and all preceding sub-packages.
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

		public static final ExecutorProperty _Departement__formation = new EcoreExecutorProperty(SitePackage.Literals.DEPARTEMENT__FORMATION, Types._Departement, 0);
		public static final ExecutorProperty _Departement__nom = new EcoreExecutorProperty(SitePackage.Literals.DEPARTEMENT__NOM, Types._Departement, 1);
		public static final ExecutorProperty _Departement__responsable = new EcoreExecutorProperty(SitePackage.Literals.DEPARTEMENT__RESPONSABLE, Types._Departement, 2);
		public static final ExecutorProperty _Departement__Site__departement = new ExecutorPropertyWithImplementation("Site", Types._Departement, 3, new EcoreLibraryOppositeProperty(SitePackage.Literals.SITE__DEPARTEMENT));

		public static final ExecutorProperty _Formation__description = new EcoreExecutorProperty(SitePackage.Literals.FORMATION__DESCRIPTION, Types._Formation, 0);
		public static final ExecutorProperty _Formation__niveau = new EcoreExecutorProperty(SitePackage.Literals.FORMATION__NIVEAU, Types._Formation, 1);
		public static final ExecutorProperty _Formation__nom = new EcoreExecutorProperty(SitePackage.Literals.FORMATION__NOM, Types._Formation, 2);
		public static final ExecutorProperty _Formation__specialite = new EcoreExecutorProperty(SitePackage.Literals.FORMATION__SPECIALITE, Types._Formation, 3);
		public static final ExecutorProperty _Formation__Departement__formation = new ExecutorPropertyWithImplementation("Departement", Types._Formation, 4, new EcoreLibraryOppositeProperty(SitePackage.Literals.DEPARTEMENT__FORMATION));

		public static final ExecutorProperty _Niveau__description = new EcoreExecutorProperty(SitePackage.Literals.NIVEAU__DESCRIPTION, Types._Niveau, 0);
		public static final ExecutorProperty _Niveau__niveau = new EcoreExecutorProperty(SitePackage.Literals.NIVEAU__NIVEAU, Types._Niveau, 1);
		public static final ExecutorProperty _Niveau__responsable = new EcoreExecutorProperty(SitePackage.Literals.NIVEAU__RESPONSABLE, Types._Niveau, 2);
		public static final ExecutorProperty _Niveau__semestre = new EcoreExecutorProperty(SitePackage.Literals.NIVEAU__SEMESTRE, Types._Niveau, 3);
		public static final ExecutorProperty _Niveau__specialite = new EcoreExecutorProperty(SitePackage.Literals.NIVEAU__SPECIALITE, Types._Niveau, 4);
		public static final ExecutorProperty _Niveau__Formation__niveau = new ExecutorPropertyWithImplementation("Formation", Types._Niveau, 5, new EcoreLibraryOppositeProperty(SitePackage.Literals.FORMATION__NIVEAU));

		public static final ExecutorProperty _Programmation__heureDebut = new EcoreExecutorProperty(SitePackage.Literals.PROGRAMMATION__HEURE_DEBUT, Types._Programmation, 0);
		public static final ExecutorProperty _Programmation__heureFin = new EcoreExecutorProperty(SitePackage.Literals.PROGRAMMATION__HEURE_FIN, Types._Programmation, 1);
		public static final ExecutorProperty _Programmation__jour = new EcoreExecutorProperty(SitePackage.Literals.PROGRAMMATION__JOUR, Types._Programmation, 2);
		public static final ExecutorProperty _Programmation__salle = new EcoreExecutorProperty(SitePackage.Literals.PROGRAMMATION__SALLE, Types._Programmation, 3);
		public static final ExecutorProperty _Programmation__UE__programmation = new ExecutorPropertyWithImplementation("UE", Types._Programmation, 4, new EcoreLibraryOppositeProperty(SitePackage.Literals.UE__PROGRAMMATION));

		public static final ExecutorProperty _Responsable__grade = new EcoreExecutorProperty(SitePackage.Literals.RESPONSABLE__GRADE, Types._Responsable, 0);
		public static final ExecutorProperty _Responsable__nom = new EcoreExecutorProperty(SitePackage.Literals.RESPONSABLE__NOM, Types._Responsable, 1);
		public static final ExecutorProperty _Responsable__prenom = new EcoreExecutorProperty(SitePackage.Literals.RESPONSABLE__PRENOM, Types._Responsable, 2);
		public static final ExecutorProperty _Responsable__Departement__responsable = new ExecutorPropertyWithImplementation("Departement", Types._Responsable, 3, new EcoreLibraryOppositeProperty(SitePackage.Literals.DEPARTEMENT__RESPONSABLE));
		public static final ExecutorProperty _Responsable__Niveau__responsable = new ExecutorPropertyWithImplementation("Niveau", Types._Responsable, 4, new EcoreLibraryOppositeProperty(SitePackage.Literals.NIVEAU__RESPONSABLE));
		public static final ExecutorProperty _Responsable__Site__responsable = new ExecutorPropertyWithImplementation("Site", Types._Responsable, 5, new EcoreLibraryOppositeProperty(SitePackage.Literals.SITE__RESPONSABLE));
		public static final ExecutorProperty _Responsable__UE__responsable = new ExecutorPropertyWithImplementation("UE", Types._Responsable, 6, new EcoreLibraryOppositeProperty(SitePackage.Literals.UE__RESPONSABLE));

		public static final ExecutorProperty _Ressource__description = new EcoreExecutorProperty(SitePackage.Literals.RESSOURCE__DESCRIPTION, Types._Ressource, 0);
		public static final ExecutorProperty _Ressource__lien = new EcoreExecutorProperty(SitePackage.Literals.RESSOURCE__LIEN, Types._Ressource, 1);
		public static final ExecutorProperty _Ressource__nom = new EcoreExecutorProperty(SitePackage.Literals.RESSOURCE__NOM, Types._Ressource, 2);
		public static final ExecutorProperty _Ressource__type = new EcoreExecutorProperty(SitePackage.Literals.RESSOURCE__TYPE, Types._Ressource, 3);
		public static final ExecutorProperty _Ressource__UE__ressource = new ExecutorPropertyWithImplementation("UE", Types._Ressource, 4, new EcoreLibraryOppositeProperty(SitePackage.Literals.UE__RESSOURCE));

		public static final ExecutorProperty _Semestre__nom = new EcoreExecutorProperty(SitePackage.Literals.SEMESTRE__NOM, Types._Semestre, 0);
		public static final ExecutorProperty _Semestre__ue = new EcoreExecutorProperty(SitePackage.Literals.SEMESTRE__UE, Types._Semestre, 1);
		public static final ExecutorProperty _Semestre__Niveau__semestre = new ExecutorPropertyWithImplementation("Niveau", Types._Semestre, 2, new EcoreLibraryOppositeProperty(SitePackage.Literals.NIVEAU__SEMESTRE));

		public static final ExecutorProperty _Site__departement = new EcoreExecutorProperty(SitePackage.Literals.SITE__DEPARTEMENT, Types._Site, 0);
		public static final ExecutorProperty _Site__nom = new EcoreExecutorProperty(SitePackage.Literals.SITE__NOM, Types._Site, 1);
		public static final ExecutorProperty _Site__responsable = new EcoreExecutorProperty(SitePackage.Literals.SITE__RESPONSABLE, Types._Site, 2);

		public static final ExecutorProperty _Specialite__description = new EcoreExecutorProperty(SitePackage.Literals.SPECIALITE__DESCRIPTION, Types._Specialite, 0);
		public static final ExecutorProperty _Specialite__nom = new EcoreExecutorProperty(SitePackage.Literals.SPECIALITE__NOM, Types._Specialite, 1);
		public static final ExecutorProperty _Specialite__Formation__specialite = new ExecutorPropertyWithImplementation("Formation", Types._Specialite, 2, new EcoreLibraryOppositeProperty(SitePackage.Literals.FORMATION__SPECIALITE));
		public static final ExecutorProperty _Specialite__Niveau__specialite = new ExecutorPropertyWithImplementation("Niveau", Types._Specialite, 3, new EcoreLibraryOppositeProperty(SitePackage.Literals.NIVEAU__SPECIALITE));

		public static final ExecutorProperty _UE__code = new EcoreExecutorProperty(SitePackage.Literals.UE__CODE, Types._UE, 0);
		public static final ExecutorProperty _UE__credits = new EcoreExecutorProperty(SitePackage.Literals.UE__CREDITS, Types._UE, 1);
		public static final ExecutorProperty _UE__description = new EcoreExecutorProperty(SitePackage.Literals.UE__DESCRIPTION, Types._UE, 2);
		public static final ExecutorProperty _UE__libelle = new EcoreExecutorProperty(SitePackage.Literals.UE__LIBELLE, Types._UE, 3);
		public static final ExecutorProperty _UE__programmation = new EcoreExecutorProperty(SitePackage.Literals.UE__PROGRAMMATION, Types._UE, 4);
		public static final ExecutorProperty _UE__required = new EcoreExecutorProperty(SitePackage.Literals.UE__REQUIRED, Types._UE, 5);
		public static final ExecutorProperty _UE__responsable = new EcoreExecutorProperty(SitePackage.Literals.UE__RESPONSABLE, Types._UE, 6);
		public static final ExecutorProperty _UE__ressource = new EcoreExecutorProperty(SitePackage.Literals.UE__RESSOURCE, Types._UE, 7);
		public static final ExecutorProperty _UE__Semestre__ue = new ExecutorPropertyWithImplementation("Semestre", Types._UE, 8, new EcoreLibraryOppositeProperty(SitePackage.Literals.SEMESTRE__UE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SiteTables::Properties and all preceding sub-packages.
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

		private static final ExecutorFragment /*@NonNull*/ [] _Departement =
			{
				Fragments._Departement__OclAny /* 0 */,
				Fragments._Departement__OclElement /* 1 */,
				Fragments._Departement__Departement /* 2 */
			};
		private static final int /*@NonNull*/ [] __Departement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Formation =
			{
				Fragments._Formation__OclAny /* 0 */,
				Fragments._Formation__OclElement /* 1 */,
				Fragments._Formation__Formation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Formation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Niveau =
			{
				Fragments._Niveau__OclAny /* 0 */,
				Fragments._Niveau__OclElement /* 1 */,
				Fragments._Niveau__Niveau /* 2 */
			};
		private static final int /*@NonNull*/ [] __Niveau = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Programmation =
			{
				Fragments._Programmation__OclAny /* 0 */,
				Fragments._Programmation__OclElement /* 1 */,
				Fragments._Programmation__Programmation /* 2 */
			};
		private static final int /*@NonNull*/ [] __Programmation = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Responsable =
			{
				Fragments._Responsable__OclAny /* 0 */,
				Fragments._Responsable__OclElement /* 1 */,
				Fragments._Responsable__Responsable /* 2 */
			};
		private static final int /*@NonNull*/ [] __Responsable = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Ressource =
			{
				Fragments._Ressource__OclAny /* 0 */,
				Fragments._Ressource__OclElement /* 1 */,
				Fragments._Ressource__Ressource /* 2 */
			};
		private static final int /*@NonNull*/ [] __Ressource = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Semestre =
			{
				Fragments._Semestre__OclAny /* 0 */,
				Fragments._Semestre__OclElement /* 1 */,
				Fragments._Semestre__Semestre /* 2 */
			};
		private static final int /*@NonNull*/ [] __Semestre = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Site =
			{
				Fragments._Site__OclAny /* 0 */,
				Fragments._Site__OclElement /* 1 */,
				Fragments._Site__Site /* 2 */
			};
		private static final int /*@NonNull*/ [] __Site = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Specialite =
			{
				Fragments._Specialite__OclAny /* 0 */,
				Fragments._Specialite__OclElement /* 1 */,
				Fragments._Specialite__Specialite /* 2 */
			};
		private static final int /*@NonNull*/ [] __Specialite = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UE =
			{
				Fragments._UE__OclAny /* 0 */,
				Fragments._UE__OclElement /* 1 */,
				Fragments._UE__UE /* 2 */
			};
		private static final int /*@NonNull*/ [] __UE = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Departement.initFragments(_Departement, __Departement);
			Types._Formation.initFragments(_Formation, __Formation);
			Types._Niveau.initFragments(_Niveau, __Niveau);
			Types._Programmation.initFragments(_Programmation, __Programmation);
			Types._Responsable.initFragments(_Responsable, __Responsable);
			Types._Ressource.initFragments(_Ressource, __Ressource);
			Types._Semestre.initFragments(_Semestre, __Semestre);
			Types._Site.initFragments(_Site, __Site);
			Types._Specialite.initFragments(_Specialite, __Specialite);
			Types._UE.initFragments(_UE, __UE);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SiteTables::TypeFragments and all preceding sub-packages.
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

		private static final ExecutorOperation /*@NonNull*/ [] _Departement__Departement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Departement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Formation__Formation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Formation__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Formation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Niveau__Niveau = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Niveau__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Niveau__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Programmation__Programmation = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Programmation__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Programmation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Responsable__Responsable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Responsable__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Responsable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Ressource__Ressource = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Ressource__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Ressource__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Semestre__Semestre = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Semestre__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Semestre__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Site__Site = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Site__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Site__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Specialite__Specialite = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Specialite__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Specialite__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UE__UE = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UE__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _UE__OclElement = {
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
			Fragments._Departement__Departement.initOperations(_Departement__Departement);
			Fragments._Departement__OclAny.initOperations(_Departement__OclAny);
			Fragments._Departement__OclElement.initOperations(_Departement__OclElement);

			Fragments._Formation__Formation.initOperations(_Formation__Formation);
			Fragments._Formation__OclAny.initOperations(_Formation__OclAny);
			Fragments._Formation__OclElement.initOperations(_Formation__OclElement);

			Fragments._Niveau__Niveau.initOperations(_Niveau__Niveau);
			Fragments._Niveau__OclAny.initOperations(_Niveau__OclAny);
			Fragments._Niveau__OclElement.initOperations(_Niveau__OclElement);

			Fragments._Programmation__OclAny.initOperations(_Programmation__OclAny);
			Fragments._Programmation__OclElement.initOperations(_Programmation__OclElement);
			Fragments._Programmation__Programmation.initOperations(_Programmation__Programmation);

			Fragments._Responsable__OclAny.initOperations(_Responsable__OclAny);
			Fragments._Responsable__OclElement.initOperations(_Responsable__OclElement);
			Fragments._Responsable__Responsable.initOperations(_Responsable__Responsable);

			Fragments._Ressource__OclAny.initOperations(_Ressource__OclAny);
			Fragments._Ressource__OclElement.initOperations(_Ressource__OclElement);
			Fragments._Ressource__Ressource.initOperations(_Ressource__Ressource);

			Fragments._Semestre__OclAny.initOperations(_Semestre__OclAny);
			Fragments._Semestre__OclElement.initOperations(_Semestre__OclElement);
			Fragments._Semestre__Semestre.initOperations(_Semestre__Semestre);

			Fragments._Site__OclAny.initOperations(_Site__OclAny);
			Fragments._Site__OclElement.initOperations(_Site__OclElement);
			Fragments._Site__Site.initOperations(_Site__Site);

			Fragments._Specialite__OclAny.initOperations(_Specialite__OclAny);
			Fragments._Specialite__OclElement.initOperations(_Specialite__OclElement);
			Fragments._Specialite__Specialite.initOperations(_Specialite__Specialite);

			Fragments._UE__OclAny.initOperations(_UE__OclAny);
			Fragments._UE__OclElement.initOperations(_UE__OclElement);
			Fragments._UE__UE.initOperations(_UE__UE);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SiteTables::FragmentOperations and all preceding sub-packages.
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

		private static final ExecutorProperty /*@NonNull*/ [] _Departement = {
			SiteTables.Properties._Departement__formation,
			SiteTables.Properties._Departement__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SiteTables.Properties._Departement__responsable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Formation = {
			SiteTables.Properties._Formation__description,
			SiteTables.Properties._Formation__niveau,
			SiteTables.Properties._Formation__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SiteTables.Properties._Formation__specialite
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Niveau = {
			SiteTables.Properties._Niveau__description,
			SiteTables.Properties._Niveau__niveau,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SiteTables.Properties._Niveau__responsable,
			SiteTables.Properties._Niveau__semestre,
			SiteTables.Properties._Niveau__specialite
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Programmation = {
			SiteTables.Properties._Programmation__heureDebut,
			SiteTables.Properties._Programmation__heureFin,
			SiteTables.Properties._Programmation__jour,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SiteTables.Properties._Programmation__salle
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Responsable = {
			SiteTables.Properties._Responsable__grade,
			SiteTables.Properties._Responsable__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SiteTables.Properties._Responsable__prenom
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Ressource = {
			SiteTables.Properties._Ressource__description,
			SiteTables.Properties._Ressource__lien,
			SiteTables.Properties._Ressource__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SiteTables.Properties._Ressource__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Semestre = {
			SiteTables.Properties._Semestre__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SiteTables.Properties._Semestre__ue
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Site = {
			SiteTables.Properties._Site__departement,
			SiteTables.Properties._Site__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SiteTables.Properties._Site__responsable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Specialite = {
			SiteTables.Properties._Specialite__description,
			SiteTables.Properties._Specialite__nom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UE = {
			SiteTables.Properties._UE__code,
			SiteTables.Properties._UE__credits,
			SiteTables.Properties._UE__description,
			SiteTables.Properties._UE__libelle,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			SiteTables.Properties._UE__programmation,
			SiteTables.Properties._UE__required,
			SiteTables.Properties._UE__responsable,
			SiteTables.Properties._UE__ressource
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Departement__Departement.initProperties(_Departement);
			Fragments._Formation__Formation.initProperties(_Formation);
			Fragments._Niveau__Niveau.initProperties(_Niveau);
			Fragments._Programmation__Programmation.initProperties(_Programmation);
			Fragments._Responsable__Responsable.initProperties(_Responsable);
			Fragments._Ressource__Ressource.initProperties(_Ressource);
			Fragments._Semestre__Semestre.initProperties(_Semestre);
			Fragments._Site__Site.initProperties(_Site);
			Fragments._Specialite__Specialite.initProperties(_Specialite);
			Fragments._UE__UE.initProperties(_UE);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SiteTables::FragmentProperties and all preceding sub-packages.
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

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of SiteTables::EnumerationLiterals and all preceding sub-packages.
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
		new SiteTables();
	}

	private SiteTables() {
		super(SitePackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		SitePackage.Literals.DEPARTEMENT,
		SitePackage.Literals.FORMATION
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
