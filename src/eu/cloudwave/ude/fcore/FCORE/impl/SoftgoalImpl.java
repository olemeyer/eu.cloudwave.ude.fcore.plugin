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
import eu.cloudwave.ude.fcore.FCORE.Influence;
import eu.cloudwave.ude.fcore.FCORE.Softgoal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Softgoal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.SoftgoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.SoftgoalImpl#getInfluence <em>Influence</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.SoftgoalImpl#getWeighting <em>Weighting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftgoalImpl extends MinimalEObjectImpl.Container implements Softgoal {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT      = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String              name               = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getInfluence() <em>Influence</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInfluence()
     * @generated
     * @ordered
     */
    protected EList<Influence>    influence;

    /**
     * The default value of the '{@link #getWeighting() <em>Weighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeighting()
     * @generated
     * @ordered
     */
    protected static final String WEIGHTING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWeighting() <em>Weighting</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWeighting()
     * @generated
     * @ordered
     */
    protected String              weighting          = WEIGHTING_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SoftgoalImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.SOFTGOAL;
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
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.SOFTGOAL__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Influence> getInfluence() {
        if (influence == null) {
            influence = new EObjectWithInverseResolvingEList<Influence>(Influence.class, this, FCOREPackage.SOFTGOAL__INFLUENCE, FCOREPackage.INFLUENCE__SOFTGOAL);
        }
        return influence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWeighting() {
        return weighting;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWeighting(String newWeighting) {
        String oldWeighting = weighting;
        weighting = newWeighting;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.SOFTGOAL__WEIGHTING, oldWeighting, weighting));
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
            case FCOREPackage.SOFTGOAL__INFLUENCE:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfluence()).basicAdd(otherEnd, msgs);
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
            case FCOREPackage.SOFTGOAL__INFLUENCE:
                return ((InternalEList<?>)getInfluence()).basicRemove(otherEnd, msgs);
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
            case FCOREPackage.SOFTGOAL__NAME:
                return getName();
            case FCOREPackage.SOFTGOAL__INFLUENCE:
                return getInfluence();
            case FCOREPackage.SOFTGOAL__WEIGHTING:
                return getWeighting();
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
            case FCOREPackage.SOFTGOAL__NAME:
                setName((String)newValue);
                return;
            case FCOREPackage.SOFTGOAL__INFLUENCE:
                getInfluence().clear();
                getInfluence().addAll((Collection<? extends Influence>)newValue);
                return;
            case FCOREPackage.SOFTGOAL__WEIGHTING:
                setWeighting((String)newValue);
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
            case FCOREPackage.SOFTGOAL__NAME:
                setName(NAME_EDEFAULT);
                return;
            case FCOREPackage.SOFTGOAL__INFLUENCE:
                getInfluence().clear();
                return;
            case FCOREPackage.SOFTGOAL__WEIGHTING:
                setWeighting(WEIGHTING_EDEFAULT);
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
            case FCOREPackage.SOFTGOAL__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case FCOREPackage.SOFTGOAL__INFLUENCE:
                return influence != null && !influence.isEmpty();
            case FCOREPackage.SOFTGOAL__WEIGHTING:
                return WEIGHTING_EDEFAULT == null ? weighting != null : !WEIGHTING_EDEFAULT.equals(weighting);
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
        result.append(", weighting: ");
        result.append(weighting);
        result.append(')');
        return result.toString();
    }

} //SoftgoalImpl
