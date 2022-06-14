package org.zerock.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private Logger logger = LogManager.getLogger(BoardController.class);
	
	@GetMapping("/list")
	public void list(Model model) {
		
		logger.info("list..............");
		model.addAttribute("list", service.getList());
	}
	
	@PostMapping("/register")
	public void register(BoardVO board) {
		logger.info("board: " + board);
		
		Long bno = service.register(board);
		
		logger.info("BNO: "+bno);
	}
	

}
