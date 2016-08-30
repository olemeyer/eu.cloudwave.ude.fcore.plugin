/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import eu.cloudwave.ude.fcore.FCORE.AttributeConstraint;
import eu.cloudwave.ude.fcore.FCORE.AttributeConstraintConnection;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintImpl#getEquation <em>Equation</em>}</li>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.AttributeConstraintImpl#getAttributeConstraintConnection <em>Attribute Constraint Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeConstraintImpl extends MinimalEObjectImpl.Container implements AttributeConstraint {
    /**
     * The default value of the '{@link #getEquation() <em>Equation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquation()
     * @generated
     * @ordered
     */
    protected static final String EQUATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEquation() <em>Equation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquation()
     * @generated
     * @ordered
     */
    protected String              equation          = EQUATION_EDEFAULT;

    /**
     * The cached value of the '{@link #getAttributeConstraintConnection() <em>Attribute Constraint Connection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeConstraintConnection()
     * @generated
     * @ordered
     */
    protected AttributeConstraintConnection attributeConstraintConnection;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.ATTRIBUTE_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEquation() {
        return equation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEquation(String newEquation) {
        String oldEquation = equation;
        equation = newEquation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE_CONSTRAINT__EQUATION, oldEquation, equation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeConstraintConnection getAttributeConstraintConnection() {
        if (attributeConstraintConnection != null && attributeConstraintConnection.eIsProxy()) {
            InternalEObject oldAttributeConstraintConnection = (InternalEObject)attributeConstraintConnection;
            attributeConstraintConnection = (AttributeConstraintConnection)eResolveProxy(oldAttributeConstraintConnection);
            if (attributeConstraintConnection != oldAttributeConstraintConnection) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION, oldAttributeConstraintConnection, attributeConstraintConnection));
            }
        }
        return attributeConstraintConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeConstraintConnection basicGetAttributeConstraintConnection() {
        return attributeConstraintConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAttributeConstraintConnection(AttributeConstraintConnection newAttributeConstraintConnection, NotificationChain msgs) {
        AttributeConstraintConnection oldAttributeConstraintConnection = attributeConstraintConnection;
        attributeConstraintConnection = newAttributeConstraintConnection;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION, oldAttributeConstraintConnection, newAttributeConstraintConnection);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributeConstraintConnection(AttributeConstraintConnection newAttributeConstraintConnection) {
        if (newAttributeConstraintConnection != attributeConstraintConnection) {
            NotificationChain msgs = null;
            if (attributeConstraintConnection != null)
                msgs = ((InternalEObject)attributeConstraintConnection).eInverseRemove(this, FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET, AttributeConstraintConnection.class, msgs);
            if (newAttributeConstraintConnection != null)
                msgs = ((InternalEObject)newAttributeConstraintConnection).eInverseAdd(this, FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET, AttributeConstraintConnection.class, msgs);
            msgs = basicSetAttributeConstraintConnection(newAttributeConstraintConnection, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION, newAttributeConstraintConnection, newAttributeConstraintConnection));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION:
                if (attributeConstraintConnection != null)
                    msgs = ((InternalEObject)attributeConstraintConnection).eInverseRemove(this, FCOREPackage.ATTRIBUTE_CONSTRAINT_CONNECTION__TARGET, AttributeConstraintConnection.class, msgs);
                return basicSetAttributeConstraintConnection((AttributeConstraintConnection)otherEnd, msgs);
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
            case FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION:
                return basicSetAttributeConstraintConnection(null, msgs);
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
            case FCOREPackage.ATTRIBUTE_CONSTRAINT__EQUATION:
                return getEquation();
            case FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION:
                if (resolve) return getAttributeConstraintConnection();
                return basicGetAttributeConstraintConnection();
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
            case FCOREPackage.ATTRIBUTE_CONSTRAINT__EQUATION:
                setEquation((String)newValue);
                return;
            case FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION:
                setAttributeConstraintConnection((AttributeConstraintConnection)newValue);
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
            case FCOREPackage.ATTRIBUTE_CONSTRAINT__EQUATION:
                setEquation(EQUATION_EDEFAULT);
                return;
            case FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION:
                setAttributeConstraintConnection((AttributeConstraintConnection)null);
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
            case FCOREPackage.ATTRIBUTE_CONSTRAINT__EQUATION:
                return EQUATION_EDEFAULT == null ? equation != null : !EQUATION_EDEFAULT.equals(equation);
            case FCOREPackage.ATTRIBUTE_CONSTRAINT__ATTRIBUTE_CONSTRAINT_CONNECTION:
                return attributeConstraintConnection != null;
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
        result.append(" (equation: ");
        result.append(equation);
        result.append(')');
        return result.toString();
    }

} //AttributeConstraintImpl
