/**
 */
package com.link.site.impl;

import com.link.site.Niveau;
import com.link.site.Responsable;
import com.link.site.Semestre;
import com.link.site.SitePackage;
import com.link.site.Specialite;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Niveau</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.link.site.impl.NiveauImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link com.link.site.impl.NiveauImpl#getSpecialite <em>Specialite</em>}</li>
 *   <li>{@link com.link.site.impl.NiveauImpl#getSemestre <em>Semestre</em>}</li>
 *   <li>{@link com.link.site.impl.NiveauImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.link.site.impl.NiveauImpl#getResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NiveauImpl extends MinimalEObjectImpl.Container implements Niveau {
	/**
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final String NIVEAU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected String niveau = NIVEAU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecialite() <em>Specialite</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialite()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialite> specialite;

	/**
	 * The cached value of the '{@link #getSemestre() <em>Semestre</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestre()
	 * @generated
	 * @ordered
	 */
	protected EList<Semestre> semestre;

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
	 * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected Responsable responsable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NiveauImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitePackage.Literals.NIVEAU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(String newNiveau) {
		String oldNiveau = niveau;
		niveau = newNiveau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.NIVEAU__NIVEAU, oldNiveau, niveau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialite> getSpecialite() {
		if (specialite == null) {
			specialite = new EObjectResolvingEList<Specialite>(Specialite.class, this, SitePackage.NIVEAU__SPECIALITE);
		}
		return specialite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semestre> getSemestre() {
		if (semestre == null) {
			semestre = new EObjectContainmentEList<Semestre>(Semestre.class, this, SitePackage.NIVEAU__SEMESTRE);
		}
		return semestre;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.NIVEAU__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsable getResponsable() {
		if (responsable != null && responsable.eIsProxy()) {
			InternalEObject oldResponsable = (InternalEObject) responsable;
			responsable = (Responsable) eResolveProxy(oldResponsable);
			if (responsable != oldResponsable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SitePackage.NIVEAU__RESPONSABLE,
							oldResponsable, responsable));
			}
		}
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsable basicGetResponsable() {
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsable(Responsable newResponsable) {
		Responsable oldResponsable = responsable;
		responsable = newResponsable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.NIVEAU__RESPONSABLE, oldResponsable,
					responsable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SitePackage.NIVEAU__SEMESTRE:
			return ((InternalEList<?>) getSemestre()).basicRemove(otherEnd, msgs);
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
		case SitePackage.NIVEAU__NIVEAU:
			return getNiveau();
		case SitePackage.NIVEAU__SPECIALITE:
			return getSpecialite();
		case SitePackage.NIVEAU__SEMESTRE:
			return getSemestre();
		case SitePackage.NIVEAU__DESCRIPTION:
			return getDescription();
		case SitePackage.NIVEAU__RESPONSABLE:
			if (resolve)
				return getResponsable();
			return basicGetResponsable();
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
		case SitePackage.NIVEAU__NIVEAU:
			setNiveau((String) newValue);
			return;
		case SitePackage.NIVEAU__SPECIALITE:
			getSpecialite().clear();
			getSpecialite().addAll((Collection<? extends Specialite>) newValue);
			return;
		case SitePackage.NIVEAU__SEMESTRE:
			getSemestre().clear();
			getSemestre().addAll((Collection<? extends Semestre>) newValue);
			return;
		case SitePackage.NIVEAU__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case SitePackage.NIVEAU__RESPONSABLE:
			setResponsable((Responsable) newValue);
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
		case SitePackage.NIVEAU__NIVEAU:
			setNiveau(NIVEAU_EDEFAULT);
			return;
		case SitePackage.NIVEAU__SPECIALITE:
			getSpecialite().clear();
			return;
		case SitePackage.NIVEAU__SEMESTRE:
			getSemestre().clear();
			return;
		case SitePackage.NIVEAU__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case SitePackage.NIVEAU__RESPONSABLE:
			setResponsable((Responsable) null);
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
		case SitePackage.NIVEAU__NIVEAU:
			return NIVEAU_EDEFAULT == null ? niveau != null : !NIVEAU_EDEFAULT.equals(niveau);
		case SitePackage.NIVEAU__SPECIALITE:
			return specialite != null && !specialite.isEmpty();
		case SitePackage.NIVEAU__SEMESTRE:
			return semestre != null && !semestre.isEmpty();
		case SitePackage.NIVEAU__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case SitePackage.NIVEAU__RESPONSABLE:
			return responsable != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (niveau: ");
		result.append(niveau);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //NiveauImpl
