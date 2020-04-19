/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.reaction.dsl.reactionLanguage.ReactionLanguagePackage;
import org.reaction.dsl.reactionLanguage.Wildcard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wildcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.WildcardImpl#isAnything <em>Anything</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.WildcardImpl#isNothing <em>Nothing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WildcardImpl extends MinimalEObjectImpl.Container implements Wildcard
{
  /**
   * The default value of the '{@link #isAnything() <em>Anything</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnything()
   * @generated
   * @ordered
   */
  protected static final boolean ANYTHING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnything() <em>Anything</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnything()
   * @generated
   * @ordered
   */
  protected boolean anything = ANYTHING_EDEFAULT;

  /**
   * The default value of the '{@link #isNothing() <em>Nothing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNothing()
   * @generated
   * @ordered
   */
  protected static final boolean NOTHING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNothing() <em>Nothing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNothing()
   * @generated
   * @ordered
   */
  protected boolean nothing = NOTHING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WildcardImpl()
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
    return ReactionLanguagePackage.Literals.WILDCARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAnything()
  {
    return anything;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAnything(boolean newAnything)
  {
    boolean oldAnything = anything;
    anything = newAnything;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.WILDCARD__ANYTHING, oldAnything, anything));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isNothing()
  {
    return nothing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNothing(boolean newNothing)
  {
    boolean oldNothing = nothing;
    nothing = newNothing;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.WILDCARD__NOTHING, oldNothing, nothing));
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
      case ReactionLanguagePackage.WILDCARD__ANYTHING:
        return isAnything();
      case ReactionLanguagePackage.WILDCARD__NOTHING:
        return isNothing();
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
      case ReactionLanguagePackage.WILDCARD__ANYTHING:
        setAnything((Boolean)newValue);
        return;
      case ReactionLanguagePackage.WILDCARD__NOTHING:
        setNothing((Boolean)newValue);
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
      case ReactionLanguagePackage.WILDCARD__ANYTHING:
        setAnything(ANYTHING_EDEFAULT);
        return;
      case ReactionLanguagePackage.WILDCARD__NOTHING:
        setNothing(NOTHING_EDEFAULT);
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
      case ReactionLanguagePackage.WILDCARD__ANYTHING:
        return anything != ANYTHING_EDEFAULT;
      case ReactionLanguagePackage.WILDCARD__NOTHING:
        return nothing != NOTHING_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (anything: ");
    result.append(anything);
    result.append(", nothing: ");
    result.append(nothing);
    result.append(')');
    return result.toString();
  }

} //WildcardImpl