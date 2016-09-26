package org.tetrabox.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.tetrabox.example.services.MinitlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMinitlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transformation'", "'{'", "'outputMetamodel'", "'}'", "'inputMetamodel'", "','", "'rule'", "'from'", "'to'", "':'", "';'", "'='", "'.'", "'('", "')'", "'+'", "'-'"
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

        public InternalMinitlParser(TokenStream input, MinitlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Transformation";
       	}

       	@Override
       	protected MinitlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTransformation"
    // InternalMinitl.g:65:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // InternalMinitl.g:65:55: (iv_ruleTransformation= ruleTransformation EOF )
            // InternalMinitl.g:66:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // InternalMinitl.g:72:1: ruleTransformation returns [EObject current=null] : (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputMetamodel_3_0= ruleInputMetamodel ) )? (otherlv_4= 'outputMetamodel' ( (lv_outputMetamodel_5_0= ruleMetamodel ) ) )? ( ( (lv_rules_6_0= ruleRule ) ) ( (lv_rules_7_0= ruleRule ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_inputMetamodel_3_0 = null;

        EObject lv_outputMetamodel_5_0 = null;

        EObject lv_rules_6_0 = null;

        EObject lv_rules_7_0 = null;



        	enterRule();

        try {
            // InternalMinitl.g:78:2: ( (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputMetamodel_3_0= ruleInputMetamodel ) )? (otherlv_4= 'outputMetamodel' ( (lv_outputMetamodel_5_0= ruleMetamodel ) ) )? ( ( (lv_rules_6_0= ruleRule ) ) ( (lv_rules_7_0= ruleRule ) )* )? otherlv_8= '}' ) )
            // InternalMinitl.g:79:2: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputMetamodel_3_0= ruleInputMetamodel ) )? (otherlv_4= 'outputMetamodel' ( (lv_outputMetamodel_5_0= ruleMetamodel ) ) )? ( ( (lv_rules_6_0= ruleRule ) ) ( (lv_rules_7_0= ruleRule ) )* )? otherlv_8= '}' )
            {
            // InternalMinitl.g:79:2: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputMetamodel_3_0= ruleInputMetamodel ) )? (otherlv_4= 'outputMetamodel' ( (lv_outputMetamodel_5_0= ruleMetamodel ) ) )? ( ( (lv_rules_6_0= ruleRule ) ) ( (lv_rules_7_0= ruleRule ) )* )? otherlv_8= '}' )
            // InternalMinitl.g:80:3: otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_inputMetamodel_3_0= ruleInputMetamodel ) )? (otherlv_4= 'outputMetamodel' ( (lv_outputMetamodel_5_0= ruleMetamodel ) ) )? ( ( (lv_rules_6_0= ruleRule ) ) ( (lv_rules_7_0= ruleRule ) )* )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransformationAccess().getTransformationKeyword_0());
            		
            // InternalMinitl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMinitl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMinitl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMinitl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMinitl.g:106:3: ( (lv_inputMetamodel_3_0= ruleInputMetamodel ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMinitl.g:107:4: (lv_inputMetamodel_3_0= ruleInputMetamodel )
                    {
                    // InternalMinitl.g:107:4: (lv_inputMetamodel_3_0= ruleInputMetamodel )
                    // InternalMinitl.g:108:5: lv_inputMetamodel_3_0= ruleInputMetamodel
                    {

                    					newCompositeNode(grammarAccess.getTransformationAccess().getInputMetamodelInputMetamodelParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_inputMetamodel_3_0=ruleInputMetamodel();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransformationRule());
                    					}
                    					set(
                    						current,
                    						"inputMetamodel",
                    						lv_inputMetamodel_3_0,
                    						"org.tetrabox.example.Minitl.InputMetamodel");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMinitl.g:125:3: (otherlv_4= 'outputMetamodel' ( (lv_outputMetamodel_5_0= ruleMetamodel ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMinitl.g:126:4: otherlv_4= 'outputMetamodel' ( (lv_outputMetamodel_5_0= ruleMetamodel ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTransformationAccess().getOutputMetamodelKeyword_4_0());
                    			
                    // InternalMinitl.g:130:4: ( (lv_outputMetamodel_5_0= ruleMetamodel ) )
                    // InternalMinitl.g:131:5: (lv_outputMetamodel_5_0= ruleMetamodel )
                    {
                    // InternalMinitl.g:131:5: (lv_outputMetamodel_5_0= ruleMetamodel )
                    // InternalMinitl.g:132:6: lv_outputMetamodel_5_0= ruleMetamodel
                    {

                    						newCompositeNode(grammarAccess.getTransformationAccess().getOutputMetamodelMetamodelParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_outputMetamodel_5_0=ruleMetamodel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformationRule());
                    						}
                    						set(
                    							current,
                    							"outputMetamodel",
                    							lv_outputMetamodel_5_0,
                    							"org.tetrabox.example.Minitl.Metamodel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMinitl.g:150:3: ( ( (lv_rules_6_0= ruleRule ) ) ( (lv_rules_7_0= ruleRule ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMinitl.g:151:4: ( (lv_rules_6_0= ruleRule ) ) ( (lv_rules_7_0= ruleRule ) )*
                    {
                    // InternalMinitl.g:151:4: ( (lv_rules_6_0= ruleRule ) )
                    // InternalMinitl.g:152:5: (lv_rules_6_0= ruleRule )
                    {
                    // InternalMinitl.g:152:5: (lv_rules_6_0= ruleRule )
                    // InternalMinitl.g:153:6: lv_rules_6_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getTransformationAccess().getRulesRuleParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_rules_6_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransformationRule());
                    						}
                    						add(
                    							current,
                    							"rules",
                    							lv_rules_6_0,
                    							"org.tetrabox.example.Minitl.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMinitl.g:170:4: ( (lv_rules_7_0= ruleRule ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMinitl.g:171:5: (lv_rules_7_0= ruleRule )
                    	    {
                    	    // InternalMinitl.g:171:5: (lv_rules_7_0= ruleRule )
                    	    // InternalMinitl.g:172:6: lv_rules_7_0= ruleRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getTransformationAccess().getRulesRuleParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_rules_7_0=ruleRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTransformationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rules",
                    	    							lv_rules_7_0,
                    	    							"org.tetrabox.example.Minitl.Rule");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleInputMetamodel"
    // InternalMinitl.g:198:1: entryRuleInputMetamodel returns [EObject current=null] : iv_ruleInputMetamodel= ruleInputMetamodel EOF ;
    public final EObject entryRuleInputMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputMetamodel = null;


        try {
            // InternalMinitl.g:198:55: (iv_ruleInputMetamodel= ruleInputMetamodel EOF )
            // InternalMinitl.g:199:2: iv_ruleInputMetamodel= ruleInputMetamodel EOF
            {
             newCompositeNode(grammarAccess.getInputMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputMetamodel=ruleInputMetamodel();

            state._fsp--;

             current =iv_ruleInputMetamodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputMetamodel"


    // $ANTLR start "ruleInputMetamodel"
    // InternalMinitl.g:205:1: ruleInputMetamodel returns [EObject current=null] : (otherlv_0= 'inputMetamodel' this_Metamodel_1= ruleMetamodel ) ;
    public final EObject ruleInputMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Metamodel_1 = null;



        	enterRule();

        try {
            // InternalMinitl.g:211:2: ( (otherlv_0= 'inputMetamodel' this_Metamodel_1= ruleMetamodel ) )
            // InternalMinitl.g:212:2: (otherlv_0= 'inputMetamodel' this_Metamodel_1= ruleMetamodel )
            {
            // InternalMinitl.g:212:2: (otherlv_0= 'inputMetamodel' this_Metamodel_1= ruleMetamodel )
            // InternalMinitl.g:213:3: otherlv_0= 'inputMetamodel' this_Metamodel_1= ruleMetamodel
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputMetamodelAccess().getInputMetamodelKeyword_0());
            		

            			newCompositeNode(grammarAccess.getInputMetamodelAccess().getMetamodelParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_Metamodel_1=ruleMetamodel();

            state._fsp--;


            			current = this_Metamodel_1;
            			afterParserOrEnumRuleCall();
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputMetamodel"


    // $ANTLR start "entryRuleMetamodel"
    // InternalMinitl.g:229:1: entryRuleMetamodel returns [EObject current=null] : iv_ruleMetamodel= ruleMetamodel EOF ;
    public final EObject entryRuleMetamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetamodel = null;


        try {
            // InternalMinitl.g:229:50: (iv_ruleMetamodel= ruleMetamodel EOF )
            // InternalMinitl.g:230:2: iv_ruleMetamodel= ruleMetamodel EOF
            {
             newCompositeNode(grammarAccess.getMetamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetamodel=ruleMetamodel();

            state._fsp--;

             current =iv_ruleMetamodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetamodel"


    // $ANTLR start "ruleMetamodel"
    // InternalMinitl.g:236:1: ruleMetamodel returns [EObject current=null] : ( ( ( ruleFQN ) ) (otherlv_1= ',' ( ( ruleFQN ) ) )* ) ;
    public final EObject ruleMetamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMinitl.g:242:2: ( ( ( ( ruleFQN ) ) (otherlv_1= ',' ( ( ruleFQN ) ) )* ) )
            // InternalMinitl.g:243:2: ( ( ( ruleFQN ) ) (otherlv_1= ',' ( ( ruleFQN ) ) )* )
            {
            // InternalMinitl.g:243:2: ( ( ( ruleFQN ) ) (otherlv_1= ',' ( ( ruleFQN ) ) )* )
            // InternalMinitl.g:244:3: ( ( ruleFQN ) ) (otherlv_1= ',' ( ( ruleFQN ) ) )*
            {
            // InternalMinitl.g:244:3: ( ( ruleFQN ) )
            // InternalMinitl.g:245:4: ( ruleFQN )
            {
            // InternalMinitl.g:245:4: ( ruleFQN )
            // InternalMinitl.g:246:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetamodelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMetamodelAccess().getPackagesEPackageCrossReference_0_0());
            				
            pushFollow(FOLLOW_8);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinitl.g:260:3: (otherlv_1= ',' ( ( ruleFQN ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMinitl.g:261:4: otherlv_1= ',' ( ( ruleFQN ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_1, grammarAccess.getMetamodelAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMinitl.g:265:4: ( ( ruleFQN ) )
            	    // InternalMinitl.g:266:5: ( ruleFQN )
            	    {
            	    // InternalMinitl.g:266:5: ( ruleFQN )
            	    // InternalMinitl.g:267:6: ruleFQN
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMetamodelRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getMetamodelAccess().getPackagesEPackageCrossReference_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleFQN();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMetamodel"


    // $ANTLR start "entryRuleRule"
    // InternalMinitl.g:286:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMinitl.g:286:45: (iv_ruleRule= ruleRule EOF )
            // InternalMinitl.g:287:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMinitl.g:293:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_objectTemplates_4_0= ruleObjectTemplate ) ) otherlv_5= 'to' ( (lv_objectTemplates_6_0= ruleObjectTemplate ) ) otherlv_7= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_objectTemplates_4_0 = null;

        EObject lv_objectTemplates_6_0 = null;



        	enterRule();

        try {
            // InternalMinitl.g:299:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_objectTemplates_4_0= ruleObjectTemplate ) ) otherlv_5= 'to' ( (lv_objectTemplates_6_0= ruleObjectTemplate ) ) otherlv_7= '}' ) )
            // InternalMinitl.g:300:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_objectTemplates_4_0= ruleObjectTemplate ) ) otherlv_5= 'to' ( (lv_objectTemplates_6_0= ruleObjectTemplate ) ) otherlv_7= '}' )
            {
            // InternalMinitl.g:300:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_objectTemplates_4_0= ruleObjectTemplate ) ) otherlv_5= 'to' ( (lv_objectTemplates_6_0= ruleObjectTemplate ) ) otherlv_7= '}' )
            // InternalMinitl.g:301:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' ( (lv_objectTemplates_4_0= ruleObjectTemplate ) ) otherlv_5= 'to' ( (lv_objectTemplates_6_0= ruleObjectTemplate ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalMinitl.g:305:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMinitl.g:306:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMinitl.g:306:4: (lv_name_1_0= RULE_ID )
            // InternalMinitl.g:307:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getFromKeyword_3());
            		
            // InternalMinitl.g:331:3: ( (lv_objectTemplates_4_0= ruleObjectTemplate ) )
            // InternalMinitl.g:332:4: (lv_objectTemplates_4_0= ruleObjectTemplate )
            {
            // InternalMinitl.g:332:4: (lv_objectTemplates_4_0= ruleObjectTemplate )
            // InternalMinitl.g:333:5: lv_objectTemplates_4_0= ruleObjectTemplate
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getObjectTemplatesObjectTemplateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_objectTemplates_4_0=ruleObjectTemplate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"objectTemplates",
            						lv_objectTemplates_4_0,
            						"org.tetrabox.example.Minitl.ObjectTemplate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getToKeyword_5());
            		
            // InternalMinitl.g:354:3: ( (lv_objectTemplates_6_0= ruleObjectTemplate ) )
            // InternalMinitl.g:355:4: (lv_objectTemplates_6_0= ruleObjectTemplate )
            {
            // InternalMinitl.g:355:4: (lv_objectTemplates_6_0= ruleObjectTemplate )
            // InternalMinitl.g:356:5: lv_objectTemplates_6_0= ruleObjectTemplate
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getObjectTemplatesObjectTemplateParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_objectTemplates_6_0=ruleObjectTemplate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					add(
            						current,
            						"objectTemplates",
            						lv_objectTemplates_6_0,
            						"org.tetrabox.example.Minitl.ObjectTemplate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleObjectTemplate"
    // InternalMinitl.g:381:1: entryRuleObjectTemplate returns [EObject current=null] : iv_ruleObjectTemplate= ruleObjectTemplate EOF ;
    public final EObject entryRuleObjectTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectTemplate = null;


        try {
            // InternalMinitl.g:381:55: (iv_ruleObjectTemplate= ruleObjectTemplate EOF )
            // InternalMinitl.g:382:2: iv_ruleObjectTemplate= ruleObjectTemplate EOF
            {
             newCompositeNode(grammarAccess.getObjectTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectTemplate=ruleObjectTemplate();

            state._fsp--;

             current =iv_ruleObjectTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectTemplate"


    // $ANTLR start "ruleObjectTemplate"
    // InternalMinitl.g:388:1: ruleObjectTemplate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) (otherlv_3= '{' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) ) )* )? (otherlv_7= ';' )? otherlv_8= '}' )? ) ;
    public final EObject ruleObjectTemplate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_bindings_4_0 = null;

        EObject lv_bindings_6_0 = null;



        	enterRule();

        try {
            // InternalMinitl.g:394:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) (otherlv_3= '{' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) ) )* )? (otherlv_7= ';' )? otherlv_8= '}' )? ) )
            // InternalMinitl.g:395:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) (otherlv_3= '{' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) ) )* )? (otherlv_7= ';' )? otherlv_8= '}' )? )
            {
            // InternalMinitl.g:395:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) (otherlv_3= '{' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) ) )* )? (otherlv_7= ';' )? otherlv_8= '}' )? )
            // InternalMinitl.g:396:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ruleFQN ) ) (otherlv_3= '{' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) ) )* )? (otherlv_7= ';' )? otherlv_8= '}' )?
            {
            // InternalMinitl.g:396:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMinitl.g:397:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMinitl.g:397:4: (lv_name_0_0= RULE_ID )
            // InternalMinitl.g:398:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getObjectTemplateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectTemplateAccess().getColonKeyword_1());
            		
            // InternalMinitl.g:418:3: ( ( ruleFQN ) )
            // InternalMinitl.g:419:4: ( ruleFQN )
            {
            // InternalMinitl.g:419:4: ( ruleFQN )
            // InternalMinitl.g:420:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectTemplateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getObjectTemplateAccess().getTypeEClassCrossReference_2_0());
            				
            pushFollow(FOLLOW_13);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMinitl.g:434:3: (otherlv_3= '{' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) ) )* )? (otherlv_7= ';' )? otherlv_8= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMinitl.g:435:4: otherlv_3= '{' ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) ) )* )? (otherlv_7= ';' )? otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getObjectTemplateAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalMinitl.g:439:4: ( ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMinitl.g:440:5: ( (lv_bindings_4_0= ruleBinding ) ) (otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) ) )*
                            {
                            // InternalMinitl.g:440:5: ( (lv_bindings_4_0= ruleBinding ) )
                            // InternalMinitl.g:441:6: (lv_bindings_4_0= ruleBinding )
                            {
                            // InternalMinitl.g:441:6: (lv_bindings_4_0= ruleBinding )
                            // InternalMinitl.g:442:7: lv_bindings_4_0= ruleBinding
                            {

                            							newCompositeNode(grammarAccess.getObjectTemplateAccess().getBindingsBindingParserRuleCall_3_1_0_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_bindings_4_0=ruleBinding();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getObjectTemplateRule());
                            							}
                            							add(
                            								current,
                            								"bindings",
                            								lv_bindings_4_0,
                            								"org.tetrabox.example.Minitl.Binding");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMinitl.g:459:5: (otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==21) ) {
                                    int LA6_1 = input.LA(2);

                                    if ( (LA6_1==RULE_ID) ) {
                                        alt6=1;
                                    }


                                }


                                switch (alt6) {
                            	case 1 :
                            	    // InternalMinitl.g:460:6: otherlv_5= ';' ( (lv_bindings_6_0= ruleBinding ) )
                            	    {
                            	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                            	    						newLeafNode(otherlv_5, grammarAccess.getObjectTemplateAccess().getSemicolonKeyword_3_1_1_0());
                            	    					
                            	    // InternalMinitl.g:464:6: ( (lv_bindings_6_0= ruleBinding ) )
                            	    // InternalMinitl.g:465:7: (lv_bindings_6_0= ruleBinding )
                            	    {
                            	    // InternalMinitl.g:465:7: (lv_bindings_6_0= ruleBinding )
                            	    // InternalMinitl.g:466:8: lv_bindings_6_0= ruleBinding
                            	    {

                            	    								newCompositeNode(grammarAccess.getObjectTemplateAccess().getBindingsBindingParserRuleCall_3_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_15);
                            	    lv_bindings_6_0=ruleBinding();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getObjectTemplateRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"bindings",
                            	    									lv_bindings_6_0,
                            	    									"org.tetrabox.example.Minitl.Binding");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // InternalMinitl.g:485:4: (otherlv_7= ';' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==21) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMinitl.g:486:5: otherlv_7= ';'
                            {
                            otherlv_7=(Token)match(input,21,FOLLOW_11); 

                            					newLeafNode(otherlv_7, grammarAccess.getObjectTemplateAccess().getSemicolonKeyword_3_2());
                            				

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectTemplateAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectTemplate"


    // $ANTLR start "entryRuleBinding"
    // InternalMinitl.g:500:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalMinitl.g:500:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalMinitl.g:501:2: iv_ruleBinding= ruleBinding EOF
            {
             newCompositeNode(grammarAccess.getBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;

             current =iv_ruleBinding; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalMinitl.g:507:1: ruleBinding returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMinitl.g:513:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalMinitl.g:514:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalMinitl.g:514:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // InternalMinitl.g:515:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalMinitl.g:515:3: ( (otherlv_0= RULE_ID ) )
            // InternalMinitl.g:516:4: (otherlv_0= RULE_ID )
            {
            // InternalMinitl.g:516:4: (otherlv_0= RULE_ID )
            // InternalMinitl.g:517:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_0, grammarAccess.getBindingAccess().getFeatureEStructuralFeatureCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getBindingAccess().getEqualsSignKeyword_1());
            		
            // InternalMinitl.g:532:3: ( (lv_value_2_0= ruleValue ) )
            // InternalMinitl.g:533:4: (lv_value_2_0= ruleValue )
            {
            // InternalMinitl.g:533:4: (lv_value_2_0= ruleValue )
            // InternalMinitl.g:534:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getBindingAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBindingRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.tetrabox.example.Minitl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleValue"
    // InternalMinitl.g:555:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMinitl.g:555:46: (iv_ruleValue= ruleValue EOF )
            // InternalMinitl.g:556:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMinitl.g:562:1: ruleValue returns [EObject current=null] : this_MaybeBinary_0= ruleMaybeBinary ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_MaybeBinary_0 = null;



        	enterRule();

        try {
            // InternalMinitl.g:568:2: (this_MaybeBinary_0= ruleMaybeBinary )
            // InternalMinitl.g:569:2: this_MaybeBinary_0= ruleMaybeBinary
            {

            		newCompositeNode(grammarAccess.getValueAccess().getMaybeBinaryParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_MaybeBinary_0=ruleMaybeBinary();

            state._fsp--;


            		current = this_MaybeBinary_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleMaybeBinary"
    // InternalMinitl.g:580:1: entryRuleMaybeBinary returns [EObject current=null] : iv_ruleMaybeBinary= ruleMaybeBinary EOF ;
    public final EObject entryRuleMaybeBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaybeBinary = null;


        try {
            // InternalMinitl.g:580:52: (iv_ruleMaybeBinary= ruleMaybeBinary EOF )
            // InternalMinitl.g:581:2: iv_ruleMaybeBinary= ruleMaybeBinary EOF
            {
             newCompositeNode(grammarAccess.getMaybeBinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaybeBinary=ruleMaybeBinary();

            state._fsp--;

             current =iv_ruleMaybeBinary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaybeBinary"


    // $ANTLR start "ruleMaybeBinary"
    // InternalMinitl.g:587:1: ruleMaybeBinary returns [EObject current=null] : (this_MaybeFieldAccessValue_0= ruleMaybeFieldAccessValue ( () ( (lv_operator_2_0= ruleOperator ) ) ( (lv_expressions_3_0= ruleMaybeFieldAccessValue ) ) )* ) ;
    public final EObject ruleMaybeBinary() throws RecognitionException {
        EObject current = null;

        EObject this_MaybeFieldAccessValue_0 = null;

        Enumerator lv_operator_2_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalMinitl.g:593:2: ( (this_MaybeFieldAccessValue_0= ruleMaybeFieldAccessValue ( () ( (lv_operator_2_0= ruleOperator ) ) ( (lv_expressions_3_0= ruleMaybeFieldAccessValue ) ) )* ) )
            // InternalMinitl.g:594:2: (this_MaybeFieldAccessValue_0= ruleMaybeFieldAccessValue ( () ( (lv_operator_2_0= ruleOperator ) ) ( (lv_expressions_3_0= ruleMaybeFieldAccessValue ) ) )* )
            {
            // InternalMinitl.g:594:2: (this_MaybeFieldAccessValue_0= ruleMaybeFieldAccessValue ( () ( (lv_operator_2_0= ruleOperator ) ) ( (lv_expressions_3_0= ruleMaybeFieldAccessValue ) ) )* )
            // InternalMinitl.g:595:3: this_MaybeFieldAccessValue_0= ruleMaybeFieldAccessValue ( () ( (lv_operator_2_0= ruleOperator ) ) ( (lv_expressions_3_0= ruleMaybeFieldAccessValue ) ) )*
            {

            			newCompositeNode(grammarAccess.getMaybeBinaryAccess().getMaybeFieldAccessValueParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_MaybeFieldAccessValue_0=ruleMaybeFieldAccessValue();

            state._fsp--;


            			current = this_MaybeFieldAccessValue_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMinitl.g:603:3: ( () ( (lv_operator_2_0= ruleOperator ) ) ( (lv_expressions_3_0= ruleMaybeFieldAccessValue ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMinitl.g:604:4: () ( (lv_operator_2_0= ruleOperator ) ) ( (lv_expressions_3_0= ruleMaybeFieldAccessValue ) )
            	    {
            	    // InternalMinitl.g:604:4: ()
            	    // InternalMinitl.g:605:5: 
            	    {

            	    					current = forceCreateModelElementAndAdd(
            	    						grammarAccess.getMaybeBinaryAccess().getBinaryExpressionExpressionsAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMinitl.g:611:4: ( (lv_operator_2_0= ruleOperator ) )
            	    // InternalMinitl.g:612:5: (lv_operator_2_0= ruleOperator )
            	    {
            	    // InternalMinitl.g:612:5: (lv_operator_2_0= ruleOperator )
            	    // InternalMinitl.g:613:6: lv_operator_2_0= ruleOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMaybeBinaryAccess().getOperatorOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operator_2_0=ruleOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMaybeBinaryRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"org.tetrabox.example.Minitl.Operator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMinitl.g:630:4: ( (lv_expressions_3_0= ruleMaybeFieldAccessValue ) )
            	    // InternalMinitl.g:631:5: (lv_expressions_3_0= ruleMaybeFieldAccessValue )
            	    {
            	    // InternalMinitl.g:631:5: (lv_expressions_3_0= ruleMaybeFieldAccessValue )
            	    // InternalMinitl.g:632:6: lv_expressions_3_0= ruleMaybeFieldAccessValue
            	    {

            	    						newCompositeNode(grammarAccess.getMaybeBinaryAccess().getExpressionsMaybeFieldAccessValueParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_expressions_3_0=ruleMaybeFieldAccessValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMaybeBinaryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_3_0,
            	    							"org.tetrabox.example.Minitl.MaybeFieldAccessValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaybeBinary"


    // $ANTLR start "entryRuleMaybeFieldAccessValue"
    // InternalMinitl.g:654:1: entryRuleMaybeFieldAccessValue returns [EObject current=null] : iv_ruleMaybeFieldAccessValue= ruleMaybeFieldAccessValue EOF ;
    public final EObject entryRuleMaybeFieldAccessValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaybeFieldAccessValue = null;


        try {
            // InternalMinitl.g:654:62: (iv_ruleMaybeFieldAccessValue= ruleMaybeFieldAccessValue EOF )
            // InternalMinitl.g:655:2: iv_ruleMaybeFieldAccessValue= ruleMaybeFieldAccessValue EOF
            {
             newCompositeNode(grammarAccess.getMaybeFieldAccessValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaybeFieldAccessValue=ruleMaybeFieldAccessValue();

            state._fsp--;

             current =iv_ruleMaybeFieldAccessValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaybeFieldAccessValue"


    // $ANTLR start "ruleMaybeFieldAccessValue"
    // InternalMinitl.g:661:1: ruleMaybeFieldAccessValue returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject ruleMaybeFieldAccessValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;



        	enterRule();

        try {
            // InternalMinitl.g:667:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* ) )
            // InternalMinitl.g:668:2: (this_Primary_0= rulePrimary ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // InternalMinitl.g:668:2: (this_Primary_0= rulePrimary ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )* )
            // InternalMinitl.g:669:3: this_Primary_0= rulePrimary ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            {

            			newCompositeNode(grammarAccess.getMaybeFieldAccessValueAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMinitl.g:677:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMinitl.g:678:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // InternalMinitl.g:678:4: ()
            	    // InternalMinitl.g:679:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMaybeFieldAccessValueAccess().getFieldAccessValueObjectAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMaybeFieldAccessValueAccess().getFullStopKeyword_1_1());
            	    			
            	    // InternalMinitl.g:689:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMinitl.g:690:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMinitl.g:690:5: (otherlv_3= RULE_ID )
            	    // InternalMinitl.g:691:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMaybeFieldAccessValueRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMaybeFieldAccessValueAccess().getFeatureEStructuralFeatureCrossReference_1_2_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaybeFieldAccessValue"


    // $ANTLR start "entryRulePrimary"
    // InternalMinitl.g:707:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMinitl.g:707:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMinitl.g:708:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMinitl.g:714:1: rulePrimary returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_ObjectTemplateValue_1= ruleObjectTemplateValue | (otherlv_2= '(' this_MaybeBinary_3= ruleMaybeBinary otherlv_4= ')' ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_StringValue_0 = null;

        EObject this_ObjectTemplateValue_1 = null;

        EObject this_MaybeBinary_3 = null;



        	enterRule();

        try {
            // InternalMinitl.g:720:2: ( (this_StringValue_0= ruleStringValue | this_ObjectTemplateValue_1= ruleObjectTemplateValue | (otherlv_2= '(' this_MaybeBinary_3= ruleMaybeBinary otherlv_4= ')' ) ) )
            // InternalMinitl.g:721:2: (this_StringValue_0= ruleStringValue | this_ObjectTemplateValue_1= ruleObjectTemplateValue | (otherlv_2= '(' this_MaybeBinary_3= ruleMaybeBinary otherlv_4= ')' ) )
            {
            // InternalMinitl.g:721:2: (this_StringValue_0= ruleStringValue | this_ObjectTemplateValue_1= ruleObjectTemplateValue | (otherlv_2= '(' this_MaybeBinary_3= ruleMaybeBinary otherlv_4= ')' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMinitl.g:722:3: this_StringValue_0= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getStringValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMinitl.g:731:3: this_ObjectTemplateValue_1= ruleObjectTemplateValue
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getObjectTemplateValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectTemplateValue_1=ruleObjectTemplateValue();

                    state._fsp--;


                    			current = this_ObjectTemplateValue_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMinitl.g:740:3: (otherlv_2= '(' this_MaybeBinary_3= ruleMaybeBinary otherlv_4= ')' )
                    {
                    // InternalMinitl.g:740:3: (otherlv_2= '(' this_MaybeBinary_3= ruleMaybeBinary otherlv_4= ')' )
                    // InternalMinitl.g:741:4: otherlv_2= '(' this_MaybeBinary_3= ruleMaybeBinary otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getMaybeBinaryParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_20);
                    this_MaybeBinary_3=ruleMaybeBinary();

                    state._fsp--;


                    				current = this_MaybeBinary_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleStringValue"
    // InternalMinitl.g:762:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalMinitl.g:762:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalMinitl.g:763:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalMinitl.g:769:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMinitl.g:775:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMinitl.g:776:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMinitl.g:776:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMinitl.g:777:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMinitl.g:777:3: (lv_value_0_0= RULE_STRING )
            // InternalMinitl.g:778:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleObjectTemplateValue"
    // InternalMinitl.g:797:1: entryRuleObjectTemplateValue returns [EObject current=null] : iv_ruleObjectTemplateValue= ruleObjectTemplateValue EOF ;
    public final EObject entryRuleObjectTemplateValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectTemplateValue = null;


        try {
            // InternalMinitl.g:797:60: (iv_ruleObjectTemplateValue= ruleObjectTemplateValue EOF )
            // InternalMinitl.g:798:2: iv_ruleObjectTemplateValue= ruleObjectTemplateValue EOF
            {
             newCompositeNode(grammarAccess.getObjectTemplateValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectTemplateValue=ruleObjectTemplateValue();

            state._fsp--;

             current =iv_ruleObjectTemplateValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObjectTemplateValue"


    // $ANTLR start "ruleObjectTemplateValue"
    // InternalMinitl.g:804:1: ruleObjectTemplateValue returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleObjectTemplateValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMinitl.g:810:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMinitl.g:811:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMinitl.g:811:2: ( (otherlv_0= RULE_ID ) )
            // InternalMinitl.g:812:3: (otherlv_0= RULE_ID )
            {
            // InternalMinitl.g:812:3: (otherlv_0= RULE_ID )
            // InternalMinitl.g:813:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getObjectTemplateValueRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getObjectTemplateValueAccess().getObjecttemplateObjectTemplateCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectTemplateValue"


    // $ANTLR start "entryRuleFQN"
    // InternalMinitl.g:827:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalMinitl.g:827:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalMinitl.g:828:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalMinitl.g:834:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMinitl.g:840:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMinitl.g:841:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMinitl.g:841:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMinitl.g:842:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalMinitl.g:849:3: (kw= '.' this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMinitl.g:850:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleOperator"
    // InternalMinitl.g:867:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMinitl.g:873:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalMinitl.g:874:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalMinitl.g:874:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMinitl.g:875:3: (enumLiteral_0= '+' )
                    {
                    // InternalMinitl.g:875:3: (enumLiteral_0= '+' )
                    // InternalMinitl.g:876:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMinitl.g:883:3: (enumLiteral_1= '-' )
                    {
                    // InternalMinitl.g:883:3: (enumLiteral_1= '-' )
                    // InternalMinitl.g:884:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getSUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000002E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000204010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});

}