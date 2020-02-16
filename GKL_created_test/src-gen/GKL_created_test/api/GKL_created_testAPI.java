package GKL_created_test.api;

import GKL_created_test.api.rules.KT_xBwdRule;
import GKL_created_test.api.rules.KT_xRule;
import GKL_created_test.api.rules.KT_yBwdRule;
import GKL_created_test.api.rules.KT_yRule;
import GKL_created_test.api.rules.PT_xBwdRule;
import GKL_created_test.api.rules.PT_xRule;
import GKL_created_test.api.rules.PT_yBwdRule;
import GKL_created_test.api.rules.PT_yRule;
import GKL_created_test.api.rules.T_pp_unboundRule;
import GKL_created_test.api.rules.T_ppRule;
import GKL_created_test.api.rules.Tp_xRule;
import GKL_created_test.api.rules.Tp_yRule;
import GKL_created_test.api.rules.Tu_xRule;
import GKL_created_test.api.rules.Tu_yRule;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;

/**
 * The GKL_created_testAPI with 14 rules.
 */
public class GKL_created_testAPI extends GraphTransformationAPI {
	public static String patternPath = "GKL_created_test/src-gen/GKL_created_test/api/ibex-patterns.xmi";

	/**
	 * Creates a new GKL_created_testAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public GKL_created_testAPI(final IContextPatternInterpreter engine, final ResourceSet model, final String workspacePath) {
		super(engine, model);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
	}

	/**
	 * Creates a new GKL_created_testAPI.
	 *
	 * @param engine
	 *            the engine to use for queries and transformations
	 * @param model
	 *            the resource set containing the model file
	 * @param defaultResource
	 *            the default resource
	 * @param workspacePath
	 *            the path to the workspace which is concatenated with the project
	 *            relative path to the patterns
	 */
	public GKL_created_testAPI(final IContextPatternInterpreter engine, final ResourceSet model, final Resource defaultResource,
			final String workspacePath) {
		super(engine, model, defaultResource);
		URI uri = URI.createFileURI(workspacePath + patternPath);
		interpreter.loadPatternSet(uri);
	}

	/**
	 * Creates a new instance of the rule <code>KT_x()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public KT_xRule KT_x() {
		return new KT_xRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>KT_xBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public KT_xBwdRule KT_xBwd() {
		return new KT_xBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Tp_x()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Tp_xRule Tp_x() {
		return new Tp_xRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>KT_y()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public KT_yRule KT_y() {
		return new KT_yRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>KT_yBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public KT_yBwdRule KT_yBwd() {
		return new KT_yBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Tp_y()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Tp_yRule Tp_y() {
		return new Tp_yRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>PT_x()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PT_xRule PT_x() {
		return new PT_xRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>PT_xBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PT_xBwdRule PT_xBwd() {
		return new PT_xBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Tu_x()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Tu_xRule Tu_x() {
		return new Tu_xRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>PT_y()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PT_yRule PT_y() {
		return new PT_yRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>PT_yBwd()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public PT_yBwdRule PT_yBwd() {
		return new PT_yBwdRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>Tu_y()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public Tu_yRule Tu_y() {
		return new Tu_yRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>T_pp()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public T_ppRule T_pp() {
		return new T_ppRule(this, interpreter);
	}

	/**
	 * Creates a new instance of the rule <code>T_pp_unbound()</code> which does the following:
	 * If this rule is not self-explaining, you really should add some comment in the specification.
	 *
	 * @return the new instance of the rule
	 */
	public T_pp_unboundRule T_pp_unbound() {
		return new T_pp_unboundRule(this, interpreter);
	}
}
