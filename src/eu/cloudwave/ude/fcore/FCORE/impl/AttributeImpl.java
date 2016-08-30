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
import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeImpl#getInfluences <em>Influences</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeImpl#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String       NAME_EDEFAULT  = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String                    name           = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getInfluences() <em>Influences</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInfluences()
     * @generated
     * @ordered
     */
    protected EList<InfluenceAttribute> influences;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final int          VALUE_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected int                       value          = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected static final int          MIN_EDEFAULT   = 1;

    /**
     * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMin()
     * @generated
     * @ordered
     */
    protected int                       min            = MIN_EDEFAULT;

    /**
     * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected static final int          MAX_EDEFAULT   = 1;

    /**
     * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected int                       max            = MAX_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.ATTRIBUTE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<InfluenceAttribute> getInfluences() {
        if (influences == null) {
            influences = new EObjectWithInverseResolvingEList<InfluenceAttribute>(InfluenceAttribute.class, this, FCOREPackage.ATTRIBUTE__INFLUENCES, FCOREPackage.INFLUENCE_ATTRIBUTE__ATTRIBUTE);
        }
        return influences;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(int newValue) {
        int oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE__VALUE, oldValue, value));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE__MIN, oldMin, min));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE__MAX, oldMax, max));
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
            case FCOREPackage.ATTRIBUTE__INFLUENCES:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getInfluences()).basicAdd(otherEnd, msgs);
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
            case FCOREPackage.ATTRIBUTE__INFLUENCES:
                return ((InternalEList<?>)getInfluences()).basicRemove(otherEnd, msgs);
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
            case FCOREPackage.ATTRIBUTE__NAME:
                return getName();
            case FCOREPackage.ATTRIBUTE__INFLUENCES:
                return getInfluences();
            case FCOREPackage.ATTRIBUTE__VALUE:
                return getValue();
            case FCOREPackage.ATTRIBUTE__MIN:
                return getMin();
            case FCOREPackage.ATTRIBUTE__MAX:
                return getMax();
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
            case FCOREPackage.ATTRIBUTE__NAME:
                setName((String)newValue);
                return;
            case FCOREPackage.ATTRIBUTE__INFLUENCES:
                getInfluences().clear();
                getInfluences().addAll((Collection<? extends InfluenceAttribute>)newValue);
                return;
            case FCOREPackage.ATTRIBUTE__VALUE:
                setValue((Integer)newValue);
                return;
            case FCOREPackage.ATTRIBUTE__MIN:
                setMin((Integer)newValue);
                return;
            case FCOREPackage.ATTRIBUTE__MAX:
                setMax((Integer)newValue);
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
            case FCOREPackage.ATTRIBUTE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case FCOREPackage.ATTRIBUTE__INFLUENCES:
                getInfluences().clear();
                return;
            case FCOREPackage.ATTRIBUTE__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case FCOREPackage.ATTRIBUTE__MIN:
                setMin(MIN_EDEFAULT);
                return;
            case FCOREPackage.ATTRIBUTE__MAX:
                setMax(MAX_EDEFAULT);
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
            case FCOREPackage.ATTRIBUTE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case FCOREPackage.ATTRIBUTE__INFLUENCES:
                return influences != null && !influences.isEmpty();
            case FCOREPackage.ATTRIBUTE__VALUE:
                return value != VALUE_EDEFAULT;
            case FCOREPackage.ATTRIBUTE__MIN:
                return min != MIN_EDEFAULT;
            case FCOREPackage.ATTRIBUTE__MAX:
                return max != MAX_EDEFAULT;
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
        result.append(", value: ");
        result.append(value);
        result.append(", min: ");
        result.append(min);
        result.append(", max: ");
        result.append(max);
        result.append(')');
        return result.toString();
    }

} //AttributeImpl
