/**
 */
package eu.cloudwave.ude.fcore.FCORE.util;

import eu.cloudwave.ude.fcore.FCORE.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.AttributeConstraint;
import eu.cloudwave.ude.fcore.FCORE.ExcludesFeatureConstraint;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.FCORE.FeatureConstraint;
import eu.cloudwave.ude.fcore.FCORE.FeatureGroup;
import eu.cloudwave.ude.fcore.FCORE.FeatureModel;
import eu.cloudwave.ude.fcore.FCORE.GroupFeature;
import eu.cloudwave.ude.fcore.FCORE.Influence;
import eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute;
import eu.cloudwave.ude.fcore.FCORE.InfluenceFeature;
import eu.cloudwave.ude.fcore.FCORE.RequiresFeatureConstraint;
import eu.cloudwave.ude.fcore.FCORE.RootFeature;
import eu.cloudwave.ude.fcore.FCORE.Softgoal;
import eu.cloudwave.ude.fcore.FCORE.SolitaryFeature;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage
 * @generated
 */
public class FCOREAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static FCOREPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FCOREAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = FCOREPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FCORESwitch<Adapter> modelSwitch =
                                                 new FCORESwitch<Adapter>() {
            @Override
            public Adapter caseFeatureModel(FeatureModel object) {
                return createFeatureModelAdapter();
            }
            @Override
            public Adapter caseFeature(Feature object) {
                return createFeatureAdapter();
            }
            @Override
            public Adapter caseRootFeature(RootFeature object) {
                return createRootFeatureAdapter();
            }
            @Override
            public Adapter caseSolitaryFeature(SolitaryFeature object) {
                return createSolitaryFeatureAdapter();
            }
            @Override
            public Adapter caseGroupFeature(GroupFeature object) {
                return createGroupFeatureAdapter();
            }
            @Override
            public Adapter caseFeatureGroup(FeatureGroup object) {
                return createFeatureGroupAdapter();
            }
            @Override
            public Adapter caseAttribute(Attribute object) {
                return createAttributeAdapter();
            }
            @Override
            public Adapter caseAttributeConstraint(AttributeConstraint object) {
                return createAttributeConstraintAdapter();
            }
            @Override
            public Adapter caseSoftgoal(Softgoal object) {
                return createSoftgoalAdapter();
            }
            @Override
            public Adapter caseConncection(Conncection object) {
                return createConncectionAdapter();
            }
            @Override
            public Adapter caseFeatureConstraint(FeatureConstraint object) {
                return createFeatureConstraintAdapter();
            }
            @Override
            public Adapter caseRequiresFeatureConstraint(RequiresFeatureConstraint object) {
                return createRequiresFeatureConstraintAdapter();
            }
            @Override
            public Adapter caseExcludesFeatureConstraint(ExcludesFeatureConstraint object) {
                return createExcludesFeatureConstraintAdapter();
            }
            @Override
            public Adapter caseInfluence(Influence object) {
                return createInfluenceAdapter();
            }
            @Override
            public Adapter caseInfluenceFeature(InfluenceFeature object) {
                return createInfluenceFeatureAdapter();
            }
            @Override
            public Adapter caseInfluenceAttribute(InfluenceAttribute object) {
                return createInfluenceAttributeAdapter();
            }
            @Override
            public Adapter caseSingleFeatureConnection(SingleFeatureConnection object) {
                return createSingleFeatureConnectionAdapter();
            }
            @Override
            public Adapter caseCardinalityConnection(CardinalityConnection object) {
                return createCardinalityConnectionAdapter();
            }
            @Override
            public Adapter caseMandatoryConnection(MandatoryConnection object) {
                return createMandatoryConnectionAdapter();
            }
            @Override
            public Adapter caseOptionalConnection(OptionalConnection object) {
                return createOptionalConnectionAdapter();
            }
            @Override
            public Adapter caseFeatureToGroupConnection(FeatureToGroupConnection object) {
                return createFeatureToGroupConnectionAdapter();
            }
            @Override
            public Adapter caseGroupToFeatureConnection(GroupToFeatureConnection object) {
                return createGroupToFeatureConnectionAdapter();
            }
            @Override
            public Adapter caseAttributeConstraintConnection(AttributeConstraintConnection object) {
                return createAttributeConstraintConnectionAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.FeatureModel <em>Feature Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureModel
     * @generated
     */
    public Adapter createFeatureModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.Feature <em>Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.Feature
     * @generated
     */
    public Adapter createFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.RootFeature <em>Root Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.RootFeature
     * @generated
     */
    public Adapter createRootFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.GroupFeature <em>Group Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.GroupFeature
     * @generated
     */
    public Adapter createGroupFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.SolitaryFeature <em>Solitary Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.SolitaryFeature
     * @generated
     */
    public Adapter createSolitaryFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.FeatureGroup <em>Feature Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureGroup
     * @generated
     */
    public Adapter createFeatureGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraint <em>Attribute Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraint
     * @generated
     */
    public Adapter createAttributeConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.FeatureConstraint <em>Feature Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureConstraint
     * @generated
     */
    public Adapter createFeatureConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.RequiresFeatureConstraint <em>Requires Feature Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.RequiresFeatureConstraint
     * @generated
     */
    public Adapter createRequiresFeatureConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.ExcludesFeatureConstraint <em>Excludes Feature Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.ExcludesFeatureConstraint
     * @generated
     */
    public Adapter createExcludesFeatureConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.InfluenceFeature <em>Influence Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.InfluenceFeature
     * @generated
     */
    public Adapter createInfluenceFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.Softgoal <em>Softgoal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.Softgoal
     * @generated
     */
    public Adapter createSoftgoalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.Conncection <em>Conncection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.Conncection
     * @generated
     */
    public Adapter createConncectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.Influence <em>Influence</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.Influence
     * @generated
     */
    public Adapter createInfluenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute <em>Influence Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute
     * @generated
     */
    public Adapter createInfluenceAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection <em>Single Feature Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection
     * @generated
     */
    public Adapter createSingleFeatureConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.CardinalityConnection <em>Cardinality Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.CardinalityConnection
     * @generated
     */
    public Adapter createCardinalityConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.MandatoryConnection <em>Mandatory Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.MandatoryConnection
     * @generated
     */
    public Adapter createMandatoryConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.OptionalConnection <em>Optional Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.OptionalConnection
     * @generated
     */
    public Adapter createOptionalConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection <em>Feature To Group Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection
     * @generated
     */
    public Adapter createFeatureToGroupConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection <em>Group To Feature Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection
     * @generated
     */
    public Adapter createGroupToFeatureConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection <em>Attribute Constraint Connection</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection
     * @generated
     */
    public Adapter createAttributeConstraintConnectionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

}
