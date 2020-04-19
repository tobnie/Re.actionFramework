/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.reaction.dsl.reactionLanguage.AbstractAgent;
import org.reaction.dsl.reactionLanguage.BondSide;
import org.reaction.dsl.reactionLanguage.ReactionLanguagePackage;
import org.reaction.dsl.reactionLanguage.SiteInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bond Side</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.BondSideImpl#getAbstractAgent <em>Abstract Agent</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.BondSideImpl#isArray <em>Array</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.BondSideImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.BondSideImpl#getSiteInstance <em>Site Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BondSideImpl extends BondSideOrWildcardImpl implements BondSide
{
  /**
   * The cached value of the '{@link #getAbstractAgent() <em>Abstract Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstractAgent()
   * @generated
   * @ordered
   */
  protected AbstractAgent abstractAgent;

  /**
   * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArray()
   * @generated
   * @ordered
   */
  protected static final boolean ARRAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isArray()
   * @generated
   * @ordered
   */
  protected boolean array = ARRAY_EDEFAULT;

  /**
   * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected static final int INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected int index = INDEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getSiteInstance() <em>Site Instance</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiteInstance()
   * @generated
   * @ordered
   */
  protected SiteInstance siteInstance;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BondSideImpl()
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
    return ReactionLanguagePackage.Literals.BOND_SIDE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractAgent getAbstractAgent()
  {
    if (abstractAgent != null && abstractAgent.eIsProxy())
    {
      InternalEObject oldAbstractAgent = (InternalEObject)abstractAgent;
      abstractAgent = (AbstractAgent)eResolveProxy(oldAbstractAgent);
      if (abstractAgent != oldAbstractAgent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReactionLanguagePackage.BOND_SIDE__ABSTRACT_AGENT, oldAbstractAgent, abstractAgent));
      }
    }
    return abstractAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractAgent basicGetAbstractAgent()
  {
    return abstractAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAbstractAgent(AbstractAgent newAbstractAgent)
  {
    AbstractAgent oldAbstractAgent = abstractAgent;
    abstractAgent = newAbstractAgent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.BOND_SIDE__ABSTRACT_AGENT, oldAbstractAgent, abstractAgent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArray(boolean newArray)
  {
    boolean oldArray = array;
    array = newArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.BOND_SIDE__ARRAY, oldArray, array));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIndex(int newIndex)
  {
    int oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.BOND_SIDE__INDEX, oldIndex, index));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SiteInstance getSiteInstance()
  {
    return siteInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSiteInstance(SiteInstance newSiteInstance, NotificationChain msgs)
  {
    SiteInstance oldSiteInstance = siteInstance;
    siteInstance = newSiteInstance;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.BOND_SIDE__SITE_INSTANCE, oldSiteInstance, newSiteInstance);
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
  public void setSiteInstance(SiteInstance newSiteInstance)
  {
    if (newSiteInstance != siteInstance)
    {
      NotificationChain msgs = null;
      if (siteInstance != null)
        msgs = ((InternalEObject)siteInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.BOND_SIDE__SITE_INSTANCE, null, msgs);
      if (newSiteInstance != null)
        msgs = ((InternalEObject)newSiteInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.BOND_SIDE__SITE_INSTANCE, null, msgs);
      msgs = basicSetSiteInstance(newSiteInstance, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.BOND_SIDE__SITE_INSTANCE, newSiteInstance, newSiteInstance));
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
      case ReactionLanguagePackage.BOND_SIDE__SITE_INSTANCE:
        return basicSetSiteInstance(null, msgs);
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
      case ReactionLanguagePackage.BOND_SIDE__ABSTRACT_AGENT:
        if (resolve) return getAbstractAgent();
        return basicGetAbstractAgent();
      case ReactionLanguagePackage.BOND_SIDE__ARRAY:
        return isArray();
      case ReactionLanguagePackage.BOND_SIDE__INDEX:
        return getIndex();
      case ReactionLanguagePackage.BOND_SIDE__SITE_INSTANCE:
        return getSiteInstance();
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
      case ReactionLanguagePackage.BOND_SIDE__ABSTRACT_AGENT:
        setAbstractAgent((AbstractAgent)newValue);
        return;
      case ReactionLanguagePackage.BOND_SIDE__ARRAY:
        setArray((Boolean)newValue);
        return;
      case ReactionLanguagePackage.BOND_SIDE__INDEX:
        setIndex((Integer)newValue);
        return;
      case ReactionLanguagePackage.BOND_SIDE__SITE_INSTANCE:
        setSiteInstance((SiteInstance)newValue);
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
      case ReactionLanguagePackage.BOND_SIDE__ABSTRACT_AGENT:
        setAbstractAgent((AbstractAgent)null);
        return;
      case ReactionLanguagePackage.BOND_SIDE__ARRAY:
        setArray(ARRAY_EDEFAULT);
        return;
      case ReactionLanguagePackage.BOND_SIDE__INDEX:
        setIndex(INDEX_EDEFAULT);
        return;
      case ReactionLanguagePackage.BOND_SIDE__SITE_INSTANCE:
        setSiteInstance((SiteInstance)null);
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
      case ReactionLanguagePackage.BOND_SIDE__ABSTRACT_AGENT:
        return abstractAgent != null;
      case ReactionLanguagePackage.BOND_SIDE__ARRAY:
        return array != ARRAY_EDEFAULT;
      case ReactionLanguagePackage.BOND_SIDE__INDEX:
        return index != INDEX_EDEFAULT;
      case ReactionLanguagePackage.BOND_SIDE__SITE_INSTANCE:
        return siteInstance != null;
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
    result.append(" (array: ");
    result.append(array);
    result.append(", index: ");
    result.append(index);
    result.append(')');
    return result.toString();
  }

} //BondSideImpl
