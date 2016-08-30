/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Feature Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getSource <em>Source</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSingleFeatureConnection()
 * @model abstract="true"
 * @generated
 */
public interface SingleFeatureConnection extends Conncection {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getOutgoingSingleFeatureConnections <em>Outgoing Single Feature Connections</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(Feature)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSingleFeatureConnection_Source()
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getOutgoingSingleFeatureConnections
     * @model opposite="outgoingSingleFeatureConnections" required="true"
     * @generated
     */
    Feature getSource();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Feature value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getIncomingSingleFeatureConnection <em>Incoming Single Feature Connection</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(SolitaryFeature)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getSingleFeatureConnection_Target()
     * @see eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getIncomingSingleFeatureConnection
     * @model opposite="incomingSingleFeatureConnection" required="true"
     * @generated
     */
    SolitaryFeature getTarget();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(SolitaryFeature value);

} // SingleFeatureConnection
