/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bond</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.Bond#getLeft <em>Left</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.Bond#getBondType <em>Bond Type</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.Bond#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getBond()
 * @model
 * @generated
 */
public interface Bond extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(BondSide)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getBond_Left()
   * @model containment="true"
   * @generated
   */
  BondSide getLeft();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.Bond#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BondSide value);

  /**
   * Returns the value of the '<em><b>Bond Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.reaction.dsl.reactionLanguage.BondType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bond Type</em>' attribute.
   * @see org.reaction.dsl.reactionLanguage.BondType
   * @see #setBondType(BondType)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getBond_BondType()
   * @model
   * @generated
   */
  BondType getBondType();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.Bond#getBondType <em>Bond Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bond Type</em>' attribute.
   * @see org.reaction.dsl.reactionLanguage.BondType
   * @see #getBondType()
   * @generated
   */
  void setBondType(BondType value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BondSideOrWildcard)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getBond_Right()
   * @model containment="true"
   * @generated
   */
  BondSideOrWildcard getRight();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.Bond#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BondSideOrWildcard value);

} // Bond