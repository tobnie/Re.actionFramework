/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.reaction.dsl.reactionLanguage.BondSideOrWildcard;
import org.reaction.dsl.reactionLanguage.ReactionLanguagePackage;
import org.reaction.dsl.reactionLanguage.Wildcard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bond Side Or Wildcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.BondSideOrWildcardImpl#getWildcard <em>Wildcard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BondSideOrWildcardImpl extends MinimalEObjectImpl.Container implements BondSideOrWildcard
{
  /**
   * The cached value of the '{@link #getWildcard() <em>Wildcard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWildcard()
   * @generated
   * @ordered
   */
  protected Wildcard wildcard;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BondSideOrWildcardImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ReactionLanguagePackage.Literals.BOND_SIDE_OR_WILDCARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Wildcard getWildcard()
  {
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWildcard(Wildcard newWildcard, NotificationChain msgs)
  {
    Wildcard oldWildcard = wildcard;
    wildcard = newWildcard;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.BOND_SIDE_OR_WILDCARD__WILDCARD, oldWildcard, newWildcard);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setWildcard(Wildcard newWildcard)
  {
    if (newWildcard != wildcard)
    {
      NotificationChain msgs = null;
      if (wildcard != null)
        msgs = ((InternalEObject)wildcard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.BOND_SIDE_OR_WILDCARD__WILDCARD, null, msgs);
      if (newWildcard != null)
        msgs = ((InternalEObject)newWildcard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.BOND_SIDE_OR_WILDCARD__WILDCARD, null, msgs);
      msgs = basicSetWildcard(newWildcard, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.BOND_SIDE_OR_WILDCARD__WILDCARD, newWildcard, newWildcard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ReactionLanguagePackage.BOND_SIDE_OR_WILDCARD__WILDCARD:
        return basicSetWildcard(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ReactionLanguagePackage.BOND_SIDE_OR_WILDCARD__WILDCARD:
        return getWildcard();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReactionLanguagePackage.BOND_SIDE_OR_WILDCARD__WILDCARD:
        setWildcard((Wildcard)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ReactionLanguagePackage.BOND_SIDE_OR_WILDCARD__WILDCARD:
        setWildcard((Wildcard)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ReactionLanguagePackage.BOND_SIDE_OR_WILDCARD__WILDCARD:
        return wildcard != null;
    }
    return super.eIsSet(featureID);
  }

} //BondSideOrWildcardImpl
