/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminate Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.TerminateTime#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getTerminateTime()
 * @model
 * @generated
 */
public interface TerminateTime extends TerminateBody
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(ArithmeticExpr)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getTerminateTime_Time()
   * @model containment="true"
   * @generated
   */
  ArithmeticExpr getTime();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.TerminateTime#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(ArithmeticExpr value);

} // TerminateTime
