/**
 */
package eu.cloudwave.ude.fcore.FCORE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getGroupFeatures <em>Group Features</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getSolitaryFeatures <em>Solitary Features</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getFeatureGroups <em>Feature Groups</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributeConstraints <em>Attribute Constraints</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getRequiresFeatureConstraints <em>Requires Feature Constraints</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getExcludesFeatureConstraints <em>Excludes Feature Constraints</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getSoftgoals <em>Softgoals</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getFeatureInfluences <em>Feature Influences</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributeInfluences <em>Attribute Influences</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getMandatoryConnections <em>Mandatory Connections</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getOptionalConnections <em>Optional Connections</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getFeatureToGroupConnections <em>Feature To Group Connections</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getGroupToFeatureConnections <em>Group To Feature Connections</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributeConstraintConnections <em>Attribute Constraint Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends EObject {
    /**
     * Returns the value of the '<em><b>Root Feature</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Root Feature</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Root Feature</em>' containment reference.
     * @see #setRootFeature(RootFeature)
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_RootFeature()
     * @model containment="true" required="true"
     * @generated
     */
    RootFeature getRootFeature();

    /**
     * Sets the value of the '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getRootFeature <em>Root Feature</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Root Feature</em>' containment reference.
     * @see #getRootFeature()
     * @generated
     */
    void setRootFeature(RootFeature value);

    /**
     * Returns the value of the '<em><b>Group Features</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.GroupFeature}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group Features</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group Features</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_GroupFeatures()
     * @model containment="true"
     * @generated
     */
    EList<GroupFeature> getGroupFeatures();

    /**
     * Returns the value of the '<em><b>Solitary Features</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Solitary Features</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Solitary Features</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_SolitaryFeatures()
     * @model containment="true"
     * @generated
     */
    EList<SolitaryFeature> getSolitaryFeatures();

    /**
     * Returns the value of the '<em><b>Feature Groups</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature Groups</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature Groups</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_FeatureGroups()
     * @model containment="true"
     * @generated
     */
    EList<FeatureGroup> getFeatureGroups();

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
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<Attribute> getAttributes();

    /**
     * Returns the value of the '<em><b>Attribute Constraints</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Constraints</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Constraints</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_AttributeConstraints()
     * @model containment="true"
     * @generated
     */
    EList<AttributeConstraint> getAttributeConstraints();

    /**
     * Returns the value of the '<em><b>Requires Feature Constraints</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.RequiresFeatureConstraint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requires Feature Constraints</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requires Feature Constraints</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_RequiresFeatureConstraints()
     * @model containment="true"
     * @generated
     */
    EList<RequiresFeatureConstraint> getRequiresFeatureConstraints();

    /**
     * Returns the value of the '<em><b>Excludes Feature Constraints</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.ExcludesFeatureConstraint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Excludes Feature Constraints</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Excludes Feature Constraints</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_ExcludesFeatureConstraints()
     * @model containment="true"
     * @generated
     */
    EList<ExcludesFeatureConstraint> getExcludesFeatureConstraints();

    /**
     * Returns the value of the '<em><b>Softgoals</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.Softgoal}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Softgoals</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Softgoals</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_Softgoals()
     * @model containment="true"
     * @generated
     */
    EList<Softgoal> getSoftgoals();

    /**
     * Returns the value of the '<em><b>Feature Influences</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.InfluenceFeature}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature Influences</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature Influences</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_FeatureInfluences()
     * @model containment="true"
     * @generated
     */
    EList<InfluenceFeature> getFeatureInfluences();

    /**
     * Returns the value of the '<em><b>Attribute Influences</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Influences</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Influences</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_AttributeInfluences()
     * @model containment="true"
     * @generated
     */
    EList<InfluenceAttribute> getAttributeInfluences();

    /**
     * Returns the value of the '<em><b>Mandatory Connections</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.MandatoryConnection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mandatory Connections</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mandatory Connections</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_MandatoryConnections()
     * @model containment="true"
     * @generated
     */
    EList<MandatoryConnection> getMandatoryConnections();

    /**
     * Returns the value of the '<em><b>Optional Connections</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.OptionalConnection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Optional Connections</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Optional Connections</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_OptionalConnections()
     * @model containment="true"
     * @generated
     */
    EList<OptionalConnection> getOptionalConnections();

    /**
     * Returns the value of the '<em><b>Feature To Group Connections</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Feature To Group Connections</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Feature To Group Connections</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_FeatureToGroupConnections()
     * @model containment="true"
     * @generated
     */
    EList<FeatureToGroupConnection> getFeatureToGroupConnections();

    /**
     * Returns the value of the '<em><b>Group To Feature Connections</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group To Feature Connections</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group To Feature Connections</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_GroupToFeatureConnections()
     * @model containment="true"
     * @generated
     */
    EList<GroupToFeatureConnection> getGroupToFeatureConnections();

    /**
     * Returns the value of the '<em><b>Attribute Constraint Connections</b></em>' containment reference list.
     * The list contents are of type {@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Constraint Connections</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Constraint Connections</em>' containment reference list.
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#getFeatureModel_AttributeConstraintConnections()
     * @model containment="true"
     * @generated
     */
    EList<AttributeConstraintConnection> getAttributeConstraintConnections();

} // FeatureModel
