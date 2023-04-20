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
			//System.out.println(curBlockDTO.getId() + " - " + curBlockDTO.getParam());
			switch(curBlockDTO.getId()) {
			case "print":
				PrintBlock newPrintBlock = new PrintBlock(curBlockDTO.getParam());
				codeBlocks.add(newPrintBlock);
				break;
			case "int":
				VarIntBlock newIntBlock = new VarIntBlock(curBlockDTO.getParam());
				codeBlocks.add(newIntBlock);
				break;
			case "double":
				VarDoubleBlock newDoubleBlock = new VarDoubleBlock(curBlockDTO.getParam());
				codeBlocks.add(newDoubleBlock);
				break;
			case "bool":
				VarBoolBlock newBoolBlock = new VarBoolBlock(curBlockDTO.getParam());
				codeBlocks.add(newBoolBlock);
				break;
			case "char":
				VarCharBlock newCharBlock = new VarCharBlock(curBlockDTO.getParam());
				codeBlocks.add(newCharBlock);
				break;
			case "string":
				VarStringBlock newStringBlock = new VarStringBlock(curBlockDTO.getParam());
				codeBlocks.add(newStringBlock);
				break;
			case "if":
				IfBlock newIfBlock = new IfBlock(curBlockDTO.getParam());
				codeBlocks.add(newIfBlock);
				break;
			case "else":
				ElseBlock newElseBlock = new ElseBlock(curBlockDTO.getParam());
				codeBlocks.add(newElseBlock);
				break;
			case "for":
				ForLoopBlock newForLoopBlock = new ForLoopBlock(curBlockDTO.getParam());
				codeBlocks.add(newForLoopBlock);
				break;
			case "while":
				WhileLoopBlock newWhileLoopBlock = new WhileLoopBlock(curBlockDTO.getParam());
				codeBlocks.add(newWhileLoopBlock);
				break;
			case "endif":
				EndIfBlock newEndIfBlock = new EndIfBlock();
				codeBlocks.add(newEndIfBlock);
				break;
			case "endelse":
				EndElseBlock newEndElseBlock = new EndElseBlock();
				codeBlocks.add(newEndElseBlock);
				break;
			case "endfor":
				EndForBlock newEndForBlock = new EndForBlock();
				codeBlocks.add(newEndForBlock);
				break;
			case "endwhile":
				EndWhileBlock newEndWhileBlock = new EndWhileBlock();
				codeBlocks.add(newEndWhileBlock);
				break;
			}
		}
		
		//System.out.println(codeBlockService.translateCodeBlocks(codeBlocks));
		return codeBlockService.translateCodeBlocks(codeBlocks);
	}

}
