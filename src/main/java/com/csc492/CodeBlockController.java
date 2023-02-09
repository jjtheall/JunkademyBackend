package com.csc492;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@RestController
public class CodeBlockController {
	
	private CodeBlockService codeBlockService;
	
	@GetMapping("/")
	public String root() {
		return "root";
	}
	
	@GetMapping("/home")
	public String homepageText() {
		return "Junkademy Homepage";
	}
	
	@GetMapping("/codeblock")
	public List<CodeBlock> codeBlockTest() {
		List<CodeBlock> blockList = new ArrayList<CodeBlock>();
		
		blockList.add(new CodeBlock(1));
		blockList.add(new CodeBlock(2));
		blockList.add(new CodeBlock(3));
		blockList.add(new CodeBlock(4));
		blockList.add(new CodeBlock(5));
		
		return blockList;
	}
	
	@PostMapping
	@RequestMapping(path="/translatecodeblocks")
	@ResponseStatus(HttpStatus.OK)
	public String translateCodeBlocks(@RequestBody List<CodeBlock> codeBlocks) {
		return codeBlockService.translateCodeBlocks(codeBlocks);
	}

}
