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
		
		blockList.add(new ElseBlock());
		blockList.add(new IfBlock());
		blockList.add(new OpAddBlock());
		blockList.add(new OpAndBlock());
		blockList.add(new OpDivBlock());
		blockList.add(new OpEqualsBlock());
		blockList.add(new OpGreaterBlock());
		blockList.add(new OpLessBlock());
		blockList.add(new OpMultBlock());
		blockList.add(new OpNotBlock());
		blockList.add(new OpOrBlock());
		blockList.add(new OpSubBlock());
		blockList.add(new PrintBlock());
		blockList.add(new VarBoolBlock());
		blockList.add(new VarCharBlock());
		blockList.add(new VarIntBlock());
		blockList.add(new VarStringBlock());
		blockList.add(new WhileLoopBlock());
		blockList.add(new ForLoopBlock());
		
		return blockList;
	}
	
	@PostMapping
	@RequestMapping(path="/translatecodeblocks")
	@ResponseStatus(HttpStatus.OK)
	public String translateCodeBlocks(@RequestBody List<CodeBlock> codeBlocks) {
		return codeBlockService.translateCodeBlocks(codeBlocks);
	}

}
