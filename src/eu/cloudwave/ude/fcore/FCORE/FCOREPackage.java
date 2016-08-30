/**
 */
package eu.cloudwave.ude.fcore.FCORE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREFactory
 * @model kind="package"
 * @generated
 */
public interface FCOREPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String       eNAME                                       = "FCORE";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String       eNS_URI                                     = "http://www.cloudwave-fp7.eu/ude/fcore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String       eNS_PREFIX                                  = "fcore";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FCOREPackage eINSTANCE                                   = eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl.init();

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl <em>Feature Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getFeatureModel()
     * @generated
     */
    int          FEATURE_MODEL                               = 0;

    /**
     * The feature id for the '<em><b>Root Feature</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_MODEL__ROOT_FEATURE                 = 0;

    /**
     * The feature id for the '<em><b>Group Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__GROUP_FEATURES = 1;

    /**
     * The feature id for the '<em><b>Solitary Features</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__SOLITARY_FEATURES = 2;

    /**
     * The feature id for the '<em><b>Feature Groups</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__FEATURE_GROUPS = 3;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__ATTRIBUTES = 4;

    /**
     * The feature id for the '<em><b>Attribute Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__ATTRIBUTE_CONSTRAINTS = 5;

    /**
     * The feature id for the '<em><b>Requires Feature Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__REQUIRES_FEATURE_CONSTRAINTS = 6;

    /**
     * The feature id for the '<em><b>Excludes Feature Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__EXCLUDES_FEATURE_CONSTRAINTS = 7;

    /**
     * The feature id for the '<em><b>Softgoals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_MODEL__SOFTGOALS                    = 8;

    /**
     * The feature id for the '<em><b>Feature Influences</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__FEATURE_INFLUENCES = 9;

    /**
     * The feature id for the '<em><b>Attribute Influences</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__ATTRIBUTE_INFLUENCES = 10;

    /**
     * The feature id for the '<em><b>Mandatory Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__MANDATORY_CONNECTIONS = 11;

    /**
     * The feature id for the '<em><b>Optional Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__OPTIONAL_CONNECTIONS = 12;

    /**
     * The feature id for the '<em><b>Feature To Group Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__FEATURE_TO_GROUP_CONNECTIONS = 13;

    /**
     * The feature id for the '<em><b>Group To Feature Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__GROUP_TO_FEATURE_CONNECTIONS = 14;

    /**
     * The feature id for the '<em><b>Attribute Constraint Connections</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_MODEL__ATTRIBUTE_CONSTRAINT_CONNECTIONS = 15;

    /**
     * The number of structural features of the '<em>Feature Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_MODEL_FEATURE_COUNT                 = 16;

    /**
     * The number of operations of the '<em>Feature Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_MODEL_OPERATION_COUNT               = 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getFeature()
     * @generated
     */
    int          FEATURE                                     = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE__NAME                               = 0;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE__SELECTED                           = 1;

    /**
     * The feature id for the '<em><b>Attribute Constraints</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE__ATTRIBUTE_CONSTRAINTS              = 2;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE__ATTRIBUTES                         = 3;

    /**
     * The feature id for the '<em><b>Feature Constraints Starts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE__FEATURE_CONSTRAINTS_STARTS = 4;

    /**
     * The feature id for the '<em><b>Feature Constraints Ends</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE__FEATURE_CONSTRAINTS_ENDS = 5;

    /**
     * The feature id for the '<em><b>Influences</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE__INFLUENCES                         = 6;

    /**
     * The feature id for the '<em><b>Outgoing Single Feature Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS = 7;

    /**
     * The feature id for the '<em><b>Feature To Group Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE__FEATURE_TO_GROUP_CONNECTIONS = 8;

    /**
     * The number of structural features of the '<em>Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_FEATURE_COUNT                       = 9;

    /**
     * The number of operations of the '<em>Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_OPERATION_COUNT                     = 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.RootFeatureImpl <em>Root Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.RootFeatureImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getRootFeature()
     * @generated
     */
    int          ROOT_FEATURE                                = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ROOT_FEATURE__NAME                          = FEATURE__NAME;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ROOT_FEATURE__SELECTED                      = FEATURE__SELECTED;

    /**
     * The feature id for the '<em><b>Attribute Constraints</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ROOT_FEATURE__ATTRIBUTE_CONSTRAINTS         = FEATURE__ATTRIBUTE_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ROOT_FEATURE__ATTRIBUTES                    = FEATURE__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Feature Constraints Starts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_FEATURE__FEATURE_CONSTRAINTS_STARTS = FEATURE__FEATURE_CONSTRAINTS_STARTS;

    /**
     * The feature id for the '<em><b>Feature Constraints Ends</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_FEATURE__FEATURE_CONSTRAINTS_ENDS = FEATURE__FEATURE_CONSTRAINTS_ENDS;

    /**
     * The feature id for the '<em><b>Influences</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ROOT_FEATURE__INFLUENCES                    = FEATURE__INFLUENCES;

    /**
     * The feature id for the '<em><b>Outgoing Single Feature Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS = FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Feature To Group Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ROOT_FEATURE__FEATURE_TO_GROUP_CONNECTIONS = FEATURE__FEATURE_TO_GROUP_CONNECTIONS;

    /**
     * The number of structural features of the '<em>Root Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ROOT_FEATURE_FEATURE_COUNT                  = FEATURE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Root Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ROOT_FEATURE_OPERATION_COUNT                = FEATURE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.GroupFeatureImpl <em>Group Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.GroupFeatureImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getGroupFeature()
     * @generated
     */
    int          GROUP_FEATURE                               = 4;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.SolitaryFeatureImpl <em>Solitary Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.SolitaryFeatureImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getSolitaryFeature()
     * @generated
     */
    int          SOLITARY_FEATURE                            = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOLITARY_FEATURE__NAME                      = FEATURE__NAME;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOLITARY_FEATURE__SELECTED                  = FEATURE__SELECTED;

    /**
     * The feature id for the '<em><b>Attribute Constraints</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOLITARY_FEATURE__ATTRIBUTE_CONSTRAINTS     = FEATURE__ATTRIBUTE_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOLITARY_FEATURE__ATTRIBUTES                = FEATURE__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Feature Constraints Starts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLITARY_FEATURE__FEATURE_CONSTRAINTS_STARTS = FEATURE__FEATURE_CONSTRAINTS_STARTS;

    /**
     * The feature id for the '<em><b>Feature Constraints Ends</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLITARY_FEATURE__FEATURE_CONSTRAINTS_ENDS = FEATURE__FEATURE_CONSTRAINTS_ENDS;

    /**
     * The feature id for the '<em><b>Influences</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOLITARY_FEATURE__INFLUENCES                = FEATURE__INFLUENCES;

    /**
     * The feature id for the '<em><b>Outgoing Single Feature Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLITARY_FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS = FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Feature To Group Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLITARY_FEATURE__FEATURE_TO_GROUP_CONNECTIONS = FEATURE__FEATURE_TO_GROUP_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOLITARY_FEATURE__MIN                       = FEATURE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOLITARY_FEATURE__MAX                       = FEATURE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Incoming Single Feature Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION = FEATURE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Solitary Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOLITARY_FEATURE_FEATURE_COUNT              = FEATURE_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Solitary Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOLITARY_FEATURE_OPERATION_COUNT            = FEATURE_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          GROUP_FEATURE__NAME                         = FEATURE__NAME;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          GROUP_FEATURE__SELECTED                     = FEATURE__SELECTED;

    /**
     * The feature id for the '<em><b>Attribute Constraints</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          GROUP_FEATURE__ATTRIBUTE_CONSTRAINTS        = FEATURE__ATTRIBUTE_CONSTRAINTS;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          GROUP_FEATURE__ATTRIBUTES                   = FEATURE__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Feature Constraints Starts</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_FEATURE__FEATURE_CONSTRAINTS_STARTS = FEATURE__FEATURE_CONSTRAINTS_STARTS;

    /**
     * The feature id for the '<em><b>Feature Constraints Ends</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_FEATURE__FEATURE_CONSTRAINTS_ENDS = FEATURE__FEATURE_CONSTRAINTS_ENDS;

    /**
     * The feature id for the '<em><b>Influences</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          GROUP_FEATURE__INFLUENCES                   = FEATURE__INFLUENCES;

    /**
     * The feature id for the '<em><b>Outgoing Single Feature Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS = FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Feature To Group Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_FEATURE__FEATURE_TO_GROUP_CONNECTIONS = FEATURE__FEATURE_TO_GROUP_CONNECTIONS;

    /**
     * The feature id for the '<em><b>Group To Feature Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION = FEATURE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Group Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          GROUP_FEATURE_FEATURE_COUNT                 = FEATURE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Group Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          GROUP_FEATURE_OPERATION_COUNT               = FEATURE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FeatureGroupImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getFeatureGroup()
     * @generated
     */
    int          FEATURE_GROUP                               = 5;

    /**
     * The feature id for the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_GROUP__MIN                          = 0;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_GROUP__MAX                          = 1;

    /**
     * The feature id for the '<em><b>Feature To Group Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION = 2;

    /**
     * The feature id for the '<em><b>Group To Feature Connections</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS = 3;

    /**
     * The number of structural features of the '<em>Feature Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_GROUP_FEATURE_COUNT                 = 4;

    /**
     * The number of operations of the '<em>Feature Group</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_GROUP_OPERATION_COUNT               = 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getAttributeConstraint()
     * @generated
     */
    int          ATTRIBUTE_CONSTRAINT                        = 7;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureConstraintImpl <em>Feature Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FeatureConstraintImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getFeatureConstraint()
     * @generated
     */
    int          FEATURE_CONSTRAINT                          = 10;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.RequiresFeatureConstraintImpl <em>Requires Feature Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.RequiresFeatureConstraintImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getRequiresFeatureConstraint()
     * @generated
     */
    int          REQUIRES_FEATURE_CONSTRAINT                 = 11;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.ExcludesFeatureConstraintImpl <em>Excludes Feature Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.ExcludesFeatureConstraintImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getExcludesFeatureConstraint()
     * @generated
     */
    int          EXCLUDES_FEATURE_CONSTRAINT                 = 12;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.AttributeImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getAttribute()
     * @generated
     */
    int          ATTRIBUTE                                   = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ATTRIBUTE__NAME                             = 0;

    /**
     * The feature id for the '<em><b>Influences</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ATTRIBUTE__INFLUENCES                       = 1;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ATTRIBUTE__VALUE                            = 2;

    /**
     * The feature id for the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ATTRIBUTE__MIN                              = 3;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ATTRIBUTE__MAX                              = 4;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ATTRIBUTE_FEATURE_COUNT                     = 5;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ATTRIBUTE_OPERATION_COUNT                   = 0;

    /**
     * The feature id for the '<em><b>Equation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ATTRIBUTE_CONSTRAINT__EQUATION              = 0;

    /**
     * The feature id for the '<em><b>Attribute Constraint Connection</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION = 1;

    /**
     * The number of structural features of the '<em>Attribute Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ATTRIBUTE_CONSTRAINT_FEATURE_COUNT          = 2;

    /**
     * The number of operations of the '<em>Attribute Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          ATTRIBUTE_CONSTRAINT_OPERATION_COUNT        = 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.InfluenceImpl <em>Influence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.InfluenceImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getInfluence()
     * @generated
     */
    int          INFLUENCE                                   = 13;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.InfluenceFeatureImpl <em>Influence Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.InfluenceFeatureImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getInfluenceFeature()
     * @generated
     */
    int          INFLUENCE_FEATURE                           = 14;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.SoftgoalImpl <em>Softgoal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.SoftgoalImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getSoftgoal()
     * @generated
     */
    int          SOFTGOAL                                    = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOFTGOAL__NAME                              = 0;

    /**
     * The feature id for the '<em><b>Influence</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOFTGOAL__INFLUENCE                         = 1;

    /**
     * The feature id for the '<em><b>Weighting</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOFTGOAL__WEIGHTING                         = 2;

    /**
     * The number of structural features of the '<em>Softgoal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOFTGOAL_FEATURE_COUNT                      = 3;

    /**
     * The number of operations of the '<em>Softgoal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          SOFTGOAL_OPERATION_COUNT                    = 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.ConncectionImpl <em>Conncection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.ConncectionImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getConncection()
     * @generated
     */
    int CONNCECTION = 9;

    /**
     * The number of structural features of the '<em>Conncection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNCECTION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Conncection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONNCECTION_OPERATION_COUNT = 0;

    /**
     * The feature id for the '<em><b>Feature Start</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_CONSTRAINT__FEATURE_START           = CONNCECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Feature End</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_CONSTRAINT__FEATURE_END             = CONNCECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Feature Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_CONSTRAINT_FEATURE_COUNT            = CONNCECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Feature Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          FEATURE_CONSTRAINT_OPERATION_COUNT          = CONNCECTION_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Feature Start</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          REQUIRES_FEATURE_CONSTRAINT__FEATURE_START  = FEATURE_CONSTRAINT__FEATURE_START;

    /**
     * The feature id for the '<em><b>Feature End</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          REQUIRES_FEATURE_CONSTRAINT__FEATURE_END    = FEATURE_CONSTRAINT__FEATURE_END;

    /**
     * The number of structural features of the '<em>Requires Feature Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          REQUIRES_FEATURE_CONSTRAINT_FEATURE_COUNT   = FEATURE_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Requires Feature Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          REQUIRES_FEATURE_CONSTRAINT_OPERATION_COUNT = FEATURE_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Feature Start</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          EXCLUDES_FEATURE_CONSTRAINT__FEATURE_START  = FEATURE_CONSTRAINT__FEATURE_START;

    /**
     * The feature id for the '<em><b>Feature End</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          EXCLUDES_FEATURE_CONSTRAINT__FEATURE_END    = FEATURE_CONSTRAINT__FEATURE_END;

    /**
     * The number of structural features of the '<em>Excludes Feature Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          EXCLUDES_FEATURE_CONSTRAINT_FEATURE_COUNT   = FEATURE_CONSTRAINT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Excludes Feature Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          EXCLUDES_FEATURE_CONSTRAINT_OPERATION_COUNT = FEATURE_CONSTRAINT_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Contribution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE__CONTRIBUTION                     = CONNCECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Softgoal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE__SOFTGOAL                         = CONNCECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Influence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_FEATURE_COUNT                     = CONNCECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Influence</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_OPERATION_COUNT                   = CONNCECTION_OPERATION_COUNT + 0;

    /**
     * The feature id for the '<em><b>Contribution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_FEATURE__CONTRIBUTION             = INFLUENCE__CONTRIBUTION;

    /**
     * The feature id for the '<em><b>Softgoal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_FEATURE__SOFTGOAL                 = INFLUENCE__SOFTGOAL;

    /**
     * The feature id for the '<em><b>Feature</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_FEATURE__FEATURE                  = INFLUENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Influence Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_FEATURE_FEATURE_COUNT             = INFLUENCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Influence Feature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_FEATURE_OPERATION_COUNT           = INFLUENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.InfluenceAttributeImpl <em>Influence Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.InfluenceAttributeImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getInfluenceAttribute()
     * @generated
     */
    int          INFLUENCE_ATTRIBUTE                         = 15;

    /**
     * The feature id for the '<em><b>Contribution</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_ATTRIBUTE__CONTRIBUTION           = INFLUENCE__CONTRIBUTION;

    /**
     * The feature id for the '<em><b>Softgoal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_ATTRIBUTE__SOFTGOAL               = INFLUENCE__SOFTGOAL;

    /**
     * The feature id for the '<em><b>Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_ATTRIBUTE__ATTRIBUTE              = INFLUENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Influence Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_ATTRIBUTE_FEATURE_COUNT           = INFLUENCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Influence Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int          INFLUENCE_ATTRIBUTE_OPERATION_COUNT         = INFLUENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.SingleFeatureConnectionImpl <em>Single Feature Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.SingleFeatureConnectionImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getSingleFeatureConnection()
     * @generated
     */
    int SINGLE_FEATURE_CONNECTION = 16;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_FEATURE_CONNECTION__SOURCE = CONNCECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_FEATURE_CONNECTION__TARGET = CONNCECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Single Feature Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_FEATURE_CONNECTION_FEATURE_COUNT = CONNCECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Single Feature Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_FEATURE_CONNECTION_OPERATION_COUNT = CONNCECTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.CardinalityConnectionImpl <em>Cardinality Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.CardinalityConnectionImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getCardinalityConnection()
     * @generated
     */
    int CARDINALITY_CONNECTION = 17;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_CONNECTION__SOURCE = SINGLE_FEATURE_CONNECTION__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_CONNECTION__TARGET = SINGLE_FEATURE_CONNECTION__TARGET;

    /**
     * The feature id for the '<em><b>Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_CONNECTION__MIN = SINGLE_FEATURE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_CONNECTION__MAX = SINGLE_FEATURE_CONNECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Cardinality Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_CONNECTION_FEATURE_COUNT = SINGLE_FEATURE_CONNECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Cardinality Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CARDINALITY_CONNECTION_OPERATION_COUNT = SINGLE_FEATURE_CONNECTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.MandatoryConnectionImpl <em>Mandatory Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.MandatoryConnectionImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getMandatoryConnection()
     * @generated
     */
    int MANDATORY_CONNECTION = 18;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_CONNECTION__SOURCE = SINGLE_FEATURE_CONNECTION__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_CONNECTION__TARGET = SINGLE_FEATURE_CONNECTION__TARGET;

    /**
     * The number of structural features of the '<em>Mandatory Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_CONNECTION_FEATURE_COUNT = SINGLE_FEATURE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Mandatory Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MANDATORY_CONNECTION_OPERATION_COUNT = SINGLE_FEATURE_CONNECTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.OptionalConnectionImpl <em>Optional Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.OptionalConnectionImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getOptionalConnection()
     * @generated
     */
    int OPTIONAL_CONNECTION = 19;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPTIONAL_CONNECTION__SOURCE = SINGLE_FEATURE_CONNECTION__SOURCE;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPTIONAL_CONNECTION__TARGET = SINGLE_FEATURE_CONNECTION__TARGET;

    /**
     * The number of structural features of the '<em>Optional Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPTIONAL_CONNECTION_FEATURE_COUNT = SINGLE_FEATURE_CONNECTION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Optional Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OPTIONAL_CONNECTION_OPERATION_COUNT = SINGLE_FEATURE_CONNECTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureToGroupConnectionImpl <em>Feature To Group Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FeatureToGroupConnectionImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getFeatureToGroupConnection()
     * @generated
     */
    int FEATURE_TO_GROUP_CONNECTION = 20;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_TO_GROUP_CONNECTION__SOURCE = CONNCECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_TO_GROUP_CONNECTION__TARGET = CONNCECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Feature To Group Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_TO_GROUP_CONNECTION_FEATURE_COUNT = CONNCECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Feature To Group Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FEATURE_TO_GROUP_CONNECTION_OPERATION_COUNT = CONNCECTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.GroupToFeatureConnectionImpl <em>Group To Feature Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.GroupToFeatureConnectionImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getGroupToFeatureConnection()
     * @generated
     */
    int GROUP_TO_FEATURE_CONNECTION = 21;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_TO_FEATURE_CONNECTION__SOURCE = CONNCECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_TO_FEATURE_CONNECTION__TARGET = CONNCECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Group To Feature Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_TO_FEATURE_CONNECTION_FEATURE_COUNT = CONNCECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Group To Feature Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUP_TO_FEATURE_CONNECTION_OPERATION_COUNT = CONNCECTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintConnectionImpl <em>Attribute Constraint Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintConnectionImpl
     * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getAttributeConstraintConnection()
     * @generated
     */
    int ATTRIBUTE_CONSTRAINT_CONNECTION = 22;

    /**
     * The feature id for the '<em><b>Source</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE = CONNCECTION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET = CONNCECTION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Attribute Constraint Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CONSTRAINT_CONNECTION_FEATURE_COUNT = CONNCECTION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Attribute Constraint Connection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_CONSTRAINT_CONNECTION_OPERATION_COUNT = CONNCECTION_OPERATION_COUNT + 0;

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel <em>Feature Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Feature Model</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel
     * @generated
     */
    EClass getFeatureModel();

    /**
     * Returns the meta object for the containment reference '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getRootFeature <em>Root Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Root Feature</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getRootFeature()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_RootFeature();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getGroupFeatures <em>Group Features</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Group Features</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getGroupFeatures()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_GroupFeatures();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getSolitaryFeatures <em>Solitary Features</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Solitary Features</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getSolitaryFeatures()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_SolitaryFeatures();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getFeatureGroups <em>Feature Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Feature Groups</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getFeatureGroups()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_FeatureGroups();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributes()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_Attributes();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributeConstraints <em>Attribute Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Constraints</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributeConstraints()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_AttributeConstraints();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getRequiresFeatureConstraints <em>Requires Feature Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Requires Feature Constraints</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getRequiresFeatureConstraints()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_RequiresFeatureConstraints();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getExcludesFeatureConstraints <em>Excludes Feature Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Excludes Feature Constraints</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getExcludesFeatureConstraints()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_ExcludesFeatureConstraints();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getSoftgoals <em>Softgoals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Softgoals</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getSoftgoals()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_Softgoals();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getFeatureInfluences <em>Feature Influences</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Feature Influences</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getFeatureInfluences()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_FeatureInfluences();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributeInfluences <em>Attribute Influences</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Influences</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributeInfluences()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_AttributeInfluences();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getMandatoryConnections <em>Mandatory Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Mandatory Connections</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getMandatoryConnections()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_MandatoryConnections();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getOptionalConnections <em>Optional Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Optional Connections</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getOptionalConnections()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_OptionalConnections();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getFeatureToGroupConnections <em>Feature To Group Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Feature To Group Connections</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getFeatureToGroupConnections()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_FeatureToGroupConnections();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getGroupToFeatureConnections <em>Group To Feature Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Group To Feature Connections</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getGroupToFeatureConnections()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_GroupToFeatureConnections();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributeConstraintConnections <em>Attribute Constraint Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attribute Constraint Connections</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel#getAttributeConstraintConnections()
     * @see #getFeatureModel()
     * @generated
     */
    EReference getFeatureModel_AttributeConstraintConnections();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.Feature <em>Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Feature</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature
     * @generated
     */
    EClass getFeature();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getName()
     * @see #getFeature()
     * @generated
     */
    EAttribute getFeature_Name();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.Feature#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#isSelected()
     * @see #getFeature()
     * @generated
     */
    EAttribute getFeature_Selected();

    /**
     * Returns the meta object for the reference list '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getAttributeConstraints <em>Attribute Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Attribute Constraints</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getAttributeConstraints()
     * @see #getFeature()
     * @generated
     */
    EReference getFeature_AttributeConstraints();

    /**
     * Returns the meta object for the containment reference list '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getAttributes()
     * @see #getFeature()
     * @generated
     */
    EReference getFeature_Attributes();

    /**
     * Returns the meta object for the reference list '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureConstraintsStarts <em>Feature Constraints Starts</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Feature Constraints Starts</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureConstraintsStarts()
     * @see #getFeature()
     * @generated
     */
    EReference getFeature_FeatureConstraintsStarts();

    /**
     * Returns the meta object for the reference list '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureConstraintsEnds <em>Feature Constraints Ends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Feature Constraints Ends</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureConstraintsEnds()
     * @see #getFeature()
     * @generated
     */
    EReference getFeature_FeatureConstraintsEnds();

    /**
     * Returns the meta object for the reference list '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getInfluences <em>Influences</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Influences</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getInfluences()
     * @see #getFeature()
     * @generated
     */
    EReference getFeature_Influences();

    /**
     * Returns the meta object for the reference list '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getOutgoingSingleFeatureConnections <em>Outgoing Single Feature Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outgoing Single Feature Connections</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getOutgoingSingleFeatureConnections()
     * @see #getFeature()
     * @generated
     */
    EReference getFeature_OutgoingSingleFeatureConnections();

    /**
     * Returns the meta object for the reference list '{@link eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureToGroupConnections <em>Feature To Group Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Feature To Group Connections</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature#getFeatureToGroupConnections()
     * @see #getFeature()
     * @generated
     */
    EReference getFeature_FeatureToGroupConnections();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.RootFeature <em>Root Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Root Feature</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.RootFeature
     * @generated
     */
    EClass getRootFeature();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.GroupFeature <em>Group Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Group Feature</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.GroupFeature
     * @generated
     */
    EClass getGroupFeature();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.GroupFeature#getGroupToFeatureConnection <em>Group To Feature Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Group To Feature Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.GroupFeature#getGroupToFeatureConnection()
     * @see #getGroupFeature()
     * @generated
     */
    EReference getGroupFeature_GroupToFeatureConnection();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature <em>Solitary Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Solitary Feature</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.SolitaryFeature
     * @generated
     */
    EClass getSolitaryFeature();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getMin <em>Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getMin()
     * @see #getSolitaryFeature()
     * @generated
     */
    EAttribute getSolitaryFeature_Min();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getMax()
     * @see #getSolitaryFeature()
     * @generated
     */
    EAttribute getSolitaryFeature_Max();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getIncomingSingleFeatureConnection <em>Incoming Single Feature Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Incoming Single Feature Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.SolitaryFeature#getIncomingSingleFeatureConnection()
     * @see #getSolitaryFeature()
     * @generated
     */
    EReference getSolitaryFeature_IncomingSingleFeatureConnection();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup <em>Feature Group</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Feature Group</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureGroup
     * @generated
     */
    EClass getFeatureGroup();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getMin <em>Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getMin()
     * @see #getFeatureGroup()
     * @generated
     */
    EAttribute getFeatureGroup_Min();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getMax()
     * @see #getFeatureGroup()
     * @generated
     */
    EAttribute getFeatureGroup_Max();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getFeatureToGroupConnection <em>Feature To Group Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Feature To Group Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getFeatureToGroupConnection()
     * @see #getFeatureGroup()
     * @generated
     */
    EReference getFeatureGroup_FeatureToGroupConnection();

    /**
     * Returns the meta object for the reference list '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getGroupToFeatureConnections <em>Group To Feature Connections</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Group To Feature Connections</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureGroup#getGroupToFeatureConnections()
     * @see #getFeatureGroup()
     * @generated
     */
    EReference getFeatureGroup_GroupToFeatureConnections();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraint <em>Attribute Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Constraint</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraint
     * @generated
     */
    EClass getAttributeConstraint();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraint#getEquation <em>Equation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Equation</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraint#getEquation()
     * @see #getAttributeConstraint()
     * @generated
     */
    EAttribute getAttributeConstraint_Equation();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraint#getAttributeConstraintConnection <em>Attribute Constraint Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Attribute Constraint Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraint#getAttributeConstraintConnection()
     * @see #getAttributeConstraint()
     * @generated
     */
    EReference getAttributeConstraint_AttributeConstraintConnection();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint <em>Feature Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Feature Constraint</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureConstraint
     * @generated
     */
    EClass getFeatureConstraint();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureStart <em>Feature Start</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Feature Start</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureStart()
     * @see #getFeatureConstraint()
     * @generated
     */
    EReference getFeatureConstraint_FeatureStart();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureEnd <em>Feature End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Feature End</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureConstraint#getFeatureEnd()
     * @see #getFeatureConstraint()
     * @generated
     */
    EReference getFeatureConstraint_FeatureEnd();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.RequiresFeatureConstraint <em>Requires Feature Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Requires Feature Constraint</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.RequiresFeatureConstraint
     * @generated
     */
    EClass getRequiresFeatureConstraint();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.ExcludesFeatureConstraint <em>Excludes Feature Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Excludes Feature Constraint</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.ExcludesFeatureConstraint
     * @generated
     */
    EClass getExcludesFeatureConstraint();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Attribute#getName()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Name();

    /**
     * Returns the meta object for the reference list '{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getInfluences <em>Influences</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Influences</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Attribute#getInfluences()
     * @see #getAttribute()
     * @generated
     */
    EReference getAttribute_Influences();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Attribute#getValue()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Value();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getMin <em>Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Attribute#getMin()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Min();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.Attribute#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Attribute#getMax()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Max();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.InfluenceFeature <em>Influence Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Influence Feature</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.InfluenceFeature
     * @generated
     */
    EClass getInfluenceFeature();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.InfluenceFeature#getFeature <em>Feature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Feature</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.InfluenceFeature#getFeature()
     * @see #getInfluenceFeature()
     * @generated
     */
    EReference getInfluenceFeature_Feature();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.Softgoal <em>Softgoal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Softgoal</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Softgoal
     * @generated
     */
    EClass getSoftgoal();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.Softgoal#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Softgoal#getName()
     * @see #getSoftgoal()
     * @generated
     */
    EAttribute getSoftgoal_Name();

    /**
     * Returns the meta object for the reference list '{@link eu.cloudwave.ude.fcore.FCORE.Softgoal#getInfluence <em>Influence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Influence</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Softgoal#getInfluence()
     * @see #getSoftgoal()
     * @generated
     */
    EReference getSoftgoal_Influence();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.Softgoal#getWeighting <em>Weighting</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Weighting</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Softgoal#getWeighting()
     * @see #getSoftgoal()
     * @generated
     */
    EAttribute getSoftgoal_Weighting();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.Conncection <em>Conncection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conncection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Conncection
     * @generated
     */
    EClass getConncection();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.Influence <em>Influence</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Influence</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Influence
     * @generated
     */
    EClass getInfluence();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.Influence#getContribution <em>Contribution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Contribution</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Influence#getContribution()
     * @see #getInfluence()
     * @generated
     */
    EAttribute getInfluence_Contribution();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.Influence#getSoftgoal <em>Softgoal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Softgoal</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.Influence#getSoftgoal()
     * @see #getInfluence()
     * @generated
     */
    EReference getInfluence_Softgoal();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute <em>Influence Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Influence Attribute</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute
     * @generated
     */
    EClass getInfluenceAttribute();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute#getAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Attribute</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute#getAttribute()
     * @see #getInfluenceAttribute()
     * @generated
     */
    EReference getInfluenceAttribute_Attribute();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection <em>Single Feature Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Single Feature Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection
     * @generated
     */
    EClass getSingleFeatureConnection();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getSource()
     * @see #getSingleFeatureConnection()
     * @generated
     */
    EReference getSingleFeatureConnection_Source();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection#getTarget()
     * @see #getSingleFeatureConnection()
     * @generated
     */
    EReference getSingleFeatureConnection_Target();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.CardinalityConnection <em>Cardinality Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Cardinality Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.CardinalityConnection
     * @generated
     */
    EClass getCardinalityConnection();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.CardinalityConnection#getMin <em>Min</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.CardinalityConnection#getMin()
     * @see #getCardinalityConnection()
     * @generated
     */
    EAttribute getCardinalityConnection_Min();

    /**
     * Returns the meta object for the attribute '{@link eu.cloudwave.ude.fcore.FCORE.CardinalityConnection#getMax <em>Max</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.CardinalityConnection#getMax()
     * @see #getCardinalityConnection()
     * @generated
     */
    EAttribute getCardinalityConnection_Max();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.MandatoryConnection <em>Mandatory Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Mandatory Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.MandatoryConnection
     * @generated
     */
    EClass getMandatoryConnection();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.OptionalConnection <em>Optional Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Optional Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.OptionalConnection
     * @generated
     */
    EClass getOptionalConnection();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection <em>Feature To Group Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Feature To Group Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection
     * @generated
     */
    EClass getFeatureToGroupConnection();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getSource()
     * @see #getFeatureToGroupConnection()
     * @generated
     */
    EReference getFeatureToGroupConnection_Source();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection#getTarget()
     * @see #getFeatureToGroupConnection()
     * @generated
     */
    EReference getFeatureToGroupConnection_Target();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection <em>Group To Feature Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Group To Feature Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection
     * @generated
     */
    EClass getGroupToFeatureConnection();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getSource()
     * @see #getGroupToFeatureConnection()
     * @generated
     */
    EReference getGroupToFeatureConnection_Source();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection#getTarget()
     * @see #getGroupToFeatureConnection()
     * @generated
     */
    EReference getGroupToFeatureConnection_Target();

    /**
     * Returns the meta object for class '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection <em>Attribute Constraint Connection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Constraint Connection</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection
     * @generated
     */
    EClass getAttributeConstraintConnection();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Source</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getSource()
     * @see #getAttributeConstraintConnection()
     * @generated
     */
    EReference getAttributeConstraintConnection_Source();

    /**
     * Returns the meta object for the reference '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection#getTarget()
     * @see #getAttributeConstraintConnection()
     * @generated
     */
    EReference getAttributeConstraintConnection_Target();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    FCOREFactory getFCOREFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl <em>Feature Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getFeatureModel()
         * @generated
         */
        EClass     FEATURE_MODEL                      = eINSTANCE.getFeatureModel();

        /**
         * The meta object literal for the '<em><b>Root Feature</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__ROOT_FEATURE        = eINSTANCE.getFeatureModel_RootFeature();

        /**
         * The meta object literal for the '<em><b>Group Features</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__GROUP_FEATURES = eINSTANCE.getFeatureModel_GroupFeatures();

        /**
         * The meta object literal for the '<em><b>Solitary Features</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__SOLITARY_FEATURES = eINSTANCE.getFeatureModel_SolitaryFeatures();

        /**
         * The meta object literal for the '<em><b>Feature Groups</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__FEATURE_GROUPS = eINSTANCE.getFeatureModel_FeatureGroups();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__ATTRIBUTES = eINSTANCE.getFeatureModel_Attributes();

        /**
         * The meta object literal for the '<em><b>Attribute Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__ATTRIBUTE_CONSTRAINTS = eINSTANCE.getFeatureModel_AttributeConstraints();

        /**
         * The meta object literal for the '<em><b>Requires Feature Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__REQUIRES_FEATURE_CONSTRAINTS = eINSTANCE.getFeatureModel_RequiresFeatureConstraints();

        /**
         * The meta object literal for the '<em><b>Excludes Feature Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__EXCLUDES_FEATURE_CONSTRAINTS = eINSTANCE.getFeatureModel_ExcludesFeatureConstraints();

        /**
         * The meta object literal for the '<em><b>Softgoals</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__SOFTGOALS           = eINSTANCE.getFeatureModel_Softgoals();

        /**
         * The meta object literal for the '<em><b>Feature Influences</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__FEATURE_INFLUENCES = eINSTANCE.getFeatureModel_FeatureInfluences();

        /**
         * The meta object literal for the '<em><b>Attribute Influences</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__ATTRIBUTE_INFLUENCES = eINSTANCE.getFeatureModel_AttributeInfluences();

        /**
         * The meta object literal for the '<em><b>Mandatory Connections</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__MANDATORY_CONNECTIONS = eINSTANCE.getFeatureModel_MandatoryConnections();

        /**
         * The meta object literal for the '<em><b>Optional Connections</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__OPTIONAL_CONNECTIONS = eINSTANCE.getFeatureModel_OptionalConnections();

        /**
         * The meta object literal for the '<em><b>Feature To Group Connections</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__FEATURE_TO_GROUP_CONNECTIONS = eINSTANCE.getFeatureModel_FeatureToGroupConnections();

        /**
         * The meta object literal for the '<em><b>Group To Feature Connections</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__GROUP_TO_FEATURE_CONNECTIONS = eINSTANCE.getFeatureModel_GroupToFeatureConnections();

        /**
         * The meta object literal for the '<em><b>Attribute Constraint Connections</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_MODEL__ATTRIBUTE_CONSTRAINT_CONNECTIONS = eINSTANCE.getFeatureModel_AttributeConstraintConnections();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl <em>Feature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getFeature()
         * @generated
         */
        EClass     FEATURE                            = eINSTANCE.getFeature();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE__NAME                      = eINSTANCE.getFeature_Name();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE__SELECTED                  = eINSTANCE.getFeature_Selected();

        /**
         * The meta object literal for the '<em><b>Attribute Constraints</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE__ATTRIBUTE_CONSTRAINTS     = eINSTANCE.getFeature_AttributeConstraints();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE__ATTRIBUTES                = eINSTANCE.getFeature_Attributes();

        /**
         * The meta object literal for the '<em><b>Feature Constraints Starts</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE__FEATURE_CONSTRAINTS_STARTS = eINSTANCE.getFeature_FeatureConstraintsStarts();

        /**
         * The meta object literal for the '<em><b>Feature Constraints Ends</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE__FEATURE_CONSTRAINTS_ENDS = eINSTANCE.getFeature_FeatureConstraintsEnds();

        /**
         * The meta object literal for the '<em><b>Influences</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE__INFLUENCES                = eINSTANCE.getFeature_Influences();

        /**
         * The meta object literal for the '<em><b>Outgoing Single Feature Connections</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS = eINSTANCE.getFeature_OutgoingSingleFeatureConnections();

        /**
         * The meta object literal for the '<em><b>Feature To Group Connections</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE__FEATURE_TO_GROUP_CONNECTIONS = eINSTANCE.getFeature_FeatureToGroupConnections();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.RootFeatureImpl <em>Root Feature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.RootFeatureImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getRootFeature()
         * @generated
         */
        EClass     ROOT_FEATURE                       = eINSTANCE.getRootFeature();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.GroupFeatureImpl <em>Group Feature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.GroupFeatureImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getGroupFeature()
         * @generated
         */
        EClass     GROUP_FEATURE                      = eINSTANCE.getGroupFeature();

        /**
         * The meta object literal for the '<em><b>Group To Feature Connection</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION = eINSTANCE.getGroupFeature_GroupToFeatureConnection();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.SolitaryFeatureImpl <em>Solitary Feature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.SolitaryFeatureImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getSolitaryFeature()
         * @generated
         */
        EClass     SOLITARY_FEATURE                   = eINSTANCE.getSolitaryFeature();

        /**
         * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOLITARY_FEATURE__MIN              = eINSTANCE.getSolitaryFeature_Min();

        /**
         * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOLITARY_FEATURE__MAX              = eINSTANCE.getSolitaryFeature_Max();

        /**
         * The meta object literal for the '<em><b>Incoming Single Feature Connection</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION = eINSTANCE.getSolitaryFeature_IncomingSingleFeatureConnection();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureGroupImpl <em>Feature Group</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FeatureGroupImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getFeatureGroup()
         * @generated
         */
        EClass     FEATURE_GROUP                      = eINSTANCE.getFeatureGroup();

        /**
         * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE_GROUP__MIN                 = eINSTANCE.getFeatureGroup_Min();

        /**
         * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FEATURE_GROUP__MAX                 = eINSTANCE.getFeatureGroup_Max();

        /**
         * The meta object literal for the '<em><b>Feature To Group Connection</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION = eINSTANCE.getFeatureGroup_FeatureToGroupConnection();

        /**
         * The meta object literal for the '<em><b>Group To Feature Connections</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS = eINSTANCE.getFeatureGroup_GroupToFeatureConnections();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getAttributeConstraint()
         * @generated
         */
        EClass     ATTRIBUTE_CONSTRAINT               = eINSTANCE.getAttributeConstraint();

        /**
         * The meta object literal for the '<em><b>Equation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE_CONSTRAINT__EQUATION     = eINSTANCE.getAttributeConstraint_Equation();

        /**
         * The meta object literal for the '<em><b>Attribute Constraint Connection</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION = eINSTANCE.getAttributeConstraint_AttributeConstraintConnection();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureConstraintImpl <em>Feature Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FeatureConstraintImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getFeatureConstraint()
         * @generated
         */
        EClass     FEATURE_CONSTRAINT                 = eINSTANCE.getFeatureConstraint();

        /**
         * The meta object literal for the '<em><b>Feature Start</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_CONSTRAINT__FEATURE_START  = eINSTANCE.getFeatureConstraint_FeatureStart();

        /**
         * The meta object literal for the '<em><b>Feature End</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_CONSTRAINT__FEATURE_END    = eINSTANCE.getFeatureConstraint_FeatureEnd();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.RequiresFeatureConstraintImpl <em>Requires Feature Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.RequiresFeatureConstraintImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getRequiresFeatureConstraint()
         * @generated
         */
        EClass     REQUIRES_FEATURE_CONSTRAINT        = eINSTANCE.getRequiresFeatureConstraint();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.ExcludesFeatureConstraintImpl <em>Excludes Feature Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.ExcludesFeatureConstraintImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getExcludesFeatureConstraint()
         * @generated
         */
        EClass     EXCLUDES_FEATURE_CONSTRAINT        = eINSTANCE.getExcludesFeatureConstraint();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.AttributeImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getAttribute()
         * @generated
         */
        EClass     ATTRIBUTE                          = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__NAME                    = eINSTANCE.getAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Influences</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE__INFLUENCES              = eINSTANCE.getAttribute_Influences();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__VALUE                   = eINSTANCE.getAttribute_Value();

        /**
         * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__MIN                     = eINSTANCE.getAttribute_Min();

        /**
         * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__MAX                     = eINSTANCE.getAttribute_Max();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.InfluenceFeatureImpl <em>Influence Feature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.InfluenceFeatureImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getInfluenceFeature()
         * @generated
         */
        EClass     INFLUENCE_FEATURE                  = eINSTANCE.getInfluenceFeature();

        /**
         * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INFLUENCE_FEATURE__FEATURE         = eINSTANCE.getInfluenceFeature_Feature();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.SoftgoalImpl <em>Softgoal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.SoftgoalImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getSoftgoal()
         * @generated
         */
        EClass     SOFTGOAL                           = eINSTANCE.getSoftgoal();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOFTGOAL__NAME                     = eINSTANCE.getSoftgoal_Name();

        /**
         * The meta object literal for the '<em><b>Influence</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SOFTGOAL__INFLUENCE                = eINSTANCE.getSoftgoal_Influence();

        /**
         * The meta object literal for the '<em><b>Weighting</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SOFTGOAL__WEIGHTING                = eINSTANCE.getSoftgoal_Weighting();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.ConncectionImpl <em>Conncection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.ConncectionImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getConncection()
         * @generated
         */
        EClass CONNCECTION = eINSTANCE.getConncection();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.InfluenceImpl <em>Influence</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.InfluenceImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getInfluence()
         * @generated
         */
        EClass     INFLUENCE                          = eINSTANCE.getInfluence();

        /**
         * The meta object literal for the '<em><b>Contribution</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INFLUENCE__CONTRIBUTION            = eINSTANCE.getInfluence_Contribution();

        /**
         * The meta object literal for the '<em><b>Softgoal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INFLUENCE__SOFTGOAL                = eINSTANCE.getInfluence_Softgoal();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.InfluenceAttributeImpl <em>Influence Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.InfluenceAttributeImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getInfluenceAttribute()
         * @generated
         */
        EClass     INFLUENCE_ATTRIBUTE                = eINSTANCE.getInfluenceAttribute();

        /**
         * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INFLUENCE_ATTRIBUTE__ATTRIBUTE     = eINSTANCE.getInfluenceAttribute_Attribute();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.SingleFeatureConnectionImpl <em>Single Feature Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.SingleFeatureConnectionImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getSingleFeatureConnection()
         * @generated
         */
        EClass SINGLE_FEATURE_CONNECTION = eINSTANCE.getSingleFeatureConnection();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_FEATURE_CONNECTION__SOURCE = eINSTANCE.getSingleFeatureConnection_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_FEATURE_CONNECTION__TARGET = eINSTANCE.getSingleFeatureConnection_Target();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.CardinalityConnectionImpl <em>Cardinality Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.CardinalityConnectionImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getCardinalityConnection()
         * @generated
         */
        EClass CARDINALITY_CONNECTION = eINSTANCE.getCardinalityConnection();

        /**
         * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CARDINALITY_CONNECTION__MIN = eINSTANCE.getCardinalityConnection_Min();

        /**
         * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CARDINALITY_CONNECTION__MAX = eINSTANCE.getCardinalityConnection_Max();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.MandatoryConnectionImpl <em>Mandatory Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.MandatoryConnectionImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getMandatoryConnection()
         * @generated
         */
        EClass MANDATORY_CONNECTION = eINSTANCE.getMandatoryConnection();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.OptionalConnectionImpl <em>Optional Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.OptionalConnectionImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getOptionalConnection()
         * @generated
         */
        EClass OPTIONAL_CONNECTION = eINSTANCE.getOptionalConnection();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureToGroupConnectionImpl <em>Feature To Group Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FeatureToGroupConnectionImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getFeatureToGroupConnection()
         * @generated
         */
        EClass FEATURE_TO_GROUP_CONNECTION = eINSTANCE.getFeatureToGroupConnection();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_TO_GROUP_CONNECTION__SOURCE = eINSTANCE.getFeatureToGroupConnection_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FEATURE_TO_GROUP_CONNECTION__TARGET = eINSTANCE.getFeatureToGroupConnection_Target();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.GroupToFeatureConnectionImpl <em>Group To Feature Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.GroupToFeatureConnectionImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getGroupToFeatureConnection()
         * @generated
         */
        EClass GROUP_TO_FEATURE_CONNECTION = eINSTANCE.getGroupToFeatureConnection();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP_TO_FEATURE_CONNECTION__SOURCE = eINSTANCE.getGroupToFeatureConnection_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GROUP_TO_FEATURE_CONNECTION__TARGET = eINSTANCE.getGroupToFeatureConnection_Target();

        /**
         * The meta object literal for the '{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintConnectionImpl <em>Attribute Constraint Connection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintConnectionImpl
         * @see eu.cloudwave.ude.fcore.FCORE.impl.FCOREPackageImpl#getAttributeConstraintConnection()
         * @generated
         */
        EClass ATTRIBUTE_CONSTRAINT_CONNECTION = eINSTANCE.getAttributeConstraintConnection();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE = eINSTANCE.getAttributeConstraintConnection_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET = eINSTANCE.getAttributeConstraintConnection_Target();

    }

}
