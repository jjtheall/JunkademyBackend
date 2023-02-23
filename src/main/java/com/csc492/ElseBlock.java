package com.csc492;

public class ElseBlock extends CodeBlock{

	public ElseBlock() {
		super("else","else{","","","}");
	}
	
	public ElseBlock(String executable) {
		super("else","else{","","",executable + "}");
	}
}
