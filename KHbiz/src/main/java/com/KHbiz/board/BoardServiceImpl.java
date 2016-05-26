package com.KHbiz.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO bdao;

	@Override
	public void list(int curpage, Model model, String kind) {
		try {
			int totalList = bdao.totalList();
			Paging p = new Paging(curpage, totalList);
			p.setType(kind);
			model.addAttribute("page",p);
			model.addAttribute("list",bdao.list(p));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	@Override
	public void write(BoardDTO bdto) {
		try {
			bdao.write(bdto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public void delete(int num) {
		try {
			bdao.delete(num);
	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void update(BoardDTO bdto) {
		try {
			bdao.update(bdto);			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
	@Override
	public void search(Model model,BoardSearch boardsearch) {
		try {
			model.addAttribute("list",bdao.search(boardsearch));
			Paging p = new Paging(1, bdao.totalList());
			model.addAttribute("page",p);
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	@Override
	public void view(int num, Model model) {
		try {
			model.addAttribute(bdao.view(num));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
