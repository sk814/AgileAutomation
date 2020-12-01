/*
 * generated by Xtext 2.23.0
 */
package co7217.xtext.entity.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
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
public class EntityDSLGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class DomainmodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.Domainmodel");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsAbstractElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Domainmodel:
		//	elements+=AbstractElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=AbstractElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_0() { return cElementsAbstractElementParserRuleCall_0; }
	}
	public class PackageDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.PackageDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsAbstractElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//PackageDeclaration:
		//	'package' name=QualifiedName '{'
		//	elements+=AbstractElement*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'package' name=QualifiedName '{' elements+=AbstractElement* '}'
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//elements+=AbstractElement*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_3_0() { return cElementsAbstractElementParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.AbstractElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPackageDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cImportParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//AbstractElement:
		//	PackageDeclaration | Type | Import;
		@Override public ParserRule getRule() { return rule; }
		
		//PackageDeclaration | Type | Import
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PackageDeclaration
		public RuleCall getPackageDeclarationParserRuleCall_0() { return cPackageDeclarationParserRuleCall_0; }
		
		//Type
		public RuleCall getTypeParserRuleCall_1() { return cTypeParserRuleCall_1; }
		
		//Import
		public RuleCall getImportParserRuleCall_2() { return cImportParserRuleCall_2; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	'import' importedNamespace=QualifiedNameWithWildcard;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=QualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.Literal");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Literal:
		//	value=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//value=ID
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_0() { return cValueIDTerminalRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLiteralParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDataTypeParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		////Literal:
		////	name=ID;
		//Type:
		//	Literal | Entity | DataType;
		@Override public ParserRule getRule() { return rule; }
		
		//Literal | Entity | DataType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Literal
		public RuleCall getLiteralParserRuleCall_0() { return cLiteralParserRuleCall_0; }
		
		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
		
		//DataType
		public RuleCall getDataTypeParserRuleCall_2() { return cDataTypeParserRuleCall_2; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.DataType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cEnumerationKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Group cGroup_0_2 = (Group)cGroup_0.eContents().get(2);
		private final Keyword cExtendsKeyword_0_2_0 = (Keyword)cGroup_0_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_0_2_1 = (Assignment)cGroup_0_2.eContents().get(1);
		private final CrossReference cSuperTypeLiteralCrossReference_0_2_1_0 = (CrossReference)cSuperTypeAssignment_0_2_1.eContents().get(0);
		private final RuleCall cSuperTypeLiteralQualifiedNameParserRuleCall_0_2_1_0_1 = (RuleCall)cSuperTypeLiteralCrossReference_0_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Assignment cLiteralsAssignment_0_4 = (Assignment)cGroup_0.eContents().get(4);
		private final RuleCall cLiteralsLiteralParserRuleCall_0_4_0 = (RuleCall)cLiteralsAssignment_0_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_0_5 = (Keyword)cGroup_0.eContents().get(5);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDatatypeKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		
		//DataType:
		//	'enumeration'
		//	name=ID ('extends' superType=[Literal|QualifiedName])?
		//	'{'
		//	//	(literals = literals + Literal)*
		//	literals+=Literal*
		//	'}'
		//	| 'datatype' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'enumeration' name=ID ('extends' superType=[Literal|QualifiedName])? '{' //	(literals = literals + Literal)*
		//literals+=Literal* '}' | 'datatype' name=ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'enumeration' name=ID ('extends' superType=[Literal|QualifiedName])? '{' //	(literals = literals + Literal)*
		//literals+=Literal* '}'
		public Group getGroup_0() { return cGroup_0; }
		
		//'enumeration'
		public Keyword getEnumerationKeyword_0_0() { return cEnumerationKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//('extends' superType=[Literal|QualifiedName])?
		public Group getGroup_0_2() { return cGroup_0_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_0_2_0() { return cExtendsKeyword_0_2_0; }
		
		//superType=[Literal|QualifiedName]
		public Assignment getSuperTypeAssignment_0_2_1() { return cSuperTypeAssignment_0_2_1; }
		
		//[Literal|QualifiedName]
		public CrossReference getSuperTypeLiteralCrossReference_0_2_1_0() { return cSuperTypeLiteralCrossReference_0_2_1_0; }
		
		//QualifiedName
		public RuleCall getSuperTypeLiteralQualifiedNameParserRuleCall_0_2_1_0_1() { return cSuperTypeLiteralQualifiedNameParserRuleCall_0_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0_3() { return cLeftCurlyBracketKeyword_0_3; }
		
		////	(literals = literals + Literal)*
		//literals+=Literal*
		public Assignment getLiteralsAssignment_0_4() { return cLiteralsAssignment_0_4; }
		
		//Literal
		public RuleCall getLiteralsLiteralParserRuleCall_0_4_0() { return cLiteralsLiteralParserRuleCall_0_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_0_5() { return cRightCurlyBracketKeyword_0_5; }
		
		//'datatype' name=ID
		public Group getGroup_1() { return cGroup_1; }
		
		//'datatype'
		public Keyword getDatatypeKeyword_1_0() { return cDatatypeKeyword_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_1_0() { return cNameIDTerminalRuleCall_1_1_0; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperTypeAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperTypeEntityCrossReference_2_1_0 = (CrossReference)cSuperTypeAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cSuperTypeEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFeaturesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFeaturesFeatureParserRuleCall_4_0 = (RuleCall)cFeaturesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	'entity' name=ID ('extends' superType=[Entity|QualifiedName])?
		//	'{'
		//	features+=Feature*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID ('extends' superType=[Entity|QualifiedName])? '{' features+=Feature* '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' superType=[Entity|QualifiedName])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//superType=[Entity|QualifiedName]
		public Assignment getSuperTypeAssignment_2_1() { return cSuperTypeAssignment_2_1; }
		
		//[Entity|QualifiedName]
		public CrossReference getSuperTypeEntityCrossReference_2_1_0() { return cSuperTypeEntityCrossReference_2_1_0; }
		
		//QualifiedName
		public RuleCall getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1() { return cSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//features+=Feature*
		public Assignment getFeaturesAssignment_4() { return cFeaturesAssignment_4; }
		
		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_4_0() { return cFeaturesFeatureParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cModifierAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cModifierVisibilityEnumRuleCall_0_0 = (RuleCall)cModifierAssignment_0.eContents().get(0);
		private final Assignment cManyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cManyManyKeyword_1_0 = (Keyword)cManyAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cTypeTypeCrossReference_4_0 = (CrossReference)cTypeAssignment_4.eContents().get(0);
		private final RuleCall cTypeTypeQualifiedNameParserRuleCall_4_0_1 = (RuleCall)cTypeTypeCrossReference_4_0.eContents().get(1);
		
		//Feature:
		//	modifier=Visibility? many?='many'? name=ID ':' type=[Type|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//modifier=Visibility? many?='many'? name=ID ':' type=[Type|QualifiedName]
		public Group getGroup() { return cGroup; }
		
		//modifier=Visibility?
		public Assignment getModifierAssignment_0() { return cModifierAssignment_0; }
		
		//Visibility
		public RuleCall getModifierVisibilityEnumRuleCall_0_0() { return cModifierVisibilityEnumRuleCall_0_0; }
		
		//many?='many'?
		public Assignment getManyAssignment_1() { return cManyAssignment_1; }
		
		//'many'
		public Keyword getManyManyKeyword_1_0() { return cManyManyKeyword_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//type=[Type|QualifiedName]
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//[Type|QualifiedName]
		public CrossReference getTypeTypeCrossReference_4_0() { return cTypeTypeCrossReference_4_0; }
		
		//QualifiedName
		public RuleCall getTypeTypeQualifiedNameParserRuleCall_4_0_1() { return cTypeTypeQualifiedNameParserRuleCall_4_0_1; }
	}
	
	public class VisibilityElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "co7217.xtext.entity.EntityDSL.Visibility");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPUBLICEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPUBLICPublicKeyword_0_0 = (Keyword)cPUBLICEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPRIVATEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPRIVATEPrivateKeyword_1_0 = (Keyword)cPRIVATEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cPROTECTEDEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cPROTECTEDProtectedKeyword_2_0 = (Keyword)cPROTECTEDEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Visibility:
		//	PUBLIC='public'
		//	| PRIVATE='private'
		//	| PROTECTED='protected';
		public EnumRule getRule() { return rule; }
		
		//PUBLIC='public' | PRIVATE='private' | PROTECTED='protected'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PUBLIC='public'
		public EnumLiteralDeclaration getPUBLICEnumLiteralDeclaration_0() { return cPUBLICEnumLiteralDeclaration_0; }
		
		//'public'
		public Keyword getPUBLICPublicKeyword_0_0() { return cPUBLICPublicKeyword_0_0; }
		
		//PRIVATE='private'
		public EnumLiteralDeclaration getPRIVATEEnumLiteralDeclaration_1() { return cPRIVATEEnumLiteralDeclaration_1; }
		
		//'private'
		public Keyword getPRIVATEPrivateKeyword_1_0() { return cPRIVATEPrivateKeyword_1_0; }
		
		//PROTECTED='protected'
		public EnumLiteralDeclaration getPROTECTEDEnumLiteralDeclaration_2() { return cPROTECTEDEnumLiteralDeclaration_2; }
		
		//'protected'
		public Keyword getPROTECTEDProtectedKeyword_2_0() { return cPROTECTEDProtectedKeyword_2_0; }
	}
	
	private final DomainmodelElements pDomainmodel;
	private final PackageDeclarationElements pPackageDeclaration;
	private final AbstractElementElements pAbstractElement;
	private final ImportElements pImport;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final QualifiedNameElements pQualifiedName;
	private final LiteralElements pLiteral;
	private final TypeElements pType;
	private final DataTypeElements pDataType;
	private final EntityElements pEntity;
	private final FeatureElements pFeature;
	private final VisibilityElements eVisibility;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EntityDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDomainmodel = new DomainmodelElements();
		this.pPackageDeclaration = new PackageDeclarationElements();
		this.pAbstractElement = new AbstractElementElements();
		this.pImport = new ImportElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pLiteral = new LiteralElements();
		this.pType = new TypeElements();
		this.pDataType = new DataTypeElements();
		this.pEntity = new EntityElements();
		this.pFeature = new FeatureElements();
		this.eVisibility = new VisibilityElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("co7217.xtext.entity.EntityDSL".equals(grammar.getName())) {
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

	
	//Domainmodel:
	//	elements+=AbstractElement*;
	public DomainmodelElements getDomainmodelAccess() {
		return pDomainmodel;
	}
	
	public ParserRule getDomainmodelRule() {
		return getDomainmodelAccess().getRule();
	}
	
	//PackageDeclaration:
	//	'package' name=QualifiedName '{'
	//	elements+=AbstractElement*
	//	'}';
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return pPackageDeclaration;
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}
	
	//AbstractElement:
	//	PackageDeclaration | Type | Import;
	public AbstractElementElements getAbstractElementAccess() {
		return pAbstractElement;
	}
	
	public ParserRule getAbstractElementRule() {
		return getAbstractElementAccess().getRule();
	}
	
	//Import:
	//	'import' importedNamespace=QualifiedNameWithWildcard;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.*'?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Literal:
	//	value=ID;
	public LiteralElements getLiteralAccess() {
		return pLiteral;
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}
	
	////Literal:
	////	name=ID;
	//Type:
	//	Literal | Entity | DataType;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//DataType:
	//	'enumeration'
	//	name=ID ('extends' superType=[Literal|QualifiedName])?
	//	'{'
	//	//	(literals = literals + Literal)*
	//	literals+=Literal*
	//	'}'
	//	| 'datatype' name=ID;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID ('extends' superType=[Entity|QualifiedName])?
	//	'{'
	//	features+=Feature*
	//	'}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Feature:
	//	modifier=Visibility? many?='many'? name=ID ':' type=[Type|QualifiedName];
	public FeatureElements getFeatureAccess() {
		return pFeature;
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}
	
	//enum Visibility:
	//	PUBLIC='public'
	//	| PRIVATE='private'
	//	| PROTECTED='protected';
	public VisibilityElements getVisibilityAccess() {
		return eVisibility;
	}
	
	public EnumRule getVisibilityRule() {
		return getVisibilityAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
