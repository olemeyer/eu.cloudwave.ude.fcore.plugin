/**
 */
package eu.cloudwave.ude.fcore.FCORE;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraint#getEquation <em>Equation</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraint#getAttributeConstraintConnection <em>Attribute Constraint Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttributeConstraint()
 * @model
 * @generated
 */
public interface AttributeConstraint extends EObject {
    /**
     * Returns the value of the '<em><b>Equation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Equation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Equation</em>' attribute.
     * @see #setEquation(String)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttributeConstraint_Equation()
     * @model
     * @generated
     */
    String getEquation();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraint#getEquation <em>Equation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Equation</em>' attribute.
     * @see #getEquation()
     * @generated
     */
    void setEquation(String value);

    /**
     * Returns the value of the '<em><b>Attribute Constraint Connection</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Constraint Connection</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Constraint Connection</em>' reference.
     * @see #setAttributeConstraintConnection(AttributeConstraintConnection)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttributeConstraint_AttributeConstraintConnection()
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getTarget
     * @model opposite="target"
     * @generated
     */
    AttributeConstraintConnection getAttributeConstraintConnection();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraint#getAttributeConstraintConnection <em>Attribute Constraint Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute Constraint Connection</em>' reference.
     * @see #getAttributeConstraintConnection()
     * @generated
     */
    void setAttributeConstraintConnection(AttributeConstraintConnection value);

} // AttributeConstraint
