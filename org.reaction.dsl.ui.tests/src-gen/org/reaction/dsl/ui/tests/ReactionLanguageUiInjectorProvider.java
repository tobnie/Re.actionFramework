/*
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.reaction.dsl.ui.internal.DslActivator;

public class ReactionLanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("org.reaction.dsl.ReactionLanguage");
	}

}