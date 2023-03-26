/**
 */
package com.link.site;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programmation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.link.site.Programmation#getJour <em>Jour</em>}</li>
 *   <li>{@link com.link.site.Programmation#getSalle <em>Salle</em>}</li>
 *   <li>{@link com.link.site.Programmation#getHeureDebut <em>Heure Debut</em>}</li>
 *   <li>{@link com.link.site.Programmation#getHeureFin <em>Heure Fin</em>}</li>
 * </ul>
 *
 * @see com.link.site.SitePackage#getProgrammation()
 * @model
 * @generated
 */
public interface Programmation extends EObject {
	/**
	 * Returns the value of the '<em><b>Jour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jour</em>' attribute.
	 * @see #setJour(String)
	 * @see com.link.site.SitePackage#getProgrammation_Jour()
	 * @model
	 * @generated
	 */
	String getJour();

	/**
	 * Sets the value of the '{@link com.link.site.Programmation#getJour <em>Jour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jour</em>' attribute.
	 * @see #getJour()
	 * @generated
	 */
	void setJour(String value);

	/**
	 * Returns the value of the '<em><b>Salle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salle</em>' attribute.
	 * @see #setSalle(String)
	 * @see com.link.site.SitePackage#getProgrammation_Salle()
	 * @model
	 * @generated
	 */
	String getSalle();

	/**
	 * Sets the value of the '{@link com.link.site.Programmation#getSalle <em>Salle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salle</em>' attribute.
	 * @see #getSalle()
	 * @generated
	 */
	void setSalle(String value);

	/**
	 * Returns the value of the '<em><b>Heure Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Debut</em>' attribute.
	 * @see #setHeureDebut(int)
	 * @see com.link.site.SitePackage#getProgrammation_HeureDebut()
	 * @model required="true"
	 * @generated
	 */
	int getHeureDebut();

	/**
	 * Sets the value of the '{@link com.link.site.Programmation#getHeureDebut <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Debut</em>' attribute.
	 * @see #getHeureDebut()
	 * @generated
	 */
	void setHeureDebut(int value);

	/**
	 * Returns the value of the '<em><b>Heure Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Fin</em>' attribute.
	 * @see #setHeureFin(int)
	 * @see com.link.site.SitePackage#getProgrammation_HeureFin()
	 * @model required="true"
	 * @generated
	 */
	int getHeureFin();

	/**
	 * Sets the value of the '{@link com.link.site.Programmation#getHeureFin <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Fin</em>' attribute.
	 * @see #getHeureFin()
	 * @generated
	 */
	void setHeureFin(int value);

} // Programmation
