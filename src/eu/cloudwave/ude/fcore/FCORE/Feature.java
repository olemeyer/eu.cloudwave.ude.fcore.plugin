/**
 */
package eu.cloudwave.ude.fcore.FCORE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Feature#getName <em>Name</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Feature#isSelected <em>Selected</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Feature#getAttributeConstraints <em>Attribute Constraints</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Feature#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureConstraintsStarts <em>Feature Constraints Starts</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureConstraintsEnds <em>Feature Constraints Ends</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Feature#getInfluences <em>Influences</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Feature#getOutgoingSingleFeatureConnections <em>Outgoing Single Feature Connections</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureToGroupConnections <em>Feature To Group Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeature()
 * @model abstract="true"
 * @generated
 */
public interface Feature extends EObject {
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
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeature_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected</em>' attribute.
     * @see #setSelected(boolean)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeature_Selected()
     * @model
     * @generated
     */
    boolean isSelected();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.Feature#isSelected <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selected</em>' attribute.
     * @see #isSelected()
     * @generated
     */
    void setSelected(boolean value);

    /**
     * Returns the value of the '<em><b>Attribute Constraints</b></em>' reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection}.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Constraints</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Constraints</em>' reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeature_AttributeConstraints()
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getSource
     * @model opposite="source"
     * @generated
     */
    EList<AttributeConstraintConnection> getAttributeConstraints();

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.Attribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeature_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<Attribute> getAttributes();

    /**
     * Returns the value of the '<em><b>Feature Constraints Starts</b></em>' reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint}.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureStart <em>Feature Start</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature Constraints Starts</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature Constraints Starts</em>' reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeature_FeatureConstraintsStarts()
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureStart
     * @model opposite="featureStart"
     * @generated
     */
    EList<FeatureConstraint> getFeatureConstraintsStarts();

    /**
     * Returns the value of the '<em><b>Feature Constraints Ends</b></em>' reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint}.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureEnd <em>Feature End</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature Constraints Ends</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature Constraints Ends</em>' reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeature_FeatureConstraintsEnds()
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureEnd
     * @model opposite="featureEnd"
     * @generated
     */
    EList<FeatureConstraint> getFeatureConstraintsEnds();

    /**
     * Returns the value of the '<em><b>Influences</b></em>' reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.InfluenceFeature}.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.InfluenceFeature#getFeature <em>Feature</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Influences</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Influences</em>' reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeature_Influences()
     * @see eu.cloudwave.ude.fcore.FCORE.InfluenceFeature#getFeature
     * @model opposite="feature"
     * @generated
     */
    EList<InfluenceFeature> getInfluences();

    /**
     * Returns the value of the '<em><b>Outgoing Single Feature Connections</b></em>' reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection}.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Single Feature Connections</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing Single Feature Connections</em>' reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeature_OutgoingSingleFeatureConnections()
     * @see eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getSource
     * @model opposite="source"
     * @generated
     */
    EList<SingleFeatureConnection> getOutgoingSingleFeatureConnections();

    /**
     * Returns the value of the '<em><b>Feature To Group Connections</b></em>' reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection}.
     * It is bidirectional and its opposite is '{@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature To Group Connections</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature To Group Connections</em>' reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeature_FeatureToGroupConnections()
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getSource
     * @model opposite="source"
     * @generated
     */
    EList<FeatureToGroupConnection> getFeatureToGroupConnections();

} // Feature
