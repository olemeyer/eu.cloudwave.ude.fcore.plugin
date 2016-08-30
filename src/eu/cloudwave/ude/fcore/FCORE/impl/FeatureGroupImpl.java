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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.FeatureGroup;
import eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection;
import eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureGroupImpl#getMin <em>Min</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureGroupImpl#getMax <em>Max</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureGroupImpl#getFeatureToGroupConnection <em>Feature To Group Connection</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureGroupImpl#getGroupToFeatureConnections <em>Group To Feature Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureGroupImpl extends MinimalEObjectImpl.Container implements FeatureGroup {
    /**
     * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected static final int    MIN_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected int                 min          = MIN_EDEFAULT;

    /**
     * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected static final int    MAX_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected int                 max          = MAX_EDEFAULT;

    /**
     * The cached value of the '{@link #getFeatureToGroupConnection() <em>Feature To Group Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureToGroupConnection()
     * @generated
     * @ordered
     */
    protected FeatureToGroupConnection featureToGroupConnection;

    /**
     * The cached value of the '{@link #getGroupToFeatureConnections() <em>Group To Feature Connections</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupToFeatureConnections()
     * @generated
     * @ordered
     */
    protected EList<GroupToFeatureConnection> groupToFeatureConnections;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FeatureGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.FEATURE_GROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMin() {
        return min;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMin(int newMin) {
        int oldMin = min;
        min = newMin;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_GROUP__MIN, oldMin, min));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMax() {
        return max;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMax(int newMax) {
        int oldMax = max;
        max = newMax;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_GROUP__MAX, oldMax, max));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureToGroupConnection getFeatureToGroupConnection() {
        if (featureToGroupConnection != null && featureToGroupConnection.eIsProxy()) {
            InternalEObject oldFeatureToGroupConnection = (InternalEObject)featureToGroupConnection;
            featureToGroupConnection = (FeatureToGroupConnection)eResolveProxy(oldFeatureToGroupConnection);
            if (featureToGroupConnection != oldFeatureToGroupConnection) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION, oldFeatureToGroupConnection, featureToGroupConnection));
            }
        }
        return featureToGroupConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureToGroupConnection basicGetFeatureToGroupConnection() {
        return featureToGroupConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFeatureToGroupConnection(FeatureToGroupConnection newFeatureToGroupConnection, NotificationChain msgs) {
        FeatureToGroupConnection oldFeatureToGroupConnection = featureToGroupConnection;
        featureToGroupConnection = newFeatureToGroupConnection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION, oldFeatureToGroupConnection, newFeatureToGroupConnection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeatureToGroupConnection(FeatureToGroupConnection newFeatureToGroupConnection) {
        if (newFeatureToGroupConnection != featureToGroupConnection) {
            NotificationChain msgs = null;
            if (featureToGroupConnection != null)
                msgs = ((InternalEObject)featureToGroupConnection).eInverseRemove(this, FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET, FeatureToGroupConnection.class, msgs);
            if (newFeatureToGroupConnection != null)
                msgs = ((InternalEObject)newFeatureToGroupConnection).eInverseAdd(this, FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET, FeatureToGroupConnection.class, msgs);
            msgs = basicSetFeatureToGroupConnection(newFeatureToGroupConnection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION, newFeatureToGroupConnection, newFeatureToGroupConnection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<GroupToFeatureConnection> getGroupToFeatureConnections() {
        if (groupToFeatureConnections == null) {
            groupToFeatureConnections = new EObjectWithInverseResolvingEList<GroupToFeatureConnection>(GroupToFeatureConnection.class, this, FCOREPackage.FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS, FCOREPackage.GROUP_TO_FEATURE_CONNECTION__SOURCE);
        }
        return groupToFeatureConnections;
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
            case FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION:
                if (featureToGroupConnection != null)
                    msgs = ((InternalEObject)featureToGroupConnection).eInverseRemove(this, FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET, FeatureToGroupConnection.class, msgs);
                return basicSetFeatureToGroupConnection((FeatureToGroupConnection)otherEnd, msgs);
            case FCOREPackage.FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroupToFeatureConnections()).basicAdd(otherEnd, msgs);
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
            case FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION:
                return basicSetFeatureToGroupConnection(null, msgs);
            case FCOREPackage.FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS:
                return ((InternalEList<?>)getGroupToFeatureConnections()).basicRemove(otherEnd, msgs);
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
            case FCOREPackage.FEATURE_GROUP__MIN:
                return getMin();
            case FCOREPackage.FEATURE_GROUP__MAX:
                return getMax();
            case FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION:
                if (resolve) return getFeatureToGroupConnection();
                return basicGetFeatureToGroupConnection();
            case FCOREPackage.FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS:
                return getGroupToFeatureConnections();
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
            case FCOREPackage.FEATURE_GROUP__MIN:
                setMin((Integer)newValue);
                return;
            case FCOREPackage.FEATURE_GROUP__MAX:
                setMax((Integer)newValue);
                return;
            case FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION:
                setFeatureToGroupConnection((FeatureToGroupConnection)newValue);
                return;
            case FCOREPackage.FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS:
                getGroupToFeatureConnections().clear();
                getGroupToFeatureConnections().addAll((Collection<? extends GroupToFeatureConnection>)newValue);
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
            case FCOREPackage.FEATURE_GROUP__MIN:
                setMin(MIN_EDEFAULT);
                return;
            case FCOREPackage.FEATURE_GROUP__MAX:
                setMax(MAX_EDEFAULT);
                return;
            case FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION:
                setFeatureToGroupConnection((FeatureToGroupConnection)null);
                return;
            case FCOREPackage.FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS:
                getGroupToFeatureConnections().clear();
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
            case FCOREPackage.FEATURE_GROUP__MIN:
                return min != MIN_EDEFAULT;
            case FCOREPackage.FEATURE_GROUP__MAX:
                return max != MAX_EDEFAULT;
            case FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION:
                return featureToGroupConnection != null;
            case FCOREPackage.FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS:
                return groupToFeatureConnections != null && !groupToFeatureConnections.isEmpty();
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
        result.append(" (min: ");
        result.append(min);
        result.append(", max: ");
        result.append(max);
        result.append(')');
        return result.toString();
    }

} //FeatureGroupImpl
