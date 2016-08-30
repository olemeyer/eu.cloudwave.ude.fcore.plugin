/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.InfluenceFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getInfluenceFeature()
 * @model
 * @generated
 */
public interface InfluenceFeature extends Influence {
    /**
     * Returns the value of the '<em><b>Feature</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getInfluences <em>Influences</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature</em>' reference.
     * @see #setFeature(Feature)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getInfluenceFeature_Feature()
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getInfluences
     * @model opposite="influences" required="true"
     * @generated
     */
    Feature getFeature();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.InfluenceFeature#getFeature <em>Feature</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feature</em>' reference.
     * @see #getFeature()
     * @generated
     */
    void setFeature(Feature value);

} // InfluenceFeature
