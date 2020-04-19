/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.Rule#getHead <em>Head</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.Rule#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends Component, ComplexElement
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(RuleHead)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getRule_Head()
   * @model containment="true"
   * @generated
   */
  RuleHead getHead();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.Rule#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(RuleHead value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(RuleBody)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getRule_Body()
   * @model containment="true"
   * @generated
   */
  RuleBody getBody();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.Rule#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(RuleBody value);

} // Rule
