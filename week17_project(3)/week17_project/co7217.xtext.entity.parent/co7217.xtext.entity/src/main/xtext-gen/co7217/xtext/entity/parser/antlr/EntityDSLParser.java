/*
 * generated by Xtext 2.23.0
 */
package co7217.xtext.entity.parser.antlr;

import co7217.xtext.entity.parser.antlr.internal.InternalEntityDSLParser;
import co7217.xtext.entity.services.EntityDSLGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class EntityDSLParser extends AbstractAntlrParser {

	@Inject
	private EntityDSLGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEntityDSLParser createParser(XtextTokenStream stream) {
		return new InternalEntityDSLParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}

	public EntityDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EntityDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
