/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Influence Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getInfluenceAttribute()
 * @model
 * @generated
 */
public interface InfluenceAttribute extends Influence {
    /**
     * Returns the value of the '<em><b>Attribute</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getInfluences <em>Influences</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' reference.
     * @see #setAttribute(Attribute)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getInfluenceAttribute_Attribute()
     * @see eu.cloudwave.ude.fcore.FCORE.Attribute#getInfluences
     * @model opposite="influences" required="true"
     * @generated
     */
    Attribute getAttribute();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute#getAttribute <em>Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute</em>' reference.
     * @see #getAttribute()
     * @generated
     */
    void setAttribute(Attribute value);

} // InfluenceAttribute
