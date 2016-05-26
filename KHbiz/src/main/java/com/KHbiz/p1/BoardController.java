package com.KHbiz.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.KHbiz.board.BoardDTO;
import com.KHbiz.board.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private com.KHbiz.board.BoardService boardService;
	
	@RequestMapping(value="/write",method=RequestMethod.GET)
	public void writeFrom(){}
	
	@RequestMapping(value="/write",method=RequestMethod.POST)
	public String write(@ModelAttribute com.KHbiz.board.BoardDTO bdto){
		boardService.write(bdto);
		return "redirect:/board/list?curpage=1";
	}
	
	 
	
}
