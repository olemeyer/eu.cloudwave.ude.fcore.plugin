/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureStart <em>Feature Start</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureEnd <em>Feature End</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureConstraint()
 * @model abstract="true"
 * @generated
 */
public interface FeatureConstraint extends Conncection {
    /**
     * Returns the value of the '<em><b>Feature Start</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureConstraintsStarts <em>Feature Constraints Starts</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature Start</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature Start</em>' reference.
     * @see #setFeatureStart(Feature)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureConstraint_FeatureStart()
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureConstraintsStarts
     * @model opposite="featureConstraintsStarts" required="true"
     * @generated
     */
    Feature getFeatureStart();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureStart <em>Feature Start</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feature Start</em>' reference.
     * @see #getFeatureStart()
     * @generated
     */
    void setFeatureStart(Feature value);

    /**
     * Returns the value of the '<em><b>Feature End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureConstraintsEnds <em>Feature Constraints Ends</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature End</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature End</em>' reference.
     * @see #setFeatureEnd(Feature)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureConstraint_FeatureEnd()
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureConstraintsEnds
     * @model opposite="featureConstraintsEnds" required="true"
     * @generated
     */
    Feature getFeatureEnd();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureEnd <em>Feature End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feature End</em>' reference.
     * @see #getFeatureEnd()
     * @generated
     */
    void setFeatureEnd(Feature value);

} // FeatureConstraint
