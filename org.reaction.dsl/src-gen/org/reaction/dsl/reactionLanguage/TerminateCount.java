/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminate Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.TerminateCount#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.TerminateCount#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.TerminateCount#getCnt <em>Cnt</em>}</li>
 * </ul>
 *
 * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getTerminateCount()
 * @model
 * @generated
 */
public interface TerminateCount extends TerminateBody
{
  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(Signature)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getTerminateCount_Signature()
   * @model containment="true"
   * @generated
   */
  Signature getSignature();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.TerminateCount#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(Signature value);

  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(Pattern)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getTerminateCount_Pattern()
   * @model containment="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.TerminateCount#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

  /**
   * Returns the value of the '<em><b>Cnt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cnt</em>' containment reference.
   * @see #setCnt(ArithmeticExpr)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getTerminateCount_Cnt()
   * @model containment="true"
   * @generated
   */
  ArithmeticExpr getCnt();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.TerminateCount#getCnt <em>Cnt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cnt</em>' containment reference.
   * @see #getCnt()
   * @generated
   */
  void setCnt(ArithmeticExpr value);

} // TerminateCount
