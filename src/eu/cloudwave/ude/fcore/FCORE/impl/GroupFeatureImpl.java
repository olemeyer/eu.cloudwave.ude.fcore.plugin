/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.GroupFeature;

import eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.GroupFeatureImpl#getGroupToFeatureConnection <em>Group To Feature Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupFeatureImpl extends FeatureImpl implements GroupFeature {
    /**
     * The cached value of the '{@link #getGroupToFeatureConnection() <em>Group To Feature Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroupToFeatureConnection()
     * @generated
     * @ordered
     */
    protected GroupToFeatureConnection groupToFeatureConnection;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GroupFeatureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.GROUP_FEATURE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GroupToFeatureConnection getGroupToFeatureConnection() {
        if (groupToFeatureConnection != null && groupToFeatureConnection.eIsProxy()) {
            InternalEObject oldGroupToFeatureConnection = (InternalEObject)groupToFeatureConnection;
            groupToFeatureConnection = (GroupToFeatureConnection)eResolveProxy(oldGroupToFeatureConnection);
            if (groupToFeatureConnection != oldGroupToFeatureConnection) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION, oldGroupToFeatureConnection, groupToFeatureConnection));
            }
        }
        return groupToFeatureConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GroupToFeatureConnection basicGetGroupToFeatureConnection() {
        return groupToFeatureConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGroupToFeatureConnection(GroupToFeatureConnection newGroupToFeatureConnection, NotificationChain msgs) {
        GroupToFeatureConnection oldGroupToFeatureConnection = groupToFeatureConnection;
        groupToFeatureConnection = newGroupToFeatureConnection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION, oldGroupToFeatureConnection, newGroupToFeatureConnection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroupToFeatureConnection(GroupToFeatureConnection newGroupToFeatureConnection) {
        if (newGroupToFeatureConnection != groupToFeatureConnection) {
            NotificationChain msgs = null;
            if (groupToFeatureConnection != null)
                msgs = ((InternalEObject)groupToFeatureConnection).eInverseRemove(this, FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET, GroupToFeatureConnection.class, msgs);
            if (newGroupToFeatureConnection != null)
                msgs = ((InternalEObject)newGroupToFeatureConnection).eInverseAdd(this, FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET, GroupToFeatureConnection.class, msgs);
            msgs = basicSetGroupToFeatureConnection(newGroupToFeatureConnection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION, newGroupToFeatureConnection, newGroupToFeatureConnection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION:
                if (groupToFeatureConnection != null)
                    msgs = ((InternalEObject)groupToFeatureConnection).eInverseRemove(this, FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET, GroupToFeatureConnection.class, msgs);
                return basicSetGroupToFeatureConnection((GroupToFeatureConnection)otherEnd, msgs);
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
            case FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION:
                return basicSetGroupToFeatureConnection(null, msgs);
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
            case FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION:
                if (resolve) return getGroupToFeatureConnection();
                return basicGetGroupToFeatureConnection();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION:
                setGroupToFeatureConnection((GroupToFeatureConnection)newValue);
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
            case FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION:
                setGroupToFeatureConnection((GroupToFeatureConnection)null);
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
            case FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION:
                return groupToFeatureConnection != null;
        }
        return super.eIsSet(featureID);
    }

} //GroupFeatureImpl
