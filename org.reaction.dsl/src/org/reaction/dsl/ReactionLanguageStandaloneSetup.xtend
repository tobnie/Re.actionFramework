/*
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ReactionLanguageStandaloneSetup extends ReactionLanguageStandaloneSetupGenerated {

	def static void doSetup() {
		new ReactionLanguageStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
