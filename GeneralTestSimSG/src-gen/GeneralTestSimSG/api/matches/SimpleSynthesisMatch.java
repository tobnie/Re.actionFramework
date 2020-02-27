package GeneralTestSimSG.api.matches;

import GeneralTestSimSG.api.rules.SimpleSynthesisRule;
import org.emoflon.ibex.common.operational.IMatch;
import org.emoflon.ibex.gt.api.GraphTransformationMatch;
import TestcasesModel.A;
import TestcasesModel.U_s;

/**
 * A match for the rule <code>simpleSynthesis()</code>.
 */
public class SimpleSynthesisMatch extends GraphTransformationMatch<SimpleSynthesisMatch, SimpleSynthesisRule> {
	private A varA;
	private U_s varUs;

	/**
	 * Creates a new match for the rule <code>simpleSynthesis()</code>.
	 * 
	 * @param pattern
	 *            the pattern
	 * @param match
	 *            the untyped match
	 */
	public SimpleSynthesisMatch(final SimpleSynthesisRule pattern, final IMatch match) {
		super(pattern, match);
		varA = (A) match.get("a");
		varUs = (U_s) match.get("us");
	}

	/**
	 * Returns the a.
	 *
	 * @return the a
	 */
	public A getA() {
		return varA;
	}

	/**
	 * Returns the us.
	 *
	 * @return the us
	 */
	public U_s getUs() {
		return varUs;
	}

	@Override
	public String toString() {
		String s = "match {" + System.lineSeparator();
		s += "	a --> " + varA + System.lineSeparator();
		s += "	us --> " + varUs + System.lineSeparator();
		s += "} for " + getPattern();
		return s;
	}
}