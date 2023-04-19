package com.csc492;

import java.util.ArrayList;
import java.util.List;

public class CodeBlockService {

	public CodeBlockService() {}
	
	public String translateCodeBlocks(List<CodeBlock> codeBlocks) {
		//algorithm for converting blocks to text file
		String result = "public class App {\n\tpublic static void main(String[] args) {\n";
		
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
		
		int indentCounter = 2;
		
		for(int i=0; i<codeBlocks.size(); i++) {
			for(int j=0; j<indentCounter; j++) {
				result += "\t";
			}
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
				result += "\n";
				break;
			case "int":
				result += curBlock.getPreCode();
				intVars++;
				intVarNames.add("int" + intVars);
				result += "int" + intVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n";
				break;
			case "double":
				result += curBlock.getPreCode();
				doubleVars++;
				doubleVarNames.add("double" + doubleVars);
				result += "double" + doubleVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n";
				break;
			case "bool":
				result += curBlock.getPreCode();
				boolVars++;
				boolVarNames.add("bool" + boolVars);
				result += "bool" + boolVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n";
				break;
			case "char":
				result += curBlock.getPreCode();
				charVars++;
				charVarNames.add("char" + charVars);
				result += "char" + charVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n";
				break;
			case "string":
				result += curBlock.getPreCode();
				stringVars++;
				stringVarNames.add("string" + stringVars);
				result += "string" + stringVars + " = ";
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += curBlock.getExecutable();
				result += "\n";
				break;
			case "if":
				indentCounter++;
				result += curBlock.getPreCode();
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += "\n";
				break;
			case "else":
				indentCounter++;
				result += curBlock.getPreCode();
				result += "\n";
				break;
			case "for":
				indentCounter++;
				result += curBlock.getPreCode();
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += "\n";
				break;
			case "while":
				indentCounter++;
				result += curBlock.getPreCode();
				result += curBlock.getParameter();
				result += curBlock.getPostCode();
				result += "\n";
				break;
			case "endif":
				indentCounter--;
				result = result.substring(0, result.lastIndexOf("\t")) + "}\n";
				break;
			case "endelse":
				indentCounter--;
				result = result.substring(0, result.lastIndexOf("\t")) + "}\n";
				break;
			case "endfor":
				indentCounter--;
				result = result.substring(0, result.lastIndexOf("\t")) + "}\n";
				break;
			case "endwhile":
				indentCounter--;
				result = result.substring(0, result.lastIndexOf("\t")) + "}\n";
				break;
			default:
				System.out.println("*** unrecognized block ***");
				break;
			}
		}
		
		result += "\t}\n}";
		return result;
	}
}
