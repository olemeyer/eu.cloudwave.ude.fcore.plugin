/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.AttributeConstraint;
import eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection;
import eu.cloudwave.ude.fcore.FCORE.ExcludesFeatureConstraint;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
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
 * An implementation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getGroupFeatures <em>Group Features</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getSolitaryFeatures <em>Solitary Features</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getFeatureGroups <em>Feature Groups</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getAttributeConstraints <em>Attribute Constraints</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getRequiresFeatureConstraints <em>Requires Feature Constraints</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getExcludesFeatureConstraints <em>Excludes Feature Constraints</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getSoftgoals <em>Softgoals</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getFeatureInfluences <em>Feature Influences</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getAttributeInfluences <em>Attribute Influences</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getMandatoryConnections <em>Mandatory Connections</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getOptionalConnections <em>Optional Connections</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getFeatureToGroupConnections <em>Feature To Group Connections</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getGroupToFeatureConnections <em>Group To Feature Connections</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureModelImpl#getAttributeConstraintConnections <em>Attribute Constraint Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureModelImpl extends MinimalEObjectImpl.Container implements FeatureModel {
    /**
     * The cached value of the '{@link #getRootFeature() <em>Root Feature</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRootFeature()
     * @generated
     * @ordered
     */
    protected RootFeature              rootFeature;

    /**
     * The cached value of the '{@link #getGroupFeatures() <em>Group Features</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupFeatures()
     * @generated
     * @ordered
     */
    protected EList<GroupFeature> groupFeatures;

    /**
     * The cached value of the '{@link #getSolitaryFeatures() <em>Solitary Features</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSolitaryFeatures()
     * @generated
     * @ordered
     */
    protected EList<SolitaryFeature> solitaryFeatures;

    /**
     * The cached value of the '{@link #getFeatureGroups() <em>Feature Groups</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureGroups()
     * @generated
     * @ordered
     */
    protected EList<FeatureGroup> featureGroups;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<Attribute> attributes;

    /**
     * The cached value of the '{@link #getAttributeConstraints() <em>Attribute Constraints</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeConstraints()
     * @generated
     * @ordered
     */
    protected EList<AttributeConstraint> attributeConstraints;

    /**
     * The cached value of the '{@link #getRequiresFeatureConstraints() <em>Requires Feature Constraints</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequiresFeatureConstraints()
     * @generated
     * @ordered
     */
    protected EList<RequiresFeatureConstraint> requiresFeatureConstraints;

    /**
     * The cached value of the '{@link #getExcludesFeatureConstraints() <em>Excludes Feature Constraints</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExcludesFeatureConstraints()
     * @generated
     * @ordered
     */
    protected EList<ExcludesFeatureConstraint> excludesFeatureConstraints;

    /**
     * The cached value of the '{@link #getSoftgoals() <em>Softgoals</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoftgoals()
     * @generated
     * @ordered
     */
    protected EList<Softgoal>          softgoals;

    /**
     * The cached value of the '{@link #getFeatureInfluences() <em>Feature Influences</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureInfluences()
     * @generated
     * @ordered
     */
    protected EList<InfluenceFeature> featureInfluences;

    /**
     * The cached value of the '{@link #getAttributeInfluences() <em>Attribute Influences</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeInfluences()
     * @generated
     * @ordered
     */
    protected EList<InfluenceAttribute> attributeInfluences;

    /**
     * The cached value of the '{@link #getMandatoryConnections() <em>Mandatory Connections</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMandatoryConnections()
     * @generated
     * @ordered
     */
    protected EList<MandatoryConnection> mandatoryConnections;

    /**
     * The cached value of the '{@link #getOptionalConnections() <em>Optional Connections</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptionalConnections()
     * @generated
     * @ordered
     */
    protected EList<OptionalConnection> optionalConnections;

    /**
     * The cached value of the '{@link #getFeatureToGroupConnections() <em>Feature To Group Connections</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureToGroupConnections()
     * @generated
     * @ordered
     */
    protected EList<FeatureToGroupConnection> featureToGroupConnections;

    /**
     * The cached value of the '{@link #getGroupToFeatureConnections() <em>Group To Feature Connections</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupToFeatureConnections()
     * @generated
     * @ordered
     */
    protected EList<GroupToFeatureConnection> groupToFeatureConnections;

    /**
     * The cached value of the '{@link #getAttributeConstraintConnections() <em>Attribute Constraint Connections</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeConstraintConnections()
     * @generated
     * @ordered
     */
    protected EList<AttributeConstraintConnection> attributeConstraintConnections;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FeatureModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.FEATURE_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RootFeature getRootFeature() {
        return rootFeature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRootFeature(RootFeature newRootFeature, NotificationChain msgs) {
        RootFeature oldRootFeature = rootFeature;
        rootFeature = newRootFeature;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_MODEL__ROOT_FEATURE, oldRootFeature, newRootFeature);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRootFeature(RootFeature newRootFeature) {
        if (newRootFeature != rootFeature) {
            NotificationChain msgs = null;
            if (rootFeature != null)
                msgs = ((InternalEObject)rootFeature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FCOREPackage.FEATURE_MODEL__ROOT_FEATURE, null, msgs);
            if (newRootFeature != null)
                msgs = ((InternalEObject)newRootFeature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FCOREPackage.FEATURE_MODEL__ROOT_FEATURE, null, msgs);
            msgs = basicSetRootFeature(newRootFeature, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_MODEL__ROOT_FEATURE, newRootFeature, newRootFeature));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GroupFeature> getGroupFeatures() {
        if (groupFeatures == null) {
            groupFeatures = new EObjectContainmentEList<GroupFeature>(GroupFeature.class, this, FCOREPackage.FEATURE_MODEL__GROUP_FEATURES);
        }
        return groupFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SolitaryFeature> getSolitaryFeatures() {
        if (solitaryFeatures == null) {
            solitaryFeatures = new EObjectContainmentEList<SolitaryFeature>(SolitaryFeature.class, this, FCOREPackage.FEATURE_MODEL__SOLITARY_FEATURES);
        }
        return solitaryFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FeatureGroup> getFeatureGroups() {
        if (featureGroups == null) {
            featureGroups = new EObjectContainmentEList<FeatureGroup>(FeatureGroup.class, this, FCOREPackage.FEATURE_MODEL__FEATURE_GROUPS);
        }
        return featureGroups;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, FCOREPackage.FEATURE_MODEL__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeConstraint> getAttributeConstraints() {
        if (attributeConstraints == null) {
            attributeConstraints = new EObjectContainmentEList<AttributeConstraint>(AttributeConstraint.class, this, FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINTS);
        }
        return attributeConstraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RequiresFeatureConstraint> getRequiresFeatureConstraints() {
        if (requiresFeatureConstraints == null) {
            requiresFeatureConstraints = new EObjectContainmentEList<RequiresFeatureConstraint>(RequiresFeatureConstraint.class, this, FCOREPackage.FEATURE_MODEL__REQUIRES_FEATURE_CONSTRAINTS);
        }
        return requiresFeatureConstraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExcludesFeatureConstraint> getExcludesFeatureConstraints() {
        if (excludesFeatureConstraints == null) {
            excludesFeatureConstraints = new EObjectContainmentEList<ExcludesFeatureConstraint>(ExcludesFeatureConstraint.class, this, FCOREPackage.FEATURE_MODEL__EXCLUDES_FEATURE_CONSTRAINTS);
        }
        return excludesFeatureConstraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Softgoal> getSoftgoals() {
        if (softgoals == null) {
            softgoals = new EObjectContainmentEList<Softgoal>(Softgoal.class, this, FCOREPackage.FEATURE_MODEL__SOFTGOALS);
        }
        return softgoals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InfluenceFeature> getFeatureInfluences() {
        if (featureInfluences == null) {
            featureInfluences = new EObjectContainmentEList<InfluenceFeature>(InfluenceFeature.class, this, FCOREPackage.FEATURE_MODEL__FEATURE_INFLUENCES);
        }
        return featureInfluences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InfluenceAttribute> getAttributeInfluences() {
        if (attributeInfluences == null) {
            attributeInfluences = new EObjectContainmentEList<InfluenceAttribute>(InfluenceAttribute.class, this, FCOREPackage.FEATURE_MODEL__ATTRIBUTE_INFLUENCES);
        }
        return attributeInfluences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MandatoryConnection> getMandatoryConnections() {
        if (mandatoryConnections == null) {
            mandatoryConnections = new EObjectContainmentEList<MandatoryConnection>(MandatoryConnection.class, this, FCOREPackage.FEATURE_MODEL__MANDATORY_CONNECTIONS);
        }
        return mandatoryConnections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OptionalConnection> getOptionalConnections() {
        if (optionalConnections == null) {
            optionalConnections = new EObjectContainmentEList<OptionalConnection>(OptionalConnection.class, this, FCOREPackage.FEATURE_MODEL__OPTIONAL_CONNECTIONS);
        }
        return optionalConnections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FeatureToGroupConnection> getFeatureToGroupConnections() {
        if (featureToGroupConnections == null) {
            featureToGroupConnections = new EObjectContainmentEList<FeatureToGroupConnection>(FeatureToGroupConnection.class, this, FCOREPackage.FEATURE_MODEL__FEATURE_TO_GROUP_CONNECTIONS);
        }
        return featureToGroupConnections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GroupToFeatureConnection> getGroupToFeatureConnections() {
        if (groupToFeatureConnections == null) {
            groupToFeatureConnections = new EObjectContainmentEList<GroupToFeatureConnection>(GroupToFeatureConnection.class, this, FCOREPackage.FEATURE_MODEL__GROUP_TO_FEATURE_CONNECTIONS);
        }
        return groupToFeatureConnections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeConstraintConnection> getAttributeConstraintConnections() {
        if (attributeConstraintConnections == null) {
            attributeConstraintConnections = new EObjectContainmentEList<AttributeConstraintConnection>(AttributeConstraintConnection.class, this, FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINT_CONNECTIONS);
        }
        return attributeConstraintConnections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.FEATURE_MODEL__ROOT_FEATURE:
                return basicSetRootFeature(null, msgs);
            case FCOREPackage.FEATURE_MODEL__GROUP_FEATURES:
                return ((InternalEList<?>)getGroupFeatures()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__SOLITARY_FEATURES:
                return ((InternalEList<?>)getSolitaryFeatures()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__FEATURE_GROUPS:
                return ((InternalEList<?>)getFeatureGroups()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINTS:
                return ((InternalEList<?>)getAttributeConstraints()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__REQUIRES_FEATURE_CONSTRAINTS:
                return ((InternalEList<?>)getRequiresFeatureConstraints()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__EXCLUDES_FEATURE_CONSTRAINTS:
                return ((InternalEList<?>)getExcludesFeatureConstraints()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__SOFTGOALS:
                return ((InternalEList<?>)getSoftgoals()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__FEATURE_INFLUENCES:
                return ((InternalEList<?>)getFeatureInfluences()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_INFLUENCES:
                return ((InternalEList<?>)getAttributeInfluences()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__MANDATORY_CONNECTIONS:
                return ((InternalEList<?>)getMandatoryConnections()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__OPTIONAL_CONNECTIONS:
                return ((InternalEList<?>)getOptionalConnections()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__FEATURE_TO_GROUP_CONNECTIONS:
                return ((InternalEList<?>)getFeatureToGroupConnections()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__GROUP_TO_FEATURE_CONNECTIONS:
                return ((InternalEList<?>)getGroupToFeatureConnections()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINT_CONNECTIONS:
                return ((InternalEList<?>)getAttributeConstraintConnections()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FCOREPackage.FEATURE_MODEL__ROOT_FEATURE:
                return getRootFeature();
            case FCOREPackage.FEATURE_MODEL__GROUP_FEATURES:
                return getGroupFeatures();
            case FCOREPackage.FEATURE_MODEL__SOLITARY_FEATURES:
                return getSolitaryFeatures();
            case FCOREPackage.FEATURE_MODEL__FEATURE_GROUPS:
                return getFeatureGroups();
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTES:
                return getAttributes();
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINTS:
                return getAttributeConstraints();
            case FCOREPackage.FEATURE_MODEL__REQUIRES_FEATURE_CONSTRAINTS:
                return getRequiresFeatureConstraints();
            case FCOREPackage.FEATURE_MODEL__EXCLUDES_FEATURE_CONSTRAINTS:
                return getExcludesFeatureConstraints();
            case FCOREPackage.FEATURE_MODEL__SOFTGOALS:
                return getSoftgoals();
            case FCOREPackage.FEATURE_MODEL__FEATURE_INFLUENCES:
                return getFeatureInfluences();
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_INFLUENCES:
                return getAttributeInfluences();
            case FCOREPackage.FEATURE_MODEL__MANDATORY_CONNECTIONS:
                return getMandatoryConnections();
            case FCOREPackage.FEATURE_MODEL__OPTIONAL_CONNECTIONS:
                return getOptionalConnections();
            case FCOREPackage.FEATURE_MODEL__FEATURE_TO_GROUP_CONNECTIONS:
                return getFeatureToGroupConnections();
            case FCOREPackage.FEATURE_MODEL__GROUP_TO_FEATURE_CONNECTIONS:
                return getGroupToFeatureConnections();
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINT_CONNECTIONS:
                return getAttributeConstraintConnections();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case FCOREPackage.FEATURE_MODEL__ROOT_FEATURE:
                setRootFeature((RootFeature)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__GROUP_FEATURES:
                getGroupFeatures().clear();
                getGroupFeatures().addAll((Collection<? extends GroupFeature>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__SOLITARY_FEATURES:
                getSolitaryFeatures().clear();
                getSolitaryFeatures().addAll((Collection<? extends SolitaryFeature>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__FEATURE_GROUPS:
                getFeatureGroups().clear();
                getFeatureGroups().addAll((Collection<? extends FeatureGroup>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINTS:
                getAttributeConstraints().clear();
                getAttributeConstraints().addAll((Collection<? extends AttributeConstraint>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__REQUIRES_FEATURE_CONSTRAINTS:
                getRequiresFeatureConstraints().clear();
                getRequiresFeatureConstraints().addAll((Collection<? extends RequiresFeatureConstraint>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__EXCLUDES_FEATURE_CONSTRAINTS:
                getExcludesFeatureConstraints().clear();
                getExcludesFeatureConstraints().addAll((Collection<? extends ExcludesFeatureConstraint>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__SOFTGOALS:
                getSoftgoals().clear();
                getSoftgoals().addAll((Collection<? extends Softgoal>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__FEATURE_INFLUENCES:
                getFeatureInfluences().clear();
                getFeatureInfluences().addAll((Collection<? extends InfluenceFeature>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_INFLUENCES:
                getAttributeInfluences().clear();
                getAttributeInfluences().addAll((Collection<? extends InfluenceAttribute>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__MANDATORY_CONNECTIONS:
                getMandatoryConnections().clear();
                getMandatoryConnections().addAll((Collection<? extends MandatoryConnection>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__OPTIONAL_CONNECTIONS:
                getOptionalConnections().clear();
                getOptionalConnections().addAll((Collection<? extends OptionalConnection>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__FEATURE_TO_GROUP_CONNECTIONS:
                getFeatureToGroupConnections().clear();
                getFeatureToGroupConnections().addAll((Collection<? extends FeatureToGroupConnection>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__GROUP_TO_FEATURE_CONNECTIONS:
                getGroupToFeatureConnections().clear();
                getGroupToFeatureConnections().addAll((Collection<? extends GroupToFeatureConnection>)newValue);
                return;
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINT_CONNECTIONS:
                getAttributeConstraintConnections().clear();
                getAttributeConstraintConnections().addAll((Collection<? extends AttributeConstraintConnection>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case FCOREPackage.FEATURE_MODEL__ROOT_FEATURE:
                setRootFeature((RootFeature)null);
                return;
            case FCOREPackage.FEATURE_MODEL__GROUP_FEATURES:
                getGroupFeatures().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__SOLITARY_FEATURES:
                getSolitaryFeatures().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__FEATURE_GROUPS:
                getFeatureGroups().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTES:
                getAttributes().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINTS:
                getAttributeConstraints().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__REQUIRES_FEATURE_CONSTRAINTS:
                getRequiresFeatureConstraints().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__EXCLUDES_FEATURE_CONSTRAINTS:
                getExcludesFeatureConstraints().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__SOFTGOALS:
                getSoftgoals().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__FEATURE_INFLUENCES:
                getFeatureInfluences().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_INFLUENCES:
                getAttributeInfluences().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__MANDATORY_CONNECTIONS:
                getMandatoryConnections().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__OPTIONAL_CONNECTIONS:
                getOptionalConnections().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__FEATURE_TO_GROUP_CONNECTIONS:
                getFeatureToGroupConnections().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__GROUP_TO_FEATURE_CONNECTIONS:
                getGroupToFeatureConnections().clear();
                return;
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINT_CONNECTIONS:
                getAttributeConstraintConnections().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case FCOREPackage.FEATURE_MODEL__ROOT_FEATURE:
                return rootFeature != null;
            case FCOREPackage.FEATURE_MODEL__GROUP_FEATURES:
                return groupFeatures != null && !groupFeatures.isEmpty();
            case FCOREPackage.FEATURE_MODEL__SOLITARY_FEATURES:
                return solitaryFeatures != null && !solitaryFeatures.isEmpty();
            case FCOREPackage.FEATURE_MODEL__FEATURE_GROUPS:
                return featureGroups != null && !featureGroups.isEmpty();
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINTS:
                return attributeConstraints != null && !attributeConstraints.isEmpty();
            case FCOREPackage.FEATURE_MODEL__REQUIRES_FEATURE_CONSTRAINTS:
                return requiresFeatureConstraints != null && !requiresFeatureConstraints.isEmpty();
            case FCOREPackage.FEATURE_MODEL__EXCLUDES_FEATURE_CONSTRAINTS:
                return excludesFeatureConstraints != null && !excludesFeatureConstraints.isEmpty();
            case FCOREPackage.FEATURE_MODEL__SOFTGOALS:
                return softgoals != null && !softgoals.isEmpty();
            case FCOREPackage.FEATURE_MODEL__FEATURE_INFLUENCES:
                return featureInfluences != null && !featureInfluences.isEmpty();
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_INFLUENCES:
                return attributeInfluences != null && !attributeInfluences.isEmpty();
            case FCOREPackage.FEATURE_MODEL__MANDATORY_CONNECTIONS:
                return mandatoryConnections != null && !mandatoryConnections.isEmpty();
            case FCOREPackage.FEATURE_MODEL__OPTIONAL_CONNECTIONS:
                return optionalConnections != null && !optionalConnections.isEmpty();
            case FCOREPackage.FEATURE_MODEL__FEATURE_TO_GROUP_CONNECTIONS:
                return featureToGroupConnections != null && !featureToGroupConnections.isEmpty();
            case FCOREPackage.FEATURE_MODEL__GROUP_TO_FEATURE_CONNECTIONS:
                return groupToFeatureConnections != null && !groupToFeatureConnections.isEmpty();
            case FCOREPackage.FEATURE_MODEL__ATTRIBUTE_CONSTRAINT_CONNECTIONS:
                return attributeConstraintConnections != null && !attributeConstraintConnections.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //FeatureModelImpl
