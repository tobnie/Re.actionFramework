/*
 * generated by Xtext 2.20.0
 */
package org.reaction.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ReactionLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/reaction/dsl/parser/antlr/internal/InternalReactionLanguage.tokens");
	}
}
