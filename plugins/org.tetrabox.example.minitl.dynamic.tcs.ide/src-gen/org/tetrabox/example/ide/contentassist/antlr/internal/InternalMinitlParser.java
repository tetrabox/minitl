package org.tetrabox.example.ide.contentassist.antlr.internal;

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
import org.tetrabox.example.services.MinitlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMinitlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'transformation'", "'{'", "'}'", "'outputMetamodel'", "'inputMetamodel'", "','", "'rule'", "'from'", "'to'", "':'", "';'", "'='", "'.'", "'('", "')'"
    };
    public static final int RULE_STRING=5;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMinitlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMinitlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMinitlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMinitl.g"; }


    	private MinitlGrammarAccess grammarAccess;

    	public void setGrammarAccess(MinitlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTransformation"
    // InternalMinitl.g:53:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // InternalMinitl.g:54:1: ( ruleTransformation EOF )
            // InternalMinitl.g:55:1: ruleTransformation EOF
            {
             before(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationRule()); 
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
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalMinitl.g:62:1: ruleTransformation : ( ( rule__Transformation__Group__0 ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:66:2: ( ( ( rule__Transformation__Group__0 ) ) )
            // InternalMinitl.g:67:2: ( ( rule__Transformation__Group__0 ) )
            {
            // InternalMinitl.g:67:2: ( ( rule__Transformation__Group__0 ) )
            // InternalMinitl.g:68:3: ( rule__Transformation__Group__0 )
            {
             before(grammarAccess.getTransformationAccess().getGroup()); 
            // InternalMinitl.g:69:3: ( rule__Transformation__Group__0 )
            // InternalMinitl.g:69:4: rule__Transformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getGroup()); 

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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleInputMetamodel"
    // InternalMinitl.g:78:1: entryRuleInputMetamodel : ruleInputMetamodel EOF ;
    public final void entryRuleInputMetamodel() throws RecognitionException {
        try {
            // InternalMinitl.g:79:1: ( ruleInputMetamodel EOF )
            // InternalMinitl.g:80:1: ruleInputMetamodel EOF
            {
             before(grammarAccess.getInputMetamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleInputMetamodel();

            state._fsp--;

             after(grammarAccess.getInputMetamodelRule()); 
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
    // $ANTLR end "entryRuleInputMetamodel"


    // $ANTLR start "ruleInputMetamodel"
    // InternalMinitl.g:87:1: ruleInputMetamodel : ( ( rule__InputMetamodel__Group__0 ) ) ;
    public final void ruleInputMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:91:2: ( ( ( rule__InputMetamodel__Group__0 ) ) )
            // InternalMinitl.g:92:2: ( ( rule__InputMetamodel__Group__0 ) )
            {
            // InternalMinitl.g:92:2: ( ( rule__InputMetamodel__Group__0 ) )
            // InternalMinitl.g:93:3: ( rule__InputMetamodel__Group__0 )
            {
             before(grammarAccess.getInputMetamodelAccess().getGroup()); 
            // InternalMinitl.g:94:3: ( rule__InputMetamodel__Group__0 )
            // InternalMinitl.g:94:4: rule__InputMetamodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputMetamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputMetamodelAccess().getGroup()); 

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
    // $ANTLR end "ruleInputMetamodel"


    // $ANTLR start "entryRuleMetamodel"
    // InternalMinitl.g:103:1: entryRuleMetamodel : ruleMetamodel EOF ;
    public final void entryRuleMetamodel() throws RecognitionException {
        try {
            // InternalMinitl.g:104:1: ( ruleMetamodel EOF )
            // InternalMinitl.g:105:1: ruleMetamodel EOF
            {
             before(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getMetamodelRule()); 
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
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // InternalMinitl.g:112:1: ruleMetamodel : ( ( rule__Metamodel__Group__0 ) ) ;
    public final void ruleMetamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:116:2: ( ( ( rule__Metamodel__Group__0 ) ) )
            // InternalMinitl.g:117:2: ( ( rule__Metamodel__Group__0 ) )
            {
            // InternalMinitl.g:117:2: ( ( rule__Metamodel__Group__0 ) )
            // InternalMinitl.g:118:3: ( rule__Metamodel__Group__0 )
            {
             before(grammarAccess.getMetamodelAccess().getGroup()); 
            // InternalMinitl.g:119:3: ( rule__Metamodel__Group__0 )
            // InternalMinitl.g:119:4: rule__Metamodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Metamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getGroup()); 

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
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleRule"
    // InternalMinitl.g:128:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMinitl.g:129:1: ( ruleRule EOF )
            // InternalMinitl.g:130:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMinitl.g:137:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:141:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMinitl.g:142:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMinitl.g:142:2: ( ( rule__Rule__Group__0 ) )
            // InternalMinitl.g:143:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMinitl.g:144:3: ( rule__Rule__Group__0 )
            // InternalMinitl.g:144:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleObjectTemplate"
    // InternalMinitl.g:153:1: entryRuleObjectTemplate : ruleObjectTemplate EOF ;
    public final void entryRuleObjectTemplate() throws RecognitionException {
        try {
            // InternalMinitl.g:154:1: ( ruleObjectTemplate EOF )
            // InternalMinitl.g:155:1: ruleObjectTemplate EOF
            {
             before(grammarAccess.getObjectTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectTemplate();

            state._fsp--;

             after(grammarAccess.getObjectTemplateRule()); 
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
    // $ANTLR end "entryRuleObjectTemplate"


    // $ANTLR start "ruleObjectTemplate"
    // InternalMinitl.g:162:1: ruleObjectTemplate : ( ( rule__ObjectTemplate__Group__0 ) ) ;
    public final void ruleObjectTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:166:2: ( ( ( rule__ObjectTemplate__Group__0 ) ) )
            // InternalMinitl.g:167:2: ( ( rule__ObjectTemplate__Group__0 ) )
            {
            // InternalMinitl.g:167:2: ( ( rule__ObjectTemplate__Group__0 ) )
            // InternalMinitl.g:168:3: ( rule__ObjectTemplate__Group__0 )
            {
             before(grammarAccess.getObjectTemplateAccess().getGroup()); 
            // InternalMinitl.g:169:3: ( rule__ObjectTemplate__Group__0 )
            // InternalMinitl.g:169:4: rule__ObjectTemplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectTemplateAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectTemplate"


    // $ANTLR start "entryRuleBinding"
    // InternalMinitl.g:178:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalMinitl.g:179:1: ( ruleBinding EOF )
            // InternalMinitl.g:180:1: ruleBinding EOF
            {
             before(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getBindingRule()); 
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
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalMinitl.g:187:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:191:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalMinitl.g:192:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalMinitl.g:192:2: ( ( rule__Binding__Group__0 ) )
            // InternalMinitl.g:193:3: ( rule__Binding__Group__0 )
            {
             before(grammarAccess.getBindingAccess().getGroup()); 
            // InternalMinitl.g:194:3: ( rule__Binding__Group__0 )
            // InternalMinitl.g:194:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getGroup()); 

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
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleValue"
    // InternalMinitl.g:203:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMinitl.g:204:1: ( ruleValue EOF )
            // InternalMinitl.g:205:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMinitl.g:212:1: ruleValue : ( ruleMaybeBinary ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:216:2: ( ( ruleMaybeBinary ) )
            // InternalMinitl.g:217:2: ( ruleMaybeBinary )
            {
            // InternalMinitl.g:217:2: ( ruleMaybeBinary )
            // InternalMinitl.g:218:3: ruleMaybeBinary
            {
             before(grammarAccess.getValueAccess().getMaybeBinaryParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleMaybeBinary();

            state._fsp--;

             after(grammarAccess.getValueAccess().getMaybeBinaryParserRuleCall()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleMaybeBinary"
    // InternalMinitl.g:228:1: entryRuleMaybeBinary : ruleMaybeBinary EOF ;
    public final void entryRuleMaybeBinary() throws RecognitionException {
        try {
            // InternalMinitl.g:229:1: ( ruleMaybeBinary EOF )
            // InternalMinitl.g:230:1: ruleMaybeBinary EOF
            {
             before(grammarAccess.getMaybeBinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleMaybeBinary();

            state._fsp--;

             after(grammarAccess.getMaybeBinaryRule()); 
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
    // $ANTLR end "entryRuleMaybeBinary"


    // $ANTLR start "ruleMaybeBinary"
    // InternalMinitl.g:237:1: ruleMaybeBinary : ( ( rule__MaybeBinary__Group__0 ) ) ;
    public final void ruleMaybeBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:241:2: ( ( ( rule__MaybeBinary__Group__0 ) ) )
            // InternalMinitl.g:242:2: ( ( rule__MaybeBinary__Group__0 ) )
            {
            // InternalMinitl.g:242:2: ( ( rule__MaybeBinary__Group__0 ) )
            // InternalMinitl.g:243:3: ( rule__MaybeBinary__Group__0 )
            {
             before(grammarAccess.getMaybeBinaryAccess().getGroup()); 
            // InternalMinitl.g:244:3: ( rule__MaybeBinary__Group__0 )
            // InternalMinitl.g:244:4: rule__MaybeBinary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaybeBinary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaybeBinaryAccess().getGroup()); 

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
    // $ANTLR end "ruleMaybeBinary"


    // $ANTLR start "entryRuleMaybeFieldAccessValue"
    // InternalMinitl.g:253:1: entryRuleMaybeFieldAccessValue : ruleMaybeFieldAccessValue EOF ;
    public final void entryRuleMaybeFieldAccessValue() throws RecognitionException {
        try {
            // InternalMinitl.g:254:1: ( ruleMaybeFieldAccessValue EOF )
            // InternalMinitl.g:255:1: ruleMaybeFieldAccessValue EOF
            {
             before(grammarAccess.getMaybeFieldAccessValueRule()); 
            pushFollow(FOLLOW_1);
            ruleMaybeFieldAccessValue();

            state._fsp--;

             after(grammarAccess.getMaybeFieldAccessValueRule()); 
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
    // $ANTLR end "entryRuleMaybeFieldAccessValue"


    // $ANTLR start "ruleMaybeFieldAccessValue"
    // InternalMinitl.g:262:1: ruleMaybeFieldAccessValue : ( ( rule__MaybeFieldAccessValue__Group__0 ) ) ;
    public final void ruleMaybeFieldAccessValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:266:2: ( ( ( rule__MaybeFieldAccessValue__Group__0 ) ) )
            // InternalMinitl.g:267:2: ( ( rule__MaybeFieldAccessValue__Group__0 ) )
            {
            // InternalMinitl.g:267:2: ( ( rule__MaybeFieldAccessValue__Group__0 ) )
            // InternalMinitl.g:268:3: ( rule__MaybeFieldAccessValue__Group__0 )
            {
             before(grammarAccess.getMaybeFieldAccessValueAccess().getGroup()); 
            // InternalMinitl.g:269:3: ( rule__MaybeFieldAccessValue__Group__0 )
            // InternalMinitl.g:269:4: rule__MaybeFieldAccessValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaybeFieldAccessValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaybeFieldAccessValueAccess().getGroup()); 

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
    // $ANTLR end "ruleMaybeFieldAccessValue"


    // $ANTLR start "entryRulePrimary"
    // InternalMinitl.g:278:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMinitl.g:279:1: ( rulePrimary EOF )
            // InternalMinitl.g:280:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMinitl.g:287:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:291:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMinitl.g:292:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMinitl.g:292:2: ( ( rule__Primary__Alternatives ) )
            // InternalMinitl.g:293:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMinitl.g:294:3: ( rule__Primary__Alternatives )
            // InternalMinitl.g:294:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleStringValue"
    // InternalMinitl.g:303:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalMinitl.g:304:1: ( ruleStringValue EOF )
            // InternalMinitl.g:305:1: ruleStringValue EOF
            {
             before(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;

             after(grammarAccess.getStringValueRule()); 
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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalMinitl.g:312:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:316:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalMinitl.g:317:2: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalMinitl.g:317:2: ( ( rule__StringValue__ValueAssignment ) )
            // InternalMinitl.g:318:3: ( rule__StringValue__ValueAssignment )
            {
             before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            // InternalMinitl.g:319:3: ( rule__StringValue__ValueAssignment )
            // InternalMinitl.g:319:4: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringValueAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleObjectTemplateValue"
    // InternalMinitl.g:328:1: entryRuleObjectTemplateValue : ruleObjectTemplateValue EOF ;
    public final void entryRuleObjectTemplateValue() throws RecognitionException {
        try {
            // InternalMinitl.g:329:1: ( ruleObjectTemplateValue EOF )
            // InternalMinitl.g:330:1: ruleObjectTemplateValue EOF
            {
             before(grammarAccess.getObjectTemplateValueRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectTemplateValue();

            state._fsp--;

             after(grammarAccess.getObjectTemplateValueRule()); 
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
    // $ANTLR end "entryRuleObjectTemplateValue"


    // $ANTLR start "ruleObjectTemplateValue"
    // InternalMinitl.g:337:1: ruleObjectTemplateValue : ( ( rule__ObjectTemplateValue__ObjecttemplateAssignment ) ) ;
    public final void ruleObjectTemplateValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:341:2: ( ( ( rule__ObjectTemplateValue__ObjecttemplateAssignment ) ) )
            // InternalMinitl.g:342:2: ( ( rule__ObjectTemplateValue__ObjecttemplateAssignment ) )
            {
            // InternalMinitl.g:342:2: ( ( rule__ObjectTemplateValue__ObjecttemplateAssignment ) )
            // InternalMinitl.g:343:3: ( rule__ObjectTemplateValue__ObjecttemplateAssignment )
            {
             before(grammarAccess.getObjectTemplateValueAccess().getObjecttemplateAssignment()); 
            // InternalMinitl.g:344:3: ( rule__ObjectTemplateValue__ObjecttemplateAssignment )
            // InternalMinitl.g:344:4: rule__ObjectTemplateValue__ObjecttemplateAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTemplateValue__ObjecttemplateAssignment();

            state._fsp--;


            }

             after(grammarAccess.getObjectTemplateValueAccess().getObjecttemplateAssignment()); 

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
    // $ANTLR end "ruleObjectTemplateValue"


    // $ANTLR start "entryRuleFQN"
    // InternalMinitl.g:353:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalMinitl.g:354:1: ( ruleFQN EOF )
            // InternalMinitl.g:355:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalMinitl.g:362:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:366:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalMinitl.g:367:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalMinitl.g:367:2: ( ( rule__FQN__Group__0 ) )
            // InternalMinitl.g:368:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalMinitl.g:369:3: ( rule__FQN__Group__0 )
            // InternalMinitl.g:369:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleOperator"
    // InternalMinitl.g:378:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:382:1: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMinitl.g:383:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMinitl.g:383:2: ( ( rule__Operator__Alternatives ) )
            // InternalMinitl.g:384:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMinitl.g:385:3: ( rule__Operator__Alternatives )
            // InternalMinitl.g:385:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMinitl.g:393:1: rule__Primary__Alternatives : ( ( ruleStringValue ) | ( ruleObjectTemplateValue ) | ( ( rule__Primary__Group_2__0 ) ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:397:1: ( ( ruleStringValue ) | ( ruleObjectTemplateValue ) | ( ( rule__Primary__Group_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt1=1;
                }
                break;
            case RULE_ID:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMinitl.g:398:2: ( ruleStringValue )
                    {
                    // InternalMinitl.g:398:2: ( ruleStringValue )
                    // InternalMinitl.g:399:3: ruleStringValue
                    {
                     before(grammarAccess.getPrimaryAccess().getStringValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getStringValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinitl.g:404:2: ( ruleObjectTemplateValue )
                    {
                    // InternalMinitl.g:404:2: ( ruleObjectTemplateValue )
                    // InternalMinitl.g:405:3: ruleObjectTemplateValue
                    {
                     before(grammarAccess.getPrimaryAccess().getObjectTemplateValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectTemplateValue();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getObjectTemplateValueParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMinitl.g:410:2: ( ( rule__Primary__Group_2__0 ) )
                    {
                    // InternalMinitl.g:410:2: ( ( rule__Primary__Group_2__0 ) )
                    // InternalMinitl.g:411:3: ( rule__Primary__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_2()); 
                    // InternalMinitl.g:412:3: ( rule__Primary__Group_2__0 )
                    // InternalMinitl.g:412:4: rule__Primary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMinitl.g:420:1: rule__Operator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:424:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMinitl.g:425:2: ( ( '+' ) )
                    {
                    // InternalMinitl.g:425:2: ( ( '+' ) )
                    // InternalMinitl.g:426:3: ( '+' )
                    {
                     before(grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalMinitl.g:427:3: ( '+' )
                    // InternalMinitl.g:427:4: '+'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMinitl.g:431:2: ( ( '-' ) )
                    {
                    // InternalMinitl.g:431:2: ( ( '-' ) )
                    // InternalMinitl.g:432:3: ( '-' )
                    {
                     before(grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1()); 
                    // InternalMinitl.g:433:3: ( '-' )
                    // InternalMinitl.g:433:4: '-'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__Transformation__Group__0"
    // InternalMinitl.g:441:1: rule__Transformation__Group__0 : rule__Transformation__Group__0__Impl rule__Transformation__Group__1 ;
    public final void rule__Transformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:445:1: ( rule__Transformation__Group__0__Impl rule__Transformation__Group__1 )
            // InternalMinitl.g:446:2: rule__Transformation__Group__0__Impl rule__Transformation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Transformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__1();

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
    // $ANTLR end "rule__Transformation__Group__0"


    // $ANTLR start "rule__Transformation__Group__0__Impl"
    // InternalMinitl.g:453:1: rule__Transformation__Group__0__Impl : ( 'transformation' ) ;
    public final void rule__Transformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:457:1: ( ( 'transformation' ) )
            // InternalMinitl.g:458:1: ( 'transformation' )
            {
            // InternalMinitl.g:458:1: ( 'transformation' )
            // InternalMinitl.g:459:2: 'transformation'
            {
             before(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getTransformationKeyword_0()); 

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
    // $ANTLR end "rule__Transformation__Group__0__Impl"


    // $ANTLR start "rule__Transformation__Group__1"
    // InternalMinitl.g:468:1: rule__Transformation__Group__1 : rule__Transformation__Group__1__Impl rule__Transformation__Group__2 ;
    public final void rule__Transformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:472:1: ( rule__Transformation__Group__1__Impl rule__Transformation__Group__2 )
            // InternalMinitl.g:473:2: rule__Transformation__Group__1__Impl rule__Transformation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Transformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__2();

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
    // $ANTLR end "rule__Transformation__Group__1"


    // $ANTLR start "rule__Transformation__Group__1__Impl"
    // InternalMinitl.g:480:1: rule__Transformation__Group__1__Impl : ( ( rule__Transformation__NameAssignment_1 ) ) ;
    public final void rule__Transformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:484:1: ( ( ( rule__Transformation__NameAssignment_1 ) ) )
            // InternalMinitl.g:485:1: ( ( rule__Transformation__NameAssignment_1 ) )
            {
            // InternalMinitl.g:485:1: ( ( rule__Transformation__NameAssignment_1 ) )
            // InternalMinitl.g:486:2: ( rule__Transformation__NameAssignment_1 )
            {
             before(grammarAccess.getTransformationAccess().getNameAssignment_1()); 
            // InternalMinitl.g:487:2: ( rule__Transformation__NameAssignment_1 )
            // InternalMinitl.g:487:3: rule__Transformation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Transformation__Group__1__Impl"


    // $ANTLR start "rule__Transformation__Group__2"
    // InternalMinitl.g:495:1: rule__Transformation__Group__2 : rule__Transformation__Group__2__Impl rule__Transformation__Group__3 ;
    public final void rule__Transformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:499:1: ( rule__Transformation__Group__2__Impl rule__Transformation__Group__3 )
            // InternalMinitl.g:500:2: rule__Transformation__Group__2__Impl rule__Transformation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Transformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__3();

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
    // $ANTLR end "rule__Transformation__Group__2"


    // $ANTLR start "rule__Transformation__Group__2__Impl"
    // InternalMinitl.g:507:1: rule__Transformation__Group__2__Impl : ( '{' ) ;
    public final void rule__Transformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:511:1: ( ( '{' ) )
            // InternalMinitl.g:512:1: ( '{' )
            {
            // InternalMinitl.g:512:1: ( '{' )
            // InternalMinitl.g:513:2: '{'
            {
             before(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Transformation__Group__2__Impl"


    // $ANTLR start "rule__Transformation__Group__3"
    // InternalMinitl.g:522:1: rule__Transformation__Group__3 : rule__Transformation__Group__3__Impl rule__Transformation__Group__4 ;
    public final void rule__Transformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:526:1: ( rule__Transformation__Group__3__Impl rule__Transformation__Group__4 )
            // InternalMinitl.g:527:2: rule__Transformation__Group__3__Impl rule__Transformation__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Transformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__4();

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
    // $ANTLR end "rule__Transformation__Group__3"


    // $ANTLR start "rule__Transformation__Group__3__Impl"
    // InternalMinitl.g:534:1: rule__Transformation__Group__3__Impl : ( ( rule__Transformation__InputMetamodelAssignment_3 )? ) ;
    public final void rule__Transformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:538:1: ( ( ( rule__Transformation__InputMetamodelAssignment_3 )? ) )
            // InternalMinitl.g:539:1: ( ( rule__Transformation__InputMetamodelAssignment_3 )? )
            {
            // InternalMinitl.g:539:1: ( ( rule__Transformation__InputMetamodelAssignment_3 )? )
            // InternalMinitl.g:540:2: ( rule__Transformation__InputMetamodelAssignment_3 )?
            {
             before(grammarAccess.getTransformationAccess().getInputMetamodelAssignment_3()); 
            // InternalMinitl.g:541:2: ( rule__Transformation__InputMetamodelAssignment_3 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMinitl.g:541:3: rule__Transformation__InputMetamodelAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transformation__InputMetamodelAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransformationAccess().getInputMetamodelAssignment_3()); 

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
    // $ANTLR end "rule__Transformation__Group__3__Impl"


    // $ANTLR start "rule__Transformation__Group__4"
    // InternalMinitl.g:549:1: rule__Transformation__Group__4 : rule__Transformation__Group__4__Impl rule__Transformation__Group__5 ;
    public final void rule__Transformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:553:1: ( rule__Transformation__Group__4__Impl rule__Transformation__Group__5 )
            // InternalMinitl.g:554:2: rule__Transformation__Group__4__Impl rule__Transformation__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Transformation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__5();

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
    // $ANTLR end "rule__Transformation__Group__4"


    // $ANTLR start "rule__Transformation__Group__4__Impl"
    // InternalMinitl.g:561:1: rule__Transformation__Group__4__Impl : ( ( rule__Transformation__Group_4__0 )? ) ;
    public final void rule__Transformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:565:1: ( ( ( rule__Transformation__Group_4__0 )? ) )
            // InternalMinitl.g:566:1: ( ( rule__Transformation__Group_4__0 )? )
            {
            // InternalMinitl.g:566:1: ( ( rule__Transformation__Group_4__0 )? )
            // InternalMinitl.g:567:2: ( rule__Transformation__Group_4__0 )?
            {
             before(grammarAccess.getTransformationAccess().getGroup_4()); 
            // InternalMinitl.g:568:2: ( rule__Transformation__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMinitl.g:568:3: rule__Transformation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transformation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransformationAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Transformation__Group__4__Impl"


    // $ANTLR start "rule__Transformation__Group__5"
    // InternalMinitl.g:576:1: rule__Transformation__Group__5 : rule__Transformation__Group__5__Impl rule__Transformation__Group__6 ;
    public final void rule__Transformation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:580:1: ( rule__Transformation__Group__5__Impl rule__Transformation__Group__6 )
            // InternalMinitl.g:581:2: rule__Transformation__Group__5__Impl rule__Transformation__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Transformation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group__6();

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
    // $ANTLR end "rule__Transformation__Group__5"


    // $ANTLR start "rule__Transformation__Group__5__Impl"
    // InternalMinitl.g:588:1: rule__Transformation__Group__5__Impl : ( ( rule__Transformation__Group_5__0 )? ) ;
    public final void rule__Transformation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:592:1: ( ( ( rule__Transformation__Group_5__0 )? ) )
            // InternalMinitl.g:593:1: ( ( rule__Transformation__Group_5__0 )? )
            {
            // InternalMinitl.g:593:1: ( ( rule__Transformation__Group_5__0 )? )
            // InternalMinitl.g:594:2: ( rule__Transformation__Group_5__0 )?
            {
             before(grammarAccess.getTransformationAccess().getGroup_5()); 
            // InternalMinitl.g:595:2: ( rule__Transformation__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMinitl.g:595:3: rule__Transformation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transformation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransformationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Transformation__Group__5__Impl"


    // $ANTLR start "rule__Transformation__Group__6"
    // InternalMinitl.g:603:1: rule__Transformation__Group__6 : rule__Transformation__Group__6__Impl ;
    public final void rule__Transformation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:607:1: ( rule__Transformation__Group__6__Impl )
            // InternalMinitl.g:608:2: rule__Transformation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group__6__Impl();

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
    // $ANTLR end "rule__Transformation__Group__6"


    // $ANTLR start "rule__Transformation__Group__6__Impl"
    // InternalMinitl.g:614:1: rule__Transformation__Group__6__Impl : ( '}' ) ;
    public final void rule__Transformation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:618:1: ( ( '}' ) )
            // InternalMinitl.g:619:1: ( '}' )
            {
            // InternalMinitl.g:619:1: ( '}' )
            // InternalMinitl.g:620:2: '}'
            {
             before(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Transformation__Group__6__Impl"


    // $ANTLR start "rule__Transformation__Group_4__0"
    // InternalMinitl.g:630:1: rule__Transformation__Group_4__0 : rule__Transformation__Group_4__0__Impl rule__Transformation__Group_4__1 ;
    public final void rule__Transformation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:634:1: ( rule__Transformation__Group_4__0__Impl rule__Transformation__Group_4__1 )
            // InternalMinitl.g:635:2: rule__Transformation__Group_4__0__Impl rule__Transformation__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Transformation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group_4__1();

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
    // $ANTLR end "rule__Transformation__Group_4__0"


    // $ANTLR start "rule__Transformation__Group_4__0__Impl"
    // InternalMinitl.g:642:1: rule__Transformation__Group_4__0__Impl : ( 'outputMetamodel' ) ;
    public final void rule__Transformation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:646:1: ( ( 'outputMetamodel' ) )
            // InternalMinitl.g:647:1: ( 'outputMetamodel' )
            {
            // InternalMinitl.g:647:1: ( 'outputMetamodel' )
            // InternalMinitl.g:648:2: 'outputMetamodel'
            {
             before(grammarAccess.getTransformationAccess().getOutputMetamodelKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getOutputMetamodelKeyword_4_0()); 

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
    // $ANTLR end "rule__Transformation__Group_4__0__Impl"


    // $ANTLR start "rule__Transformation__Group_4__1"
    // InternalMinitl.g:657:1: rule__Transformation__Group_4__1 : rule__Transformation__Group_4__1__Impl ;
    public final void rule__Transformation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:661:1: ( rule__Transformation__Group_4__1__Impl )
            // InternalMinitl.g:662:2: rule__Transformation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_4__1__Impl();

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
    // $ANTLR end "rule__Transformation__Group_4__1"


    // $ANTLR start "rule__Transformation__Group_4__1__Impl"
    // InternalMinitl.g:668:1: rule__Transformation__Group_4__1__Impl : ( ( rule__Transformation__OutputMetamodelAssignment_4_1 ) ) ;
    public final void rule__Transformation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:672:1: ( ( ( rule__Transformation__OutputMetamodelAssignment_4_1 ) ) )
            // InternalMinitl.g:673:1: ( ( rule__Transformation__OutputMetamodelAssignment_4_1 ) )
            {
            // InternalMinitl.g:673:1: ( ( rule__Transformation__OutputMetamodelAssignment_4_1 ) )
            // InternalMinitl.g:674:2: ( rule__Transformation__OutputMetamodelAssignment_4_1 )
            {
             before(grammarAccess.getTransformationAccess().getOutputMetamodelAssignment_4_1()); 
            // InternalMinitl.g:675:2: ( rule__Transformation__OutputMetamodelAssignment_4_1 )
            // InternalMinitl.g:675:3: rule__Transformation__OutputMetamodelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__OutputMetamodelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getOutputMetamodelAssignment_4_1()); 

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
    // $ANTLR end "rule__Transformation__Group_4__1__Impl"


    // $ANTLR start "rule__Transformation__Group_5__0"
    // InternalMinitl.g:684:1: rule__Transformation__Group_5__0 : rule__Transformation__Group_5__0__Impl rule__Transformation__Group_5__1 ;
    public final void rule__Transformation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:688:1: ( rule__Transformation__Group_5__0__Impl rule__Transformation__Group_5__1 )
            // InternalMinitl.g:689:2: rule__Transformation__Group_5__0__Impl rule__Transformation__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__Transformation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transformation__Group_5__1();

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
    // $ANTLR end "rule__Transformation__Group_5__0"


    // $ANTLR start "rule__Transformation__Group_5__0__Impl"
    // InternalMinitl.g:696:1: rule__Transformation__Group_5__0__Impl : ( ( rule__Transformation__RulesAssignment_5_0 ) ) ;
    public final void rule__Transformation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:700:1: ( ( ( rule__Transformation__RulesAssignment_5_0 ) ) )
            // InternalMinitl.g:701:1: ( ( rule__Transformation__RulesAssignment_5_0 ) )
            {
            // InternalMinitl.g:701:1: ( ( rule__Transformation__RulesAssignment_5_0 ) )
            // InternalMinitl.g:702:2: ( rule__Transformation__RulesAssignment_5_0 )
            {
             before(grammarAccess.getTransformationAccess().getRulesAssignment_5_0()); 
            // InternalMinitl.g:703:2: ( rule__Transformation__RulesAssignment_5_0 )
            // InternalMinitl.g:703:3: rule__Transformation__RulesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__RulesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getRulesAssignment_5_0()); 

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
    // $ANTLR end "rule__Transformation__Group_5__0__Impl"


    // $ANTLR start "rule__Transformation__Group_5__1"
    // InternalMinitl.g:711:1: rule__Transformation__Group_5__1 : rule__Transformation__Group_5__1__Impl ;
    public final void rule__Transformation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:715:1: ( rule__Transformation__Group_5__1__Impl )
            // InternalMinitl.g:716:2: rule__Transformation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transformation__Group_5__1__Impl();

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
    // $ANTLR end "rule__Transformation__Group_5__1"


    // $ANTLR start "rule__Transformation__Group_5__1__Impl"
    // InternalMinitl.g:722:1: rule__Transformation__Group_5__1__Impl : ( ( rule__Transformation__RulesAssignment_5_1 )* ) ;
    public final void rule__Transformation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:726:1: ( ( ( rule__Transformation__RulesAssignment_5_1 )* ) )
            // InternalMinitl.g:727:1: ( ( rule__Transformation__RulesAssignment_5_1 )* )
            {
            // InternalMinitl.g:727:1: ( ( rule__Transformation__RulesAssignment_5_1 )* )
            // InternalMinitl.g:728:2: ( rule__Transformation__RulesAssignment_5_1 )*
            {
             before(grammarAccess.getTransformationAccess().getRulesAssignment_5_1()); 
            // InternalMinitl.g:729:2: ( rule__Transformation__RulesAssignment_5_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMinitl.g:729:3: rule__Transformation__RulesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Transformation__RulesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTransformationAccess().getRulesAssignment_5_1()); 

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
    // $ANTLR end "rule__Transformation__Group_5__1__Impl"


    // $ANTLR start "rule__InputMetamodel__Group__0"
    // InternalMinitl.g:738:1: rule__InputMetamodel__Group__0 : rule__InputMetamodel__Group__0__Impl rule__InputMetamodel__Group__1 ;
    public final void rule__InputMetamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:742:1: ( rule__InputMetamodel__Group__0__Impl rule__InputMetamodel__Group__1 )
            // InternalMinitl.g:743:2: rule__InputMetamodel__Group__0__Impl rule__InputMetamodel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InputMetamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputMetamodel__Group__1();

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
    // $ANTLR end "rule__InputMetamodel__Group__0"


    // $ANTLR start "rule__InputMetamodel__Group__0__Impl"
    // InternalMinitl.g:750:1: rule__InputMetamodel__Group__0__Impl : ( 'inputMetamodel' ) ;
    public final void rule__InputMetamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:754:1: ( ( 'inputMetamodel' ) )
            // InternalMinitl.g:755:1: ( 'inputMetamodel' )
            {
            // InternalMinitl.g:755:1: ( 'inputMetamodel' )
            // InternalMinitl.g:756:2: 'inputMetamodel'
            {
             before(grammarAccess.getInputMetamodelAccess().getInputMetamodelKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInputMetamodelAccess().getInputMetamodelKeyword_0()); 

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
    // $ANTLR end "rule__InputMetamodel__Group__0__Impl"


    // $ANTLR start "rule__InputMetamodel__Group__1"
    // InternalMinitl.g:765:1: rule__InputMetamodel__Group__1 : rule__InputMetamodel__Group__1__Impl ;
    public final void rule__InputMetamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:769:1: ( rule__InputMetamodel__Group__1__Impl )
            // InternalMinitl.g:770:2: rule__InputMetamodel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputMetamodel__Group__1__Impl();

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
    // $ANTLR end "rule__InputMetamodel__Group__1"


    // $ANTLR start "rule__InputMetamodel__Group__1__Impl"
    // InternalMinitl.g:776:1: rule__InputMetamodel__Group__1__Impl : ( ruleMetamodel ) ;
    public final void rule__InputMetamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:780:1: ( ( ruleMetamodel ) )
            // InternalMinitl.g:781:1: ( ruleMetamodel )
            {
            // InternalMinitl.g:781:1: ( ruleMetamodel )
            // InternalMinitl.g:782:2: ruleMetamodel
            {
             before(grammarAccess.getInputMetamodelAccess().getMetamodelParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getInputMetamodelAccess().getMetamodelParserRuleCall_1()); 

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
    // $ANTLR end "rule__InputMetamodel__Group__1__Impl"


    // $ANTLR start "rule__Metamodel__Group__0"
    // InternalMinitl.g:792:1: rule__Metamodel__Group__0 : rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1 ;
    public final void rule__Metamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:796:1: ( rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1 )
            // InternalMinitl.g:797:2: rule__Metamodel__Group__0__Impl rule__Metamodel__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Metamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metamodel__Group__1();

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
    // $ANTLR end "rule__Metamodel__Group__0"


    // $ANTLR start "rule__Metamodel__Group__0__Impl"
    // InternalMinitl.g:804:1: rule__Metamodel__Group__0__Impl : ( ( rule__Metamodel__PackagesAssignment_0 ) ) ;
    public final void rule__Metamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:808:1: ( ( ( rule__Metamodel__PackagesAssignment_0 ) ) )
            // InternalMinitl.g:809:1: ( ( rule__Metamodel__PackagesAssignment_0 ) )
            {
            // InternalMinitl.g:809:1: ( ( rule__Metamodel__PackagesAssignment_0 ) )
            // InternalMinitl.g:810:2: ( rule__Metamodel__PackagesAssignment_0 )
            {
             before(grammarAccess.getMetamodelAccess().getPackagesAssignment_0()); 
            // InternalMinitl.g:811:2: ( rule__Metamodel__PackagesAssignment_0 )
            // InternalMinitl.g:811:3: rule__Metamodel__PackagesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Metamodel__PackagesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getPackagesAssignment_0()); 

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
    // $ANTLR end "rule__Metamodel__Group__0__Impl"


    // $ANTLR start "rule__Metamodel__Group__1"
    // InternalMinitl.g:819:1: rule__Metamodel__Group__1 : rule__Metamodel__Group__1__Impl ;
    public final void rule__Metamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:823:1: ( rule__Metamodel__Group__1__Impl )
            // InternalMinitl.g:824:2: rule__Metamodel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metamodel__Group__1__Impl();

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
    // $ANTLR end "rule__Metamodel__Group__1"


    // $ANTLR start "rule__Metamodel__Group__1__Impl"
    // InternalMinitl.g:830:1: rule__Metamodel__Group__1__Impl : ( ( rule__Metamodel__Group_1__0 )* ) ;
    public final void rule__Metamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:834:1: ( ( ( rule__Metamodel__Group_1__0 )* ) )
            // InternalMinitl.g:835:1: ( ( rule__Metamodel__Group_1__0 )* )
            {
            // InternalMinitl.g:835:1: ( ( rule__Metamodel__Group_1__0 )* )
            // InternalMinitl.g:836:2: ( rule__Metamodel__Group_1__0 )*
            {
             before(grammarAccess.getMetamodelAccess().getGroup_1()); 
            // InternalMinitl.g:837:2: ( rule__Metamodel__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMinitl.g:837:3: rule__Metamodel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Metamodel__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getMetamodelAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Metamodel__Group__1__Impl"


    // $ANTLR start "rule__Metamodel__Group_1__0"
    // InternalMinitl.g:846:1: rule__Metamodel__Group_1__0 : rule__Metamodel__Group_1__0__Impl rule__Metamodel__Group_1__1 ;
    public final void rule__Metamodel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:850:1: ( rule__Metamodel__Group_1__0__Impl rule__Metamodel__Group_1__1 )
            // InternalMinitl.g:851:2: rule__Metamodel__Group_1__0__Impl rule__Metamodel__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Metamodel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Metamodel__Group_1__1();

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
    // $ANTLR end "rule__Metamodel__Group_1__0"


    // $ANTLR start "rule__Metamodel__Group_1__0__Impl"
    // InternalMinitl.g:858:1: rule__Metamodel__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Metamodel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:862:1: ( ( ',' ) )
            // InternalMinitl.g:863:1: ( ',' )
            {
            // InternalMinitl.g:863:1: ( ',' )
            // InternalMinitl.g:864:2: ','
            {
             before(grammarAccess.getMetamodelAccess().getCommaKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMetamodelAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Metamodel__Group_1__0__Impl"


    // $ANTLR start "rule__Metamodel__Group_1__1"
    // InternalMinitl.g:873:1: rule__Metamodel__Group_1__1 : rule__Metamodel__Group_1__1__Impl ;
    public final void rule__Metamodel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:877:1: ( rule__Metamodel__Group_1__1__Impl )
            // InternalMinitl.g:878:2: rule__Metamodel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Metamodel__Group_1__1__Impl();

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
    // $ANTLR end "rule__Metamodel__Group_1__1"


    // $ANTLR start "rule__Metamodel__Group_1__1__Impl"
    // InternalMinitl.g:884:1: rule__Metamodel__Group_1__1__Impl : ( ( rule__Metamodel__PackagesAssignment_1_1 ) ) ;
    public final void rule__Metamodel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:888:1: ( ( ( rule__Metamodel__PackagesAssignment_1_1 ) ) )
            // InternalMinitl.g:889:1: ( ( rule__Metamodel__PackagesAssignment_1_1 ) )
            {
            // InternalMinitl.g:889:1: ( ( rule__Metamodel__PackagesAssignment_1_1 ) )
            // InternalMinitl.g:890:2: ( rule__Metamodel__PackagesAssignment_1_1 )
            {
             before(grammarAccess.getMetamodelAccess().getPackagesAssignment_1_1()); 
            // InternalMinitl.g:891:2: ( rule__Metamodel__PackagesAssignment_1_1 )
            // InternalMinitl.g:891:3: rule__Metamodel__PackagesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Metamodel__PackagesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMetamodelAccess().getPackagesAssignment_1_1()); 

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
    // $ANTLR end "rule__Metamodel__Group_1__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMinitl.g:900:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:904:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMinitl.g:905:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalMinitl.g:912:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:916:1: ( ( 'rule' ) )
            // InternalMinitl.g:917:1: ( 'rule' )
            {
            // InternalMinitl.g:917:1: ( 'rule' )
            // InternalMinitl.g:918:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalMinitl.g:927:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:931:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMinitl.g:932:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalMinitl.g:939:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:943:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalMinitl.g:944:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalMinitl.g:944:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalMinitl.g:945:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalMinitl.g:946:2: ( rule__Rule__NameAssignment_1 )
            // InternalMinitl.g:946:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalMinitl.g:954:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:958:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalMinitl.g:959:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalMinitl.g:966:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:970:1: ( ( '{' ) )
            // InternalMinitl.g:971:1: ( '{' )
            {
            // InternalMinitl.g:971:1: ( '{' )
            // InternalMinitl.g:972:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalMinitl.g:981:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:985:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalMinitl.g:986:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalMinitl.g:993:1: rule__Rule__Group__3__Impl : ( 'from' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:997:1: ( ( 'from' ) )
            // InternalMinitl.g:998:1: ( 'from' )
            {
            // InternalMinitl.g:998:1: ( 'from' )
            // InternalMinitl.g:999:2: 'from'
            {
             before(grammarAccess.getRuleAccess().getFromKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getFromKeyword_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalMinitl.g:1008:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1012:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalMinitl.g:1013:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalMinitl.g:1020:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__ObjectTemplatesAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1024:1: ( ( ( rule__Rule__ObjectTemplatesAssignment_4 ) ) )
            // InternalMinitl.g:1025:1: ( ( rule__Rule__ObjectTemplatesAssignment_4 ) )
            {
            // InternalMinitl.g:1025:1: ( ( rule__Rule__ObjectTemplatesAssignment_4 ) )
            // InternalMinitl.g:1026:2: ( rule__Rule__ObjectTemplatesAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getObjectTemplatesAssignment_4()); 
            // InternalMinitl.g:1027:2: ( rule__Rule__ObjectTemplatesAssignment_4 )
            // InternalMinitl.g:1027:3: rule__Rule__ObjectTemplatesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ObjectTemplatesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getObjectTemplatesAssignment_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalMinitl.g:1035:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1039:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalMinitl.g:1040:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

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
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalMinitl.g:1047:1: rule__Rule__Group__5__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1051:1: ( ( 'to' ) )
            // InternalMinitl.g:1052:1: ( 'to' )
            {
            // InternalMinitl.g:1052:1: ( 'to' )
            // InternalMinitl.g:1053:2: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getToKeyword_5()); 

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
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalMinitl.g:1062:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1066:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalMinitl.g:1067:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

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
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalMinitl.g:1074:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__ObjectTemplatesAssignment_6 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1078:1: ( ( ( rule__Rule__ObjectTemplatesAssignment_6 ) ) )
            // InternalMinitl.g:1079:1: ( ( rule__Rule__ObjectTemplatesAssignment_6 ) )
            {
            // InternalMinitl.g:1079:1: ( ( rule__Rule__ObjectTemplatesAssignment_6 ) )
            // InternalMinitl.g:1080:2: ( rule__Rule__ObjectTemplatesAssignment_6 )
            {
             before(grammarAccess.getRuleAccess().getObjectTemplatesAssignment_6()); 
            // InternalMinitl.g:1081:2: ( rule__Rule__ObjectTemplatesAssignment_6 )
            // InternalMinitl.g:1081:3: rule__Rule__ObjectTemplatesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ObjectTemplatesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getObjectTemplatesAssignment_6()); 

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
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalMinitl.g:1089:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1093:1: ( rule__Rule__Group__7__Impl )
            // InternalMinitl.g:1094:2: rule__Rule__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__7__Impl();

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
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalMinitl.g:1100:1: rule__Rule__Group__7__Impl : ( '}' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1104:1: ( ( '}' ) )
            // InternalMinitl.g:1105:1: ( '}' )
            {
            // InternalMinitl.g:1105:1: ( '}' )
            // InternalMinitl.g:1106:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group__0"
    // InternalMinitl.g:1116:1: rule__ObjectTemplate__Group__0 : rule__ObjectTemplate__Group__0__Impl rule__ObjectTemplate__Group__1 ;
    public final void rule__ObjectTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1120:1: ( rule__ObjectTemplate__Group__0__Impl rule__ObjectTemplate__Group__1 )
            // InternalMinitl.g:1121:2: rule__ObjectTemplate__Group__0__Impl rule__ObjectTemplate__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ObjectTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group__1();

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
    // $ANTLR end "rule__ObjectTemplate__Group__0"


    // $ANTLR start "rule__ObjectTemplate__Group__0__Impl"
    // InternalMinitl.g:1128:1: rule__ObjectTemplate__Group__0__Impl : ( ( rule__ObjectTemplate__NameAssignment_0 ) ) ;
    public final void rule__ObjectTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1132:1: ( ( ( rule__ObjectTemplate__NameAssignment_0 ) ) )
            // InternalMinitl.g:1133:1: ( ( rule__ObjectTemplate__NameAssignment_0 ) )
            {
            // InternalMinitl.g:1133:1: ( ( rule__ObjectTemplate__NameAssignment_0 ) )
            // InternalMinitl.g:1134:2: ( rule__ObjectTemplate__NameAssignment_0 )
            {
             before(grammarAccess.getObjectTemplateAccess().getNameAssignment_0()); 
            // InternalMinitl.g:1135:2: ( rule__ObjectTemplate__NameAssignment_0 )
            // InternalMinitl.g:1135:3: rule__ObjectTemplate__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectTemplateAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group__0__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group__1"
    // InternalMinitl.g:1143:1: rule__ObjectTemplate__Group__1 : rule__ObjectTemplate__Group__1__Impl rule__ObjectTemplate__Group__2 ;
    public final void rule__ObjectTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1147:1: ( rule__ObjectTemplate__Group__1__Impl rule__ObjectTemplate__Group__2 )
            // InternalMinitl.g:1148:2: rule__ObjectTemplate__Group__1__Impl rule__ObjectTemplate__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ObjectTemplate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group__2();

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
    // $ANTLR end "rule__ObjectTemplate__Group__1"


    // $ANTLR start "rule__ObjectTemplate__Group__1__Impl"
    // InternalMinitl.g:1155:1: rule__ObjectTemplate__Group__1__Impl : ( ':' ) ;
    public final void rule__ObjectTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1159:1: ( ( ':' ) )
            // InternalMinitl.g:1160:1: ( ':' )
            {
            // InternalMinitl.g:1160:1: ( ':' )
            // InternalMinitl.g:1161:2: ':'
            {
             before(grammarAccess.getObjectTemplateAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObjectTemplateAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group__1__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group__2"
    // InternalMinitl.g:1170:1: rule__ObjectTemplate__Group__2 : rule__ObjectTemplate__Group__2__Impl rule__ObjectTemplate__Group__3 ;
    public final void rule__ObjectTemplate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1174:1: ( rule__ObjectTemplate__Group__2__Impl rule__ObjectTemplate__Group__3 )
            // InternalMinitl.g:1175:2: rule__ObjectTemplate__Group__2__Impl rule__ObjectTemplate__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ObjectTemplate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group__3();

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
    // $ANTLR end "rule__ObjectTemplate__Group__2"


    // $ANTLR start "rule__ObjectTemplate__Group__2__Impl"
    // InternalMinitl.g:1182:1: rule__ObjectTemplate__Group__2__Impl : ( ( rule__ObjectTemplate__TypeAssignment_2 ) ) ;
    public final void rule__ObjectTemplate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1186:1: ( ( ( rule__ObjectTemplate__TypeAssignment_2 ) ) )
            // InternalMinitl.g:1187:1: ( ( rule__ObjectTemplate__TypeAssignment_2 ) )
            {
            // InternalMinitl.g:1187:1: ( ( rule__ObjectTemplate__TypeAssignment_2 ) )
            // InternalMinitl.g:1188:2: ( rule__ObjectTemplate__TypeAssignment_2 )
            {
             before(grammarAccess.getObjectTemplateAccess().getTypeAssignment_2()); 
            // InternalMinitl.g:1189:2: ( rule__ObjectTemplate__TypeAssignment_2 )
            // InternalMinitl.g:1189:3: rule__ObjectTemplate__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObjectTemplateAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group__2__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group__3"
    // InternalMinitl.g:1197:1: rule__ObjectTemplate__Group__3 : rule__ObjectTemplate__Group__3__Impl ;
    public final void rule__ObjectTemplate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1201:1: ( rule__ObjectTemplate__Group__3__Impl )
            // InternalMinitl.g:1202:2: rule__ObjectTemplate__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group__3__Impl();

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
    // $ANTLR end "rule__ObjectTemplate__Group__3"


    // $ANTLR start "rule__ObjectTemplate__Group__3__Impl"
    // InternalMinitl.g:1208:1: rule__ObjectTemplate__Group__3__Impl : ( ( rule__ObjectTemplate__Group_3__0 )? ) ;
    public final void rule__ObjectTemplate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1212:1: ( ( ( rule__ObjectTemplate__Group_3__0 )? ) )
            // InternalMinitl.g:1213:1: ( ( rule__ObjectTemplate__Group_3__0 )? )
            {
            // InternalMinitl.g:1213:1: ( ( rule__ObjectTemplate__Group_3__0 )? )
            // InternalMinitl.g:1214:2: ( rule__ObjectTemplate__Group_3__0 )?
            {
             before(grammarAccess.getObjectTemplateAccess().getGroup_3()); 
            // InternalMinitl.g:1215:2: ( rule__ObjectTemplate__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMinitl.g:1215:3: rule__ObjectTemplate__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectTemplate__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectTemplateAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group__3__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group_3__0"
    // InternalMinitl.g:1224:1: rule__ObjectTemplate__Group_3__0 : rule__ObjectTemplate__Group_3__0__Impl rule__ObjectTemplate__Group_3__1 ;
    public final void rule__ObjectTemplate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1228:1: ( rule__ObjectTemplate__Group_3__0__Impl rule__ObjectTemplate__Group_3__1 )
            // InternalMinitl.g:1229:2: rule__ObjectTemplate__Group_3__0__Impl rule__ObjectTemplate__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ObjectTemplate__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group_3__1();

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
    // $ANTLR end "rule__ObjectTemplate__Group_3__0"


    // $ANTLR start "rule__ObjectTemplate__Group_3__0__Impl"
    // InternalMinitl.g:1236:1: rule__ObjectTemplate__Group_3__0__Impl : ( '{' ) ;
    public final void rule__ObjectTemplate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1240:1: ( ( '{' ) )
            // InternalMinitl.g:1241:1: ( '{' )
            {
            // InternalMinitl.g:1241:1: ( '{' )
            // InternalMinitl.g:1242:2: '{'
            {
             before(grammarAccess.getObjectTemplateAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getObjectTemplateAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group_3__0__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group_3__1"
    // InternalMinitl.g:1251:1: rule__ObjectTemplate__Group_3__1 : rule__ObjectTemplate__Group_3__1__Impl rule__ObjectTemplate__Group_3__2 ;
    public final void rule__ObjectTemplate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1255:1: ( rule__ObjectTemplate__Group_3__1__Impl rule__ObjectTemplate__Group_3__2 )
            // InternalMinitl.g:1256:2: rule__ObjectTemplate__Group_3__1__Impl rule__ObjectTemplate__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__ObjectTemplate__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group_3__2();

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
    // $ANTLR end "rule__ObjectTemplate__Group_3__1"


    // $ANTLR start "rule__ObjectTemplate__Group_3__1__Impl"
    // InternalMinitl.g:1263:1: rule__ObjectTemplate__Group_3__1__Impl : ( ( rule__ObjectTemplate__Group_3_1__0 )? ) ;
    public final void rule__ObjectTemplate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1267:1: ( ( ( rule__ObjectTemplate__Group_3_1__0 )? ) )
            // InternalMinitl.g:1268:1: ( ( rule__ObjectTemplate__Group_3_1__0 )? )
            {
            // InternalMinitl.g:1268:1: ( ( rule__ObjectTemplate__Group_3_1__0 )? )
            // InternalMinitl.g:1269:2: ( rule__ObjectTemplate__Group_3_1__0 )?
            {
             before(grammarAccess.getObjectTemplateAccess().getGroup_3_1()); 
            // InternalMinitl.g:1270:2: ( rule__ObjectTemplate__Group_3_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMinitl.g:1270:3: rule__ObjectTemplate__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectTemplate__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectTemplateAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group_3__1__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group_3__2"
    // InternalMinitl.g:1278:1: rule__ObjectTemplate__Group_3__2 : rule__ObjectTemplate__Group_3__2__Impl rule__ObjectTemplate__Group_3__3 ;
    public final void rule__ObjectTemplate__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1282:1: ( rule__ObjectTemplate__Group_3__2__Impl rule__ObjectTemplate__Group_3__3 )
            // InternalMinitl.g:1283:2: rule__ObjectTemplate__Group_3__2__Impl rule__ObjectTemplate__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__ObjectTemplate__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group_3__3();

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
    // $ANTLR end "rule__ObjectTemplate__Group_3__2"


    // $ANTLR start "rule__ObjectTemplate__Group_3__2__Impl"
    // InternalMinitl.g:1290:1: rule__ObjectTemplate__Group_3__2__Impl : ( ( ';' )? ) ;
    public final void rule__ObjectTemplate__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1294:1: ( ( ( ';' )? ) )
            // InternalMinitl.g:1295:1: ( ( ';' )? )
            {
            // InternalMinitl.g:1295:1: ( ( ';' )? )
            // InternalMinitl.g:1296:2: ( ';' )?
            {
             before(grammarAccess.getObjectTemplateAccess().getSemicolonKeyword_3_2()); 
            // InternalMinitl.g:1297:2: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMinitl.g:1297:3: ';'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getObjectTemplateAccess().getSemicolonKeyword_3_2()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group_3__2__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group_3__3"
    // InternalMinitl.g:1305:1: rule__ObjectTemplate__Group_3__3 : rule__ObjectTemplate__Group_3__3__Impl ;
    public final void rule__ObjectTemplate__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1309:1: ( rule__ObjectTemplate__Group_3__3__Impl )
            // InternalMinitl.g:1310:2: rule__ObjectTemplate__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group_3__3__Impl();

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
    // $ANTLR end "rule__ObjectTemplate__Group_3__3"


    // $ANTLR start "rule__ObjectTemplate__Group_3__3__Impl"
    // InternalMinitl.g:1316:1: rule__ObjectTemplate__Group_3__3__Impl : ( '}' ) ;
    public final void rule__ObjectTemplate__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1320:1: ( ( '}' ) )
            // InternalMinitl.g:1321:1: ( '}' )
            {
            // InternalMinitl.g:1321:1: ( '}' )
            // InternalMinitl.g:1322:2: '}'
            {
             before(grammarAccess.getObjectTemplateAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getObjectTemplateAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group_3__3__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group_3_1__0"
    // InternalMinitl.g:1332:1: rule__ObjectTemplate__Group_3_1__0 : rule__ObjectTemplate__Group_3_1__0__Impl rule__ObjectTemplate__Group_3_1__1 ;
    public final void rule__ObjectTemplate__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1336:1: ( rule__ObjectTemplate__Group_3_1__0__Impl rule__ObjectTemplate__Group_3_1__1 )
            // InternalMinitl.g:1337:2: rule__ObjectTemplate__Group_3_1__0__Impl rule__ObjectTemplate__Group_3_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ObjectTemplate__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group_3_1__1();

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
    // $ANTLR end "rule__ObjectTemplate__Group_3_1__0"


    // $ANTLR start "rule__ObjectTemplate__Group_3_1__0__Impl"
    // InternalMinitl.g:1344:1: rule__ObjectTemplate__Group_3_1__0__Impl : ( ( rule__ObjectTemplate__BindingsAssignment_3_1_0 ) ) ;
    public final void rule__ObjectTemplate__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1348:1: ( ( ( rule__ObjectTemplate__BindingsAssignment_3_1_0 ) ) )
            // InternalMinitl.g:1349:1: ( ( rule__ObjectTemplate__BindingsAssignment_3_1_0 ) )
            {
            // InternalMinitl.g:1349:1: ( ( rule__ObjectTemplate__BindingsAssignment_3_1_0 ) )
            // InternalMinitl.g:1350:2: ( rule__ObjectTemplate__BindingsAssignment_3_1_0 )
            {
             before(grammarAccess.getObjectTemplateAccess().getBindingsAssignment_3_1_0()); 
            // InternalMinitl.g:1351:2: ( rule__ObjectTemplate__BindingsAssignment_3_1_0 )
            // InternalMinitl.g:1351:3: rule__ObjectTemplate__BindingsAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__BindingsAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectTemplateAccess().getBindingsAssignment_3_1_0()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group_3_1__0__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group_3_1__1"
    // InternalMinitl.g:1359:1: rule__ObjectTemplate__Group_3_1__1 : rule__ObjectTemplate__Group_3_1__1__Impl ;
    public final void rule__ObjectTemplate__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1363:1: ( rule__ObjectTemplate__Group_3_1__1__Impl )
            // InternalMinitl.g:1364:2: rule__ObjectTemplate__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__ObjectTemplate__Group_3_1__1"


    // $ANTLR start "rule__ObjectTemplate__Group_3_1__1__Impl"
    // InternalMinitl.g:1370:1: rule__ObjectTemplate__Group_3_1__1__Impl : ( ( rule__ObjectTemplate__Group_3_1_1__0 )* ) ;
    public final void rule__ObjectTemplate__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1374:1: ( ( ( rule__ObjectTemplate__Group_3_1_1__0 )* ) )
            // InternalMinitl.g:1375:1: ( ( rule__ObjectTemplate__Group_3_1_1__0 )* )
            {
            // InternalMinitl.g:1375:1: ( ( rule__ObjectTemplate__Group_3_1_1__0 )* )
            // InternalMinitl.g:1376:2: ( rule__ObjectTemplate__Group_3_1_1__0 )*
            {
             before(grammarAccess.getObjectTemplateAccess().getGroup_3_1_1()); 
            // InternalMinitl.g:1377:2: ( rule__ObjectTemplate__Group_3_1_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalMinitl.g:1377:3: rule__ObjectTemplate__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ObjectTemplate__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getObjectTemplateAccess().getGroup_3_1_1()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group_3_1__1__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group_3_1_1__0"
    // InternalMinitl.g:1386:1: rule__ObjectTemplate__Group_3_1_1__0 : rule__ObjectTemplate__Group_3_1_1__0__Impl rule__ObjectTemplate__Group_3_1_1__1 ;
    public final void rule__ObjectTemplate__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1390:1: ( rule__ObjectTemplate__Group_3_1_1__0__Impl rule__ObjectTemplate__Group_3_1_1__1 )
            // InternalMinitl.g:1391:2: rule__ObjectTemplate__Group_3_1_1__0__Impl rule__ObjectTemplate__Group_3_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ObjectTemplate__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group_3_1_1__1();

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
    // $ANTLR end "rule__ObjectTemplate__Group_3_1_1__0"


    // $ANTLR start "rule__ObjectTemplate__Group_3_1_1__0__Impl"
    // InternalMinitl.g:1398:1: rule__ObjectTemplate__Group_3_1_1__0__Impl : ( ';' ) ;
    public final void rule__ObjectTemplate__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1402:1: ( ( ';' ) )
            // InternalMinitl.g:1403:1: ( ';' )
            {
            // InternalMinitl.g:1403:1: ( ';' )
            // InternalMinitl.g:1404:2: ';'
            {
             before(grammarAccess.getObjectTemplateAccess().getSemicolonKeyword_3_1_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectTemplateAccess().getSemicolonKeyword_3_1_1_0()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__ObjectTemplate__Group_3_1_1__1"
    // InternalMinitl.g:1413:1: rule__ObjectTemplate__Group_3_1_1__1 : rule__ObjectTemplate__Group_3_1_1__1__Impl ;
    public final void rule__ObjectTemplate__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1417:1: ( rule__ObjectTemplate__Group_3_1_1__1__Impl )
            // InternalMinitl.g:1418:2: rule__ObjectTemplate__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__Group_3_1_1__1__Impl();

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
    // $ANTLR end "rule__ObjectTemplate__Group_3_1_1__1"


    // $ANTLR start "rule__ObjectTemplate__Group_3_1_1__1__Impl"
    // InternalMinitl.g:1424:1: rule__ObjectTemplate__Group_3_1_1__1__Impl : ( ( rule__ObjectTemplate__BindingsAssignment_3_1_1_1 ) ) ;
    public final void rule__ObjectTemplate__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1428:1: ( ( ( rule__ObjectTemplate__BindingsAssignment_3_1_1_1 ) ) )
            // InternalMinitl.g:1429:1: ( ( rule__ObjectTemplate__BindingsAssignment_3_1_1_1 ) )
            {
            // InternalMinitl.g:1429:1: ( ( rule__ObjectTemplate__BindingsAssignment_3_1_1_1 ) )
            // InternalMinitl.g:1430:2: ( rule__ObjectTemplate__BindingsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getObjectTemplateAccess().getBindingsAssignment_3_1_1_1()); 
            // InternalMinitl.g:1431:2: ( rule__ObjectTemplate__BindingsAssignment_3_1_1_1 )
            // InternalMinitl.g:1431:3: rule__ObjectTemplate__BindingsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectTemplate__BindingsAssignment_3_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectTemplateAccess().getBindingsAssignment_3_1_1_1()); 

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
    // $ANTLR end "rule__ObjectTemplate__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalMinitl.g:1440:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1444:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalMinitl.g:1445:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Binding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

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
    // $ANTLR end "rule__Binding__Group__0"


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalMinitl.g:1452:1: rule__Binding__Group__0__Impl : ( ( rule__Binding__FeatureAssignment_0 ) ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1456:1: ( ( ( rule__Binding__FeatureAssignment_0 ) ) )
            // InternalMinitl.g:1457:1: ( ( rule__Binding__FeatureAssignment_0 ) )
            {
            // InternalMinitl.g:1457:1: ( ( rule__Binding__FeatureAssignment_0 ) )
            // InternalMinitl.g:1458:2: ( rule__Binding__FeatureAssignment_0 )
            {
             before(grammarAccess.getBindingAccess().getFeatureAssignment_0()); 
            // InternalMinitl.g:1459:2: ( rule__Binding__FeatureAssignment_0 )
            // InternalMinitl.g:1459:3: rule__Binding__FeatureAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__FeatureAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getFeatureAssignment_0()); 

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
    // $ANTLR end "rule__Binding__Group__0__Impl"


    // $ANTLR start "rule__Binding__Group__1"
    // InternalMinitl.g:1467:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1471:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalMinitl.g:1472:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Binding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

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
    // $ANTLR end "rule__Binding__Group__1"


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalMinitl.g:1479:1: rule__Binding__Group__1__Impl : ( '=' ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1483:1: ( ( '=' ) )
            // InternalMinitl.g:1484:1: ( '=' )
            {
            // InternalMinitl.g:1484:1: ( '=' )
            // InternalMinitl.g:1485:2: '='
            {
             before(grammarAccess.getBindingAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Binding__Group__1__Impl"


    // $ANTLR start "rule__Binding__Group__2"
    // InternalMinitl.g:1494:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1498:1: ( rule__Binding__Group__2__Impl )
            // InternalMinitl.g:1499:2: rule__Binding__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__2__Impl();

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
    // $ANTLR end "rule__Binding__Group__2"


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalMinitl.g:1505:1: rule__Binding__Group__2__Impl : ( ( rule__Binding__ValueAssignment_2 ) ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1509:1: ( ( ( rule__Binding__ValueAssignment_2 ) ) )
            // InternalMinitl.g:1510:1: ( ( rule__Binding__ValueAssignment_2 ) )
            {
            // InternalMinitl.g:1510:1: ( ( rule__Binding__ValueAssignment_2 ) )
            // InternalMinitl.g:1511:2: ( rule__Binding__ValueAssignment_2 )
            {
             before(grammarAccess.getBindingAccess().getValueAssignment_2()); 
            // InternalMinitl.g:1512:2: ( rule__Binding__ValueAssignment_2 )
            // InternalMinitl.g:1512:3: rule__Binding__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBindingAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Binding__Group__2__Impl"


    // $ANTLR start "rule__MaybeBinary__Group__0"
    // InternalMinitl.g:1521:1: rule__MaybeBinary__Group__0 : rule__MaybeBinary__Group__0__Impl rule__MaybeBinary__Group__1 ;
    public final void rule__MaybeBinary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1525:1: ( rule__MaybeBinary__Group__0__Impl rule__MaybeBinary__Group__1 )
            // InternalMinitl.g:1526:2: rule__MaybeBinary__Group__0__Impl rule__MaybeBinary__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__MaybeBinary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaybeBinary__Group__1();

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
    // $ANTLR end "rule__MaybeBinary__Group__0"


    // $ANTLR start "rule__MaybeBinary__Group__0__Impl"
    // InternalMinitl.g:1533:1: rule__MaybeBinary__Group__0__Impl : ( ruleMaybeFieldAccessValue ) ;
    public final void rule__MaybeBinary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1537:1: ( ( ruleMaybeFieldAccessValue ) )
            // InternalMinitl.g:1538:1: ( ruleMaybeFieldAccessValue )
            {
            // InternalMinitl.g:1538:1: ( ruleMaybeFieldAccessValue )
            // InternalMinitl.g:1539:2: ruleMaybeFieldAccessValue
            {
             before(grammarAccess.getMaybeBinaryAccess().getMaybeFieldAccessValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMaybeFieldAccessValue();

            state._fsp--;

             after(grammarAccess.getMaybeBinaryAccess().getMaybeFieldAccessValueParserRuleCall_0()); 

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
    // $ANTLR end "rule__MaybeBinary__Group__0__Impl"


    // $ANTLR start "rule__MaybeBinary__Group__1"
    // InternalMinitl.g:1548:1: rule__MaybeBinary__Group__1 : rule__MaybeBinary__Group__1__Impl ;
    public final void rule__MaybeBinary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1552:1: ( rule__MaybeBinary__Group__1__Impl )
            // InternalMinitl.g:1553:2: rule__MaybeBinary__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaybeBinary__Group__1__Impl();

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
    // $ANTLR end "rule__MaybeBinary__Group__1"


    // $ANTLR start "rule__MaybeBinary__Group__1__Impl"
    // InternalMinitl.g:1559:1: rule__MaybeBinary__Group__1__Impl : ( ( rule__MaybeBinary__Group_1__0 )* ) ;
    public final void rule__MaybeBinary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1563:1: ( ( ( rule__MaybeBinary__Group_1__0 )* ) )
            // InternalMinitl.g:1564:1: ( ( rule__MaybeBinary__Group_1__0 )* )
            {
            // InternalMinitl.g:1564:1: ( ( rule__MaybeBinary__Group_1__0 )* )
            // InternalMinitl.g:1565:2: ( rule__MaybeBinary__Group_1__0 )*
            {
             before(grammarAccess.getMaybeBinaryAccess().getGroup_1()); 
            // InternalMinitl.g:1566:2: ( rule__MaybeBinary__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMinitl.g:1566:3: rule__MaybeBinary__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MaybeBinary__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMaybeBinaryAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MaybeBinary__Group__1__Impl"


    // $ANTLR start "rule__MaybeBinary__Group_1__0"
    // InternalMinitl.g:1575:1: rule__MaybeBinary__Group_1__0 : rule__MaybeBinary__Group_1__0__Impl rule__MaybeBinary__Group_1__1 ;
    public final void rule__MaybeBinary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1579:1: ( rule__MaybeBinary__Group_1__0__Impl rule__MaybeBinary__Group_1__1 )
            // InternalMinitl.g:1580:2: rule__MaybeBinary__Group_1__0__Impl rule__MaybeBinary__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__MaybeBinary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaybeBinary__Group_1__1();

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
    // $ANTLR end "rule__MaybeBinary__Group_1__0"


    // $ANTLR start "rule__MaybeBinary__Group_1__0__Impl"
    // InternalMinitl.g:1587:1: rule__MaybeBinary__Group_1__0__Impl : ( () ) ;
    public final void rule__MaybeBinary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1591:1: ( ( () ) )
            // InternalMinitl.g:1592:1: ( () )
            {
            // InternalMinitl.g:1592:1: ( () )
            // InternalMinitl.g:1593:2: ()
            {
             before(grammarAccess.getMaybeBinaryAccess().getBinaryExpressionExpressionsAction_1_0()); 
            // InternalMinitl.g:1594:2: ()
            // InternalMinitl.g:1594:3: 
            {
            }

             after(grammarAccess.getMaybeBinaryAccess().getBinaryExpressionExpressionsAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaybeBinary__Group_1__0__Impl"


    // $ANTLR start "rule__MaybeBinary__Group_1__1"
    // InternalMinitl.g:1602:1: rule__MaybeBinary__Group_1__1 : rule__MaybeBinary__Group_1__1__Impl rule__MaybeBinary__Group_1__2 ;
    public final void rule__MaybeBinary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1606:1: ( rule__MaybeBinary__Group_1__1__Impl rule__MaybeBinary__Group_1__2 )
            // InternalMinitl.g:1607:2: rule__MaybeBinary__Group_1__1__Impl rule__MaybeBinary__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__MaybeBinary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaybeBinary__Group_1__2();

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
    // $ANTLR end "rule__MaybeBinary__Group_1__1"


    // $ANTLR start "rule__MaybeBinary__Group_1__1__Impl"
    // InternalMinitl.g:1614:1: rule__MaybeBinary__Group_1__1__Impl : ( ( rule__MaybeBinary__OperatorAssignment_1_1 ) ) ;
    public final void rule__MaybeBinary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1618:1: ( ( ( rule__MaybeBinary__OperatorAssignment_1_1 ) ) )
            // InternalMinitl.g:1619:1: ( ( rule__MaybeBinary__OperatorAssignment_1_1 ) )
            {
            // InternalMinitl.g:1619:1: ( ( rule__MaybeBinary__OperatorAssignment_1_1 ) )
            // InternalMinitl.g:1620:2: ( rule__MaybeBinary__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMaybeBinaryAccess().getOperatorAssignment_1_1()); 
            // InternalMinitl.g:1621:2: ( rule__MaybeBinary__OperatorAssignment_1_1 )
            // InternalMinitl.g:1621:3: rule__MaybeBinary__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MaybeBinary__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMaybeBinaryAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__MaybeBinary__Group_1__1__Impl"


    // $ANTLR start "rule__MaybeBinary__Group_1__2"
    // InternalMinitl.g:1629:1: rule__MaybeBinary__Group_1__2 : rule__MaybeBinary__Group_1__2__Impl ;
    public final void rule__MaybeBinary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1633:1: ( rule__MaybeBinary__Group_1__2__Impl )
            // InternalMinitl.g:1634:2: rule__MaybeBinary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaybeBinary__Group_1__2__Impl();

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
    // $ANTLR end "rule__MaybeBinary__Group_1__2"


    // $ANTLR start "rule__MaybeBinary__Group_1__2__Impl"
    // InternalMinitl.g:1640:1: rule__MaybeBinary__Group_1__2__Impl : ( ( rule__MaybeBinary__ExpressionsAssignment_1_2 ) ) ;
    public final void rule__MaybeBinary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1644:1: ( ( ( rule__MaybeBinary__ExpressionsAssignment_1_2 ) ) )
            // InternalMinitl.g:1645:1: ( ( rule__MaybeBinary__ExpressionsAssignment_1_2 ) )
            {
            // InternalMinitl.g:1645:1: ( ( rule__MaybeBinary__ExpressionsAssignment_1_2 ) )
            // InternalMinitl.g:1646:2: ( rule__MaybeBinary__ExpressionsAssignment_1_2 )
            {
             before(grammarAccess.getMaybeBinaryAccess().getExpressionsAssignment_1_2()); 
            // InternalMinitl.g:1647:2: ( rule__MaybeBinary__ExpressionsAssignment_1_2 )
            // InternalMinitl.g:1647:3: rule__MaybeBinary__ExpressionsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MaybeBinary__ExpressionsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMaybeBinaryAccess().getExpressionsAssignment_1_2()); 

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
    // $ANTLR end "rule__MaybeBinary__Group_1__2__Impl"


    // $ANTLR start "rule__MaybeFieldAccessValue__Group__0"
    // InternalMinitl.g:1656:1: rule__MaybeFieldAccessValue__Group__0 : rule__MaybeFieldAccessValue__Group__0__Impl rule__MaybeFieldAccessValue__Group__1 ;
    public final void rule__MaybeFieldAccessValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1660:1: ( rule__MaybeFieldAccessValue__Group__0__Impl rule__MaybeFieldAccessValue__Group__1 )
            // InternalMinitl.g:1661:2: rule__MaybeFieldAccessValue__Group__0__Impl rule__MaybeFieldAccessValue__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__MaybeFieldAccessValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaybeFieldAccessValue__Group__1();

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
    // $ANTLR end "rule__MaybeFieldAccessValue__Group__0"


    // $ANTLR start "rule__MaybeFieldAccessValue__Group__0__Impl"
    // InternalMinitl.g:1668:1: rule__MaybeFieldAccessValue__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MaybeFieldAccessValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1672:1: ( ( rulePrimary ) )
            // InternalMinitl.g:1673:1: ( rulePrimary )
            {
            // InternalMinitl.g:1673:1: ( rulePrimary )
            // InternalMinitl.g:1674:2: rulePrimary
            {
             before(grammarAccess.getMaybeFieldAccessValueAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMaybeFieldAccessValueAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__MaybeFieldAccessValue__Group__0__Impl"


    // $ANTLR start "rule__MaybeFieldAccessValue__Group__1"
    // InternalMinitl.g:1683:1: rule__MaybeFieldAccessValue__Group__1 : rule__MaybeFieldAccessValue__Group__1__Impl ;
    public final void rule__MaybeFieldAccessValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1687:1: ( rule__MaybeFieldAccessValue__Group__1__Impl )
            // InternalMinitl.g:1688:2: rule__MaybeFieldAccessValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaybeFieldAccessValue__Group__1__Impl();

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
    // $ANTLR end "rule__MaybeFieldAccessValue__Group__1"


    // $ANTLR start "rule__MaybeFieldAccessValue__Group__1__Impl"
    // InternalMinitl.g:1694:1: rule__MaybeFieldAccessValue__Group__1__Impl : ( ( rule__MaybeFieldAccessValue__Group_1__0 )* ) ;
    public final void rule__MaybeFieldAccessValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1698:1: ( ( ( rule__MaybeFieldAccessValue__Group_1__0 )* ) )
            // InternalMinitl.g:1699:1: ( ( rule__MaybeFieldAccessValue__Group_1__0 )* )
            {
            // InternalMinitl.g:1699:1: ( ( rule__MaybeFieldAccessValue__Group_1__0 )* )
            // InternalMinitl.g:1700:2: ( rule__MaybeFieldAccessValue__Group_1__0 )*
            {
             before(grammarAccess.getMaybeFieldAccessValueAccess().getGroup_1()); 
            // InternalMinitl.g:1701:2: ( rule__MaybeFieldAccessValue__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMinitl.g:1701:3: rule__MaybeFieldAccessValue__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__MaybeFieldAccessValue__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMaybeFieldAccessValueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MaybeFieldAccessValue__Group__1__Impl"


    // $ANTLR start "rule__MaybeFieldAccessValue__Group_1__0"
    // InternalMinitl.g:1710:1: rule__MaybeFieldAccessValue__Group_1__0 : rule__MaybeFieldAccessValue__Group_1__0__Impl rule__MaybeFieldAccessValue__Group_1__1 ;
    public final void rule__MaybeFieldAccessValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1714:1: ( rule__MaybeFieldAccessValue__Group_1__0__Impl rule__MaybeFieldAccessValue__Group_1__1 )
            // InternalMinitl.g:1715:2: rule__MaybeFieldAccessValue__Group_1__0__Impl rule__MaybeFieldAccessValue__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__MaybeFieldAccessValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaybeFieldAccessValue__Group_1__1();

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
    // $ANTLR end "rule__MaybeFieldAccessValue__Group_1__0"


    // $ANTLR start "rule__MaybeFieldAccessValue__Group_1__0__Impl"
    // InternalMinitl.g:1722:1: rule__MaybeFieldAccessValue__Group_1__0__Impl : ( () ) ;
    public final void rule__MaybeFieldAccessValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1726:1: ( ( () ) )
            // InternalMinitl.g:1727:1: ( () )
            {
            // InternalMinitl.g:1727:1: ( () )
            // InternalMinitl.g:1728:2: ()
            {
             before(grammarAccess.getMaybeFieldAccessValueAccess().getFieldAccessValueObjectAction_1_0()); 
            // InternalMinitl.g:1729:2: ()
            // InternalMinitl.g:1729:3: 
            {
            }

             after(grammarAccess.getMaybeFieldAccessValueAccess().getFieldAccessValueObjectAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaybeFieldAccessValue__Group_1__0__Impl"


    // $ANTLR start "rule__MaybeFieldAccessValue__Group_1__1"
    // InternalMinitl.g:1737:1: rule__MaybeFieldAccessValue__Group_1__1 : rule__MaybeFieldAccessValue__Group_1__1__Impl rule__MaybeFieldAccessValue__Group_1__2 ;
    public final void rule__MaybeFieldAccessValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1741:1: ( rule__MaybeFieldAccessValue__Group_1__1__Impl rule__MaybeFieldAccessValue__Group_1__2 )
            // InternalMinitl.g:1742:2: rule__MaybeFieldAccessValue__Group_1__1__Impl rule__MaybeFieldAccessValue__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__MaybeFieldAccessValue__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaybeFieldAccessValue__Group_1__2();

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
    // $ANTLR end "rule__MaybeFieldAccessValue__Group_1__1"


    // $ANTLR start "rule__MaybeFieldAccessValue__Group_1__1__Impl"
    // InternalMinitl.g:1749:1: rule__MaybeFieldAccessValue__Group_1__1__Impl : ( '.' ) ;
    public final void rule__MaybeFieldAccessValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1753:1: ( ( '.' ) )
            // InternalMinitl.g:1754:1: ( '.' )
            {
            // InternalMinitl.g:1754:1: ( '.' )
            // InternalMinitl.g:1755:2: '.'
            {
             before(grammarAccess.getMaybeFieldAccessValueAccess().getFullStopKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMaybeFieldAccessValueAccess().getFullStopKeyword_1_1()); 

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
    // $ANTLR end "rule__MaybeFieldAccessValue__Group_1__1__Impl"


    // $ANTLR start "rule__MaybeFieldAccessValue__Group_1__2"
    // InternalMinitl.g:1764:1: rule__MaybeFieldAccessValue__Group_1__2 : rule__MaybeFieldAccessValue__Group_1__2__Impl ;
    public final void rule__MaybeFieldAccessValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1768:1: ( rule__MaybeFieldAccessValue__Group_1__2__Impl )
            // InternalMinitl.g:1769:2: rule__MaybeFieldAccessValue__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaybeFieldAccessValue__Group_1__2__Impl();

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
    // $ANTLR end "rule__MaybeFieldAccessValue__Group_1__2"


    // $ANTLR start "rule__MaybeFieldAccessValue__Group_1__2__Impl"
    // InternalMinitl.g:1775:1: rule__MaybeFieldAccessValue__Group_1__2__Impl : ( ( rule__MaybeFieldAccessValue__FeatureAssignment_1_2 ) ) ;
    public final void rule__MaybeFieldAccessValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1779:1: ( ( ( rule__MaybeFieldAccessValue__FeatureAssignment_1_2 ) ) )
            // InternalMinitl.g:1780:1: ( ( rule__MaybeFieldAccessValue__FeatureAssignment_1_2 ) )
            {
            // InternalMinitl.g:1780:1: ( ( rule__MaybeFieldAccessValue__FeatureAssignment_1_2 ) )
            // InternalMinitl.g:1781:2: ( rule__MaybeFieldAccessValue__FeatureAssignment_1_2 )
            {
             before(grammarAccess.getMaybeFieldAccessValueAccess().getFeatureAssignment_1_2()); 
            // InternalMinitl.g:1782:2: ( rule__MaybeFieldAccessValue__FeatureAssignment_1_2 )
            // InternalMinitl.g:1782:3: rule__MaybeFieldAccessValue__FeatureAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MaybeFieldAccessValue__FeatureAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMaybeFieldAccessValueAccess().getFeatureAssignment_1_2()); 

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
    // $ANTLR end "rule__MaybeFieldAccessValue__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_2__0"
    // InternalMinitl.g:1791:1: rule__Primary__Group_2__0 : rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 ;
    public final void rule__Primary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1795:1: ( rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1 )
            // InternalMinitl.g:1796:2: rule__Primary__Group_2__0__Impl rule__Primary__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Primary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__1();

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
    // $ANTLR end "rule__Primary__Group_2__0"


    // $ANTLR start "rule__Primary__Group_2__0__Impl"
    // InternalMinitl.g:1803:1: rule__Primary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1807:1: ( ( '(' ) )
            // InternalMinitl.g:1808:1: ( '(' )
            {
            // InternalMinitl.g:1808:1: ( '(' )
            // InternalMinitl.g:1809:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Primary__Group_2__0__Impl"


    // $ANTLR start "rule__Primary__Group_2__1"
    // InternalMinitl.g:1818:1: rule__Primary__Group_2__1 : rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 ;
    public final void rule__Primary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1822:1: ( rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2 )
            // InternalMinitl.g:1823:2: rule__Primary__Group_2__1__Impl rule__Primary__Group_2__2
            {
            pushFollow(FOLLOW_23);
            rule__Primary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2();

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
    // $ANTLR end "rule__Primary__Group_2__1"


    // $ANTLR start "rule__Primary__Group_2__1__Impl"
    // InternalMinitl.g:1830:1: rule__Primary__Group_2__1__Impl : ( ruleMaybeBinary ) ;
    public final void rule__Primary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1834:1: ( ( ruleMaybeBinary ) )
            // InternalMinitl.g:1835:1: ( ruleMaybeBinary )
            {
            // InternalMinitl.g:1835:1: ( ruleMaybeBinary )
            // InternalMinitl.g:1836:2: ruleMaybeBinary
            {
             before(grammarAccess.getPrimaryAccess().getMaybeBinaryParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleMaybeBinary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getMaybeBinaryParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Primary__Group_2__1__Impl"


    // $ANTLR start "rule__Primary__Group_2__2"
    // InternalMinitl.g:1845:1: rule__Primary__Group_2__2 : rule__Primary__Group_2__2__Impl ;
    public final void rule__Primary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1849:1: ( rule__Primary__Group_2__2__Impl )
            // InternalMinitl.g:1850:2: rule__Primary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_2__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_2__2"


    // $ANTLR start "rule__Primary__Group_2__2__Impl"
    // InternalMinitl.g:1856:1: rule__Primary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1860:1: ( ( ')' ) )
            // InternalMinitl.g:1861:1: ( ')' )
            {
            // InternalMinitl.g:1861:1: ( ')' )
            // InternalMinitl.g:1862:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Primary__Group_2__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalMinitl.g:1872:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1876:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalMinitl.g:1877:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalMinitl.g:1884:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1888:1: ( ( RULE_ID ) )
            // InternalMinitl.g:1889:1: ( RULE_ID )
            {
            // InternalMinitl.g:1889:1: ( RULE_ID )
            // InternalMinitl.g:1890:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalMinitl.g:1899:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1903:1: ( rule__FQN__Group__1__Impl )
            // InternalMinitl.g:1904:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalMinitl.g:1910:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1914:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalMinitl.g:1915:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalMinitl.g:1915:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalMinitl.g:1916:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalMinitl.g:1917:2: ( rule__FQN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMinitl.g:1917:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalMinitl.g:1926:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1930:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalMinitl.g:1931:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalMinitl.g:1938:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1942:1: ( ( '.' ) )
            // InternalMinitl.g:1943:1: ( '.' )
            {
            // InternalMinitl.g:1943:1: ( '.' )
            // InternalMinitl.g:1944:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalMinitl.g:1953:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1957:1: ( rule__FQN__Group_1__1__Impl )
            // InternalMinitl.g:1958:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalMinitl.g:1964:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1968:1: ( ( RULE_ID ) )
            // InternalMinitl.g:1969:1: ( RULE_ID )
            {
            // InternalMinitl.g:1969:1: ( RULE_ID )
            // InternalMinitl.g:1970:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Transformation__NameAssignment_1"
    // InternalMinitl.g:1980:1: rule__Transformation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transformation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1984:1: ( ( RULE_ID ) )
            // InternalMinitl.g:1985:2: ( RULE_ID )
            {
            // InternalMinitl.g:1985:2: ( RULE_ID )
            // InternalMinitl.g:1986:3: RULE_ID
            {
             before(grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Transformation__NameAssignment_1"


    // $ANTLR start "rule__Transformation__InputMetamodelAssignment_3"
    // InternalMinitl.g:1995:1: rule__Transformation__InputMetamodelAssignment_3 : ( ruleInputMetamodel ) ;
    public final void rule__Transformation__InputMetamodelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:1999:1: ( ( ruleInputMetamodel ) )
            // InternalMinitl.g:2000:2: ( ruleInputMetamodel )
            {
            // InternalMinitl.g:2000:2: ( ruleInputMetamodel )
            // InternalMinitl.g:2001:3: ruleInputMetamodel
            {
             before(grammarAccess.getTransformationAccess().getInputMetamodelInputMetamodelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInputMetamodel();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getInputMetamodelInputMetamodelParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Transformation__InputMetamodelAssignment_3"


    // $ANTLR start "rule__Transformation__OutputMetamodelAssignment_4_1"
    // InternalMinitl.g:2010:1: rule__Transformation__OutputMetamodelAssignment_4_1 : ( ruleMetamodel ) ;
    public final void rule__Transformation__OutputMetamodelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2014:1: ( ( ruleMetamodel ) )
            // InternalMinitl.g:2015:2: ( ruleMetamodel )
            {
            // InternalMinitl.g:2015:2: ( ruleMetamodel )
            // InternalMinitl.g:2016:3: ruleMetamodel
            {
             before(grammarAccess.getTransformationAccess().getOutputMetamodelMetamodelParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetamodel();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getOutputMetamodelMetamodelParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Transformation__OutputMetamodelAssignment_4_1"


    // $ANTLR start "rule__Transformation__RulesAssignment_5_0"
    // InternalMinitl.g:2025:1: rule__Transformation__RulesAssignment_5_0 : ( ruleRule ) ;
    public final void rule__Transformation__RulesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2029:1: ( ( ruleRule ) )
            // InternalMinitl.g:2030:2: ( ruleRule )
            {
            // InternalMinitl.g:2030:2: ( ruleRule )
            // InternalMinitl.g:2031:3: ruleRule
            {
             before(grammarAccess.getTransformationAccess().getRulesRuleParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getRulesRuleParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Transformation__RulesAssignment_5_0"


    // $ANTLR start "rule__Transformation__RulesAssignment_5_1"
    // InternalMinitl.g:2040:1: rule__Transformation__RulesAssignment_5_1 : ( ruleRule ) ;
    public final void rule__Transformation__RulesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2044:1: ( ( ruleRule ) )
            // InternalMinitl.g:2045:2: ( ruleRule )
            {
            // InternalMinitl.g:2045:2: ( ruleRule )
            // InternalMinitl.g:2046:3: ruleRule
            {
             before(grammarAccess.getTransformationAccess().getRulesRuleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getTransformationAccess().getRulesRuleParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Transformation__RulesAssignment_5_1"


    // $ANTLR start "rule__Metamodel__PackagesAssignment_0"
    // InternalMinitl.g:2055:1: rule__Metamodel__PackagesAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__Metamodel__PackagesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2059:1: ( ( ( ruleFQN ) ) )
            // InternalMinitl.g:2060:2: ( ( ruleFQN ) )
            {
            // InternalMinitl.g:2060:2: ( ( ruleFQN ) )
            // InternalMinitl.g:2061:3: ( ruleFQN )
            {
             before(grammarAccess.getMetamodelAccess().getPackagesEPackageCrossReference_0_0()); 
            // InternalMinitl.g:2062:3: ( ruleFQN )
            // InternalMinitl.g:2063:4: ruleFQN
            {
             before(grammarAccess.getMetamodelAccess().getPackagesEPackageFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getMetamodelAccess().getPackagesEPackageFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMetamodelAccess().getPackagesEPackageCrossReference_0_0()); 

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
    // $ANTLR end "rule__Metamodel__PackagesAssignment_0"


    // $ANTLR start "rule__Metamodel__PackagesAssignment_1_1"
    // InternalMinitl.g:2074:1: rule__Metamodel__PackagesAssignment_1_1 : ( ( ruleFQN ) ) ;
    public final void rule__Metamodel__PackagesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2078:1: ( ( ( ruleFQN ) ) )
            // InternalMinitl.g:2079:2: ( ( ruleFQN ) )
            {
            // InternalMinitl.g:2079:2: ( ( ruleFQN ) )
            // InternalMinitl.g:2080:3: ( ruleFQN )
            {
             before(grammarAccess.getMetamodelAccess().getPackagesEPackageCrossReference_1_1_0()); 
            // InternalMinitl.g:2081:3: ( ruleFQN )
            // InternalMinitl.g:2082:4: ruleFQN
            {
             before(grammarAccess.getMetamodelAccess().getPackagesEPackageFQNParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getMetamodelAccess().getPackagesEPackageFQNParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getMetamodelAccess().getPackagesEPackageCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Metamodel__PackagesAssignment_1_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalMinitl.g:2093:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2097:1: ( ( RULE_ID ) )
            // InternalMinitl.g:2098:2: ( RULE_ID )
            {
            // InternalMinitl.g:2098:2: ( RULE_ID )
            // InternalMinitl.g:2099:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__ObjectTemplatesAssignment_4"
    // InternalMinitl.g:2108:1: rule__Rule__ObjectTemplatesAssignment_4 : ( ruleObjectTemplate ) ;
    public final void rule__Rule__ObjectTemplatesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2112:1: ( ( ruleObjectTemplate ) )
            // InternalMinitl.g:2113:2: ( ruleObjectTemplate )
            {
            // InternalMinitl.g:2113:2: ( ruleObjectTemplate )
            // InternalMinitl.g:2114:3: ruleObjectTemplate
            {
             before(grammarAccess.getRuleAccess().getObjectTemplatesObjectTemplateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectTemplate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getObjectTemplatesObjectTemplateParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rule__ObjectTemplatesAssignment_4"


    // $ANTLR start "rule__Rule__ObjectTemplatesAssignment_6"
    // InternalMinitl.g:2123:1: rule__Rule__ObjectTemplatesAssignment_6 : ( ruleObjectTemplate ) ;
    public final void rule__Rule__ObjectTemplatesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2127:1: ( ( ruleObjectTemplate ) )
            // InternalMinitl.g:2128:2: ( ruleObjectTemplate )
            {
            // InternalMinitl.g:2128:2: ( ruleObjectTemplate )
            // InternalMinitl.g:2129:3: ruleObjectTemplate
            {
             before(grammarAccess.getRuleAccess().getObjectTemplatesObjectTemplateParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectTemplate();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getObjectTemplatesObjectTemplateParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Rule__ObjectTemplatesAssignment_6"


    // $ANTLR start "rule__ObjectTemplate__NameAssignment_0"
    // InternalMinitl.g:2138:1: rule__ObjectTemplate__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ObjectTemplate__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2142:1: ( ( RULE_ID ) )
            // InternalMinitl.g:2143:2: ( RULE_ID )
            {
            // InternalMinitl.g:2143:2: ( RULE_ID )
            // InternalMinitl.g:2144:3: RULE_ID
            {
             before(grammarAccess.getObjectTemplateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectTemplateAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ObjectTemplate__NameAssignment_0"


    // $ANTLR start "rule__ObjectTemplate__TypeAssignment_2"
    // InternalMinitl.g:2153:1: rule__ObjectTemplate__TypeAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__ObjectTemplate__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2157:1: ( ( ( ruleFQN ) ) )
            // InternalMinitl.g:2158:2: ( ( ruleFQN ) )
            {
            // InternalMinitl.g:2158:2: ( ( ruleFQN ) )
            // InternalMinitl.g:2159:3: ( ruleFQN )
            {
             before(grammarAccess.getObjectTemplateAccess().getTypeEClassCrossReference_2_0()); 
            // InternalMinitl.g:2160:3: ( ruleFQN )
            // InternalMinitl.g:2161:4: ruleFQN
            {
             before(grammarAccess.getObjectTemplateAccess().getTypeEClassFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getObjectTemplateAccess().getTypeEClassFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getObjectTemplateAccess().getTypeEClassCrossReference_2_0()); 

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
    // $ANTLR end "rule__ObjectTemplate__TypeAssignment_2"


    // $ANTLR start "rule__ObjectTemplate__BindingsAssignment_3_1_0"
    // InternalMinitl.g:2172:1: rule__ObjectTemplate__BindingsAssignment_3_1_0 : ( ruleBinding ) ;
    public final void rule__ObjectTemplate__BindingsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2176:1: ( ( ruleBinding ) )
            // InternalMinitl.g:2177:2: ( ruleBinding )
            {
            // InternalMinitl.g:2177:2: ( ruleBinding )
            // InternalMinitl.g:2178:3: ruleBinding
            {
             before(grammarAccess.getObjectTemplateAccess().getBindingsBindingParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getObjectTemplateAccess().getBindingsBindingParserRuleCall_3_1_0_0()); 

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
    // $ANTLR end "rule__ObjectTemplate__BindingsAssignment_3_1_0"


    // $ANTLR start "rule__ObjectTemplate__BindingsAssignment_3_1_1_1"
    // InternalMinitl.g:2187:1: rule__ObjectTemplate__BindingsAssignment_3_1_1_1 : ( ruleBinding ) ;
    public final void rule__ObjectTemplate__BindingsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2191:1: ( ( ruleBinding ) )
            // InternalMinitl.g:2192:2: ( ruleBinding )
            {
            // InternalMinitl.g:2192:2: ( ruleBinding )
            // InternalMinitl.g:2193:3: ruleBinding
            {
             before(grammarAccess.getObjectTemplateAccess().getBindingsBindingParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;

             after(grammarAccess.getObjectTemplateAccess().getBindingsBindingParserRuleCall_3_1_1_1_0()); 

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
    // $ANTLR end "rule__ObjectTemplate__BindingsAssignment_3_1_1_1"


    // $ANTLR start "rule__Binding__FeatureAssignment_0"
    // InternalMinitl.g:2202:1: rule__Binding__FeatureAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__FeatureAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2206:1: ( ( ( RULE_ID ) ) )
            // InternalMinitl.g:2207:2: ( ( RULE_ID ) )
            {
            // InternalMinitl.g:2207:2: ( ( RULE_ID ) )
            // InternalMinitl.g:2208:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingAccess().getFeatureEStructuralFeatureCrossReference_0_0()); 
            // InternalMinitl.g:2209:3: ( RULE_ID )
            // InternalMinitl.g:2210:4: RULE_ID
            {
             before(grammarAccess.getBindingAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBindingAccess().getFeatureEStructuralFeatureCrossReference_0_0()); 

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
    // $ANTLR end "rule__Binding__FeatureAssignment_0"


    // $ANTLR start "rule__Binding__ValueAssignment_2"
    // InternalMinitl.g:2221:1: rule__Binding__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Binding__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2225:1: ( ( ruleValue ) )
            // InternalMinitl.g:2226:2: ( ruleValue )
            {
            // InternalMinitl.g:2226:2: ( ruleValue )
            // InternalMinitl.g:2227:3: ruleValue
            {
             before(grammarAccess.getBindingAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getBindingAccess().getValueValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Binding__ValueAssignment_2"


    // $ANTLR start "rule__MaybeBinary__OperatorAssignment_1_1"
    // InternalMinitl.g:2236:1: rule__MaybeBinary__OperatorAssignment_1_1 : ( ruleOperator ) ;
    public final void rule__MaybeBinary__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2240:1: ( ( ruleOperator ) )
            // InternalMinitl.g:2241:2: ( ruleOperator )
            {
            // InternalMinitl.g:2241:2: ( ruleOperator )
            // InternalMinitl.g:2242:3: ruleOperator
            {
             before(grammarAccess.getMaybeBinaryAccess().getOperatorOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getMaybeBinaryAccess().getOperatorOperatorEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MaybeBinary__OperatorAssignment_1_1"


    // $ANTLR start "rule__MaybeBinary__ExpressionsAssignment_1_2"
    // InternalMinitl.g:2251:1: rule__MaybeBinary__ExpressionsAssignment_1_2 : ( ruleMaybeFieldAccessValue ) ;
    public final void rule__MaybeBinary__ExpressionsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2255:1: ( ( ruleMaybeFieldAccessValue ) )
            // InternalMinitl.g:2256:2: ( ruleMaybeFieldAccessValue )
            {
            // InternalMinitl.g:2256:2: ( ruleMaybeFieldAccessValue )
            // InternalMinitl.g:2257:3: ruleMaybeFieldAccessValue
            {
             before(grammarAccess.getMaybeBinaryAccess().getExpressionsMaybeFieldAccessValueParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMaybeFieldAccessValue();

            state._fsp--;

             after(grammarAccess.getMaybeBinaryAccess().getExpressionsMaybeFieldAccessValueParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MaybeBinary__ExpressionsAssignment_1_2"


    // $ANTLR start "rule__MaybeFieldAccessValue__FeatureAssignment_1_2"
    // InternalMinitl.g:2266:1: rule__MaybeFieldAccessValue__FeatureAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__MaybeFieldAccessValue__FeatureAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2270:1: ( ( ( RULE_ID ) ) )
            // InternalMinitl.g:2271:2: ( ( RULE_ID ) )
            {
            // InternalMinitl.g:2271:2: ( ( RULE_ID ) )
            // InternalMinitl.g:2272:3: ( RULE_ID )
            {
             before(grammarAccess.getMaybeFieldAccessValueAccess().getFeatureEStructuralFeatureCrossReference_1_2_0()); 
            // InternalMinitl.g:2273:3: ( RULE_ID )
            // InternalMinitl.g:2274:4: RULE_ID
            {
             before(grammarAccess.getMaybeFieldAccessValueAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMaybeFieldAccessValueAccess().getFeatureEStructuralFeatureIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getMaybeFieldAccessValueAccess().getFeatureEStructuralFeatureCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__MaybeFieldAccessValue__FeatureAssignment_1_2"


    // $ANTLR start "rule__StringValue__ValueAssignment"
    // InternalMinitl.g:2285:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2289:1: ( ( RULE_STRING ) )
            // InternalMinitl.g:2290:2: ( RULE_STRING )
            {
            // InternalMinitl.g:2290:2: ( RULE_STRING )
            // InternalMinitl.g:2291:3: RULE_STRING
            {
             before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringValue__ValueAssignment"


    // $ANTLR start "rule__ObjectTemplateValue__ObjecttemplateAssignment"
    // InternalMinitl.g:2300:1: rule__ObjectTemplateValue__ObjecttemplateAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ObjectTemplateValue__ObjecttemplateAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMinitl.g:2304:1: ( ( ( RULE_ID ) ) )
            // InternalMinitl.g:2305:2: ( ( RULE_ID ) )
            {
            // InternalMinitl.g:2305:2: ( ( RULE_ID ) )
            // InternalMinitl.g:2306:3: ( RULE_ID )
            {
             before(grammarAccess.getObjectTemplateValueAccess().getObjecttemplateObjectTemplateCrossReference_0()); 
            // InternalMinitl.g:2307:3: ( RULE_ID )
            // InternalMinitl.g:2308:4: RULE_ID
            {
             before(grammarAccess.getObjectTemplateValueAccess().getObjecttemplateObjectTemplateIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectTemplateValueAccess().getObjecttemplateObjectTemplateIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getObjectTemplateValueAccess().getObjecttemplateObjectTemplateCrossReference_0()); 

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
    // $ANTLR end "rule__ObjectTemplateValue__ObjecttemplateAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000B8000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000808010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});

}