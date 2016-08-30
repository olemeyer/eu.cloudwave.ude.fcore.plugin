/**
 */
package eu.cloudwave.ude.fcore.FCORE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.CardinalityConnection#getMin <em>Min</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.CardinalityConnection#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getCardinalityConnection()
 * @model
 * @generated
 */
public interface CardinalityConnection extends SingleFeatureConnection {
    /**
     * Returns the value of the '<em><b>Min</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min</em>' attribute.
     * @see #setMin(int)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getCardinalityConnection_Min()
     * @model default="1"
     * @generated
     */
    int getMin();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.CardinalityConnection#getMin <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min</em>' attribute.
     * @see #getMin()
     * @generated
     */
    void setMin(int value);

    /**
     * Returns the value of the '<em><b>Max</b></em>' attribute.
     * The default value is <code>"2"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max</em>' attribute.
     * @see #setMax(int)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getCardinalityConnection_Max()
     * @model default="2"
     * @generated
     */
    int getMax();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.CardinalityConnection#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max</em>' attribute.
     * @see #getMax()
     * @generated
     */
    void setMax(int value);

} // CardinalityConnection
