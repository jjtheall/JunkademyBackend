package com.csc492;

public class CodeBlockDTO {
	
	private String name;
	private String blockValue;
	
	public CodeBlockDTO() {
		super();
	}
	
	public CodeBlockDTO(String name, String blockValue) {
		this.name = name;
		this.blockValue = blockValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlockValue() {
		return blockValue;
	}

	public void setBlockValue(String blockValue) {
		this.blockValue = blockValue;
	}
	
	

}
