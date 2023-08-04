package org.xtext.project.cw.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.project.cw.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start'", "'at'", "'String'", "'Boolean'", "'Int'", "'screen'", "'for'", "'{'", "'}'", "'on'", "'button'", "'move'", "'to'", "'entity'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_screens_1_0= ruleScreen ) ) )* otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_entities_0_0 = null;

        EObject lv_screens_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_screens_1_0= ruleScreen ) ) )* otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalMyDsl.g:78:2: ( ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_screens_1_0= ruleScreen ) ) )* otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_screens_1_0= ruleScreen ) ) )* otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) ) )
            // InternalMyDsl.g:79:3: ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_screens_1_0= ruleScreen ) ) )* otherlv_2= 'start' otherlv_3= 'at' ( (otherlv_4= RULE_ID ) )
            {
            // InternalMyDsl.g:79:3: ( ( (lv_entities_0_0= ruleEntity ) ) | ( (lv_screens_1_0= ruleScreen ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==24) ) {
                    alt1=1;
                }
                else if ( (LA1_0==16) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: ( (lv_entities_0_0= ruleEntity ) )
            	    {
            	    // InternalMyDsl.g:80:4: ( (lv_entities_0_0= ruleEntity ) )
            	    // InternalMyDsl.g:81:5: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:81:5: (lv_entities_0_0= ruleEntity )
            	    // InternalMyDsl.g:82:6: lv_entities_0_0= ruleEntity
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entities",
            	    							lv_entities_0_0,
            	    							"org.xtext.project.cw.MyDsl.Entity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:100:4: ( (lv_screens_1_0= ruleScreen ) )
            	    {
            	    // InternalMyDsl.g:100:4: ( (lv_screens_1_0= ruleScreen ) )
            	    // InternalMyDsl.g:101:5: (lv_screens_1_0= ruleScreen )
            	    {
            	    // InternalMyDsl.g:101:5: (lv_screens_1_0= ruleScreen )
            	    // InternalMyDsl.g:102:6: lv_screens_1_0= ruleScreen
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getScreensScreenParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_screens_1_0=ruleScreen();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"screens",
            	    							lv_screens_1_0,
            	    							"org.xtext.project.cw.MyDsl.Screen");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getStartKeyword_1());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getAtKeyword_2());
            		
            // InternalMyDsl.g:128:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:129:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:129:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:130:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getModelAccess().getStartScreenScreenCrossReference_3_0());
            				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:145:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:145:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:146:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:152:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:158:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:159:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:159:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:160:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:160:3: ( (lv_type_0_0= ruleType ) )
            // InternalMyDsl.g:161:4: (lv_type_0_0= ruleType )
            {
            // InternalMyDsl.g:161:4: (lv_type_0_0= ruleType )
            // InternalMyDsl.g:162:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.project.cw.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:179:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:180:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:180:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:181:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:201:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:201:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:202:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:208:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'String' | kw= 'Boolean' | kw= 'Int' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:214:2: ( (kw= 'String' | kw= 'Boolean' | kw= 'Int' ) )
            // InternalMyDsl.g:215:2: (kw= 'String' | kw= 'Boolean' | kw= 'Int' )
            {
            // InternalMyDsl.g:215:2: (kw= 'String' | kw= 'Boolean' | kw= 'Int' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:216:3: kw= 'String'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:222:3: kw= 'Boolean'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:228:3: kw= 'Int'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getIntKeyword_2());
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleScreen"
    // InternalMyDsl.g:237:1: entryRuleScreen returns [EObject current=null] : iv_ruleScreen= ruleScreen EOF ;
    public final EObject entryRuleScreen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScreen = null;


        try {
            // InternalMyDsl.g:237:47: (iv_ruleScreen= ruleScreen EOF )
            // InternalMyDsl.g:238:2: iv_ruleScreen= ruleScreen EOF
            {
             newCompositeNode(grammarAccess.getScreenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScreen=ruleScreen();

            state._fsp--;

             current =iv_ruleScreen; 
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
    // $ANTLR end "entryRuleScreen"


    // $ANTLR start "ruleScreen"
    // InternalMyDsl.g:244:1: ruleScreen returns [EObject current=null] : (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_triggers_5_0= ruleTrigger ) )* otherlv_6= '}' ) ;
    public final EObject ruleScreen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_triggers_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:250:2: ( (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_triggers_5_0= ruleTrigger ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:251:2: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_triggers_5_0= ruleTrigger ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:251:2: (otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_triggers_5_0= ruleTrigger ) )* otherlv_6= '}' )
            // InternalMyDsl.g:252:3: otherlv_0= 'screen' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_triggers_5_0= ruleTrigger ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScreenAccess().getScreenKeyword_0());
            		
            // InternalMyDsl.g:256:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:257:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:257:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:258:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScreenAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScreenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getScreenAccess().getForKeyword_2());
            		
            // InternalMyDsl.g:278:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:279:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:279:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:280:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScreenRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getScreenAccess().getEntityEntityCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getScreenAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDsl.g:295:3: ( (lv_triggers_5_0= ruleTrigger ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:296:4: (lv_triggers_5_0= ruleTrigger )
            	    {
            	    // InternalMyDsl.g:296:4: (lv_triggers_5_0= ruleTrigger )
            	    // InternalMyDsl.g:297:5: lv_triggers_5_0= ruleTrigger
            	    {

            	    					newCompositeNode(grammarAccess.getScreenAccess().getTriggersTriggerParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_triggers_5_0=ruleTrigger();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getScreenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"triggers",
            	    						lv_triggers_5_0,
            	    						"org.xtext.project.cw.MyDsl.Trigger");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getScreenAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleScreen"


    // $ANTLR start "entryRuleTrigger"
    // InternalMyDsl.g:322:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // InternalMyDsl.g:322:48: (iv_ruleTrigger= ruleTrigger EOF )
            // InternalMyDsl.g:323:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
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
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // InternalMyDsl.g:329:1: ruleTrigger returns [EObject current=null] : (otherlv_0= 'on' otherlv_1= 'button' ( (lv_trigger_2_0= RULE_ID ) ) otherlv_3= 'move' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_trigger_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:335:2: ( (otherlv_0= 'on' otherlv_1= 'button' ( (lv_trigger_2_0= RULE_ID ) ) otherlv_3= 'move' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalMyDsl.g:336:2: (otherlv_0= 'on' otherlv_1= 'button' ( (lv_trigger_2_0= RULE_ID ) ) otherlv_3= 'move' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalMyDsl.g:336:2: (otherlv_0= 'on' otherlv_1= 'button' ( (lv_trigger_2_0= RULE_ID ) ) otherlv_3= 'move' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) ) )
            // InternalMyDsl.g:337:3: otherlv_0= 'on' otherlv_1= 'button' ( (lv_trigger_2_0= RULE_ID ) ) otherlv_3= 'move' otherlv_4= 'to' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTriggerAccess().getOnKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTriggerAccess().getButtonKeyword_1());
            		
            // InternalMyDsl.g:345:3: ( (lv_trigger_2_0= RULE_ID ) )
            // InternalMyDsl.g:346:4: (lv_trigger_2_0= RULE_ID )
            {
            // InternalMyDsl.g:346:4: (lv_trigger_2_0= RULE_ID )
            // InternalMyDsl.g:347:5: lv_trigger_2_0= RULE_ID
            {
            lv_trigger_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_trigger_2_0, grammarAccess.getTriggerAccess().getTriggerIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"trigger",
            						lv_trigger_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getTriggerAccess().getMoveKeyword_3());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTriggerAccess().getToKeyword_4());
            		
            // InternalMyDsl.g:371:3: ( (otherlv_5= RULE_ID ) )
            // InternalMyDsl.g:372:4: (otherlv_5= RULE_ID )
            {
            // InternalMyDsl.g:372:4: (otherlv_5= RULE_ID )
            // InternalMyDsl.g:373:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTriggerRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_5, grammarAccess.getTriggerAccess().getScreenScreenCrossReference_5_0());
            				

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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:388:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:388:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:389:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:395:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:401:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:402:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:402:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalMyDsl.g:403:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:407:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:408:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:408:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:409:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:429:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=13 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:430:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:430:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalMyDsl.g:431:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.project.cw.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEntity"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001010800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000008E000L});

}