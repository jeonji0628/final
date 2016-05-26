package com.KHbiz.board;

import org.springframework.ui.Model;

public interface BoardService {

	public void list(int curpage, Model model, String kind);
	
	public void write(BoardDTO bdto);
	
	public void view(int num, Model model);
	
	public void search(Model model,BoardSearch boardsearch);
	
	public void update(BoardDTO bdto);
	
	public void delete(int num);
	
}
