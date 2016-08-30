/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.FeatureGroup;
import eu.cloudwave.ude.fcore.FCORE.GroupFeature;
import eu.cloudwave.ude.fcore.FCORE.GroupToFeatureConnection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group To Feature Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.GroupToFeatureConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.GroupToFeatureConnectionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupToFeatureConnectionImpl extends ConncectionImpl implements GroupToFeatureConnection {
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected FeatureGroup source;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected GroupFeature target;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GroupToFeatureConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.GROUP_TO_FEATURE_CONNECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureGroup getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (FeatureGroup)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.GROUP_TO_FEATURE_CONNECTION__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureGroup basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSource(FeatureGroup newSource, NotificationChain msgs) {
        FeatureGroup oldSource = source;
        source = newSource;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.GROUP_TO_FEATURE_CONNECTION__SOURCE, oldSource, newSource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(FeatureGroup newSource) {
        if (newSource != source) {
            NotificationChain msgs = null;
            if (source != null)
                msgs = ((InternalEObject)source).eInverseRemove(this, FCOREPackage.FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS, FeatureGroup.class, msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, FCOREPackage.FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS, FeatureGroup.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.GROUP_TO_FEATURE_CONNECTION__SOURCE, newSource, newSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GroupFeature getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (GroupFeature)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GroupFeature basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(GroupFeature newTarget, NotificationChain msgs) {
        GroupFeature oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(GroupFeature newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION, GroupFeature.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION, GroupFeature.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__SOURCE:
                if (source != null)
                    msgs = ((InternalEObject)source).eInverseRemove(this, FCOREPackage.FEATURE_GROUP__GROUP_TO_FEATURE_CONNECTIONS, FeatureGroup.class, msgs);
                return basicSetSource((FeatureGroup)otherEnd, msgs);
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, FCOREPackage.GROUP_FEATURE__GROUP_TO_FEATURE_CONNECTION, GroupFeature.class, msgs);
                return basicSetTarget((GroupFeature)otherEnd, msgs);
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
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__SOURCE:
                return basicSetSource(null, msgs);
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET:
                return basicSetTarget(null, msgs);
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
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
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
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__SOURCE:
                setSource((FeatureGroup)newValue);
                return;
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET:
                setTarget((GroupFeature)newValue);
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
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__SOURCE:
                setSource((FeatureGroup)null);
                return;
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET:
                setTarget((GroupFeature)null);
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
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__SOURCE:
                return source != null;
            case FCOREPackage.GROUP_TO_FEATURE_CONNECTION__TARGET:
                return target != null;
        }
        return super.eIsSet(featureID);
    }

} //GroupToFeatureConnectionImpl
