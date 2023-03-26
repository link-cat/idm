/**
 */
package com.link.site.impl;

import com.link.site.Departement;
import com.link.site.Responsable;
import com.link.site.Site;
import com.link.site.SitePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.link.site.impl.SiteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link com.link.site.impl.SiteImpl#getDepartement <em>Departement</em>}</li>
 *   <li>{@link com.link.site.impl.SiteImpl#getResponsable <em>Responsable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiteImpl extends MinimalEObjectImpl.Container implements Site {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepartement() <em>Departement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartement()
	 * @generated
	 * @ordered
	 */
	protected EList<Departement> departement;

	/**
	 * The cached value of the '{@link #getResponsable() <em>Responsable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsable()
	 * @generated
	 * @ordered
	 */
	protected EList<Responsable> responsable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitePackage.Literals.SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.SITE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Departement> getDepartement() {
		if (departement == null) {
			departement = new EObjectContainmentEList<Departement>(Departement.class, this,
					SitePackage.SITE__DEPARTEMENT);
		}
		return departement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Responsable> getResponsable() {
		if (responsable == null) {
			responsable = new EObjectContainmentEList<Responsable>(Responsable.class, this,
					SitePackage.SITE__RESPONSABLE);
		}
		return responsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SitePackage.SITE__DEPARTEMENT:
			return ((InternalEList<?>) getDepartement()).basicRemove(otherEnd, msgs);
		case SitePackage.SITE__RESPONSABLE:
			return ((InternalEList<?>) getResponsable()).basicRemove(otherEnd, msgs);
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
		case SitePackage.SITE__NOM:
			return getNom();
		case SitePackage.SITE__DEPARTEMENT:
			return getDepartement();
		case SitePackage.SITE__RESPONSABLE:
			return getResponsable();
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
		case SitePackage.SITE__NOM:
			setNom((String) newValue);
			return;
		case SitePackage.SITE__DEPARTEMENT:
			getDepartement().clear();
			getDepartement().addAll((Collection<? extends Departement>) newValue);
			return;
		case SitePackage.SITE__RESPONSABLE:
			getResponsable().clear();
			getResponsable().addAll((Collection<? extends Responsable>) newValue);
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
		case SitePackage.SITE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case SitePackage.SITE__DEPARTEMENT:
			getDepartement().clear();
			return;
		case SitePackage.SITE__RESPONSABLE:
			getResponsable().clear();
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
		case SitePackage.SITE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case SitePackage.SITE__DEPARTEMENT:
			return departement != null && !departement.isEmpty();
		case SitePackage.SITE__RESPONSABLE:
			return responsable != null && !responsable.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(')');
		return result.toString();
	}

} //SiteImpl
