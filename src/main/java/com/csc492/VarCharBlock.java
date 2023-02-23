package com.csc492;

public class VarCharBlock extends CodeBlock{
	
	//TODO: maybe include name variable
	//pass in <name + " = " + parameter> in param slot of parameterized constructor 
	
	public VarCharBlock() {
		super("char","char ","",";","");
	}
	
	public VarCharBlock(String parameter) {
		super("char","char ",parameter,";","");
	}

}
