/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.reaction.dsl.reactionLanguage.ArithmeticExpr;
import org.reaction.dsl.reactionLanguage.FunctionCall;
import org.reaction.dsl.reactionLanguage.MathFunc;
import org.reaction.dsl.reactionLanguage.ReactionLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.FunctionCallImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.impl.FunctionCallImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends ArithmeticExprImpl implements FunctionCall
{
  /**
   * The default value of the '{@link #getFunc() <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected static final MathFunc FUNC_EDEFAULT = MathFunc.SQRT;

  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected MathFunc func = FUNC_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected ArithmeticExpr expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionCallImpl()
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
    return ReactionLanguagePackage.Literals.FUNCTION_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathFunc getFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunc(MathFunc newFunc)
  {
    MathFunc oldFunc = func;
    func = newFunc == null ? FUNC_EDEFAULT : newFunc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.FUNCTION_CALL__FUNC, oldFunc, func));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArithmeticExpr getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(ArithmeticExpr newExpr, NotificationChain msgs)
  {
    ArithmeticExpr oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.FUNCTION_CALL__EXPR, oldExpr, newExpr);
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
  public void setExpr(ArithmeticExpr newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.FUNCTION_CALL__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReactionLanguagePackage.FUNCTION_CALL__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReactionLanguagePackage.FUNCTION_CALL__EXPR, newExpr, newExpr));
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
      case ReactionLanguagePackage.FUNCTION_CALL__EXPR:
        return basicSetExpr(null, msgs);
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
      case ReactionLanguagePackage.FUNCTION_CALL__FUNC:
        return getFunc();
      case ReactionLanguagePackage.FUNCTION_CALL__EXPR:
        return getExpr();
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
      case ReactionLanguagePackage.FUNCTION_CALL__FUNC:
        setFunc((MathFunc)newValue);
        return;
      case ReactionLanguagePackage.FUNCTION_CALL__EXPR:
        setExpr((ArithmeticExpr)newValue);
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
      case ReactionLanguagePackage.FUNCTION_CALL__FUNC:
        setFunc(FUNC_EDEFAULT);
        return;
      case ReactionLanguagePackage.FUNCTION_CALL__EXPR:
        setExpr((ArithmeticExpr)null);
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
      case ReactionLanguagePackage.FUNCTION_CALL__FUNC:
        return func != FUNC_EDEFAULT;
      case ReactionLanguagePackage.FUNCTION_CALL__EXPR:
        return expr != null;
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
    result.append(" (func: ");
    result.append(func);
    result.append(')');
    return result.toString();
  }

} //FunctionCallImpl