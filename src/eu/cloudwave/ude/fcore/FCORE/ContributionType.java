/**
 */
package eu.cloudwave.ude.fcore.FCORE;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contribution Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getContributionType()
 * @model
 * @generated
 */
public enum ContributionType implements Enumerator {
    /**
     * The '<em><b>Minus Minus</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINUS_MINUS_VALUE
     * @generated
     * @ordered
     */
    MINUS_MINUS(0, "MinusMinus", "--"),

    /**
     * The '<em><b>Minus</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MINUS_VALUE
     * @generated
     * @ordered
     */
    MINUS(1, "Minus", "-"),

    /**
     * The '<em><b>Plus</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PLUS_VALUE
     * @generated
     * @ordered
     */
    PLUS(2, "Plus", "+"),

    /**
     * The '<em><b>Plus Plus</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PLUS_PLUS_VALUE
     * @generated
     * @ordered
     */
    PLUS_PLUS(3, "PlusPlus", "++");

    /**
     * The '<em><b>Minus Minus</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Minus Minus</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MINUS_MINUS
     * @model name="MinusMinus" literal="--"
     * @generated
     * @ordered
     */
    public static final int MINUS_MINUS_VALUE = 0;

    /**
     * The '<em><b>Minus</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Minus</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #MINUS
     * @model name="Minus" literal="-"
     * @generated
     * @ordered
     */
    public static final int MINUS_VALUE = 1;

    /**
     * The '<em><b>Plus</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Plus</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PLUS
     * @model name="Plus" literal="+"
     * @generated
     * @ordered
     */
    public static final int PLUS_VALUE = 2;

    /**
     * The '<em><b>Plus Plus</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Plus Plus</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PLUS_PLUS
     * @model name="PlusPlus" literal="++"
     * @generated
     * @ordered
     */
    public static final int PLUS_PLUS_VALUE = 3;

    /**
     * An array of all the '<em><b>Contribution Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ContributionType[] VALUES_ARRAY =
        new ContributionType[] {
            MINUS_MINUS,
            MINUS,
            PLUS,
            PLUS_PLUS,
        };

    /**
     * A public read-only list of all the '<em><b>Contribution Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ContributionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Contribution Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContributionType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ContributionType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Contribution Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContributionType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ContributionType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Contribution Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ContributionType get(int value) {
        switch (value) {
            case MINUS_MINUS_VALUE: return MINUS_MINUS;
            case MINUS_VALUE: return MINUS;
            case PLUS_VALUE: return PLUS;
            case PLUS_PLUS_VALUE: return PLUS_PLUS;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private ContributionType(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //ContributionType
