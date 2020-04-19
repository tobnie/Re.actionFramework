/**
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.reaction.dsl.ReactionLanguageRuntimeModule;
import org.reaction.dsl.ReactionLanguageStandaloneSetup;
import org.reaction.dsl.ide.ReactionLanguageIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class ReactionLanguageIdeSetup extends ReactionLanguageStandaloneSetup {
  @Override
  public Injector createInjector() {
    ReactionLanguageRuntimeModule _reactionLanguageRuntimeModule = new ReactionLanguageRuntimeModule();
    ReactionLanguageIdeModule _reactionLanguageIdeModule = new ReactionLanguageIdeModule();
    return Guice.createInjector(Modules2.mixin(_reactionLanguageRuntimeModule, _reactionLanguageIdeModule));
  }
}