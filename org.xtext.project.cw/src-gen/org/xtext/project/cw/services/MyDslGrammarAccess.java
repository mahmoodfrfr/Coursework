/*
 * generated by Xtext 2.31.0
 */
package org.xtext.project.cw.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.project.cw.MyDsl.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Assignment cEntitiesAssignment_0_0 = (Assignment)cAlternatives_0.eContents().get(0);
		private final RuleCall cEntitiesEntityParserRuleCall_0_0_0 = (RuleCall)cEntitiesAssignment_0_0.eContents().get(0);
		private final Assignment cScreensAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final RuleCall cScreensScreenParserRuleCall_0_1_0 = (RuleCall)cScreensAssignment_0_1.eContents().get(0);
		private final Keyword cStartKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAtKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStartScreenAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cStartScreenScreenCrossReference_3_0 = (CrossReference)cStartScreenAssignment_3.eContents().get(0);
		private final RuleCall cStartScreenScreenIDTerminalRuleCall_3_0_1 = (RuleCall)cStartScreenScreenCrossReference_3_0.eContents().get(1);
		
		//Model:
		//     (entities+=Entity | screens+=Screen)* 'start' 'at' startScreen=[Screen] ;
		@Override public ParserRule getRule() { return rule; }
		
		//(entities+=Entity | screens+=Screen)* 'start' 'at' startScreen=[Screen]
		public Group getGroup() { return cGroup; }
		
		//(entities+=Entity | screens+=Screen)*
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//entities+=Entity
		public Assignment getEntitiesAssignment_0_0() { return cEntitiesAssignment_0_0; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_0_0_0() { return cEntitiesEntityParserRuleCall_0_0_0; }
		
		//screens+=Screen
		public Assignment getScreensAssignment_0_1() { return cScreensAssignment_0_1; }
		
		//Screen
		public RuleCall getScreensScreenParserRuleCall_0_1_0() { return cScreensScreenParserRuleCall_0_1_0; }
		
		//'start'
		public Keyword getStartKeyword_1() { return cStartKeyword_1; }
		
		//'at'
		public Keyword getAtKeyword_2() { return cAtKeyword_2; }
		
		//startScreen=[Screen]
		public Assignment getStartScreenAssignment_3() { return cStartScreenAssignment_3; }
		
		//[Screen]
		public CrossReference getStartScreenScreenCrossReference_3_0() { return cStartScreenScreenCrossReference_3_0; }
		
		//ID
		public RuleCall getStartScreenScreenIDTerminalRuleCall_3_0_1() { return cStartScreenScreenIDTerminalRuleCall_3_0_1; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.project.cw.MyDsl.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Attribute:
		// type=Type name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//type=Type name=ID
		public Group getGroup() { return cGroup; }
		
		//type=Type
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//Type
		public RuleCall getTypeTypeParserRuleCall_0_0() { return cTypeTypeParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.project.cw.MyDsl.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBooleanKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cIntKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//Type:
		// 'String' | 'Boolean' | 'Int';
		@Override public ParserRule getRule() { return rule; }
		
		//'String' | 'Boolean' | 'Int'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'String'
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }
		
		//'Boolean'
		public Keyword getBooleanKeyword_1() { return cBooleanKeyword_1; }
		
		//'Int'
		public Keyword getIntKeyword_2() { return cIntKeyword_2; }
	}
	public class ScreenElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.project.cw.MyDsl.Screen");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScreenKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cForKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEntityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cEntityEntityCrossReference_3_0 = (CrossReference)cEntityAssignment_3.eContents().get(0);
		private final RuleCall cEntityEntityIDTerminalRuleCall_3_0_1 = (RuleCall)cEntityEntityCrossReference_3_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTriggersAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTriggersTriggerParserRuleCall_5_0 = (RuleCall)cTriggersAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Screen:
		//'screen' name=ID 'for' entity=[Entity] '{'
		//(triggers+=Trigger)*
		//'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'screen' name=ID 'for' entity=[Entity] '{'
		//(triggers+=Trigger)*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'screen'
		public Keyword getScreenKeyword_0() { return cScreenKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'for'
		public Keyword getForKeyword_2() { return cForKeyword_2; }
		
		//entity=[Entity]
		public Assignment getEntityAssignment_3() { return cEntityAssignment_3; }
		
		//[Entity]
		public CrossReference getEntityEntityCrossReference_3_0() { return cEntityEntityCrossReference_3_0; }
		
		//ID
		public RuleCall getEntityEntityIDTerminalRuleCall_3_0_1() { return cEntityEntityIDTerminalRuleCall_3_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//(triggers+=Trigger)*
		public Assignment getTriggersAssignment_5() { return cTriggersAssignment_5; }
		
		//Trigger
		public RuleCall getTriggersTriggerParserRuleCall_5_0() { return cTriggersTriggerParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class TriggerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.project.cw.MyDsl.Trigger");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cButtonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTriggerAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTriggerIDTerminalRuleCall_2_0 = (RuleCall)cTriggerAssignment_2.eContents().get(0);
		private final Keyword cMoveKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cScreenAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cScreenScreenCrossReference_5_0 = (CrossReference)cScreenAssignment_5.eContents().get(0);
		private final RuleCall cScreenScreenIDTerminalRuleCall_5_0_1 = (RuleCall)cScreenScreenCrossReference_5_0.eContents().get(1);
		
		//Trigger:
		//'on' 'button' trigger=ID 'move' 'to' screen=[Screen];
		@Override public ParserRule getRule() { return rule; }
		
		//'on' 'button' trigger=ID 'move' 'to' screen=[Screen]
		public Group getGroup() { return cGroup; }
		
		//'on'
		public Keyword getOnKeyword_0() { return cOnKeyword_0; }
		
		//'button'
		public Keyword getButtonKeyword_1() { return cButtonKeyword_1; }
		
		//trigger=ID
		public Assignment getTriggerAssignment_2() { return cTriggerAssignment_2; }
		
		//ID
		public RuleCall getTriggerIDTerminalRuleCall_2_0() { return cTriggerIDTerminalRuleCall_2_0; }
		
		//'move'
		public Keyword getMoveKeyword_3() { return cMoveKeyword_3; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//screen=[Screen]
		public Assignment getScreenAssignment_5() { return cScreenAssignment_5; }
		
		//[Screen]
		public CrossReference getScreenScreenCrossReference_5_0() { return cScreenScreenCrossReference_5_0; }
		
		//ID
		public RuleCall getScreenScreenIDTerminalRuleCall_5_0_1() { return cScreenScreenIDTerminalRuleCall_5_0_1; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.project.cw.MyDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Entity:
		//   'entity' name=ID '{'
		//       (attributes+=Attribute)*
		//   '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID '{'
		//    (attributes+=Attribute)*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(attributes+=Attribute)*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_3_0() { return cAttributesAttributeParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private final ModelElements pModel;
	private final AttributeElements pAttribute;
	private final TypeElements pType;
	private final ScreenElements pScreen;
	private final TriggerElements pTrigger;
	private final EntityElements pEntity;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAttribute = new AttributeElements();
		this.pType = new TypeElements();
		this.pScreen = new ScreenElements();
		this.pTrigger = new TriggerElements();
		this.pEntity = new EntityElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.project.cw.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//     (entities+=Entity | screens+=Screen)* 'start' 'at' startScreen=[Screen] ;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Attribute:
	// type=Type name=ID;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Type:
	// 'String' | 'Boolean' | 'Int';
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Screen:
	//'screen' name=ID 'for' entity=[Entity] '{'
	//(triggers+=Trigger)*
	//'}';
	public ScreenElements getScreenAccess() {
		return pScreen;
	}
	
	public ParserRule getScreenRule() {
		return getScreenAccess().getRule();
	}
	
	//Trigger:
	//'on' 'button' trigger=ID 'move' 'to' screen=[Screen];
	public TriggerElements getTriggerAccess() {
		return pTrigger;
	}
	
	public ParserRule getTriggerRule() {
		return getTriggerAccess().getRule();
	}
	
	//Entity:
	//   'entity' name=ID '{'
	//       (attributes+=Attribute)*
	//   '}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
