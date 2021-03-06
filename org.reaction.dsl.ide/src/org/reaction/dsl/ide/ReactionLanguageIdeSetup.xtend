/*
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.reaction.dsl.ReactionLanguageRuntimeModule
import org.reaction.dsl.ReactionLanguageStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ReactionLanguageIdeSetup extends ReactionLanguageStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ReactionLanguageRuntimeModule, new ReactionLanguageIdeModule))
	}
	
}
