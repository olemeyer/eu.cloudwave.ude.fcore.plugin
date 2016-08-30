/**
 */
package eu.cloudwave.ude.fcore.FCORE.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import eu.cloudwave.ude.fcore.FCORE.Attribute;
import eu.cloudwave.ude.fcore.FCORE.FCOREPackage;
import eu.cloudwave.ude.fcore.FCORE.InfluenceAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Influence Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.cloudwave.ude.fcore.FCORE.impl.InfluenceAttributeImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfluenceAttributeImpl extends InfluenceImpl implements InfluenceAttribute {
    /**
     * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected Attribute attribute;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected InfluenceAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FCOREPackage.Literals.INFLUENCE_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute getAttribute() {
        if (attribute != null && attribute.eIsProxy()) {
            InternalEObject oldAttribute = (InternalEObject)attribute;
            attribute = (Attribute)eResolveProxy(oldAttribute);
            if (attribute != oldAttribute) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FCOREPackage.INFLUENCE_ATTRIBUTE__ATTRIBUTE, oldAttribute, attribute));
            }
        }
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute basicGetAttribute() {
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs) {
        Attribute oldAttribute = attribute;
        attribute = newAttribute;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FCOREPackage.INFLUENCE_ATTRIBUTE__ATTRIBUTE, oldAttribute, newAttribute);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttribute(Attribute newAttribute) {
        if (newAttribute != attribute) {
            NotificationChain msgs = null;
            if (attribute != null)
                msgs = ((InternalEObject)attribute).eInverseRemove(this, FCOREPackage.ATTRIBUTE__INFLUENCES, Attribute.class, msgs);
            if (newAttribute != null)
                msgs = ((InternalEObject)newAttribute).eInverseAdd(this, FCOREPackage.ATTRIBUTE__INFLUENCES, Attribute.class, msgs);
            msgs = basicSetAttribute(newAttribute, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FCOREPackage.INFLUENCE_ATTRIBUTE__ATTRIBUTE, newAttribute, newAttribute));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case FCOREPackage.INFLUENCE_ATTRIBUTE__ATTRIBUTE:
                if (attribute != null)
                    msgs = ((InternalEObject)attribute).eInverseRemove(this, FCOREPackage.ATTRIBUTE__INFLUENCES, Attribute.class, msgs);
                return basicSetAttribute((Attribute)otherEnd, msgs);
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
            case FCOREPackage.INFLUENCE_ATTRIBUTE__ATTRIBUTE:
                return basicSetAttribute(null, msgs);
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
            case FCOREPackage.INFLUENCE_ATTRIBUTE__ATTRIBUTE:
                if (resolve) return getAttribute();
                return basicGetAttribute();
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
            case FCOREPackage.INFLUENCE_ATTRIBUTE__ATTRIBUTE:
                setAttribute((Attribute)newValue);
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
            case FCOREPackage.INFLUENCE_ATTRIBUTE__ATTRIBUTE:
                setAttribute((Attribute)null);
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
            case FCOREPackage.INFLUENCE_ATTRIBUTE__ATTRIBUTE:
                return attribute != null;
        }
        return super.eIsSet(featureID);
    }

} //InfluenceAttributeImpl
