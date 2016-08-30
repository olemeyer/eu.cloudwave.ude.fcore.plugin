/**
 */
package eu.cloudwave.ude.fcore.FCORE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getMin <em>Min</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getMax <em>Max</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getFeatureToGroupConnection <em>Feature To Group Connection</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getGroupToFeatureConnections <em>Group To Feature Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureGroup()
 * @model
 * @generated
 */
public interface FeatureGroup extends EObject {
    /**
     * Returns the value of the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min</em>' attribute.
     * @see #setMin(int)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureGroup_Min()
     * @model
     * @generated
     */
    int getMin();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getMin <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min</em>' attribute.
     * @see #getMin()
     * @generated
     */
    void setMin(int value);

    /**
     * Returns the value of the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max</em>' attribute.
     * @see #setMax(int)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureGroup_Max()
     * @model
     * @generated
     */
    int getMax();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getMax <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max</em>' attribute.
     * @see #getMax()
     * @generated
     */
    void setMax(int value);

    /**
     * Returns the value of the '<em><b>Feature To Group Connection</b></em>' reference.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature To Group Connection</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature To Group Connection</em>' reference.
     * @see #setFeatureToGroupConnection(FeatureToGroupConnection)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureGroup_FeatureToGroupConnection()
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getTarget
     * @model opposite="target" required="true"
     * @generated
     */
    FeatureToGroupConnection getFeatureToGroupConnection();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getFeatureToGroupConnection <em>Feature To Group Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feature To Group Connection</em>' reference.
     * @see #getFeatureToGroupConnection()
     * @generated
     */
    void setFeatureToGroupConnection(FeatureToGroupConnection value);

    /**
     * Returns the value of the '<em><b>Group To Feature Connections</b></em>' reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection}.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group To Feature Connections</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group To Feature Connections</em>' reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureGroup_GroupToFeatureConnections()
     * @see eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getSource
     * @model opposite="source" lower="2"
     * @generated
     */
    EList<GroupToFeatureConnection> getGroupToFeatureConnections();

} // FeatureGroup
