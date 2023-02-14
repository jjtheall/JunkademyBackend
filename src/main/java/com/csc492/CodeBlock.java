package com.csc492;

public class CodeBlock {

	private int data;
	
	public CodeBlock(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public String toString() {
		return ("CodeBlock: " + this.data);
	}

}
