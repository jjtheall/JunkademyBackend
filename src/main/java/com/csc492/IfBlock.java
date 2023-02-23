package com.csc492;

public class IfBlock extends CodeBlock{
	
	public IfBlock() {
		super("if","if(","","){","}");
	}
	
	public IfBlock(String parameter, String executable) {
		super("if","if(",parameter,"){",executable + "}");
	}

}
