package com.csc492;

public class VarDoubleBlock extends CodeBlock{
	//TODO: maybe include name variable
	//pass in <name + " = " + parameter> in param slot of parameterized constructor 
	
	public VarDoubleBlock() {
		super("double","double ","",";","");
	}
	
	public VarDoubleBlock(String parameter) {
		super("double","double ",parameter,";","");
	}
}
