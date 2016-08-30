/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import eu.cloudwave.ude.fcore.FCORE.AttributeConstraint;
import eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.Feature;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintConnectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintConnectionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeConstraintConnectionImpl extends ConncectionImpl implements AttributeConstraintConnection {
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
    protected AttributeConstraint target;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeConstraintConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.ATTRIBUTE_CONSTRAINT_CONNECTION;
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
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE, oldSource, source));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE, oldSource, newSource);
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
                msgs = ((InternalEObject)source).eInverseRemove(this, FCOREPackage.FEATURE__ATTRIBUTE_CONSTRAINTS, Feature.class, msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, FCOREPackage.FEATURE__ATTRIBUTE_CONSTRAINTS, Feature.class, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE, newSource, newSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeConstraint getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (AttributeConstraint)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeConstraint basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(AttributeConstraint newTarget, NotificationChain msgs) {
        AttributeConstraint oldTarget = target;
        target = newTarget;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(AttributeConstraint newTarget) {
        if (newTarget != target) {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION, AttributeConstraint.class, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION, AttributeConstraint.class, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE:
                if (source != null)
                    msgs = ((InternalEObject)source).eInverseRemove(this, FCOREPackage.FEATURE__ATTRIBUTE_CONSTRAINTS, Feature.class, msgs);
                return basicSetSource((Feature)otherEnd, msgs);
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET:
                if (target != null)
                    msgs = ((InternalEObject)target).eInverseRemove(this, FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION, AttributeConstraint.class, msgs);
                return basicSetTarget((AttributeConstraint)otherEnd, msgs);
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
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE:
                return basicSetSource(null, msgs);
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET:
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
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE:
                if (resolve) return getSource();
                return basicGetSource();
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET:
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
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE:
                setSource((Feature)newValue);
                return;
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET:
                setTarget((AttributeConstraint)newValue);
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
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE:
                setSource((Feature)null);
                return;
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET:
                setTarget((AttributeConstraint)null);
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
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__SOURCE:
                return source != null;
            case FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET:
                return target != null;
        }
        return super.eIsSet(featureID);
    }

} //AttributeConstraintConnectionImpl
