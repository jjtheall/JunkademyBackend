package com.csc492;

import java.util.ArrayList;
import java.util.List;

public class CodeBlockService {

	public CodeBlockService() {}
	
	//TODO: remove static from translateCodeBlocks
	//		remove main function
	
	public static String translateCodeBlocks(List<CodeBlock> codeBlocks) {
		//algorithm for converting blocks to text file
		String result = "public class App {\n\tpublic static void main(String[] args)\n\t\t";
		
		int intVars = 0;
		int doubleVars = 0;
		int boolVars = 0;
		int charVars = 0;
		int stringVars = 0;
		
		for(int i=0; i<codeBlocks.size(); i++) {
			CodeBlock curBlock = codeBlocks.get(i);
			switch(curBlock.getId()) {
			case "print":
				result += curBlock.getPreCode();
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "int":
				result += curBlock.getPreCode();
				intVars++;
				result += "int" + intVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "double":
				result += curBlock.getPreCode();
				doubleVars++;
				result += "double" + doubleVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "bool":
				result += curBlock.getPreCode();
				boolVars++;
				result += "bool" + boolVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "char":
				result += curBlock.getPreCode();
				charVars++;
				result += "char" + charVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n\t\t";
				break;
			case "string":
				result += curBlock.getPreCode();
				stringVars++;
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
		testList.add(new OpAddBlock());
		testList.add(new OpSubBlock());
		testList.add(new OpMultBlock());
		testList.add(new OpDivBlock());
		testList.add(new OpAndBlock());
		testList.add(new OpOrBlock());
		testList.add(new OpNotBlock());
		testList.add(new OpEqualsBlock());
		
		System.out.println(translateCodeBlocks(testList));
	}
}
