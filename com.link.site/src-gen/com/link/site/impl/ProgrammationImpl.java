/**
 */
package com.link.site.impl;

import com.link.site.Programmation;
import com.link.site.SitePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programmation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.link.site.impl.ProgrammationImpl#getJour <em>Jour</em>}</li>
 *   <li>{@link com.link.site.impl.ProgrammationImpl#getSalle <em>Salle</em>}</li>
 *   <li>{@link com.link.site.impl.ProgrammationImpl#getHeureDebut <em>Heure Debut</em>}</li>
 *   <li>{@link com.link.site.impl.ProgrammationImpl#getHeureFin <em>Heure Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammationImpl extends MinimalEObjectImpl.Container implements Programmation {
	/**
	 * The default value of the '{@link #getJour() <em>Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJour()
	 * @generated
	 * @ordered
	 */
	protected static final String JOUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJour() <em>Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJour()
	 * @generated
	 * @ordered
	 */
	protected String jour = JOUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalle() <em>Salle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle()
	 * @generated
	 * @ordered
	 */
	protected static final String SALLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalle() <em>Salle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle()
	 * @generated
	 * @ordered
	 */
	protected String salle = SALLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureDebut() <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebut()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURE_DEBUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeureDebut() <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebut()
	 * @generated
	 * @ordered
	 */
	protected int heureDebut = HEURE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureFin() <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFin()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURE_FIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeureFin() <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFin()
	 * @generated
	 * @ordered
	 */
	protected int heureFin = HEURE_FIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SitePackage.Literals.PROGRAMMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJour() {
		return jour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJour(String newJour) {
		String oldJour = jour;
		jour = newJour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.PROGRAMMATION__JOUR, oldJour, jour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSalle() {
		return salle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalle(String newSalle) {
		String oldSalle = salle;
		salle = newSalle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.PROGRAMMATION__SALLE, oldSalle, salle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeureDebut() {
		return heureDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureDebut(int newHeureDebut) {
		int oldHeureDebut = heureDebut;
		heureDebut = newHeureDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.PROGRAMMATION__HEURE_DEBUT, oldHeureDebut,
					heureDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeureFin() {
		return heureFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureFin(int newHeureFin) {
		int oldHeureFin = heureFin;
		heureFin = newHeureFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SitePackage.PROGRAMMATION__HEURE_FIN, oldHeureFin,
					heureFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SitePackage.PROGRAMMATION__JOUR:
			return getJour();
		case SitePackage.PROGRAMMATION__SALLE:
			return getSalle();
		case SitePackage.PROGRAMMATION__HEURE_DEBUT:
			return getHeureDebut();
		case SitePackage.PROGRAMMATION__HEURE_FIN:
			return getHeureFin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SitePackage.PROGRAMMATION__JOUR:
			setJour((String) newValue);
			return;
		case SitePackage.PROGRAMMATION__SALLE:
			setSalle((String) newValue);
			return;
		case SitePackage.PROGRAMMATION__HEURE_DEBUT:
			setHeureDebut((Integer) newValue);
			return;
		case SitePackage.PROGRAMMATION__HEURE_FIN:
			setHeureFin((Integer) newValue);
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
		case SitePackage.PROGRAMMATION__JOUR:
			setJour(JOUR_EDEFAULT);
			return;
		case SitePackage.PROGRAMMATION__SALLE:
			setSalle(SALLE_EDEFAULT);
			return;
		case SitePackage.PROGRAMMATION__HEURE_DEBUT:
			setHeureDebut(HEURE_DEBUT_EDEFAULT);
			return;
		case SitePackage.PROGRAMMATION__HEURE_FIN:
			setHeureFin(HEURE_FIN_EDEFAULT);
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
		case SitePackage.PROGRAMMATION__JOUR:
			return JOUR_EDEFAULT == null ? jour != null : !JOUR_EDEFAULT.equals(jour);
		case SitePackage.PROGRAMMATION__SALLE:
			return SALLE_EDEFAULT == null ? salle != null : !SALLE_EDEFAULT.equals(salle);
		case SitePackage.PROGRAMMATION__HEURE_DEBUT:
			return heureDebut != HEURE_DEBUT_EDEFAULT;
		case SitePackage.PROGRAMMATION__HEURE_FIN:
			return heureFin != HEURE_FIN_EDEFAULT;
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
		result.append(" (jour: ");
		result.append(jour);
		result.append(", salle: ");
		result.append(salle);
		result.append(", heureDebut: ");
		result.append(heureDebut);
		result.append(", heureFin: ");
		result.append(heureFin);
		result.append(')');
		return result.toString();
	}

} //ProgrammationImpl
