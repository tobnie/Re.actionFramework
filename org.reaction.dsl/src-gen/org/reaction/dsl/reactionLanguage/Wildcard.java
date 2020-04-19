/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.Wildcard#isAnything <em>Anything</em>}</li>
 *   <li>{@link org.reaction.dsl.reactionLanguage.Wildcard#isNothing <em>Nothing</em>}</li>
 * </ul>
 *
 * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getWildcard()
 * @model
 * @generated
 */
public interface Wildcard extends EObject
{
  /**
   * Returns the value of the '<em><b>Anything</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anything</em>' attribute.
   * @see #setAnything(boolean)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getWildcard_Anything()
   * @model
   * @generated
   */
  boolean isAnything();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.Wildcard#isAnything <em>Anything</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anything</em>' attribute.
   * @see #isAnything()
   * @generated
   */
  void setAnything(boolean value);

  /**
   * Returns the value of the '<em><b>Nothing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nothing</em>' attribute.
   * @see #setNothing(boolean)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getWildcard_Nothing()
   * @model
   * @generated
   */
  boolean isNothing();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.Wildcard#isNothing <em>Nothing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nothing</em>' attribute.
   * @see #isNothing()
   * @generated
   */
  void setNothing(boolean value);

} // Wildcard
