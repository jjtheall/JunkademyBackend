package com.csc492;

import java.util.List;

public class CodeBlockService {

	public CodeBlockService() {}
	
	public String translateCodeBlocks(List<CodeBlock> codeBlocks) {
		//algorithm for converting blocks to text file
		String result = "";
		
		for(int i=0; i<codeBlocks.size(); i++) {
			result += "" + codeBlocks.get(i);
		}
		
		return result;
	}
}
