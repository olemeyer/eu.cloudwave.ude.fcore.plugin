/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.SingleFeatureConnection;
import eu.cloudwave.ude.fcore.FCORE.SolitaryFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solitary Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.SolitaryFeatureImpl#getMin <em>Min</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.SolitaryFeatureImpl#getMax <em>Max</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.SolitaryFeatureImpl#getIncomingSingleFeatureConnection <em>Incoming Single Feature Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolitaryFeatureImpl extends FeatureImpl implements SolitaryFeature {
    /**
     * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected static final int MIN_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected int              min          = MIN_EDEFAULT;

    /**
     * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected static final int MAX_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected int              max          = MAX_EDEFAULT;

    /**
     * The cached value of the '{@link #getIncomingSingleFeatureConnection() <em>Incoming Single Feature Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncomingSingleFeatureConnection()
     * @generated
     * @ordered
     */
    protected SingleFeatureConnection incomingSingleFeatureConnection;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SolitaryFeatureImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.SOLITARY_FEATURE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.SOLITARY_FEATURE__MIN, oldMin, min));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.SOLITARY_FEATURE__MAX, oldMax, max));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SingleFeatureConnection getIncomingSingleFeatureConnection() {
        if (incomingSingleFeatureConnection != null && incomingSingleFeatureConnection.eIsProxy()) {
            InternalEObject oldIncomingSingleFeatureConnection = (InternalEObject)incomingSingleFeatureConnection;
            incomingSingleFeatureConnection = (SingleFeatureConnection)eResolveProxy(oldIncomingSingleFeatureConnection);
            if (incomingSingleFeatureConnection != oldIncomingSingleFeatureConnection) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION, oldIncomingSingleFeatureConnection, incomingSingleFeatureConnection));
            }
        }
        return incomingSingleFeatureConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SingleFeatureConnection basicGetIncomingSingleFeatureConnection() {
        return incomingSingleFeatureConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetIncomingSingleFeatureConnection(SingleFeatureConnection newIncomingSingleFeatureConnection, NotificationChain msgs) {
        SingleFeatureConnection oldIncomingSingleFeatureConnection = incomingSingleFeatureConnection;
        incomingSingleFeatureConnection = newIncomingSingleFeatureConnection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION, oldIncomingSingleFeatureConnection, newIncomingSingleFeatureConnection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIncomingSingleFeatureConnection(SingleFeatureConnection newIncomingSingleFeatureConnection) {
        if (newIncomingSingleFeatureConnection != incomingSingleFeatureConnection) {
            NotificationChain msgs = null;
            if (incomingSingleFeatureConnection != null)
                msgs = ((InternalEObject)incomingSingleFeatureConnection).eInverseRemove(this, FCOREPackage.SINGLE_FEATURE_CONNECTION__TARGET, SingleFeatureConnection.class, msgs);
            if (newIncomingSingleFeatureConnection != null)
                msgs = ((InternalEObject)newIncomingSingleFeatureConnection).eInverseAdd(this, FCOREPackage.SINGLE_FEATURE_CONNECTION__TARGET, SingleFeatureConnection.class, msgs);
            msgs = basicSetIncomingSingleFeatureConnection(newIncomingSingleFeatureConnection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION, newIncomingSingleFeatureConnection, newIncomingSingleFeatureConnection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION:
                if (incomingSingleFeatureConnection != null)
                    msgs = ((InternalEObject)incomingSingleFeatureConnection).eInverseRemove(this, FCOREPackage.SINGLE_FEATURE_CONNECTION__TARGET, SingleFeatureConnection.class, msgs);
                return basicSetIncomingSingleFeatureConnection((SingleFeatureConnection)otherEnd, msgs);
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
            case FCOREPackage.SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION:
                return basicSetIncomingSingleFeatureConnection(null, msgs);
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
            case FCOREPackage.SOLITARY_FEATURE__MIN:
                return getMin();
            case FCOREPackage.SOLITARY_FEATURE__MAX:
                return getMax();
            case FCOREPackage.SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION:
                if (resolve) return getIncomingSingleFeatureConnection();
                return basicGetIncomingSingleFeatureConnection();
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
            case FCOREPackage.SOLITARY_FEATURE__MIN:
                setMin((Integer)newValue);
                return;
            case FCOREPackage.SOLITARY_FEATURE__MAX:
                setMax((Integer)newValue);
                return;
            case FCOREPackage.SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION:
                setIncomingSingleFeatureConnection((SingleFeatureConnection)newValue);
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
            case FCOREPackage.SOLITARY_FEATURE__MIN:
                setMin(MIN_EDEFAULT);
                return;
            case FCOREPackage.SOLITARY_FEATURE__MAX:
                setMax(MAX_EDEFAULT);
                return;
            case FCOREPackage.SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION:
                setIncomingSingleFeatureConnection((SingleFeatureConnection)null);
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
            case FCOREPackage.SOLITARY_FEATURE__MIN:
                return min != MIN_EDEFAULT;
            case FCOREPackage.SOLITARY_FEATURE__MAX:
                return max != MAX_EDEFAULT;
            case FCOREPackage.SOLITARY_FEATURE__INCOMING_SINGLE_FEATURE_CONNECTION:
                return incomingSingleFeatureConnection != null;
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

} //SolitaryFeatureImpl
