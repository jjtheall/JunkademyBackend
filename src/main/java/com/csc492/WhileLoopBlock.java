package com.csc492;

public class WhileLoopBlock extends CodeBlock{
	
	public WhileLoopBlock() {
		super("while","while(","","){","}");
	}
	
	public WhileLoopBlock(String parameter, String executable) {
		super("while","while(",parameter,"){",executable + "}");
	}

}
