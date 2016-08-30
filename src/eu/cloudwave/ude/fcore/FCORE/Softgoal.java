/**
 */
package eu.cloudwave.ude.fcore.FCORE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Softgoal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Softgoal#getName <em>Name</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Softgoal#getInfluence <em>Influence</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Softgoal#getWeighting <em>Weighting</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSoftgoal()
 * @model
 * @generated
 */
public interface Softgoal extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSoftgoal_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.Softgoal#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Influence</b></em>' reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.Influence}.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.Influence#getSoftgoal <em>Softgoal</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Influence</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Influence</em>' reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSoftgoal_Influence()
     * @see eu.cloudwave.ude.fcore.FCORE.Influence#getSoftgoal
     * @model opposite="softgoal"
     * @generated
     */
    EList<Influence> getInfluence();

    /**
     * Returns the value of the '<em><b>Weighting</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Weighting</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Weighting</em>' attribute.
     * @see #setWeighting(String)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSoftgoal_Weighting()
     * @model
     * @generated
     */
    String getWeighting();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.Softgoal#getWeighting <em>Weighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Weighting</em>' attribute.
     * @see #getWeighting()
     * @generated
     */
    void setWeighting(String value);

} // Softgoal
