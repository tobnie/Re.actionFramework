/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminate Iterations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.TerminateIterations#getIterations <em>Iterations</em>}</li>
 * </ul>
 *
 * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getTerminateIterations()
 * @model
 * @generated
 */
public interface TerminateIterations extends TerminateBody
{
  /**
   * Returns the value of the '<em><b>Iterations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iterations</em>' containment reference.
   * @see #setIterations(ArithmeticExpr)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getTerminateIterations_Iterations()
   * @model containment="true"
   * @generated
   */
  ArithmeticExpr getIterations();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.TerminateIterations#getIterations <em>Iterations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterations</em>' containment reference.
   * @see #getIterations()
   * @generated
   */
  void setIterations(ArithmeticExpr value);

} // TerminateIterations
