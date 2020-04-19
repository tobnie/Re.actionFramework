/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.Initialisation#getHead <em>Head</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.Initialisation#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getInitialisation()
 * @model
 * @generated
 */
public interface Initialisation extends Component
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(InitialisationHead)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getInitialisation_Head()
   * @model containment="true"
   * @generated
   */
  InitialisationHead getHead();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.Initialisation#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(InitialisationHead value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(InitialisationBody)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getInitialisation_Body()
   * @model containment="true"
   * @generated
   */
  InitialisationBody getBody();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.Initialisation#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(InitialisationBody value);

} // Initialisation
