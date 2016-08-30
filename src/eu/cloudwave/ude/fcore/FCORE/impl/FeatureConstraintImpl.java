/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.Feature;
import eu.cloudwave.ude.fcore.FCORE.FeatureConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureConstraintImpl#getFeatureStart <em>Feature Start</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.FeatureConstraintImpl#getFeatureEnd <em>Feature End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureConstraintImpl extends ConncectionImpl implements FeatureConstraint {
    /**
     * The cached value of the '{@link #getFeatureStart() <em>Feature Start</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureStart()
     * @generated
     * @ordered
     */
    protected Feature featureStart;

    /**
     * The cached value of the '{@link #getFeatureEnd() <em>Feature End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFeatureEnd()
     * @generated
     * @ordered
     */
    protected Feature featureEnd;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FeatureConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.FEATURE_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Feature getFeatureStart() {
        if (featureStart != null && featureStart.eIsProxy()) {
            InternalEObject oldFeatureStart = (InternalEObject)featureStart;
            featureStart = (Feature)eResolveProxy(oldFeatureStart);
            if (featureStart != oldFeatureStart) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.FEATURE_CONSTRAINT__FEATURE_START, oldFeatureStart, featureStart));
            }
        }
        return featureStart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Feature basicGetFeatureStart() {
        return featureStart;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFeatureStart(Feature newFeatureStart, NotificationChain msgs) {
        Feature oldFeatureStart = featureStart;
        featureStart = newFeatureStart;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_CONSTRAINT__FEATURE_START, oldFeatureStart, newFeatureStart);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeatureStart(Feature newFeatureStart) {
        if (newFeatureStart != featureStart) {
            NotificationChain msgs = null;
            if (featureStart != null)
                msgs = ((InternalEObject)featureStart).eInverseRemove(this, FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_STARTS, Feature.class, msgs);
            if (newFeatureStart != null)
                msgs = ((InternalEObject)newFeatureStart).eInverseAdd(this, FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_STARTS, Feature.class, msgs);
            msgs = basicSetFeatureStart(newFeatureStart, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_CONSTRAINT__FEATURE_START, newFeatureStart, newFeatureStart));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Feature getFeatureEnd() {
        if (featureEnd != null && featureEnd.eIsProxy()) {
            InternalEObject oldFeatureEnd = (InternalEObject)featureEnd;
            featureEnd = (Feature)eResolveProxy(oldFeatureEnd);
            if (featureEnd != oldFeatureEnd) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.FEATURE_CONSTRAINT__FEATURE_END, oldFeatureEnd, featureEnd));
            }
        }
        return featureEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Feature basicGetFeatureEnd() {
        return featureEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetFeatureEnd(Feature newFeatureEnd, NotificationChain msgs) {
        Feature oldFeatureEnd = featureEnd;
        featureEnd = newFeatureEnd;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_CONSTRAINT__FEATURE_END, oldFeatureEnd, newFeatureEnd);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFeatureEnd(Feature newFeatureEnd) {
        if (newFeatureEnd != featureEnd) {
            NotificationChain msgs = null;
            if (featureEnd != null)
                msgs = ((InternalEObject)featureEnd).eInverseRemove(this, FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_ENDS, Feature.class, msgs);
            if (newFeatureEnd != null)
                msgs = ((InternalEObject)newFeatureEnd).eInverseAdd(this, FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_ENDS, Feature.class, msgs);
            msgs = basicSetFeatureEnd(newFeatureEnd, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.FEATURE_CONSTRAINT__FEATURE_END, newFeatureEnd, newFeatureEnd));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_START:
                if (featureStart != null)
                    msgs = ((InternalEObject)featureStart).eInverseRemove(this, FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_STARTS, Feature.class, msgs);
                return basicSetFeatureStart((Feature)otherEnd, msgs);
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_END:
                if (featureEnd != null)
                    msgs = ((InternalEObject)featureEnd).eInverseRemove(this, FCOREPackage.FEATURE__FEATURE_CONSTRAINTS_ENDS, Feature.class, msgs);
                return basicSetFeatureEnd((Feature)otherEnd, msgs);
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
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_START:
                return basicSetFeatureStart(null, msgs);
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_END:
                return basicSetFeatureEnd(null, msgs);
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
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_START:
                if (resolve) return getFeatureStart();
                return basicGetFeatureStart();
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_END:
                if (resolve) return getFeatureEnd();
                return basicGetFeatureEnd();
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
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_START:
                setFeatureStart((Feature)newValue);
                return;
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_END:
                setFeatureEnd((Feature)newValue);
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
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_START:
                setFeatureStart((Feature)null);
                return;
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_END:
                setFeatureEnd((Feature)null);
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
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_START:
                return featureStart != null;
            case FCOREPackage.FEATURE_CONSTRAINT__FEATURE_END:
                return featureEnd != null;
        }
        return super.eIsSet(featureID);
    }

} //FeatureConstraintImpl
