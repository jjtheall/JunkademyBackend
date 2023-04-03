package com.csc492;

import java.util.ArrayList;
import java.util.List;

public class CodeBlockService {

	public CodeBlockService() {}
	
	//TODO: remove static from translateCodeBlocks
	//		remove main function
	
	public static String translateCodeBlocks(List<CodeBlock> codeBlocks) {
		//algorithm for converting blocks to text file
		String result = "public class App {\n\tpublic static void main(String[] args) {\n\t\t";
		
		int intVars = 0;
		int doubleVars = 0;
		int boolVars = 0;
		int charVars = 0;
		int stringVars = 0;
		
		List<String> intVarNames = new ArrayList<String>();
		List<String> doubleVarNames = new ArrayList<String>();
		List<String> boolVarNames = new ArrayList<String>();
		List<String> charVarNames = new ArrayList<String>();
		List<String> stringVarNames = new ArrayList<String>();
		
		for(int i=0; i<codeBlocks.size(); i++) {
			CodeBlock curBlock = codeBlocks.get(i);
			switch(curBlock.getId()) {
			case "print":
				result += curBlock.getPreCode();
				if(intVarNames.contains(curBlock.getParameter()) || doubleVarNames.contains(curBlock.getParameter()) || boolVarNames.contains(curBlock.getParameter()) || charVarNames.contains(curBlock.getParameter()) || stringVarNames.contains(curBlock.getParameter())) {
					result += curBlock.getParameter();
				}
				else {
					result += "\"" + curBlock.getParameter() + "\"";
				}
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "int":
				result += curBlock.getPreCode();
				intVars++;
				intVarNames.add("int" + intVars);
				result += "int" + intVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "double":
				result += curBlock.getPreCode();
				doubleVars++;
				doubleVarNames.add("double" + doubleVars);
				result += "double" + doubleVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "bool":
				result += curBlock.getPreCode();
				boolVars++;
				boolVarNames.add("bool" + boolVars);
				result += "bool" + boolVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "char":
				result += curBlock.getPreCode();
				charVars++;
				charVarNames.add("char" + charVars);
				result += "char" + charVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "string":
				result += curBlock.getPreCode();
				stringVars++;
				stringVarNames.add("string" + stringVars);
				result += "string" + stringVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "if":
				break;
			case "else":
				break;
			case "for":
				break;
			case "while":
				break;
			case "addition":
				result += curBlock.getParameter();
				break;
			case "subtraction":
				result += curBlock.getParameter();
				break;
			case "multiplication":
				result += curBlock.getParameter();
				break;
			case "division":
				result += curBlock.getParameter();
				break;
			case "and":
				result += curBlock.getParameter();
				break;
			case "or":
				result += curBlock.getParameter();
				break;
			case "equals":
				result += curBlock.getParameter();
				break;
			case "not":
				result += curBlock.getParameter();
				break;
			case "greaterThan":
				result += curBlock.getParameter();
				break;
			case "lessThan":
				result += curBlock.getParameter();
				break;
			default:
				System.out.println("*** unrecognized block ***");
				break;
			}
		}
		
		result += "\n\t}\n}";
		return result;
	}
	
	public static void main(String[] args) {
		List<CodeBlock> testList = new ArrayList<CodeBlock>();
		
		testList.add(new VarIntBlock("4"));
		testList.add(new VarIntBlock("5"));
		testList.add(new VarDoubleBlock("4.1"));
		testList.add(new VarDoubleBlock("5.3"));
		testList.add(new VarBoolBlock("true"));
		testList.add(new VarCharBlock("g"));
		testList.add(new VarStringBlock("this is a string"));
		testList.add(new PrintBlock("Hello World"));
		testList.add(new PrintBlock("int1"));
		testList.add(new PrintBlock("double1"));
		testList.add(new PrintBlock("bool1"));
		testList.add(new PrintBlock("char1"));
		testList.add(new PrintBlock("string1"));
		testList.add(new PrintBlock("int10"));
		/*
		testList.add(new OpAddBlock());
		testList.add(new OpSubBlock());
		testList.add(new OpMultBlock());
		testList.add(new OpDivBlock());
		testList.add(new OpAndBlock());
		testList.add(new OpOrBlock());
		testList.add(new OpNotBlock());
		testList.add(new OpEqualsBlock());
		*/
		
		System.out.println(translateCodeBlocks(testList));
	}
}
