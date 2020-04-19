/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.reaction.dsl.reactionLanguage.ObservablePattern;
import org.reaction.dsl.reactionLanguage.Pattern;
import org.reaction.dsl.reactionLanguage.ReactionLanguagePackage;
import org.reaction.dsl.reactionLanguage.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Observable Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.ObservablePatternImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.ObservablePatternImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObservablePatternImpl extends ObservableBodyImpl implements ObservablePattern
{
  /**
   * The cached value of the '{@link #getSignature() <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignature()
   * @generated
   * @ordered
   */
  protected Signature signature;

  /**
   * The cached value of the '{@link #getPattern() <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPattern()
   * @generated
   * @ordered
   */
  protected Pattern pattern;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObservablePatternImpl()
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
    return ReactionLanguagePackage.Literals.OBSERVABLE_PATTERN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Signature getSignature()
  {
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSignature(Signature newSignature, NotificationChain msgs)
  {
    Signature oldSignature = signature;
    signature = newSignature;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.OBSERVABLE_PATTERN__SIGNATURE, oldSignature, newSignature);
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
  public void setSignature(Signature newSignature)
  {
    if (newSignature != signature)
    {
      NotificationChain msgs = null;
      if (signature != null)
        msgs = ((InternalEObject)signature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.OBSERVABLE_PATTERN__SIGNATURE, null, msgs);
      if (newSignature != null)
        msgs = ((InternalEObject)newSignature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.OBSERVABLE_PATTERN__SIGNATURE, null, msgs);
      msgs = basicSetSignature(newSignature, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.OBSERVABLE_PATTERN__SIGNATURE, newSignature, newSignature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pattern getPattern()
  {
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPattern(Pattern newPattern, NotificationChain msgs)
  {
    Pattern oldPattern = pattern;
    pattern = newPattern;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.OBSERVABLE_PATTERN__PATTERN, oldPattern, newPattern);
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
  public void setPattern(Pattern newPattern)
  {
    if (newPattern != pattern)
    {
      NotificationChain msgs = null;
      if (pattern != null)
        msgs = ((InternalEObject)pattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.OBSERVABLE_PATTERN__PATTERN, null, msgs);
      if (newPattern != null)
        msgs = ((InternalEObject)newPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.OBSERVABLE_PATTERN__PATTERN, null, msgs);
      msgs = basicSetPattern(newPattern, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.OBSERVABLE_PATTERN__PATTERN, newPattern, newPattern));
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
      case ReactionLanguagePackage.OBSERVABLE_PATTERN__SIGNATURE:
        return basicSetSignature(null, msgs);
      case ReactionLanguagePackage.OBSERVABLE_PATTERN__PATTERN:
        return basicSetPattern(null, msgs);
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
      case ReactionLanguagePackage.OBSERVABLE_PATTERN__SIGNATURE:
        return getSignature();
      case ReactionLanguagePackage.OBSERVABLE_PATTERN__PATTERN:
        return getPattern();
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
      case ReactionLanguagePackage.OBSERVABLE_PATTERN__SIGNATURE:
        setSignature((Signature)newValue);
        return;
      case ReactionLanguagePackage.OBSERVABLE_PATTERN__PATTERN:
        setPattern((Pattern)newValue);
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
      case ReactionLanguagePackage.OBSERVABLE_PATTERN__SIGNATURE:
        setSignature((Signature)null);
        return;
      case ReactionLanguagePackage.OBSERVABLE_PATTERN__PATTERN:
        setPattern((Pattern)null);
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
      case ReactionLanguagePackage.OBSERVABLE_PATTERN__SIGNATURE:
        return signature != null;
      case ReactionLanguagePackage.OBSERVABLE_PATTERN__PATTERN:
        return pattern != null;
    }
    return super.eIsSet(featureID);
  }

} //ObservablePatternImpl
