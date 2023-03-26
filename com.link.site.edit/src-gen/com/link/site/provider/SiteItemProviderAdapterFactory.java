/**
 */
package com.link.site.provider;

import com.link.site.util.SiteAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SiteItemProviderAdapterFactory extends SiteAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.link.site.Departement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartementItemProvider departementItemProvider;

	/**
	 * This creates an adapter for a {@link com.link.site.Departement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDepartementAdapter() {
		if (departementItemProvider == null) {
			departementItemProvider = new DepartementItemProvider(this);
		}

		return departementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.link.site.Formation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationItemProvider formationItemProvider;

	/**
	 * This creates an adapter for a {@link com.link.site.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFormationAdapter() {
		if (formationItemProvider == null) {
			formationItemProvider = new FormationItemProvider(this);
		}

		return formationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.link.site.Niveau} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NiveauItemProvider niveauItemProvider;

	/**
	 * This creates an adapter for a {@link com.link.site.Niveau}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNiveauAdapter() {
		if (niveauItemProvider == null) {
			niveauItemProvider = new NiveauItemProvider(this);
		}

		return niveauItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.link.site.Specialite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialiteItemProvider specialiteItemProvider;

	/**
	 * This creates an adapter for a {@link com.link.site.Specialite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecialiteAdapter() {
		if (specialiteItemProvider == null) {
			specialiteItemProvider = new SpecialiteItemProvider(this);
		}

		return specialiteItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.link.site.Semestre} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemestreItemProvider semestreItemProvider;

	/**
	 * This creates an adapter for a {@link com.link.site.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSemestreAdapter() {
		if (semestreItemProvider == null) {
			semestreItemProvider = new SemestreItemProvider(this);
		}

		return semestreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.link.site.UE} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UEItemProvider ueItemProvider;

	/**
	 * This creates an adapter for a {@link com.link.site.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUEAdapter() {
		if (ueItemProvider == null) {
			ueItemProvider = new UEItemProvider(this);
		}

		return ueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.link.site.Responsable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsableItemProvider responsableItemProvider;

	/**
	 * This creates an adapter for a {@link com.link.site.Responsable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResponsableAdapter() {
		if (responsableItemProvider == null) {
			responsableItemProvider = new ResponsableItemProvider(this);
		}

		return responsableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.link.site.Ressource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RessourceItemProvider ressourceItemProvider;

	/**
	 * This creates an adapter for a {@link com.link.site.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRessourceAdapter() {
		if (ressourceItemProvider == null) {
			ressourceItemProvider = new RessourceItemProvider(this);
		}

		return ressourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.link.site.Programmation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammationItemProvider programmationItemProvider;

	/**
	 * This creates an adapter for a {@link com.link.site.Programmation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgrammationAdapter() {
		if (programmationItemProvider == null) {
			programmationItemProvider = new ProgrammationItemProvider(this);
		}

		return programmationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.link.site.Site} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteItemProvider siteItemProvider;

	/**
	 * This creates an adapter for a {@link com.link.site.Site}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSiteAdapter() {
		if (siteItemProvider == null) {
			siteItemProvider = new SiteItemProvider(this);
		}

		return siteItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (departementItemProvider != null)
			departementItemProvider.dispose();
		if (formationItemProvider != null)
			formationItemProvider.dispose();
		if (niveauItemProvider != null)
			niveauItemProvider.dispose();
		if (specialiteItemProvider != null)
			specialiteItemProvider.dispose();
		if (semestreItemProvider != null)
			semestreItemProvider.dispose();
		if (ueItemProvider != null)
			ueItemProvider.dispose();
		if (responsableItemProvider != null)
			responsableItemProvider.dispose();
		if (ressourceItemProvider != null)
			ressourceItemProvider.dispose();
		if (programmationItemProvider != null)
			programmationItemProvider.dispose();
		if (siteItemProvider != null)
			siteItemProvider.dispose();
	}

}