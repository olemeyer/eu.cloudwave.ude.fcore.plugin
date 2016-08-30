/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Constraint Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getSource <em>Source</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttributeConstraintConnection()
 * @model
 * @generated
 */
public interface AttributeConstraintConnection extends Conncection {
    /**
     * Returns the value of the '<em><b>Source</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getAttributeConstraints <em>Attribute Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' reference.
     * @see #setSource(Feature)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttributeConstraintConnection_Source()
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getAttributeConstraints
     * @model opposite="attributeConstraints" required="true"
     * @generated
     */
    Feature getSource();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getSource <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Feature value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraint#getAttributeConstraintConnection <em>Attribute Constraint Connection</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(AttributeConstraint)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttributeConstraintConnection_Target()
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraint#getAttributeConstraintConnection
     * @model opposite="attributeConstraintConnection" required="true"
     * @generated
     */
    AttributeConstraint getTarget();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(AttributeConstraint value);

} // AttributeConstraintConnection
