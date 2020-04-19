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

import org.reaction.dsl.reactionLanguage.ReactionLanguagePackage;
import org.reaction.dsl.reactionLanguage.Site;
import org.reaction.dsl.reactionLanguage.SiteInstance;
import org.reaction.dsl.reactionLanguage.SiteInstanceState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.SiteInstanceImpl#getSite <em>Site</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.SiteInstanceImpl#getSiteState <em>Site State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiteInstanceImpl extends MinimalEObjectImpl.Container implements SiteInstance
{
  /**
   * The cached value of the '{@link #getSite() <em>Site</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSite()
   * @generated
   * @ordered
   */
  protected Site site;

  /**
   * The cached value of the '{@link #getSiteState() <em>Site State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSiteState()
   * @generated
   * @ordered
   */
  protected SiteInstanceState siteState;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SiteInstanceImpl()
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
    return ReactionLanguagePackage.Literals.SITE_INSTANCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Site getSite()
  {
    if (site != null && site.eIsProxy())
    {
      InternalEObject oldSite = (InternalEObject)site;
      site = (Site)eResolveProxy(oldSite);
      if (site != oldSite)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReactionLanguagePackage.SITE_INSTANCE__SITE, oldSite, site));
      }
    }
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Site basicGetSite()
  {
    return site;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSite(Site newSite)
  {
    Site oldSite = site;
    site = newSite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.SITE_INSTANCE__SITE, oldSite, site));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SiteInstanceState getSiteState()
  {
    return siteState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSiteState(SiteInstanceState newSiteState, NotificationChain msgs)
  {
    SiteInstanceState oldSiteState = siteState;
    siteState = newSiteState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.SITE_INSTANCE__SITE_STATE, oldSiteState, newSiteState);
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
  public void setSiteState(SiteInstanceState newSiteState)
  {
    if (newSiteState != siteState)
    {
      NotificationChain msgs = null;
      if (siteState != null)
        msgs = ((InternalEObject)siteState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.SITE_INSTANCE__SITE_STATE, null, msgs);
      if (newSiteState != null)
        msgs = ((InternalEObject)newSiteState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.SITE_INSTANCE__SITE_STATE, null, msgs);
      msgs = basicSetSiteState(newSiteState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.SITE_INSTANCE__SITE_STATE, newSiteState, newSiteState));
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
      case ReactionLanguagePackage.SITE_INSTANCE__SITE_STATE:
        return basicSetSiteState(null, msgs);
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
      case ReactionLanguagePackage.SITE_INSTANCE__SITE:
        if (resolve) return getSite();
        return basicGetSite();
      case ReactionLanguagePackage.SITE_INSTANCE__SITE_STATE:
        return getSiteState();
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
      case ReactionLanguagePackage.SITE_INSTANCE__SITE:
        setSite((Site)newValue);
        return;
      case ReactionLanguagePackage.SITE_INSTANCE__SITE_STATE:
        setSiteState((SiteInstanceState)newValue);
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
      case ReactionLanguagePackage.SITE_INSTANCE__SITE:
        setSite((Site)null);
        return;
      case ReactionLanguagePackage.SITE_INSTANCE__SITE_STATE:
        setSiteState((SiteInstanceState)null);
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
      case ReactionLanguagePackage.SITE_INSTANCE__SITE:
        return site != null;
      case ReactionLanguagePackage.SITE_INSTANCE__SITE_STATE:
        return siteState != null;
    }
    return super.eIsSet(featureID);
  }

} //SiteInstanceImpl
