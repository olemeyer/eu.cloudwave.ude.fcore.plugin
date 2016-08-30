/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.AttributeConstraint;
import eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection;
import eu.cloudwave.ude.fcore.FCORE.CardinalityConnection;
import eu.cloudwave.ude.fcore.FCORE.ExcludesFeatureConstraint;
import eu.cloudwave.ude.fcore.FCORE.FCOREFactory;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.FCORE.FeatureGroup;
import eu.cloudwave.ude.fcore.FCORE.FeatureModel;
import eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection;
import eu.cloudwave.ude.fcore.FCORE.GroupFeature;
import eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection;
import eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute;
import eu.cloudwave.ude.fcore.FCORE.InfluenceFeature;
import eu.cloudwave.ude.fcore.FCORE.MandatoryConnection;
import eu.cloudwave.ude.fcore.FCORE.OptionalConnection;
import eu.cloudwave.ude.fcore.FCORE.RequiresFeatureConstraint;
import eu.cloudwave.ude.fcore.FCORE.RootFeature;
import eu.cloudwave.ude.fcore.FCORE.Softgoal;
import eu.cloudwave.ude.fcore.FCORE.SolitaryFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class FCOREFactoryImpl extends EFactoryImpl implements FCOREFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public static FCOREFactory init() {
        try {
            FCOREFactory theFCOREFactory = (FCOREFactory) EPackage.Registry.INSTANCE.getEFactory(FCOREPackage.eNS_URI);
            if (theFCOREFactory != null) {
                return theFCOREFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new FCOREFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public FCOREFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case FCOREPackage.FEATURE_MODEL:
            return createFeatureModel();
        case FCOREPackage.ROOT_FEATURE:
            return createRootFeature();
        case FCOREPackage.SOLITARY_FEATURE:
            return createSolitaryFeature();
        case FCOREPackage.GROUP_FEATURE:
            return createGroupFeature();
        case FCOREPackage.FEATURE_GROUP:
            return createFeatureGroup();
        case FCOREPackage.ATTRIBUTE:
            return createAttribute();
        case FCOREPackage.ATTRIBUTE_CONSTRAINT:
            return createAttributeConstraint();
        case FCOREPackage.SOFTGOAL:
            return createSoftgoal();
        case FCOREPackage.REQUIRES_FEATURE_CONSTRAINT:
            return createRequiresFeatureConstraint();
        case FCOREPackage.EXCLUDES_FEATURE_CONSTRAINT:
            return createExcludesFeatureConstraint();
        case FCOREPackage.INFLUENCE_FEATURE:
            return createInfluenceFeature();
        case FCOREPackage.INFLUENCE_ATTRIBUTE:
            return createInfluenceAttribute();
        case FCOREPackage.CARDINALITY_CONNECTION:
            return createCardinalityConnection();
        case FCOREPackage.MANDATORY_CONNECTION:
            return createMandatoryConnection();
        case FCOREPackage.OPTIONAL_CONNECTION:
            return createOptionalConnection();
        case FCOREPackage.FEATURE_TO_GROUP_CONNECTION:
            return createFeatureToGroupConnection();
        case FCOREPackage.GROUP_TO_FEATURE_CONNECTION:
            return createGroupToFeatureConnection();
        case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION:
            return createAttributeConstraintConnection();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureModel createFeatureModel() {
        FeatureModelImpl featureModel = new FeatureModelImpl();
        return featureModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public RootFeature createRootFeature() {
        RootFeatureImpl rootFeature = new RootFeatureImpl();
        return rootFeature;
    }

    /**
     * @generated NOT
     */
    public RootFeature createRootFeature(String name) {
        RootFeatureImpl rootFeature = new RootFeatureImpl();
        rootFeature.setName(name);
        return rootFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public GroupFeature createGroupFeature() {
        GroupFeatureImpl groupFeature = new GroupFeatureImpl();
        return groupFeature;
    }

    /**
     * @generated NOT
     */
    public GroupFeature createGroupFeature(String name) {
        GroupFeatureImpl groupFeature = new GroupFeatureImpl();
        groupFeature.setName(name);
        return groupFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public SolitaryFeature createSolitaryFeature() {
        SolitaryFeatureImpl solitaryFeature = new SolitaryFeatureImpl();
        return solitaryFeature;
    }

    /**
     * 
     * @generated NOT
     */
    @Override
    public SolitaryFeature createSolitaryFeature(String name, int min, int max) {
        SolitaryFeatureImpl solitaryFeature = new SolitaryFeatureImpl();
        solitaryFeature.setName(name);
        solitaryFeature.setMin(min);
        solitaryFeature.setMax(max);
        return solitaryFeature;
    }

    /**
     * 
     * @generated NOT
     */
    @Override
    public SolitaryFeature createSolitaryFeature(String name) {
        SolitaryFeatureImpl solitaryFeature = new SolitaryFeatureImpl();
        solitaryFeature.setName(name);
        return solitaryFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureGroup createFeatureGroup() {
        FeatureGroupImpl featureGroup = new FeatureGroupImpl();
        return featureGroup;
    }

    /**
     * @generated NOT
     */
    public FeatureGroup createFeatureGroup(int min, int max) {
        FeatureGroupImpl featureGroup = new FeatureGroupImpl();
        featureGroup.setMin(min);
        featureGroup.setMax(max);
        return featureGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public AttributeConstraint createAttributeConstraint() {
        AttributeConstraintImpl attributeConstraint = new AttributeConstraintImpl();
        return attributeConstraint;
    }

    /**
     * @generated NOT
     */
    public AttributeConstraint createAttributeConstraint(String equation) {
        AttributeConstraintImpl attributeConstraint = new AttributeConstraintImpl();
        attributeConstraint.setEquation(equation);
        return attributeConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public RequiresFeatureConstraint createRequiresFeatureConstraint() {
        RequiresFeatureConstraintImpl requiresFeatureConstraint = new RequiresFeatureConstraintImpl();
        return requiresFeatureConstraint;
    }

    /**
     * @generated NOT
     */
    public RequiresFeatureConstraint createRequiresFeatureConstraint(Feature from, Feature to) {
        RequiresFeatureConstraintImpl requiresFeatureConstraint = new RequiresFeatureConstraintImpl();
        requiresFeatureConstraint.setFeatureStart(from);
        requiresFeatureConstraint.setFeatureEnd(to);
        return requiresFeatureConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public ExcludesFeatureConstraint createExcludesFeatureConstraint() {
        ExcludesFeatureConstraintImpl excludesFeatureConstraint = new ExcludesFeatureConstraintImpl();
        return excludesFeatureConstraint;
    }

    /**
     * @generated NOT
     */
    public ExcludesFeatureConstraint createExcludesFeatureConstraint(Feature from, Feature to) {
        ExcludesFeatureConstraintImpl excludesFeatureConstraint = new ExcludesFeatureConstraintImpl();
        excludesFeatureConstraint.setFeatureStart(from);
        excludesFeatureConstraint.setFeatureEnd(to);
        return excludesFeatureConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

    /**
     * @generated NOT
     */
    public Attribute createAttribute(String name) {
        AttributeImpl attribute = new AttributeImpl();
        attribute.setName(name);
        return attribute;
    }

    /**
     * @generated NOT
     */
    public Attribute createAttribute(String name, int min, int max) {
        AttributeImpl attribute = new AttributeImpl();
        attribute.setName(name);
        attribute.setMin(min);
        attribute.setMax(max);
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public InfluenceFeature createInfluenceFeature() {
        InfluenceFeatureImpl influenceFeature = new InfluenceFeatureImpl();
        return influenceFeature;
    }

    /**
     * @generated NOT
     */
    public InfluenceFeature createInfluenceFeature(float contribution, Softgoal softgoal) {
        InfluenceFeatureImpl influenceFeature = new InfluenceFeatureImpl();
        influenceFeature.setContribution(contribution);
        influenceFeature.setSoftgoal(softgoal);
        return influenceFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public Softgoal createSoftgoal() {
        SoftgoalImpl softgoal = new SoftgoalImpl();
        return softgoal;
    }

    /**
     * @generated NOT
     */
    public Softgoal createSoftgoal(String name) {
        SoftgoalImpl softgoal = new SoftgoalImpl();
        softgoal.setName(name);
        return softgoal;
    }

    /**
     * @generated NOT
     */
    public Softgoal createSoftgoal(String name, String weighting) {
        SoftgoalImpl softgoal = new SoftgoalImpl();
        softgoal.setName(name);
        softgoal.setWeighting(weighting);
        return softgoal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public InfluenceAttribute createInfluenceAttribute() {
        InfluenceAttributeImpl influenceAttribute = new InfluenceAttributeImpl();
        return influenceAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public CardinalityConnection createCardinalityConnection() {
        CardinalityConnectionImpl cardinalityConnection = new CardinalityConnectionImpl();
        return cardinalityConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public MandatoryConnection createMandatoryConnection() {
        MandatoryConnectionImpl mandatoryConnection = new MandatoryConnectionImpl();
        return mandatoryConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public OptionalConnection createOptionalConnection() {
        OptionalConnectionImpl optionalConnection = new OptionalConnectionImpl();
        return optionalConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public FeatureToGroupConnection createFeatureToGroupConnection() {
        FeatureToGroupConnectionImpl featureToGroupConnection = new FeatureToGroupConnectionImpl();
        return featureToGroupConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public GroupToFeatureConnection createGroupToFeatureConnection() {
        GroupToFeatureConnectionImpl groupToFeatureConnection = new GroupToFeatureConnectionImpl();
        return groupToFeatureConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public AttributeConstraintConnection createAttributeConstraintConnection() {
        AttributeConstraintConnectionImpl attributeConstraintConnection = new AttributeConstraintConnectionImpl();
        return attributeConstraintConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public FCOREPackage getFCOREPackage() {
        return (FCOREPackage) getEPackage();
    }

    /**
     * @generated NOT
     */
    public InfluenceAttribute createInfluenceAttribute(float contribution, Softgoal softgoal) {
        InfluenceAttributeImpl influenceAttribute = new InfluenceAttributeImpl();
        influenceAttribute.setContribution(contribution);
        influenceAttribute.setSoftgoal(softgoal);
        return influenceAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static FCOREPackage getPackage() {
        return FCOREPackage.eINSTANCE;
    }

} //FCOREFactoryImpl
