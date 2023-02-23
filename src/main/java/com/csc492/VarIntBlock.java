package com.csc492;

public class VarIntBlock extends CodeBlock{
	
	//TODO: maybe include name variable
	//pass in <name + " = " + parameter> in param slot of parameterized constructor 
	
	public VarIntBlock() {
		super("int","int ","",";","");
	}
	
	public VarIntBlock(String parameter) {
		super("int","int ",parameter,";","");
	}

}
