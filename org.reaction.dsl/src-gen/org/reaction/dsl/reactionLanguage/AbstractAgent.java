/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.reactionLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.reaction.dsl.reactionLanguage.AbstractAgent#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getAbstractAgent()
 * @model
 * @generated
 */
public interface AbstractAgent extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.reaction.dsl.reactionLanguage.ReactionLanguagePackage#getAbstractAgent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.reaction.dsl.reactionLanguage.AbstractAgent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // AbstractAgent
