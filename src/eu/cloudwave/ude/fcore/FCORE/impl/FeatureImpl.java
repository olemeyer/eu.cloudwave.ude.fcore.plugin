/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.FCORE.FeatureConstraint;
import eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection;
import eu.cloudwave.ude.fcore.FCORE.InfluenceFeature;
import eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl#getAttributeConstraints <em>Attribute Constraints</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl#getFeatureConstraintsStarts <em>Feature Constraints Starts</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl#getFeatureConstraintsEnds <em>Feature Constraints Ends</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl#getInfluences <em>Influences</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl#getOutgoingSingleFeatureConnections <em>Outgoing Single Feature Connections</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureImpl#getFeatureToGroupConnections <em>Feature To Group Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureImpl extends MinimalEObjectImpl.Container implements Feature {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String        NAME_EDEFAULT     = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String                     name              = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSelected()
     * @generated
     * @ordered
     */
    protected static final boolean       SELECTED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSelected()
     * @generated
     * @ordered
     */
    protected boolean                    selected          = SELECTED_EDEFAULT;

    /**
     * The cached value of the '{@link #getAttributeConstraints() <em>Attribute Constraints</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeConstraints()
     * @generated
     * @ordered
     */
    protected EList<AttributeConstraintConnection> attributeConstraints;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<Attribute>           attributes;

    /**
     * The cached value of the '{@link #getFeatureConstraintsStarts() <em>Feature Constraints Starts</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureConstraintsStarts()
     * @generated
     * @ordered
     */
    protected EList<FeatureConstraint> featureConstraintsStarts;

    /**
     * The cached value of the '{@link #getFeatureConstraintsEnds() <em>Feature Constraints Ends</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureConstraintsEnds()
     * @generated
     * @ordered
     */
    protected EList<FeatureConstraint> featureConstraintsEnds;

    /**
     * The cached value of the '{@link #getInfluences() <em>Influences</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInfluences()
     * @generated
     * @ordered
     */
    protected EList<InfluenceFeature>    influences;

    /**
     * The cached value of the '{@link #getOutgoingSingleFeatureConnections() <em>Outgoing Single Feature Connections</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingSingleFeatureConnections()
     * @generated
     * @ordered
     */
    protected EList<SingleFeatureConnection> outgoingSingleFeatureConnections;

    /**
     * The cached value of the '{@link #getFeatureToGroupConnections() <em>Feature To Group Connections</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureToGroupConnections()
     * @generated
     * @ordered
     */
    protected EList<FeatureToGroupConnection> featureToGroupConnections;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FeatureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.FEATURE;
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
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelected(boolean newSelected) {
        boolean oldSelected = selected;
        selected = newSelected;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE__SELECTED, oldSelected, selected));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeConstraintConnection> getAttributeConstraints() {
        if (attributeConstraints == null) {
            attributeConstraints = new EObjectWithInverseResolvingEList<AttributeConstraintConnection>(AttributeConstraintConnection.class, this, FCOREPackage.FEATURE__ATTRIBUTE_CONSTRAINTS, FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE);
        }
        return attributeConstraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, FCOREPackage.FEATURE__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FeatureConstraint> getFeatureConstraintsStarts() {
        if (featureConstraintsStarts == null) {
            featureConstraintsStarts = new EObjectWithInverseResolvingEList<FeatureConstraint>(FeatureConstraint.class, this, FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_STARTS, FCOREPackage.FEATURE_CONSTRAINT__FEATURE_START);
        }
        return featureConstraintsStarts;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FeatureConstraint> getFeatureConstraintsEnds() {
        if (featureConstraintsEnds == null) {
            featureConstraintsEnds = new EObjectWithInverseResolvingEList<FeatureConstraint>(FeatureConstraint.class, this, FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_ENDS, FCOREPackage.FEATURE_CONSTRAINT__FEATURE_END);
        }
        return featureConstraintsEnds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InfluenceFeature> getInfluences() {
        if (influences == null) {
            influences = new EObjectWithInverseResolvingEList<InfluenceFeature>(InfluenceFeature.class, this, FCOREPackage.FEATURE__INFLUENCES, FCOREPackage.INFLUENCE_FEATURE__FEATURE);
        }
        return influences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SingleFeatureConnection> getOutgoingSingleFeatureConnections() {
        if (outgoingSingleFeatureConnections == null) {
            outgoingSingleFeatureConnections = new EObjectWithInverseResolvingEList<SingleFeatureConnection>(SingleFeatureConnection.class, this, FCOREPackage.FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS, FCOREPackage.SINGLE_FEATURE_CONNECTION__SOURCE);
        }
        return outgoingSingleFeatureConnections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FeatureToGroupConnection> getFeatureToGroupConnections() {
        if (featureToGroupConnections == null) {
            featureToGroupConnections = new EObjectWithInverseResolvingEList<FeatureToGroupConnection>(FeatureToGroupConnection.class, this, FCOREPackage.FEATURE__FEATURE_TO_GROUP_CONNECTIONS, FCOREPackage.FEATURE_TO_GROUP_CONNECTION__SOURCE);
        }
        return featureToGroupConnections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.FEATURE__ATTRIBUTE_CONSTRAINTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttributeConstraints()).basicAdd(otherEnd, msgs);
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_STARTS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureConstraintsStarts()).basicAdd(otherEnd, msgs);
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_ENDS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureConstraintsEnds()).basicAdd(otherEnd, msgs);
            case FCOREPackage.FEATURE__INFLUENCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfluences()).basicAdd(otherEnd, msgs);
            case FCOREPackage.FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingSingleFeatureConnections()).basicAdd(otherEnd, msgs);
            case FCOREPackage.FEATURE__FEATURE_TO_GROUP_CONNECTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureToGroupConnections()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.FEATURE__ATTRIBUTE_CONSTRAINTS:
                return ((InternalEList<?>)getAttributeConstraints()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_STARTS:
                return ((InternalEList<?>)getFeatureConstraintsStarts()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_ENDS:
                return ((InternalEList<?>)getFeatureConstraintsEnds()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE__INFLUENCES:
                return ((InternalEList<?>)getInfluences()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS:
                return ((InternalEList<?>)getOutgoingSingleFeatureConnections()).basicRemove(otherEnd, msgs);
            case FCOREPackage.FEATURE__FEATURE_TO_GROUP_CONNECTIONS:
                return ((InternalEList<?>)getFeatureToGroupConnections()).basicRemove(otherEnd, msgs);
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
            case FCOREPackage.FEATURE__NAME:
                return getName();
            case FCOREPackage.FEATURE__SELECTED:
                return isSelected();
            case FCOREPackage.FEATURE__ATTRIBUTE_CONSTRAINTS:
                return getAttributeConstraints();
            case FCOREPackage.FEATURE__ATTRIBUTES:
                return getAttributes();
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_STARTS:
                return getFeatureConstraintsStarts();
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_ENDS:
                return getFeatureConstraintsEnds();
            case FCOREPackage.FEATURE__INFLUENCES:
                return getInfluences();
            case FCOREPackage.FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS:
                return getOutgoingSingleFeatureConnections();
            case FCOREPackage.FEATURE__FEATURE_TO_GROUP_CONNECTIONS:
                return getFeatureToGroupConnections();
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
            case FCOREPackage.FEATURE__NAME:
                setName((String)newValue);
                return;
            case FCOREPackage.FEATURE__SELECTED:
                setSelected((Boolean)newValue);
                return;
            case FCOREPackage.FEATURE__ATTRIBUTE_CONSTRAINTS:
                getAttributeConstraints().clear();
                getAttributeConstraints().addAll((Collection<? extends AttributeConstraintConnection>)newValue);
                return;
            case FCOREPackage.FEATURE__ATTRIBUTES:
                getAttributes().clear();
                getAttributes().addAll((Collection<? extends Attribute>)newValue);
                return;
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_STARTS:
                getFeatureConstraintsStarts().clear();
                getFeatureConstraintsStarts().addAll((Collection<? extends FeatureConstraint>)newValue);
                return;
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_ENDS:
                getFeatureConstraintsEnds().clear();
                getFeatureConstraintsEnds().addAll((Collection<? extends FeatureConstraint>)newValue);
                return;
            case FCOREPackage.FEATURE__INFLUENCES:
                getInfluences().clear();
                getInfluences().addAll((Collection<? extends InfluenceFeature>)newValue);
                return;
            case FCOREPackage.FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS:
                getOutgoingSingleFeatureConnections().clear();
                getOutgoingSingleFeatureConnections().addAll((Collection<? extends SingleFeatureConnection>)newValue);
                return;
            case FCOREPackage.FEATURE__FEATURE_TO_GROUP_CONNECTIONS:
                getFeatureToGroupConnections().clear();
                getFeatureToGroupConnections().addAll((Collection<? extends FeatureToGroupConnection>)newValue);
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
            case FCOREPackage.FEATURE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case FCOREPackage.FEATURE__SELECTED:
                setSelected(SELECTED_EDEFAULT);
                return;
            case FCOREPackage.FEATURE__ATTRIBUTE_CONSTRAINTS:
                getAttributeConstraints().clear();
                return;
            case FCOREPackage.FEATURE__ATTRIBUTES:
                getAttributes().clear();
                return;
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_STARTS:
                getFeatureConstraintsStarts().clear();
                return;
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_ENDS:
                getFeatureConstraintsEnds().clear();
                return;
            case FCOREPackage.FEATURE__INFLUENCES:
                getInfluences().clear();
                return;
            case FCOREPackage.FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS:
                getOutgoingSingleFeatureConnections().clear();
                return;
            case FCOREPackage.FEATURE__FEATURE_TO_GROUP_CONNECTIONS:
                getFeatureToGroupConnections().clear();
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
            case FCOREPackage.FEATURE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case FCOREPackage.FEATURE__SELECTED:
                return selected != SELECTED_EDEFAULT;
            case FCOREPackage.FEATURE__ATTRIBUTE_CONSTRAINTS:
                return attributeConstraints != null && !attributeConstraints.isEmpty();
            case FCOREPackage.FEATURE__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_STARTS:
                return featureConstraintsStarts != null && !featureConstraintsStarts.isEmpty();
            case FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_ENDS:
                return featureConstraintsEnds != null && !featureConstraintsEnds.isEmpty();
            case FCOREPackage.FEATURE__INFLUENCES:
                return influences != null && !influences.isEmpty();
            case FCOREPackage.FEATURE__OUTGOING_SINGLE_FEATURE_CONNECTIONS:
                return outgoingSingleFeatureConnections != null && !outgoingSingleFeatureConnections.isEmpty();
            case FCOREPackage.FEATURE__FEATURE_TO_GROUP_CONNECTIONS:
                return featureToGroupConnections != null && !featureToGroupConnections.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", selected: ");
        result.append(selected);
        result.append(')');
        return result.toString();
    }

} //FeatureImpl
