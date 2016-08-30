/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature To Group Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getSource <em>Source</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureToGroupConnection()
 * @model
 * @generated
 */
public interface FeatureToGroupConnection extends Conncection {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureToGroupConnections <em>Feature To Group Connections</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(Feature)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureToGroupConnection_Source()
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureToGroupConnections
     * @model opposite="featureToGroupConnections" required="true"
     * @generated
     */
    Feature getSource();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Feature value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getFeatureToGroupConnection <em>Feature To Group Connection</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(FeatureGroup)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureToGroupConnection_Target()
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getFeatureToGroupConnection
     * @model opposite="featureToGroupConnection" required="true"
     * @generated
     */
    FeatureGroup getTarget();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(FeatureGroup value);

} // FeatureToGroupConnection
