/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.Influence;
import eu.cloudwave.ude.fcore.FCORE.Softgoal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.InfluenceImpl#getContribution <em>Contribution</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.InfluenceImpl#getSoftgoal <em>Softgoal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InfluenceImpl extends ConncectionImpl implements Influence {
    /**
     * The default value of the '{@link #getContribution() <em>Contribution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContribution()
     * @generated
     * @ordered
     */
    protected static final float CONTRIBUTION_EDEFAULT = 1.0F;

    /**
     * The cached value of the '{@link #getContribution() <em>Contribution</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContribution()
     * @generated
     * @ordered
     */
    protected float              contribution          = CONTRIBUTION_EDEFAULT;

    /**
     * The cached value of the '{@link #getSoftgoal() <em>Softgoal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoftgoal()
     * @generated
     * @ordered
     */
    protected Softgoal                      softgoal;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InfluenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.INFLUENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public float getContribution() {
        return contribution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContribution(float newContribution) {
        float oldContribution = contribution;
        contribution = newContribution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.INFLUENCE__CONTRIBUTION, oldContribution, contribution));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Softgoal getSoftgoal() {
        if (softgoal != null && softgoal.eIsProxy()) {
            InternalEObject oldSoftgoal = (InternalEObject)softgoal;
            softgoal = (Softgoal)eResolveProxy(oldSoftgoal);
            if (softgoal != oldSoftgoal) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.INFLUENCE__SOFTGOAL, oldSoftgoal, softgoal));
            }
        }
        return softgoal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Softgoal basicGetSoftgoal() {
        return softgoal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSoftgoal(Softgoal newSoftgoal, NotificationChain msgs) {
        Softgoal oldSoftgoal = softgoal;
        softgoal = newSoftgoal;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.INFLUENCE__SOFTGOAL, oldSoftgoal, newSoftgoal);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSoftgoal(Softgoal newSoftgoal) {
        if (newSoftgoal != softgoal) {
            NotificationChain msgs = null;
            if (softgoal != null)
                msgs = ((InternalEObject)softgoal).eInverseRemove(this, FCOREPackage.SOFTGOAL__INFLUENCE, Softgoal.class, msgs);
            if (newSoftgoal != null)
                msgs = ((InternalEObject)newSoftgoal).eInverseAdd(this, FCOREPackage.SOFTGOAL__INFLUENCE, Softgoal.class, msgs);
            msgs = basicSetSoftgoal(newSoftgoal, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.INFLUENCE__SOFTGOAL, newSoftgoal, newSoftgoal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.INFLUENCE__SOFTGOAL:
                if (softgoal != null)
                    msgs = ((InternalEObject)softgoal).eInverseRemove(this, FCOREPackage.SOFTGOAL__INFLUENCE, Softgoal.class, msgs);
                return basicSetSoftgoal((Softgoal)otherEnd, msgs);
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
            case FCOREPackage.INFLUENCE__SOFTGOAL:
                return basicSetSoftgoal(null, msgs);
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
            case FCOREPackage.INFLUENCE__CONTRIBUTION:
                return getContribution();
            case FCOREPackage.INFLUENCE__SOFTGOAL:
                if (resolve) return getSoftgoal();
                return basicGetSoftgoal();
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
            case FCOREPackage.INFLUENCE__CONTRIBUTION:
                setContribution((Float)newValue);
                return;
            case FCOREPackage.INFLUENCE__SOFTGOAL:
                setSoftgoal((Softgoal)newValue);
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
            case FCOREPackage.INFLUENCE__CONTRIBUTION:
                setContribution(CONTRIBUTION_EDEFAULT);
                return;
            case FCOREPackage.INFLUENCE__SOFTGOAL:
                setSoftgoal((Softgoal)null);
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
            case FCOREPackage.INFLUENCE__CONTRIBUTION:
                return contribution != CONTRIBUTION_EDEFAULT;
            case FCOREPackage.INFLUENCE__SOFTGOAL:
                return softgoal != null;
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
        result.append(" (contribution: ");
        result.append(contribution);
        result.append(')');
        return result.toString();
    }

} //InfluenceImpl
