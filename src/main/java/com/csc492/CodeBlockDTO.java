package com.csc492;

public class CodeBlockDTO {
	
	private String id;
	private String param;
	
	public CodeBlockDTO() {
		super();
	}
	
	public CodeBlockDTO(String id, String param) {
		this.id = id;
		this.param = param;
	}
	
	public String getId() {
		return id;
	}
	
	public String getParam() {
		return param;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setParam(String param) {
		this.param = param;
	}

}
