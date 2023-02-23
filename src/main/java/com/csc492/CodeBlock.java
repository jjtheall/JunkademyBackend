package com.csc492;

public class CodeBlock {
	
	/*TODO: Blocks not implemented:
	 *  method
	 *  return
	 *  array var
	 *  for loop
	 *  user input
	 */

	private String id;
	private String preCode;
	private String parameter;
	private String postCode;
	private String executable;
	
	public CodeBlock() {
		super();
	}
	
	public CodeBlock(String id, String preCode, String parameter, String postCode, String executable) {
		this.id = id;
		this.preCode = preCode;
		this.parameter = parameter;
		this.postCode = postCode;
		this.executable = executable;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getPreCode() {
		return preCode;
	}

	public void setPreCode(String preCode) {
		this.preCode = preCode;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getExecutable() {
		return executable;
	}

	public void setExecutable(String executable) {
		this.executable = executable;
	}

	public String toString() {
		return(this.id + ": " + this.preCode + "<param>" + this.postCode + "{<executable>}");
	}

}
