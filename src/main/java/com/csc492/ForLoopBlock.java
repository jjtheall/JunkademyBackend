package com.csc492;

public class ForLoopBlock extends CodeBlock{
	
	public ForLoopBlock() {
		//default empty constructor has for loop that repeats 10 times
		super("for","for(int i=0; i<","10","; i++){","}");
	}
	
	public ForLoopBlock(String parameter) {
		super("for","for(int i=0; i<",parameter,"; i++){","");
	}
}
