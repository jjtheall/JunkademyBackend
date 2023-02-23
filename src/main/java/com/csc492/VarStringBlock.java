package com.csc492;

public class VarStringBlock extends CodeBlock{
	
	//TODO: maybe include name variable
	//pass in <name + " = " + parameter> in param slot of parameterized constructor 
	
	public VarStringBlock() {
		super("string","String ","",";","");
	}
	
	public VarStringBlock(String parameter) {
		super("string","String ",parameter,";","");
	}

}
