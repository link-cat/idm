/**
 */
package com.link.site.util;

import com.link.site.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.link.site.SitePackage
 * @generated
 */
public class SiteAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SitePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SitePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteSwitch<Adapter> modelSwitch = new SiteSwitch<Adapter>() {
		@Override
		public Adapter caseDepartement(Departement object) {
			return createDepartementAdapter();
		}

		@Override
		public Adapter caseFormation(Formation object) {
			return createFormationAdapter();
		}

		@Override
		public Adapter caseNiveau(Niveau object) {
			return createNiveauAdapter();
		}

		@Override
		public Adapter caseSpecialite(Specialite object) {
			return createSpecialiteAdapter();
		}

		@Override
		public Adapter caseSemestre(Semestre object) {
			return createSemestreAdapter();
		}

		@Override
		public Adapter caseUE(UE object) {
			return createUEAdapter();
		}

		@Override
		public Adapter caseResponsable(Responsable object) {
			return createResponsableAdapter();
		}

		@Override
		public Adapter caseRessource(Ressource object) {
			return createRessourceAdapter();
		}

		@Override
		public Adapter caseProgrammation(Programmation object) {
			return createProgrammationAdapter();
		}

		@Override
		public Adapter caseSite(Site object) {
			return createSiteAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.link.site.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.link.site.Departement
	 * @generated
	 */
	public Adapter createDepartementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.link.site.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.link.site.Formation
	 * @generated
	 */
	public Adapter createFormationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.link.site.Niveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.link.site.Niveau
	 * @generated
	 */
	public Adapter createNiveauAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.link.site.Specialite <em>Specialite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.link.site.Specialite
	 * @generated
	 */
	public Adapter createSpecialiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.link.site.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.link.site.Semestre
	 * @generated
	 */
	public Adapter createSemestreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.link.site.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.link.site.UE
	 * @generated
	 */
	public Adapter createUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.link.site.Responsable <em>Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.link.site.Responsable
	 * @generated
	 */
	public Adapter createResponsableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.link.site.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.link.site.Ressource
	 * @generated
	 */
	public Adapter createRessourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.link.site.Programmation <em>Programmation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.link.site.Programmation
	 * @generated
	 */
	public Adapter createProgrammationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.link.site.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.link.site.Site
	 * @generated
	 */
	public Adapter createSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SiteAdapterFactory
