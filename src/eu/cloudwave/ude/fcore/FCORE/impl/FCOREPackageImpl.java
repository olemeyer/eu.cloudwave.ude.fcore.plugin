/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.AttributeConstraint;
import eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection;
import eu.cloudwave.ude.fcore.FCORE.CardinalityConnection;
import eu.cloudwave.ude.fcore.FCORE.Conncection;
import eu.cloudwave.ude.fcore.FCORE.ExcludesFeatureConstraint;
import eu.cloudwave.ude.fcore.FCORE.FCOREFactory;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.FCORE.FeatureConstraint;
import eu.cloudwave.ude.fcore.FCORE.FeatureGroup;
import eu.cloudwave.ude.fcore.FCORE.FeatureModel;
import eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection;
import eu.cloudwave.ude.fcore.FCORE.GroupFeature;
import eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection;
import eu.cloudwave.ude.fcore.FCORE.Influence;
import eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute;
import eu.cloudwave.ude.fcore.FCORE.InfluenceFeature;
import eu.cloudwave.ude.fcore.FCORE.MandatoryConnection;
import eu.cloudwave.ude.fcore.FCORE.OptionalConnection;
import eu.cloudwave.ude.fcore.FCORE.RequiresFeatureConstraint;
import eu.cloudwave.ude.fcore.FCORE.RootFeature;
import eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection;
import eu.cloudwave.ude.fcore.FCORE.Softgoal;
import eu.cloudwave.ude.fcore.FCORE.SolitaryFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FCOREPackageImpl extends EPackageImpl implements FCOREPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass featureModelEClass              = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass featureEClass                   = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rootFeatureEClass               = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass groupFeatureEClass              = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass solitaryFeatureEClass           = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass featureGroupEClass              = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeConstraintEClass       = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass featureConstraintEClass         = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass requiresFeatureConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass excludesFeatureConstraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeEClass                 = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass influenceFeatureEClass          = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass softgoalEClass                  = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conncectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass influenceEClass                 = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass influenceAttributeEClass        = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass singleFeatureConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cardinalityConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass mandatoryConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass optionalConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass featureToGroupConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass groupToFeatureConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeConstraintConnectionEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private FCOREPackageImpl() {
        super(eNS_URI, FCOREFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link FCOREPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static FCOREPackage init() {
        if (isInited) return (FCOREPackage)EPackage.Registry.INSTANCE.getEPackage(FCOREPackage.eNS_URI);

        // Obtain or create and register package
        FCOREPackageImpl theFCOREPackage = (FCOREPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FCOREPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FCOREPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theFCOREPackage.createPackageContents();

        // Initialize created meta-data
        theFCOREPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theFCOREPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(FCOREPackage.eNS_URI, theFCOREPackage);
        return theFCOREPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFeatureModel() {
        return featureModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_RootFeature() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_GroupFeatures() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_SolitaryFeatures() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_FeatureGroups() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_Attributes() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_AttributeConstraints() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_RequiresFeatureConstraints() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_ExcludesFeatureConstraints() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_Softgoals() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_FeatureInfluences() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_AttributeInfluences() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_MandatoryConnections() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_OptionalConnections() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_FeatureToGroupConnections() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_GroupToFeatureConnections() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureModel_AttributeConstraintConnections() {
        return (EReference)featureModelEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFeature() {
        return featureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFeature_Name() {
        return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFeature_Selected() {
        return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeature_AttributeConstraints() {
        return (EReference)featureEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeature_Attributes() {
        return (EReference)featureEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeature_FeatureConstraintsStarts() {
        return (EReference)featureEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeature_FeatureConstraintsEnds() {
        return (EReference)featureEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeature_Influences() {
        return (EReference)featureEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeature_OutgoingSingleFeatureConnections() {
        return (EReference)featureEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeature_FeatureToGroupConnections() {
        return (EReference)featureEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRootFeature() {
        return rootFeatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGroupFeature() {
        return groupFeatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroupFeature_GroupToFeatureConnection() {
        return (EReference)groupFeatureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSolitaryFeature() {
        return solitaryFeatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSolitaryFeature_Min() {
        return (EAttribute)solitaryFeatureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSolitaryFeature_Max() {
        return (EAttribute)solitaryFeatureEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSolitaryFeature_IncomingSingleFeatureConnection() {
        return (EReference)solitaryFeatureEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFeatureGroup() {
        return featureGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFeatureGroup_Min() {
        return (EAttribute)featureGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFeatureGroup_Max() {
        return (EAttribute)featureGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureGroup_FeatureToGroupConnection() {
        return (EReference)featureGroupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureGroup_GroupToFeatureConnections() {
        return (EReference)featureGroupEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeConstraint() {
        return attributeConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeConstraint_Equation() {
        return (EAttribute)attributeConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeConstraint_AttributeConstraintConnection() {
        return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFeatureConstraint() {
        return featureConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureConstraint_FeatureStart() {
        return (EReference)featureConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureConstraint_FeatureEnd() {
        return (EReference)featureConstraintEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRequiresFeatureConstraint() {
        return requiresFeatureConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExcludesFeatureConstraint() {
        return excludesFeatureConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttribute() {
        return attributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Name() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttribute_Influences() {
        return (EReference)attributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Value() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Min() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Max() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInfluenceFeature() {
        return influenceFeatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInfluenceFeature_Feature() {
        return (EReference)influenceFeatureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSoftgoal() {
        return softgoalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSoftgoal_Name() {
        return (EAttribute)softgoalEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSoftgoal_Influence() {
        return (EReference)softgoalEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSoftgoal_Weighting() {
        return (EAttribute)softgoalEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConncection() {
        return conncectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInfluence() {
        return influenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInfluence_Contribution() {
        return (EAttribute)influenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInfluence_Softgoal() {
        return (EReference)influenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInfluenceAttribute() {
        return influenceAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInfluenceAttribute_Attribute() {
        return (EReference)influenceAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSingleFeatureConnection() {
        return singleFeatureConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleFeatureConnection_Source() {
        return (EReference)singleFeatureConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleFeatureConnection_Target() {
        return (EReference)singleFeatureConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCardinalityConnection() {
        return cardinalityConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCardinalityConnection_Min() {
        return (EAttribute)cardinalityConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCardinalityConnection_Max() {
        return (EAttribute)cardinalityConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMandatoryConnection() {
        return mandatoryConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOptionalConnection() {
        return optionalConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFeatureToGroupConnection() {
        return featureToGroupConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureToGroupConnection_Source() {
        return (EReference)featureToGroupConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFeatureToGroupConnection_Target() {
        return (EReference)featureToGroupConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGroupToFeatureConnection() {
        return groupToFeatureConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroupToFeatureConnection_Source() {
        return (EReference)groupToFeatureConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroupToFeatureConnection_Target() {
        return (EReference)groupToFeatureConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeConstraintConnection() {
        return attributeConstraintConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeConstraintConnection_Source() {
        return (EReference)attributeConstraintConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeConstraintConnection_Target() {
        return (EReference)attributeConstraintConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FCOREFactory getFCOREFactory() {
        return (FCOREFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        featureModelEClass = createEClass(FEATURE_MODEL);
        createEReference(featureModelEClass, FEATURE_MODEL__ROOT_FEATURE);
        createEReference(featureModelEClass, FEATURE_MODEL__GROUP_FEATURES);
        createEReference(featureModelEClass, FEATURE_MODEL__SOLITARY_FEATURES);
        createEReference(featureModelEClass, FEATURE_MODEL__FEATURE_GROUPS);
        createEReference(featureModelEClass, FEATURE_MODEL__ATTRIBUTES);
        createEReference(featureModelEClass, FEATURE_MODEL__ATTRIBUTE_CONSTRAINTS);
        createEReference(featureModelEClass, FEATURE_MODEL__REQUIRES_FEATURE_CONSTRAINTS);
        createEReference(featureModelEClass, FEATURE_MODEL__EXCLUDES_FEATURE_CONSTRAINTS);
        createEReference(featureModelEClass, FEATURE_MODEL__SOFTGOALS);
        createEReference(featureModelEClass, FEATURE_MODEL__FEATURE_INFLUENCES);
        createEReference(featureModelEClass, FEATURE_MODEL__ATTRIBUTE_INFLUENCES);
        createEReference(featureModelEClass, FEATURE_MODEL__MANDATORY_CONNECTIONS);
        createEReference(featureModelEClass, FEATURE_MODEL__OPTIONAL_CONNECTIONS);
        createEReference(featureModelEClass, FEATURE_MODEL__FEATURE_TO_GROUP_CONNECTIONS);
        createEReference(featureModelEClass, FEATURE_MODEL__GROUP_TO_FEATURE_CONNECTIONS);
        createEReference(featureModelEClass, FEATURE_MODEL__ATTRIBUTE_CONSTRAINT_CONNECTIONS);

        featureEClass = createEClass(FEATURE);
        createEAttribute(featureEClass, FEATURE__NAME);
        createEAttribute(featureEClass, FEATURE__SELECTED);
        createEReference(featureEClass, FEATURE__ATTRIBUTE_CONSTRAINTS);
        createEReference(featureEClass, FEATURE__ATTRIBUTES);
        createEReference(featureEClass, FEATURE__FEATURE_CONSTRAINTS_STARTS);
        createEReference(featureEClass, FEATURE__FEATURE_CONSTRAINTS_ENDS);
        createEReference(featureEClass, FEATURE__INFLUENCES);
        createEReference(featureEClass, FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS);
        createEReference(featureEClass, FEATURE__FEATURE_TO_GROUP_CONNECTIONS);

        rootFeatureEClass = createEClass(ROOT_FEATURE);

        solitaryFeatureEClass = createEClass(SOLITARY_FEATURE);
        createEAttribute(solitaryFeatureEClass, SOLITARY_FEATURE__MIN);
        createEAttribute(solitaryFeatureEClass, SOLITARY_FEATURE__MAX);
        createEReference(solitaryFeatureEClass, SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION);

        groupFeatureEClass = createEClass(GROUP_FEATURE);
        createEReference(groupFeatureEClass, GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION);

        featureGroupEClass = createEClass(FEATURE_GROUP);
        createEAttribute(featureGroupEClass, FEATURE_GROUP__MIN);
        createEAttribute(featureGroupEClass, FEATURE_GROUP__MAX);
        createEReference(featureGroupEClass, FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION);
        createEReference(featureGroupEClass, FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS);

        attributeEClass = createEClass(ATTRIBUTE);
        createEAttribute(attributeEClass, ATTRIBUTE__NAME);
        createEReference(attributeEClass, ATTRIBUTE__INFLUENCES);
        createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
        createEAttribute(attributeEClass, ATTRIBUTE__MIN);
        createEAttribute(attributeEClass, ATTRIBUTE__MAX);

        attributeConstraintEClass = createEClass(ATTRIBUTE_CONSTRAINT);
        createEAttribute(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__EQUATION);
        createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION);

        softgoalEClass = createEClass(SOFTGOAL);
        createEAttribute(softgoalEClass, SOFTGOAL__NAME);
        createEReference(softgoalEClass, SOFTGOAL__INFLUENCE);
        createEAttribute(softgoalEClass, SOFTGOAL__WEIGHTING);

        conncectionEClass = createEClass(CONNCECTION);

        featureConstraintEClass = createEClass(FEATURE_CONSTRAINT);
        createEReference(featureConstraintEClass, FEATURE_CONSTRAINT__FEATURE_START);
        createEReference(featureConstraintEClass, FEATURE_CONSTRAINT__FEATURE_END);

        requiresFeatureConstraintEClass = createEClass(REQUIRES_FEATURE_CONSTRAINT);

        excludesFeatureConstraintEClass = createEClass(EXCLUDES_FEATURE_CONSTRAINT);

        influenceEClass = createEClass(INFLUENCE);
        createEAttribute(influenceEClass, INFLUENCE__CONTRIBUTION);
        createEReference(influenceEClass, INFLUENCE__SOFTGOAL);

        influenceFeatureEClass = createEClass(INFLUENCE_FEATURE);
        createEReference(influenceFeatureEClass, INFLUENCE_FEATURE__FEATURE);

        influenceAttributeEClass = createEClass(INFLUENCE_ATTRIBUTE);
        createEReference(influenceAttributeEClass, INFLUENCE_ATTRIBUTE__ATTRIBUTE);

        singleFeatureConnectionEClass = createEClass(SINGLE_FEATURE_CONNECTION);
        createEReference(singleFeatureConnectionEClass, SINGLE_FEATURE_CONNECTION__SOURCE);
        createEReference(singleFeatureConnectionEClass, SINGLE_FEATURE_CONNECTION__TARGET);

        cardinalityConnectionEClass = createEClass(CARDINALITY_CONNECTION);
        createEAttribute(cardinalityConnectionEClass, CARDINALITY_CONNECTION__MIN);
        createEAttribute(cardinalityConnectionEClass, CARDINALITY_CONNECTION__MAX);

        mandatoryConnectionEClass = createEClass(MANDATORY_CONNECTION);

        optionalConnectionEClass = createEClass(OPTIONAL_CONNECTION);

        featureToGroupConnectionEClass = createEClass(FEATURE_TO_GROUP_CONNECTION);
        createEReference(featureToGroupConnectionEClass, FEATURE_TO_GROUP_CONNECTION__SOURCE);
        createEReference(featureToGroupConnectionEClass, FEATURE_TO_GROUP_CONNECTION__TARGET);

        groupToFeatureConnectionEClass = createEClass(GROUP_TO_FEATURE_CONNECTION);
        createEReference(groupToFeatureConnectionEClass, GROUP_TO_FEATURE_CONNECTION__SOURCE);
        createEReference(groupToFeatureConnectionEClass, GROUP_TO_FEATURE_CONNECTION__TARGET);

        attributeConstraintConnectionEClass = createEClass(ATTRIBUTE_CONSTRAINT_CONNECTION);
        createEReference(attributeConstraintConnectionEClass, ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE);
        createEReference(attributeConstraintConnectionEClass, ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        rootFeatureEClass.getESuperTypes().add(this.getFeature());
        solitaryFeatureEClass.getESuperTypes().add(this.getFeature());
        groupFeatureEClass.getESuperTypes().add(this.getFeature());
        featureConstraintEClass.getESuperTypes().add(this.getConncection());
        requiresFeatureConstraintEClass.getESuperTypes().add(this.getFeatureConstraint());
        excludesFeatureConstraintEClass.getESuperTypes().add(this.getFeatureConstraint());
        influenceEClass.getESuperTypes().add(this.getConncection());
        influenceFeatureEClass.getESuperTypes().add(this.getInfluence());
        influenceAttributeEClass.getESuperTypes().add(this.getInfluence());
        singleFeatureConnectionEClass.getESuperTypes().add(this.getConncection());
        cardinalityConnectionEClass.getESuperTypes().add(this.getSingleFeatureConnection());
        mandatoryConnectionEClass.getESuperTypes().add(this.getSingleFeatureConnection());
        optionalConnectionEClass.getESuperTypes().add(this.getSingleFeatureConnection());
        featureToGroupConnectionEClass.getESuperTypes().add(this.getConncection());
        groupToFeatureConnectionEClass.getESuperTypes().add(this.getConncection());
        attributeConstraintConnectionEClass.getESuperTypes().add(this.getConncection());

        // Initialize classes, features, and operations; add parameters
        initEClass(featureModelEClass, FeatureModel.class, "FeatureModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFeatureModel_RootFeature(), this.getRootFeature(), null, "rootFeature", null, 1, 1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_GroupFeatures(), this.getGroupFeature(), null, "groupFeatures", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_SolitaryFeatures(), this.getSolitaryFeature(), null, "solitaryFeatures", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_FeatureGroups(), this.getFeatureGroup(), null, "featureGroups", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_AttributeConstraints(), this.getAttributeConstraint(), null, "attributeConstraints", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_RequiresFeatureConstraints(), this.getRequiresFeatureConstraint(), null, "requiresFeatureConstraints", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_ExcludesFeatureConstraints(), this.getExcludesFeatureConstraint(), null, "excludesFeatureConstraints", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_Softgoals(), this.getSoftgoal(), null, "softgoals", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_FeatureInfluences(), this.getInfluenceFeature(), null, "featureInfluences", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_AttributeInfluences(), this.getInfluenceAttribute(), null, "attributeInfluences", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_MandatoryConnections(), this.getMandatoryConnection(), null, "mandatoryConnections", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_OptionalConnections(), this.getOptionalConnection(), null, "optionalConnections", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_FeatureToGroupConnections(), this.getFeatureToGroupConnection(), null, "featureToGroupConnections", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_GroupToFeatureConnections(), this.getGroupToFeatureConnection(), null, "groupToFeatureConnections", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureModel_AttributeConstraintConnections(), this.getAttributeConstraintConnection(), null, "AttributeConstraintConnections", null, 0, -1, FeatureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeature_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeature_AttributeConstraints(), this.getAttributeConstraintConnection(), this.getAttributeConstraintConnection_Source(), "attributeConstraints", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeature_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeature_FeatureConstraintsStarts(), this.getFeatureConstraint(), this.getFeatureConstraint_FeatureStart(), "featureConstraintsStarts", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeature_FeatureConstraintsEnds(), this.getFeatureConstraint(), this.getFeatureConstraint_FeatureEnd(), "featureConstraintsEnds", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeature_Influences(), this.getInfluenceFeature(), this.getInfluenceFeature_Feature(), "influences", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeature_OutgoingSingleFeatureConnections(), this.getSingleFeatureConnection(), this.getSingleFeatureConnection_Source(), "outgoingSingleFeatureConnections", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeature_FeatureToGroupConnections(), this.getFeatureToGroupConnection(), this.getFeatureToGroupConnection_Source(), "featureToGroupConnections", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(rootFeatureEClass, RootFeature.class, "RootFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(solitaryFeatureEClass, SolitaryFeature.class, "SolitaryFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSolitaryFeature_Min(), ecorePackage.getEInt(), "min", null, 0, 1, SolitaryFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSolitaryFeature_Max(), ecorePackage.getEInt(), "max", null, 0, 1, SolitaryFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSolitaryFeature_IncomingSingleFeatureConnection(), this.getSingleFeatureConnection(), this.getSingleFeatureConnection_Target(), "incomingSingleFeatureConnection", null, 1, 1, SolitaryFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(groupFeatureEClass, GroupFeature.class, "GroupFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGroupFeature_GroupToFeatureConnection(), this.getGroupToFeatureConnection(), this.getGroupToFeatureConnection_Target(), "groupToFeatureConnection", null, 1, 1, GroupFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(featureGroupEClass, FeatureGroup.class, "FeatureGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFeatureGroup_Min(), ecorePackage.getEInt(), "min", null, 0, 1, FeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFeatureGroup_Max(), ecorePackage.getEInt(), "max", null, 0, 1, FeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureGroup_FeatureToGroupConnection(), this.getFeatureToGroupConnection(), this.getFeatureToGroupConnection_Target(), "featureToGroupConnection", null, 1, 1, FeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureGroup_GroupToFeatureConnections(), this.getGroupToFeatureConnection(), this.getGroupToFeatureConnection_Source(), "groupToFeatureConnections", null, 2, -1, FeatureGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttribute_Influences(), this.getInfluenceAttribute(), this.getInfluenceAttribute_Attribute(), "influences", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Value(), ecorePackage.getEInt(), "value", "1", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Min(), ecorePackage.getEInt(), "min", "1", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Max(), ecorePackage.getEInt(), "max", "1", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeConstraintEClass, AttributeConstraint.class, "AttributeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttributeConstraint_Equation(), ecorePackage.getEString(), "equation", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeConstraint_AttributeConstraintConnection(), this.getAttributeConstraintConnection(), this.getAttributeConstraintConnection_Target(), "attributeConstraintConnection", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(softgoalEClass, Softgoal.class, "Softgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSoftgoal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSoftgoal_Influence(), this.getInfluence(), this.getInfluence_Softgoal(), "influence", null, 0, -1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSoftgoal_Weighting(), ecorePackage.getEString(), "weighting", null, 0, 1, Softgoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(conncectionEClass, Conncection.class, "Conncection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(featureConstraintEClass, FeatureConstraint.class, "FeatureConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFeatureConstraint_FeatureStart(), this.getFeature(), this.getFeature_FeatureConstraintsStarts(), "featureStart", null, 1, 1, FeatureConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureConstraint_FeatureEnd(), this.getFeature(), this.getFeature_FeatureConstraintsEnds(), "featureEnd", null, 1, 1, FeatureConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(requiresFeatureConstraintEClass, RequiresFeatureConstraint.class, "RequiresFeatureConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(excludesFeatureConstraintEClass, ExcludesFeatureConstraint.class, "ExcludesFeatureConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(influenceEClass, Influence.class, "Influence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getInfluence_Contribution(), ecorePackage.getEFloat(), "contribution", "1.0", 0, 1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getInfluence_Softgoal(), this.getSoftgoal(), this.getSoftgoal_Influence(), "softgoal", null, 1, 1, Influence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(influenceFeatureEClass, InfluenceFeature.class, "InfluenceFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInfluenceFeature_Feature(), this.getFeature(), this.getFeature_Influences(), "feature", null, 1, 1, InfluenceFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(influenceAttributeEClass, InfluenceAttribute.class, "InfluenceAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getInfluenceAttribute_Attribute(), this.getAttribute(), this.getAttribute_Influences(), "attribute", null, 1, 1, InfluenceAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(singleFeatureConnectionEClass, SingleFeatureConnection.class, "SingleFeatureConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSingleFeatureConnection_Source(), this.getFeature(), this.getFeature_OutgoingSingleFeatureConnections(), "source", null, 1, 1, SingleFeatureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleFeatureConnection_Target(), this.getSolitaryFeature(), this.getSolitaryFeature_IncomingSingleFeatureConnection(), "target", null, 1, 1, SingleFeatureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(cardinalityConnectionEClass, CardinalityConnection.class, "CardinalityConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCardinalityConnection_Min(), ecorePackage.getEInt(), "min", "1", 0, 1, CardinalityConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getCardinalityConnection_Max(), ecorePackage.getEInt(), "max", "2", 0, 1, CardinalityConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mandatoryConnectionEClass, MandatoryConnection.class, "MandatoryConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(optionalConnectionEClass, OptionalConnection.class, "OptionalConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(featureToGroupConnectionEClass, FeatureToGroupConnection.class, "FeatureToGroupConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFeatureToGroupConnection_Source(), this.getFeature(), this.getFeature_FeatureToGroupConnections(), "source", null, 1, 1, FeatureToGroupConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFeatureToGroupConnection_Target(), this.getFeatureGroup(), this.getFeatureGroup_FeatureToGroupConnection(), "target", null, 1, 1, FeatureToGroupConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(groupToFeatureConnectionEClass, GroupToFeatureConnection.class, "GroupToFeatureConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getGroupToFeatureConnection_Source(), this.getFeatureGroup(), this.getFeatureGroup_GroupToFeatureConnections(), "source", null, 1, 1, GroupToFeatureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGroupToFeatureConnection_Target(), this.getGroupFeature(), this.getGroupFeature_GroupToFeatureConnection(), "target", null, 1, 1, GroupToFeatureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeConstraintConnectionEClass, AttributeConstraintConnection.class, "AttributeConstraintConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAttributeConstraintConnection_Source(), this.getFeature(), this.getFeature_AttributeConstraints(), "source", null, 1, 1, AttributeConstraintConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeConstraintConnection_Target(), this.getAttributeConstraint(), this.getAttributeConstraint_AttributeConstraintConnection(), "target", null, 1, 1, AttributeConstraintConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //FCOREPackageImpl
