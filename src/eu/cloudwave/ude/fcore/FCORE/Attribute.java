/**
 */
package eu.cloudwave.ude.fcore.FCORE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getInfluences <em>Influences</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getMin <em>Min</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttribute_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Influences</b></em>' reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute}.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Influences</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Influences</em>' reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttribute_Influences()
     * @see eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute#getAttribute
     * @model opposite="attribute"
     * @generated
     */
    EList<InfluenceAttribute> getInfluences();

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(int)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttribute_Value()
     * @model default="1"
     * @generated
     */
    int getValue();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(int value);

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
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttribute_Min()
     * @model default="1"
     * @generated
     */
    int getMin();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getMin <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min</em>' attribute.
     * @see #getMin()
     * @generated
     */
    void setMin(int value);

    /**
     * Returns the value of the '<em><b>Max</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max</em>' attribute.
     * @see #setMax(int)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getAttribute_Max()
     * @model default="1"
     * @generated
     */
    int getMax();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max</em>' attribute.
     * @see #getMax()
     * @generated
     */
    void setMax(int value);

} // Attribute
