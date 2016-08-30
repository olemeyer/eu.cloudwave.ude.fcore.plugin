/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group To Feature Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getSource <em>Source</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getGroupToFeatureConnection()
 * @model
 * @generated
 */
public interface GroupToFeatureConnection extends Conncection {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getGroupToFeatureConnections <em>Group To Feature Connections</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(FeatureGroup)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getGroupToFeatureConnection_Source()
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getGroupToFeatureConnections
     * @model opposite="groupToFeatureConnections" required="true"
     * @generated
     */
    FeatureGroup getSource();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(FeatureGroup value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.GroupFeature#getGroupToFeatureConnection <em>Group To Feature Connection</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(GroupFeature)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getGroupToFeatureConnection_Target()
     * @see eu.cloudwave.ude.fcore.FCORE.GroupFeature#getGroupToFeatureConnection
     * @model opposite="groupToFeatureConnection" required="true"
     * @generated
     */
    GroupFeature getTarget();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(GroupFeature value);

} // GroupToFeatureConnection
