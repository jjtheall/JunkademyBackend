package com.csc492;

public class VarBoolBlock extends CodeBlock{
	
	//TODO: maybe include name variable
	//pass in <name + " = " + parameter> in param slot of parameterized constructor 
	
	public VarBoolBlock() {
		super("bool","boolean ","",";","");
	}
	
	public VarBoolBlock(String parameter) {
		super("bool","boolean ",parameter,";","");
	}

}
