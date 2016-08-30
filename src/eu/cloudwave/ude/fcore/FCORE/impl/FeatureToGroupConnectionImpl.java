/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.FCORE.FeatureGroup;
import eu.cloudwave.ude.fcore.FCORE.FeatureToGroupConnection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature To Group Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureToGroupConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureToGroupConnectionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureToGroupConnectionImpl extends ConncectionImpl implements FeatureToGroupConnection {
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected Feature source;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected FeatureGroup target;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FeatureToGroupConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.FEATURE_TO_GROUP_CONNECTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Feature getSource() {
        if (source != null && source.eIsProxy()) {
            InternalEObject oldSource = (InternalEObject)source;
            source = (Feature)eResolveProxy(oldSource);
            if (source != oldSource) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.FEATURE_TO_GROUP_CONNECTION__SOURCE, oldSource, source));
            }
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Feature basicGetSource() {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSource(Feature newSource, NotificationChain msgs) {
        Feature oldSource = source;
        source = newSource;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_TO_GROUP_CONNECTION__SOURCE, oldSource, newSource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(Feature newSource) {
        if (newSource != source) {
            NotificationChain msgs = null;
            if (source != null)
                msgs = ((InternalEObject)source).eInverseRemove(this, FCOREPackage.FEATURE__FEATURE_TO_GROUP_CONNECTIONS, Feature.class, msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, FCOREPackage.FEATURE__FEATURE_TO_GROUP_CONNECTIONS, Feature.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_TO_GROUP_CONNECTION__SOURCE, newSource, newSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureGroup getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (FeatureGroup)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureGroup basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(FeatureGroup newTarget, NotificationChain msgs) {
        FeatureGroup oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(FeatureGroup newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION, FeatureGroup.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION, FeatureGroup.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__SOURCE:
                if (source != null)
                    msgs = ((InternalEObject)source).eInverseRemove(this, FCOREPackage.FEATURE__FEATURE_TO_GROUP_CONNECTIONS, Feature.class, msgs);
                return basicSetSource((Feature)otherEnd, msgs);
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, FCOREPackage.FEATURE_GROUP__FEATURE_TO_GROUP_CONNECTION, FeatureGroup.class, msgs);
                return basicSetTarget((FeatureGroup)otherEnd, msgs);
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
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__SOURCE:
                return basicSetSource(null, msgs);
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET:
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
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET:
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
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__SOURCE:
                setSource((Feature)newValue);
                return;
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET:
                setTarget((FeatureGroup)newValue);
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
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__SOURCE:
                setSource((Feature)null);
                return;
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET:
                setTarget((FeatureGroup)null);
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
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__SOURCE:
                return source != null;
            case FCOREPackage.FEATURE_TO_GROUP_CONNECTION__TARGET:
                return target != null;
        }
        return super.eIsSet(featureID);
    }

} //FeatureToGroupConnectionImpl
