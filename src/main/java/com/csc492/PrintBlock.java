package com.csc492;

public class PrintBlock extends CodeBlock{
	
	public PrintBlock() {
		super("print", "System.out.println(\"","","\");","");
	}
	
	public PrintBlock(String parameter) {
		super("print", "System.out.println(",parameter,");","");
	}

}
