/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Influence#getContribution <em>Contribution</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Influence#getSoftgoal <em>Softgoal</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getInfluence()
 * @model abstract="true"
 * @generated
 */
public interface Influence extends Conncection {
    /**
     * Returns the value of the '<em><b>Contribution</b></em>' attribute.
     * The default value is <code>"1.0"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contribution</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contribution</em>' attribute.
     * @see #setContribution(float)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getInfluence_Contribution()
     * @model default="1.0"
     * @generated
     */
    float getContribution();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.Influence#getContribution <em>Contribution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contribution</em>' attribute.
     * @see #getContribution()
     * @generated
     */
    void setContribution(float value);

    /**
     * Returns the value of the '<em><b>Softgoal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.Softgoal#getInfluence <em>Influence</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Softgoal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Softgoal</em>' reference.
     * @see #setSoftgoal(Softgoal)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getInfluence_Softgoal()
     * @see eu.cloudwave.ude.fcore.FCORE.Softgoal#getInfluence
     * @model opposite="influence" required="true"
     * @generated
     */
    Softgoal getSoftgoal();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.Influence#getSoftgoal <em>Softgoal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Softgoal</em>' reference.
     * @see #getSoftgoal()
     * @generated
     */
    void setSoftgoal(Softgoal value);

} // Influence
