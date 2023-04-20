package com.csc492;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

@RestController
public class CodeBlockController {
	
	private CodeBlockService codeBlockService = new CodeBlockService();
	
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
	@CrossOrigin(origins = "http://localhost:3000")
	@ResponseStatus(HttpStatus.OK)
	public String translateCodeBlocks(@RequestBody List<CodeBlockDTO> codeBlockDTOs) {
		List<CodeBlock> codeBlocks = new ArrayList<CodeBlock>();
		
		for(int i=0; i<codeBlockDTOs.size(); i++) {
			CodeBlockDTO curBlockDTO = codeBlockDTOs.get(i);
			//System.out.println(curBlockDTO.getId() + " - " + curBlockDTO.getBlockValue());
			switch(curBlockDTO.getName()) {
			case "Print":
				PrintBlock newPrintBlock = new PrintBlock(curBlockDTO.getBlockValue());
				codeBlocks.add(newPrintBlock);
				break;
			case "Integer":
				VarIntBlock newIntBlock = new VarIntBlock(curBlockDTO.getBlockValue());
				codeBlocks.add(newIntBlock);
				break;
			case "Double":
				VarDoubleBlock newDoubleBlock = new VarDoubleBlock(curBlockDTO.getBlockValue());
				codeBlocks.add(newDoubleBlock);
				break;
			case "Boolean":
				VarBoolBlock newBoolBlock = new VarBoolBlock(curBlockDTO.getBlockValue());
				codeBlocks.add(newBoolBlock);
				break;
			case "Character":
				VarCharBlock newCharBlock = new VarCharBlock(curBlockDTO.getBlockValue());
				codeBlocks.add(newCharBlock);
				break;
			case "String":
				VarStringBlock newStringBlock = new VarStringBlock(curBlockDTO.getBlockValue());
				codeBlocks.add(newStringBlock);
				break;
			case "If":
				IfBlock newIfBlock = new IfBlock(curBlockDTO.getBlockValue());
				codeBlocks.add(newIfBlock);
				break;
			case "Else":
				ElseBlock newElseBlock = new ElseBlock(curBlockDTO.getBlockValue());
				codeBlocks.add(newElseBlock);
				break;
			case "For Loop":
				ForLoopBlock newForLoopBlock = new ForLoopBlock(curBlockDTO.getBlockValue());
				codeBlocks.add(newForLoopBlock);
				break;
			case "While Loop":
				WhileLoopBlock newWhileLoopBlock = new WhileLoopBlock(curBlockDTO.getBlockValue());
				codeBlocks.add(newWhileLoopBlock);
				break;
			case "End If":
				EndIfBlock newEndIfBlock = new EndIfBlock();
				codeBlocks.add(newEndIfBlock);
				break;
			case "End Else":
				EndElseBlock newEndElseBlock = new EndElseBlock();
				codeBlocks.add(newEndElseBlock);
				break;
			case "End For Loop":
				EndForBlock newEndForBlock = new EndForBlock();
				codeBlocks.add(newEndForBlock);
				break;
			case "End While Loop":
				EndWhileBlock newEndWhileBlock = new EndWhileBlock();
				codeBlocks.add(newEndWhileBlock);
				break;
			}
		}
		
		//System.out.println(codeBlockService.translateCodeBlocks(codeBlocks));
		return codeBlockService.translateCodeBlocks(codeBlocks);
	}

}
