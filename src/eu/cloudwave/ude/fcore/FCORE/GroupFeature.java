/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.GroupFeature#getGroupToFeatureConnection <em>Group To Feature Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getGroupFeature()
 * @model
 * @generated
 */
public interface GroupFeature extends Feature {

    /**
     * Returns the value of the '<em><b>Group To Feature Connection</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group To Feature Connection</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group To Feature Connection</em>' reference.
     * @see #setGroupToFeatureConnection(GroupToFeatureConnection)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getGroupFeature_GroupToFeatureConnection()
     * @see eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getTarget
     * @model opposite="target" required="true"
     * @generated
     */
    GroupToFeatureConnection getGroupToFeatureConnection();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.GroupFeature#getGroupToFeatureConnection <em>Group To Feature Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group To Feature Connection</em>' reference.
     * @see #getGroupToFeatureConnection()
     * @generated
     */
    void setGroupToFeatureConnection(GroupToFeatureConnection value);
} // GroupFeature
