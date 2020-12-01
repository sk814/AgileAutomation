package co7217.xtext.entity.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import co7217.xtext.entity.services.EntityDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEntityDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'private'", "'protected'", "'package'", "'{'", "'}'", "'import'", "'.*'", "'.'", "'enumeration'", "'extends'", "'datatype'", "'entity'", "':'", "'many'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEntityDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEntityDSL.g"; }


    	private EntityDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(EntityDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainmodel"
    // InternalEntityDSL.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalEntityDSL.g:54:1: ( ruleDomainmodel EOF )
            // InternalEntityDSL.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalEntityDSL.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalEntityDSL.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalEntityDSL.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalEntityDSL.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalEntityDSL.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14||LA1_0==17||LA1_0==20||(LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEntityDSL.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalEntityDSL.g:78:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalEntityDSL.g:79:1: ( rulePackageDeclaration EOF )
            // InternalEntityDSL.g:80:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalEntityDSL.g:87:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:91:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalEntityDSL.g:92:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalEntityDSL.g:92:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalEntityDSL.g:93:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalEntityDSL.g:94:3: ( rule__PackageDeclaration__Group__0 )
            // InternalEntityDSL.g:94:4: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalEntityDSL.g:103:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalEntityDSL.g:104:1: ( ruleAbstractElement EOF )
            // InternalEntityDSL.g:105:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalEntityDSL.g:112:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:116:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalEntityDSL.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalEntityDSL.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalEntityDSL.g:118:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalEntityDSL.g:119:3: ( rule__AbstractElement__Alternatives )
            // InternalEntityDSL.g:119:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImport"
    // InternalEntityDSL.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalEntityDSL.g:129:1: ( ruleImport EOF )
            // InternalEntityDSL.g:130:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEntityDSL.g:137:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:141:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalEntityDSL.g:142:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalEntityDSL.g:142:2: ( ( rule__Import__Group__0 ) )
            // InternalEntityDSL.g:143:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalEntityDSL.g:144:3: ( rule__Import__Group__0 )
            // InternalEntityDSL.g:144:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalEntityDSL.g:153:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalEntityDSL.g:154:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalEntityDSL.g:155:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalEntityDSL.g:162:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:166:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalEntityDSL.g:167:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalEntityDSL.g:167:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalEntityDSL.g:168:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalEntityDSL.g:169:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalEntityDSL.g:169:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEntityDSL.g:178:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalEntityDSL.g:179:1: ( ruleQualifiedName EOF )
            // InternalEntityDSL.g:180:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalEntityDSL.g:187:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:191:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalEntityDSL.g:192:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalEntityDSL.g:192:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalEntityDSL.g:193:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalEntityDSL.g:194:3: ( rule__QualifiedName__Group__0 )
            // InternalEntityDSL.g:194:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLiteral"
    // InternalEntityDSL.g:203:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalEntityDSL.g:204:1: ( ruleLiteral EOF )
            // InternalEntityDSL.g:205:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalEntityDSL.g:212:1: ruleLiteral : ( ( rule__Literal__ValueAssignment ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:216:2: ( ( ( rule__Literal__ValueAssignment ) ) )
            // InternalEntityDSL.g:217:2: ( ( rule__Literal__ValueAssignment ) )
            {
            // InternalEntityDSL.g:217:2: ( ( rule__Literal__ValueAssignment ) )
            // InternalEntityDSL.g:218:3: ( rule__Literal__ValueAssignment )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment()); 
            // InternalEntityDSL.g:219:3: ( rule__Literal__ValueAssignment )
            // InternalEntityDSL.g:219:4: rule__Literal__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleType"
    // InternalEntityDSL.g:228:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalEntityDSL.g:229:1: ( ruleType EOF )
            // InternalEntityDSL.g:230:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalEntityDSL.g:237:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:241:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalEntityDSL.g:242:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalEntityDSL.g:242:2: ( ( rule__Type__Alternatives ) )
            // InternalEntityDSL.g:243:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalEntityDSL.g:244:3: ( rule__Type__Alternatives )
            // InternalEntityDSL.g:244:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalEntityDSL.g:253:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalEntityDSL.g:254:1: ( ruleDataType EOF )
            // InternalEntityDSL.g:255:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalEntityDSL.g:262:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:266:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalEntityDSL.g:267:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalEntityDSL.g:267:2: ( ( rule__DataType__Alternatives ) )
            // InternalEntityDSL.g:268:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalEntityDSL.g:269:3: ( rule__DataType__Alternatives )
            // InternalEntityDSL.g:269:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalEntityDSL.g:278:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalEntityDSL.g:279:1: ( ruleEntity EOF )
            // InternalEntityDSL.g:280:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalEntityDSL.g:287:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:291:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalEntityDSL.g:292:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalEntityDSL.g:292:2: ( ( rule__Entity__Group__0 ) )
            // InternalEntityDSL.g:293:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalEntityDSL.g:294:3: ( rule__Entity__Group__0 )
            // InternalEntityDSL.g:294:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // InternalEntityDSL.g:303:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalEntityDSL.g:304:1: ( ruleFeature EOF )
            // InternalEntityDSL.g:305:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalEntityDSL.g:312:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:316:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalEntityDSL.g:317:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalEntityDSL.g:317:2: ( ( rule__Feature__Group__0 ) )
            // InternalEntityDSL.g:318:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalEntityDSL.g:319:3: ( rule__Feature__Group__0 )
            // InternalEntityDSL.g:319:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "ruleVisibility"
    // InternalEntityDSL.g:328:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:332:1: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalEntityDSL.g:333:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalEntityDSL.g:333:2: ( ( rule__Visibility__Alternatives ) )
            // InternalEntityDSL.g:334:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalEntityDSL.g:335:3: ( rule__Visibility__Alternatives )
            // InternalEntityDSL.g:335:4: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalEntityDSL.g:343:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:347:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
            case 20:
            case 22:
            case 23:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEntityDSL.g:348:2: ( rulePackageDeclaration )
                    {
                    // InternalEntityDSL.g:348:2: ( rulePackageDeclaration )
                    // InternalEntityDSL.g:349:3: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDSL.g:354:2: ( ruleType )
                    {
                    // InternalEntityDSL.g:354:2: ( ruleType )
                    // InternalEntityDSL.g:355:3: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDSL.g:360:2: ( ruleImport )
                    {
                    // InternalEntityDSL.g:360:2: ( ruleImport )
                    // InternalEntityDSL.g:361:3: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalEntityDSL.g:370:1: rule__Type__Alternatives : ( ( ruleLiteral ) | ( ruleEntity ) | ( ruleDataType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:374:1: ( ( ruleLiteral ) | ( ruleEntity ) | ( ruleDataType ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 20:
            case 22:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEntityDSL.g:375:2: ( ruleLiteral )
                    {
                    // InternalEntityDSL.g:375:2: ( ruleLiteral )
                    // InternalEntityDSL.g:376:3: ruleLiteral
                    {
                     before(grammarAccess.getTypeAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDSL.g:381:2: ( ruleEntity )
                    {
                    // InternalEntityDSL.g:381:2: ( ruleEntity )
                    // InternalEntityDSL.g:382:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDSL.g:387:2: ( ruleDataType )
                    {
                    // InternalEntityDSL.g:387:2: ( ruleDataType )
                    // InternalEntityDSL.g:388:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalEntityDSL.g:397:1: rule__DataType__Alternatives : ( ( ( rule__DataType__Group_0__0 ) ) | ( ( rule__DataType__Group_1__0 ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:401:1: ( ( ( rule__DataType__Group_0__0 ) ) | ( ( rule__DataType__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEntityDSL.g:402:2: ( ( rule__DataType__Group_0__0 ) )
                    {
                    // InternalEntityDSL.g:402:2: ( ( rule__DataType__Group_0__0 ) )
                    // InternalEntityDSL.g:403:3: ( rule__DataType__Group_0__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_0()); 
                    // InternalEntityDSL.g:404:3: ( rule__DataType__Group_0__0 )
                    // InternalEntityDSL.g:404:4: rule__DataType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDSL.g:408:2: ( ( rule__DataType__Group_1__0 ) )
                    {
                    // InternalEntityDSL.g:408:2: ( ( rule__DataType__Group_1__0 ) )
                    // InternalEntityDSL.g:409:3: ( rule__DataType__Group_1__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_1()); 
                    // InternalEntityDSL.g:410:3: ( rule__DataType__Group_1__0 )
                    // InternalEntityDSL.g:410:4: rule__DataType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalEntityDSL.g:418:1: rule__Visibility__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:422:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEntityDSL.g:423:2: ( ( 'public' ) )
                    {
                    // InternalEntityDSL.g:423:2: ( ( 'public' ) )
                    // InternalEntityDSL.g:424:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalEntityDSL.g:425:3: ( 'public' )
                    // InternalEntityDSL.g:425:4: 'public'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEntityDSL.g:429:2: ( ( 'private' ) )
                    {
                    // InternalEntityDSL.g:429:2: ( ( 'private' ) )
                    // InternalEntityDSL.g:430:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalEntityDSL.g:431:3: ( 'private' )
                    // InternalEntityDSL.g:431:4: 'private'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEntityDSL.g:435:2: ( ( 'protected' ) )
                    {
                    // InternalEntityDSL.g:435:2: ( ( 'protected' ) )
                    // InternalEntityDSL.g:436:3: ( 'protected' )
                    {
                     before(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    // InternalEntityDSL.g:437:3: ( 'protected' )
                    // InternalEntityDSL.g:437:4: 'protected'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // InternalEntityDSL.g:445:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:449:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalEntityDSL.g:450:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // InternalEntityDSL.g:457:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:461:1: ( ( 'package' ) )
            // InternalEntityDSL.g:462:1: ( 'package' )
            {
            // InternalEntityDSL.g:462:1: ( 'package' )
            // InternalEntityDSL.g:463:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // InternalEntityDSL.g:472:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:476:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalEntityDSL.g:477:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // InternalEntityDSL.g:484:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:488:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalEntityDSL.g:489:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalEntityDSL.g:489:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalEntityDSL.g:490:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalEntityDSL.g:491:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalEntityDSL.g:491:3: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // InternalEntityDSL.g:499:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:503:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalEntityDSL.g:504:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // InternalEntityDSL.g:511:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:515:1: ( ( '{' ) )
            // InternalEntityDSL.g:516:1: ( '{' )
            {
            // InternalEntityDSL.g:516:1: ( '{' )
            // InternalEntityDSL.g:517:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // InternalEntityDSL.g:526:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:530:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalEntityDSL.g:531:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // InternalEntityDSL.g:538:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:542:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalEntityDSL.g:543:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalEntityDSL.g:543:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalEntityDSL.g:544:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalEntityDSL.g:545:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==14||LA6_0==17||LA6_0==20||(LA6_0>=22 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEntityDSL.g:545:3: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // InternalEntityDSL.g:553:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:557:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalEntityDSL.g:558:2: rule__PackageDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // InternalEntityDSL.g:564:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:568:1: ( ( '}' ) )
            // InternalEntityDSL.g:569:1: ( '}' )
            {
            // InternalEntityDSL.g:569:1: ( '}' )
            // InternalEntityDSL.g:570:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalEntityDSL.g:580:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:584:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalEntityDSL.g:585:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalEntityDSL.g:592:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:596:1: ( ( 'import' ) )
            // InternalEntityDSL.g:597:1: ( 'import' )
            {
            // InternalEntityDSL.g:597:1: ( 'import' )
            // InternalEntityDSL.g:598:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalEntityDSL.g:607:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:611:1: ( rule__Import__Group__1__Impl )
            // InternalEntityDSL.g:612:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalEntityDSL.g:618:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:622:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalEntityDSL.g:623:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalEntityDSL.g:623:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalEntityDSL.g:624:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalEntityDSL.g:625:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalEntityDSL.g:625:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalEntityDSL.g:634:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:638:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalEntityDSL.g:639:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalEntityDSL.g:646:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:650:1: ( ( ruleQualifiedName ) )
            // InternalEntityDSL.g:651:1: ( ruleQualifiedName )
            {
            // InternalEntityDSL.g:651:1: ( ruleQualifiedName )
            // InternalEntityDSL.g:652:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalEntityDSL.g:661:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:665:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalEntityDSL.g:666:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalEntityDSL.g:672:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:676:1: ( ( ( '.*' )? ) )
            // InternalEntityDSL.g:677:1: ( ( '.*' )? )
            {
            // InternalEntityDSL.g:677:1: ( ( '.*' )? )
            // InternalEntityDSL.g:678:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalEntityDSL.g:679:2: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEntityDSL.g:679:3: '.*'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalEntityDSL.g:688:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:692:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalEntityDSL.g:693:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalEntityDSL.g:700:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:704:1: ( ( RULE_ID ) )
            // InternalEntityDSL.g:705:1: ( RULE_ID )
            {
            // InternalEntityDSL.g:705:1: ( RULE_ID )
            // InternalEntityDSL.g:706:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalEntityDSL.g:715:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:719:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalEntityDSL.g:720:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalEntityDSL.g:726:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:730:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalEntityDSL.g:731:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalEntityDSL.g:731:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalEntityDSL.g:732:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalEntityDSL.g:733:2: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEntityDSL.g:733:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalEntityDSL.g:742:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:746:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalEntityDSL.g:747:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalEntityDSL.g:754:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:758:1: ( ( '.' ) )
            // InternalEntityDSL.g:759:1: ( '.' )
            {
            // InternalEntityDSL.g:759:1: ( '.' )
            // InternalEntityDSL.g:760:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalEntityDSL.g:769:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:773:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalEntityDSL.g:774:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalEntityDSL.g:780:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:784:1: ( ( RULE_ID ) )
            // InternalEntityDSL.g:785:1: ( RULE_ID )
            {
            // InternalEntityDSL.g:785:1: ( RULE_ID )
            // InternalEntityDSL.g:786:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__DataType__Group_0__0"
    // InternalEntityDSL.g:796:1: rule__DataType__Group_0__0 : rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 ;
    public final void rule__DataType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:800:1: ( rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1 )
            // InternalEntityDSL.g:801:2: rule__DataType__Group_0__0__Impl rule__DataType__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__0"


    // $ANTLR start "rule__DataType__Group_0__0__Impl"
    // InternalEntityDSL.g:808:1: rule__DataType__Group_0__0__Impl : ( 'enumeration' ) ;
    public final void rule__DataType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:812:1: ( ( 'enumeration' ) )
            // InternalEntityDSL.g:813:1: ( 'enumeration' )
            {
            // InternalEntityDSL.g:813:1: ( 'enumeration' )
            // InternalEntityDSL.g:814:2: 'enumeration'
            {
             before(grammarAccess.getDataTypeAccess().getEnumerationKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getEnumerationKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__0__Impl"


    // $ANTLR start "rule__DataType__Group_0__1"
    // InternalEntityDSL.g:823:1: rule__DataType__Group_0__1 : rule__DataType__Group_0__1__Impl rule__DataType__Group_0__2 ;
    public final void rule__DataType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:827:1: ( rule__DataType__Group_0__1__Impl rule__DataType__Group_0__2 )
            // InternalEntityDSL.g:828:2: rule__DataType__Group_0__1__Impl rule__DataType__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__DataType__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__1"


    // $ANTLR start "rule__DataType__Group_0__1__Impl"
    // InternalEntityDSL.g:835:1: rule__DataType__Group_0__1__Impl : ( ( rule__DataType__NameAssignment_0_1 ) ) ;
    public final void rule__DataType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:839:1: ( ( ( rule__DataType__NameAssignment_0_1 ) ) )
            // InternalEntityDSL.g:840:1: ( ( rule__DataType__NameAssignment_0_1 ) )
            {
            // InternalEntityDSL.g:840:1: ( ( rule__DataType__NameAssignment_0_1 ) )
            // InternalEntityDSL.g:841:2: ( rule__DataType__NameAssignment_0_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_0_1()); 
            // InternalEntityDSL.g:842:2: ( rule__DataType__NameAssignment_0_1 )
            // InternalEntityDSL.g:842:3: rule__DataType__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__1__Impl"


    // $ANTLR start "rule__DataType__Group_0__2"
    // InternalEntityDSL.g:850:1: rule__DataType__Group_0__2 : rule__DataType__Group_0__2__Impl rule__DataType__Group_0__3 ;
    public final void rule__DataType__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:854:1: ( rule__DataType__Group_0__2__Impl rule__DataType__Group_0__3 )
            // InternalEntityDSL.g:855:2: rule__DataType__Group_0__2__Impl rule__DataType__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__DataType__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__2"


    // $ANTLR start "rule__DataType__Group_0__2__Impl"
    // InternalEntityDSL.g:862:1: rule__DataType__Group_0__2__Impl : ( ( rule__DataType__Group_0_2__0 )? ) ;
    public final void rule__DataType__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:866:1: ( ( ( rule__DataType__Group_0_2__0 )? ) )
            // InternalEntityDSL.g:867:1: ( ( rule__DataType__Group_0_2__0 )? )
            {
            // InternalEntityDSL.g:867:1: ( ( rule__DataType__Group_0_2__0 )? )
            // InternalEntityDSL.g:868:2: ( rule__DataType__Group_0_2__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_0_2()); 
            // InternalEntityDSL.g:869:2: ( rule__DataType__Group_0_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEntityDSL.g:869:3: rule__DataType__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__2__Impl"


    // $ANTLR start "rule__DataType__Group_0__3"
    // InternalEntityDSL.g:877:1: rule__DataType__Group_0__3 : rule__DataType__Group_0__3__Impl rule__DataType__Group_0__4 ;
    public final void rule__DataType__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:881:1: ( rule__DataType__Group_0__3__Impl rule__DataType__Group_0__4 )
            // InternalEntityDSL.g:882:2: rule__DataType__Group_0__3__Impl rule__DataType__Group_0__4
            {
            pushFollow(FOLLOW_11);
            rule__DataType__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__3"


    // $ANTLR start "rule__DataType__Group_0__3__Impl"
    // InternalEntityDSL.g:889:1: rule__DataType__Group_0__3__Impl : ( '{' ) ;
    public final void rule__DataType__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:893:1: ( ( '{' ) )
            // InternalEntityDSL.g:894:1: ( '{' )
            {
            // InternalEntityDSL.g:894:1: ( '{' )
            // InternalEntityDSL.g:895:2: '{'
            {
             before(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_0_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__3__Impl"


    // $ANTLR start "rule__DataType__Group_0__4"
    // InternalEntityDSL.g:904:1: rule__DataType__Group_0__4 : rule__DataType__Group_0__4__Impl rule__DataType__Group_0__5 ;
    public final void rule__DataType__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:908:1: ( rule__DataType__Group_0__4__Impl rule__DataType__Group_0__5 )
            // InternalEntityDSL.g:909:2: rule__DataType__Group_0__4__Impl rule__DataType__Group_0__5
            {
            pushFollow(FOLLOW_11);
            rule__DataType__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__4"


    // $ANTLR start "rule__DataType__Group_0__4__Impl"
    // InternalEntityDSL.g:916:1: rule__DataType__Group_0__4__Impl : ( ( rule__DataType__LiteralsAssignment_0_4 )* ) ;
    public final void rule__DataType__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:920:1: ( ( ( rule__DataType__LiteralsAssignment_0_4 )* ) )
            // InternalEntityDSL.g:921:1: ( ( rule__DataType__LiteralsAssignment_0_4 )* )
            {
            // InternalEntityDSL.g:921:1: ( ( rule__DataType__LiteralsAssignment_0_4 )* )
            // InternalEntityDSL.g:922:2: ( rule__DataType__LiteralsAssignment_0_4 )*
            {
             before(grammarAccess.getDataTypeAccess().getLiteralsAssignment_0_4()); 
            // InternalEntityDSL.g:923:2: ( rule__DataType__LiteralsAssignment_0_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEntityDSL.g:923:3: rule__DataType__LiteralsAssignment_0_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__DataType__LiteralsAssignment_0_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getLiteralsAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__4__Impl"


    // $ANTLR start "rule__DataType__Group_0__5"
    // InternalEntityDSL.g:931:1: rule__DataType__Group_0__5 : rule__DataType__Group_0__5__Impl ;
    public final void rule__DataType__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:935:1: ( rule__DataType__Group_0__5__Impl )
            // InternalEntityDSL.g:936:2: rule__DataType__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__5"


    // $ANTLR start "rule__DataType__Group_0__5__Impl"
    // InternalEntityDSL.g:942:1: rule__DataType__Group_0__5__Impl : ( '}' ) ;
    public final void rule__DataType__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:946:1: ( ( '}' ) )
            // InternalEntityDSL.g:947:1: ( '}' )
            {
            // InternalEntityDSL.g:947:1: ( '}' )
            // InternalEntityDSL.g:948:2: '}'
            {
             before(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_0_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0__5__Impl"


    // $ANTLR start "rule__DataType__Group_0_2__0"
    // InternalEntityDSL.g:958:1: rule__DataType__Group_0_2__0 : rule__DataType__Group_0_2__0__Impl rule__DataType__Group_0_2__1 ;
    public final void rule__DataType__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:962:1: ( rule__DataType__Group_0_2__0__Impl rule__DataType__Group_0_2__1 )
            // InternalEntityDSL.g:963:2: rule__DataType__Group_0_2__0__Impl rule__DataType__Group_0_2__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0_2__0"


    // $ANTLR start "rule__DataType__Group_0_2__0__Impl"
    // InternalEntityDSL.g:970:1: rule__DataType__Group_0_2__0__Impl : ( 'extends' ) ;
    public final void rule__DataType__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:974:1: ( ( 'extends' ) )
            // InternalEntityDSL.g:975:1: ( 'extends' )
            {
            // InternalEntityDSL.g:975:1: ( 'extends' )
            // InternalEntityDSL.g:976:2: 'extends'
            {
             before(grammarAccess.getDataTypeAccess().getExtendsKeyword_0_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getExtendsKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0_2__0__Impl"


    // $ANTLR start "rule__DataType__Group_0_2__1"
    // InternalEntityDSL.g:985:1: rule__DataType__Group_0_2__1 : rule__DataType__Group_0_2__1__Impl ;
    public final void rule__DataType__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:989:1: ( rule__DataType__Group_0_2__1__Impl )
            // InternalEntityDSL.g:990:2: rule__DataType__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0_2__1"


    // $ANTLR start "rule__DataType__Group_0_2__1__Impl"
    // InternalEntityDSL.g:996:1: rule__DataType__Group_0_2__1__Impl : ( ( rule__DataType__SuperTypeAssignment_0_2_1 ) ) ;
    public final void rule__DataType__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1000:1: ( ( ( rule__DataType__SuperTypeAssignment_0_2_1 ) ) )
            // InternalEntityDSL.g:1001:1: ( ( rule__DataType__SuperTypeAssignment_0_2_1 ) )
            {
            // InternalEntityDSL.g:1001:1: ( ( rule__DataType__SuperTypeAssignment_0_2_1 ) )
            // InternalEntityDSL.g:1002:2: ( rule__DataType__SuperTypeAssignment_0_2_1 )
            {
             before(grammarAccess.getDataTypeAccess().getSuperTypeAssignment_0_2_1()); 
            // InternalEntityDSL.g:1003:2: ( rule__DataType__SuperTypeAssignment_0_2_1 )
            // InternalEntityDSL.g:1003:3: rule__DataType__SuperTypeAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__SuperTypeAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getSuperTypeAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_0_2__1__Impl"


    // $ANTLR start "rule__DataType__Group_1__0"
    // InternalEntityDSL.g:1012:1: rule__DataType__Group_1__0 : rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 ;
    public final void rule__DataType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1016:1: ( rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 )
            // InternalEntityDSL.g:1017:2: rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__0"


    // $ANTLR start "rule__DataType__Group_1__0__Impl"
    // InternalEntityDSL.g:1024:1: rule__DataType__Group_1__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1028:1: ( ( 'datatype' ) )
            // InternalEntityDSL.g:1029:1: ( 'datatype' )
            {
            // InternalEntityDSL.g:1029:1: ( 'datatype' )
            // InternalEntityDSL.g:1030:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__0__Impl"


    // $ANTLR start "rule__DataType__Group_1__1"
    // InternalEntityDSL.g:1039:1: rule__DataType__Group_1__1 : rule__DataType__Group_1__1__Impl ;
    public final void rule__DataType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1043:1: ( rule__DataType__Group_1__1__Impl )
            // InternalEntityDSL.g:1044:2: rule__DataType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__1"


    // $ANTLR start "rule__DataType__Group_1__1__Impl"
    // InternalEntityDSL.g:1050:1: rule__DataType__Group_1__1__Impl : ( ( rule__DataType__NameAssignment_1_1 ) ) ;
    public final void rule__DataType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1054:1: ( ( ( rule__DataType__NameAssignment_1_1 ) ) )
            // InternalEntityDSL.g:1055:1: ( ( rule__DataType__NameAssignment_1_1 ) )
            {
            // InternalEntityDSL.g:1055:1: ( ( rule__DataType__NameAssignment_1_1 ) )
            // InternalEntityDSL.g:1056:2: ( rule__DataType__NameAssignment_1_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1_1()); 
            // InternalEntityDSL.g:1057:2: ( rule__DataType__NameAssignment_1_1 )
            // InternalEntityDSL.g:1057:3: rule__DataType__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalEntityDSL.g:1066:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1070:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalEntityDSL.g:1071:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalEntityDSL.g:1078:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1082:1: ( ( 'entity' ) )
            // InternalEntityDSL.g:1083:1: ( 'entity' )
            {
            // InternalEntityDSL.g:1083:1: ( 'entity' )
            // InternalEntityDSL.g:1084:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalEntityDSL.g:1093:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1097:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalEntityDSL.g:1098:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalEntityDSL.g:1105:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1109:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalEntityDSL.g:1110:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalEntityDSL.g:1110:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalEntityDSL.g:1111:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalEntityDSL.g:1112:2: ( rule__Entity__NameAssignment_1 )
            // InternalEntityDSL.g:1112:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalEntityDSL.g:1120:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1124:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalEntityDSL.g:1125:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalEntityDSL.g:1132:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1136:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalEntityDSL.g:1137:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalEntityDSL.g:1137:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalEntityDSL.g:1138:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalEntityDSL.g:1139:2: ( rule__Entity__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEntityDSL.g:1139:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalEntityDSL.g:1147:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1151:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalEntityDSL.g:1152:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalEntityDSL.g:1159:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1163:1: ( ( '{' ) )
            // InternalEntityDSL.g:1164:1: ( '{' )
            {
            // InternalEntityDSL.g:1164:1: ( '{' )
            // InternalEntityDSL.g:1165:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalEntityDSL.g:1174:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1178:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalEntityDSL.g:1179:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalEntityDSL.g:1186:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1190:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // InternalEntityDSL.g:1191:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // InternalEntityDSL.g:1191:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // InternalEntityDSL.g:1192:2: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // InternalEntityDSL.g:1193:2: ( rule__Entity__FeaturesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=11 && LA12_0<=13)||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEntityDSL.g:1193:3: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalEntityDSL.g:1201:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1205:1: ( rule__Entity__Group__5__Impl )
            // InternalEntityDSL.g:1206:2: rule__Entity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalEntityDSL.g:1212:1: rule__Entity__Group__5__Impl : ( '}' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1216:1: ( ( '}' ) )
            // InternalEntityDSL.g:1217:1: ( '}' )
            {
            // InternalEntityDSL.g:1217:1: ( '}' )
            // InternalEntityDSL.g:1218:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalEntityDSL.g:1228:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1232:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalEntityDSL.g:1233:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalEntityDSL.g:1240:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1244:1: ( ( 'extends' ) )
            // InternalEntityDSL.g:1245:1: ( 'extends' )
            {
            // InternalEntityDSL.g:1245:1: ( 'extends' )
            // InternalEntityDSL.g:1246:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalEntityDSL.g:1255:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1259:1: ( rule__Entity__Group_2__1__Impl )
            // InternalEntityDSL.g:1260:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalEntityDSL.g:1266:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1270:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalEntityDSL.g:1271:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalEntityDSL.g:1271:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalEntityDSL.g:1272:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalEntityDSL.g:1273:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalEntityDSL.g:1273:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalEntityDSL.g:1282:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1286:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalEntityDSL.g:1287:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalEntityDSL.g:1294:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ModifierAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1298:1: ( ( ( rule__Feature__ModifierAssignment_0 )? ) )
            // InternalEntityDSL.g:1299:1: ( ( rule__Feature__ModifierAssignment_0 )? )
            {
            // InternalEntityDSL.g:1299:1: ( ( rule__Feature__ModifierAssignment_0 )? )
            // InternalEntityDSL.g:1300:2: ( rule__Feature__ModifierAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getModifierAssignment_0()); 
            // InternalEntityDSL.g:1301:2: ( rule__Feature__ModifierAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=11 && LA13_0<=13)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEntityDSL.g:1301:3: rule__Feature__ModifierAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ModifierAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getModifierAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalEntityDSL.g:1309:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1313:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalEntityDSL.g:1314:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalEntityDSL.g:1321:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__ManyAssignment_1 )? ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1325:1: ( ( ( rule__Feature__ManyAssignment_1 )? ) )
            // InternalEntityDSL.g:1326:1: ( ( rule__Feature__ManyAssignment_1 )? )
            {
            // InternalEntityDSL.g:1326:1: ( ( rule__Feature__ManyAssignment_1 )? )
            // InternalEntityDSL.g:1327:2: ( rule__Feature__ManyAssignment_1 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_1()); 
            // InternalEntityDSL.g:1328:2: ( rule__Feature__ManyAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEntityDSL.g:1328:3: rule__Feature__ManyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ManyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalEntityDSL.g:1336:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1340:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalEntityDSL.g:1341:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalEntityDSL.g:1348:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1352:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalEntityDSL.g:1353:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalEntityDSL.g:1353:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalEntityDSL.g:1354:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalEntityDSL.g:1355:2: ( rule__Feature__NameAssignment_2 )
            // InternalEntityDSL.g:1355:3: rule__Feature__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalEntityDSL.g:1363:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1367:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalEntityDSL.g:1368:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalEntityDSL.g:1375:1: rule__Feature__Group__3__Impl : ( ':' ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1379:1: ( ( ':' ) )
            // InternalEntityDSL.g:1380:1: ( ':' )
            {
            // InternalEntityDSL.g:1380:1: ( ':' )
            // InternalEntityDSL.g:1381:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalEntityDSL.g:1390:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1394:1: ( rule__Feature__Group__4__Impl )
            // InternalEntityDSL.g:1395:2: rule__Feature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalEntityDSL.g:1401:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__TypeAssignment_4 ) ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1405:1: ( ( ( rule__Feature__TypeAssignment_4 ) ) )
            // InternalEntityDSL.g:1406:1: ( ( rule__Feature__TypeAssignment_4 ) )
            {
            // InternalEntityDSL.g:1406:1: ( ( rule__Feature__TypeAssignment_4 ) )
            // InternalEntityDSL.g:1407:2: ( rule__Feature__TypeAssignment_4 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_4()); 
            // InternalEntityDSL.g:1408:2: ( rule__Feature__TypeAssignment_4 )
            // InternalEntityDSL.g:1408:3: rule__Feature__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalEntityDSL.g:1417:1: rule__Domainmodel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1421:1: ( ( ruleAbstractElement ) )
            // InternalEntityDSL.g:1422:2: ( ruleAbstractElement )
            {
            // InternalEntityDSL.g:1422:2: ( ruleAbstractElement )
            // InternalEntityDSL.g:1423:3: ruleAbstractElement
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // InternalEntityDSL.g:1432:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1436:1: ( ( ruleQualifiedName ) )
            // InternalEntityDSL.g:1437:2: ( ruleQualifiedName )
            {
            // InternalEntityDSL.g:1437:2: ( ruleQualifiedName )
            // InternalEntityDSL.g:1438:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_3"
    // InternalEntityDSL.g:1447:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1451:1: ( ( ruleAbstractElement ) )
            // InternalEntityDSL.g:1452:2: ( ruleAbstractElement )
            {
            // InternalEntityDSL.g:1452:2: ( ruleAbstractElement )
            // InternalEntityDSL.g:1453:3: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalEntityDSL.g:1462:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1466:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalEntityDSL.g:1467:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalEntityDSL.g:1467:2: ( ruleQualifiedNameWithWildcard )
            // InternalEntityDSL.g:1468:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Literal__ValueAssignment"
    // InternalEntityDSL.g:1477:1: rule__Literal__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Literal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1481:1: ( ( RULE_ID ) )
            // InternalEntityDSL.g:1482:2: ( RULE_ID )
            {
            // InternalEntityDSL.g:1482:2: ( RULE_ID )
            // InternalEntityDSL.g:1483:3: RULE_ID
            {
             before(grammarAccess.getLiteralAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getValueIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment"


    // $ANTLR start "rule__DataType__NameAssignment_0_1"
    // InternalEntityDSL.g:1492:1: rule__DataType__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1496:1: ( ( RULE_ID ) )
            // InternalEntityDSL.g:1497:2: ( RULE_ID )
            {
            // InternalEntityDSL.g:1497:2: ( RULE_ID )
            // InternalEntityDSL.g:1498:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_0_1"


    // $ANTLR start "rule__DataType__SuperTypeAssignment_0_2_1"
    // InternalEntityDSL.g:1507:1: rule__DataType__SuperTypeAssignment_0_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataType__SuperTypeAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1511:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEntityDSL.g:1512:2: ( ( ruleQualifiedName ) )
            {
            // InternalEntityDSL.g:1512:2: ( ( ruleQualifiedName ) )
            // InternalEntityDSL.g:1513:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataTypeAccess().getSuperTypeLiteralCrossReference_0_2_1_0()); 
            // InternalEntityDSL.g:1514:3: ( ruleQualifiedName )
            // InternalEntityDSL.g:1515:4: ruleQualifiedName
            {
             before(grammarAccess.getDataTypeAccess().getSuperTypeLiteralQualifiedNameParserRuleCall_0_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getSuperTypeLiteralQualifiedNameParserRuleCall_0_2_1_0_1()); 

            }

             after(grammarAccess.getDataTypeAccess().getSuperTypeLiteralCrossReference_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__SuperTypeAssignment_0_2_1"


    // $ANTLR start "rule__DataType__LiteralsAssignment_0_4"
    // InternalEntityDSL.g:1526:1: rule__DataType__LiteralsAssignment_0_4 : ( ruleLiteral ) ;
    public final void rule__DataType__LiteralsAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1530:1: ( ( ruleLiteral ) )
            // InternalEntityDSL.g:1531:2: ( ruleLiteral )
            {
            // InternalEntityDSL.g:1531:2: ( ruleLiteral )
            // InternalEntityDSL.g:1532:3: ruleLiteral
            {
             before(grammarAccess.getDataTypeAccess().getLiteralsLiteralParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getLiteralsLiteralParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__LiteralsAssignment_0_4"


    // $ANTLR start "rule__DataType__NameAssignment_1_1"
    // InternalEntityDSL.g:1541:1: rule__DataType__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1545:1: ( ( RULE_ID ) )
            // InternalEntityDSL.g:1546:2: ( RULE_ID )
            {
            // InternalEntityDSL.g:1546:2: ( RULE_ID )
            // InternalEntityDSL.g:1547:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalEntityDSL.g:1556:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1560:1: ( ( RULE_ID ) )
            // InternalEntityDSL.g:1561:2: ( RULE_ID )
            {
            // InternalEntityDSL.g:1561:2: ( RULE_ID )
            // InternalEntityDSL.g:1562:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalEntityDSL.g:1571:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1575:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEntityDSL.g:1576:2: ( ( ruleQualifiedName ) )
            {
            // InternalEntityDSL.g:1576:2: ( ( ruleQualifiedName ) )
            // InternalEntityDSL.g:1577:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalEntityDSL.g:1578:3: ( ruleQualifiedName )
            // InternalEntityDSL.g:1579:4: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_4"
    // InternalEntityDSL.g:1590:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1594:1: ( ( ruleFeature ) )
            // InternalEntityDSL.g:1595:2: ( ruleFeature )
            {
            // InternalEntityDSL.g:1595:2: ( ruleFeature )
            // InternalEntityDSL.g:1596:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__FeaturesAssignment_4"


    // $ANTLR start "rule__Feature__ModifierAssignment_0"
    // InternalEntityDSL.g:1605:1: rule__Feature__ModifierAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Feature__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1609:1: ( ( ruleVisibility ) )
            // InternalEntityDSL.g:1610:2: ( ruleVisibility )
            {
            // InternalEntityDSL.g:1610:2: ( ruleVisibility )
            // InternalEntityDSL.g:1611:3: ruleVisibility
            {
             before(grammarAccess.getFeatureAccess().getModifierVisibilityEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getModifierVisibilityEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ModifierAssignment_0"


    // $ANTLR start "rule__Feature__ManyAssignment_1"
    // InternalEntityDSL.g:1620:1: rule__Feature__ManyAssignment_1 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1624:1: ( ( ( 'many' ) ) )
            // InternalEntityDSL.g:1625:2: ( ( 'many' ) )
            {
            // InternalEntityDSL.g:1625:2: ( ( 'many' ) )
            // InternalEntityDSL.g:1626:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_1_0()); 
            // InternalEntityDSL.g:1627:3: ( 'many' )
            // InternalEntityDSL.g:1628:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_1_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ManyAssignment_1"


    // $ANTLR start "rule__Feature__NameAssignment_2"
    // InternalEntityDSL.g:1639:1: rule__Feature__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1643:1: ( ( RULE_ID ) )
            // InternalEntityDSL.g:1644:2: ( RULE_ID )
            {
            // InternalEntityDSL.g:1644:2: ( RULE_ID )
            // InternalEntityDSL.g:1645:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_2"


    // $ANTLR start "rule__Feature__TypeAssignment_4"
    // InternalEntityDSL.g:1654:1: rule__Feature__TypeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Feature__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEntityDSL.g:1658:1: ( ( ( ruleQualifiedName ) ) )
            // InternalEntityDSL.g:1659:2: ( ( ruleQualifiedName ) )
            {
            // InternalEntityDSL.g:1659:2: ( ( ruleQualifiedName ) )
            // InternalEntityDSL.g:1660:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_4_0()); 
            // InternalEntityDSL.g:1661:3: ( ruleQualifiedName )
            // InternalEntityDSL.g:1662:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeQualifiedNameParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TypeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000D24012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000D34010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002013810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002003812L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002003810L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});

}