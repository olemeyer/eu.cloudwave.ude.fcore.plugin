/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solitary Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getMin <em>Min</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getMax <em>Max</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getIncomingSingleFeatureConnection <em>Incoming Single Feature Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSolitaryFeature()
 * @model
 * @generated
 */
public interface SolitaryFeature extends Feature {
    /**
     * Returns the value of the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min</em>' attribute.
     * @see #setMin(int)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSolitaryFeature_Min()
     * @model
     * @generated
     */
    int getMin();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getMin <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min</em>' attribute.
     * @see #getMin()
     * @generated
     */
    void setMin(int value);

    /**
     * Returns the value of the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max</em>' attribute.
     * @see #setMax(int)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSolitaryFeature_Max()
     * @model
     * @generated
     */
    int getMax();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max</em>' attribute.
     * @see #getMax()
     * @generated
     */
    void setMax(int value);

    /**
     * Returns the value of the '<em><b>Incoming Single Feature Connection</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incoming Single Feature Connection</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incoming Single Feature Connection</em>' reference.
     * @see #setIncomingSingleFeatureConnection(SingleFeatureConnection)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSolitaryFeature_IncomingSingleFeatureConnection()
     * @see eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getTarget
     * @model opposite="target" required="true"
     * @generated
     */
    SingleFeatureConnection getIncomingSingleFeatureConnection();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getIncomingSingleFeatureConnection <em>Incoming Single Feature Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Incoming Single Feature Connection</em>' reference.
     * @see #getIncomingSingleFeatureConnection()
     * @generated
     */
    void setIncomingSingleFeatureConnection(SingleFeatureConnection value);

} // SolitaryFeature
