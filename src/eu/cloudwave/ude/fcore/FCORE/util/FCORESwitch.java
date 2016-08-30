/**
 */
package eu.cloudwave.ude.fcore.FCORE.util;

import eu.cloudwave.ude.fcore.FCORE.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see eu.cloudwave.ude.fcore.FCORE.FCOREPackage
 * @generated
 */
public class FCORESwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static FCOREPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FCORESwitch() {
        if (modelPackage == null) {
            modelPackage = FCOREPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case FCOREPackage.FEATURE_MODEL: {
                FeatureModel featureModel = (FeatureModel)theEObject;
                T result = caseFeatureModel(featureModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.FEATURE: {
                Feature feature = (Feature)theEObject;
                T result = caseFeature(feature);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.ROOT_FEATURE: {
                RootFeature rootFeature = (RootFeature)theEObject;
                T result = caseRootFeature(rootFeature);
                if (result == null) result = caseFeature(rootFeature);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.SOLITARY_FEATURE: {
                SolitaryFeature solitaryFeature = (SolitaryFeature)theEObject;
                T result = caseSolitaryFeature(solitaryFeature);
                if (result == null) result = caseFeature(solitaryFeature);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.GROUP_FEATURE: {
                GroupFeature groupFeature = (GroupFeature)theEObject;
                T result = caseGroupFeature(groupFeature);
                if (result == null) result = caseFeature(groupFeature);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.FEATURE_GROUP: {
                FeatureGroup featureGroup = (FeatureGroup)theEObject;
                T result = caseFeatureGroup(featureGroup);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.ATTRIBUTE: {
                Attribute attribute = (Attribute)theEObject;
                T result = caseAttribute(attribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.ATTRIBUTE_CONSTRAINT: {
                AttributeConstraint attributeConstraint = (AttributeConstraint)theEObject;
                T result = caseAttributeConstraint(attributeConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.SOFTGOAL: {
                Softgoal softgoal = (Softgoal)theEObject;
                T result = caseSoftgoal(softgoal);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.CONNCECTION: {
                Conncection conncection = (Conncection)theEObject;
                T result = caseConncection(conncection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.FEATURE_CONSTRAINT: {
                FeatureConstraint featureConstraint = (FeatureConstraint)theEObject;
                T result = caseFeatureConstraint(featureConstraint);
                if (result == null) result = caseConncection(featureConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.REQUIRES_FEATURE_CONSTRAINT: {
                RequiresFeatureConstraint requiresFeatureConstraint = (RequiresFeatureConstraint)theEObject;
                T result = caseRequiresFeatureConstraint(requiresFeatureConstraint);
                if (result == null) result = caseFeatureConstraint(requiresFeatureConstraint);
                if (result == null) result = caseConncection(requiresFeatureConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.EXCLUDES_FEATURE_CONSTRAINT: {
                ExcludesFeatureConstraint excludesFeatureConstraint = (ExcludesFeatureConstraint)theEObject;
                T result = caseExcludesFeatureConstraint(excludesFeatureConstraint);
                if (result == null) result = caseFeatureConstraint(excludesFeatureConstraint);
                if (result == null) result = caseConncection(excludesFeatureConstraint);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.INFLUENCE: {
                Influence influence = (Influence)theEObject;
                T result = caseInfluence(influence);
                if (result == null) result = caseConncection(influence);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.INFLUENCE_FEATURE: {
                InfluenceFeature influenceFeature = (InfluenceFeature)theEObject;
                T result = caseInfluenceFeature(influenceFeature);
                if (result == null) result = caseInfluence(influenceFeature);
                if (result == null) result = caseConncection(influenceFeature);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.INFLUENCE_ATTRIBUTE: {
                InfluenceAttribute influenceAttribute = (InfluenceAttribute)theEObject;
                T result = caseInfluenceAttribute(influenceAttribute);
                if (result == null) result = caseInfluence(influenceAttribute);
                if (result == null) result = caseConncection(influenceAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.SINGLE_FEATURE_CONNECTION: {
                SingleFeatureConnection singleFeatureConnection = (SingleFeatureConnection)theEObject;
                T result = caseSingleFeatureConnection(singleFeatureConnection);
                if (result == null) result = caseConncection(singleFeatureConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.CARDINALITY_CONNECTION: {
                CardinalityConnection cardinalityConnection = (CardinalityConnection)theEObject;
                T result = caseCardinalityConnection(cardinalityConnection);
                if (result == null) result = caseSingleFeatureConnection(cardinalityConnection);
                if (result == null) result = caseConncection(cardinalityConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.MANDATORY_CONNECTION: {
                MandatoryConnection mandatoryConnection = (MandatoryConnection)theEObject;
                T result = caseMandatoryConnection(mandatoryConnection);
                if (result == null) result = caseSingleFeatureConnection(mandatoryConnection);
                if (result == null) result = caseConncection(mandatoryConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.OPTIONAL_CONNECTION: {
                OptionalConnection optionalConnection = (OptionalConnection)theEObject;
                T result = caseOptionalConnection(optionalConnection);
                if (result == null) result = caseSingleFeatureConnection(optionalConnection);
                if (result == null) result = caseConncection(optionalConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION: {
                FeatureToGroupConnection featureToGroupConnection = (FeatureToGroupConnection)theEObject;
                T result = caseFeatureToGroupConnection(featureToGroupConnection);
                if (result == null) result = caseConncection(featureToGroupConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION: {
                GroupToFeatureConnection groupToFeatureConnection = (GroupToFeatureConnection)theEObject;
                T result = caseGroupToFeatureConnection(groupToFeatureConnection);
                if (result == null) result = caseConncection(groupToFeatureConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION: {
                AttributeConstraintConnection attributeConstraintConnection = (AttributeConstraintConnection)theEObject;
                T result = caseAttributeConstraintConnection(attributeConstraintConnection);
                if (result == null) result = caseConncection(attributeConstraintConnection);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Feature Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feature Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeatureModel(FeatureModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeature(Feature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Root Feature</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Root Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRootFeature(RootFeature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Group Feature</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Group Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGroupFeature(GroupFeature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Solitary Feature</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Solitary Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSolitaryFeature(SolitaryFeature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Feature Group</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feature Group</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeatureGroup(FeatureGroup object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributeConstraint(AttributeConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Feature Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feature Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeatureConstraint(FeatureConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Requires Feature Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Requires Feature Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRequiresFeatureConstraint(RequiresFeatureConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Excludes Feature Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Excludes Feature Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseExcludesFeatureConstraint(ExcludesFeatureConstraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttribute(Attribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Influence Feature</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Influence Feature</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInfluenceFeature(InfluenceFeature object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Softgoal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Softgoal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoftgoal(Softgoal object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Conncection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Conncection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConncection(Conncection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Influence</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Influence</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInfluence(Influence object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Influence Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Influence Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseInfluenceAttribute(InfluenceAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Single Feature Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Single Feature Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSingleFeatureConnection(SingleFeatureConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cardinality Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cardinality Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCardinalityConnection(CardinalityConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Mandatory Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Mandatory Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMandatoryConnection(MandatoryConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Optional Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Optional Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOptionalConnection(OptionalConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Feature To Group Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Feature To Group Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFeatureToGroupConnection(FeatureToGroupConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Group To Feature Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Group To Feature Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGroupToFeatureConnection(GroupToFeatureConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint Connection</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Constraint Connection</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttributeConstraintConnection(AttributeConstraintConnection object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

}
