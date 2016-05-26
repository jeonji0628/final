package com.KHbiz.board;

import java.util.List;

public interface BoardDAO {

	//글쓰기
	public void write(BoardDTO bdto) throws Exception;
	//글수정
	public void update(BoardDTO bdto) throws Exception;
	//글 삭제
	public void delete(int num) throws Exception;
	//글보기 
	public BoardDTO view(int num) throws Exception;
	//목록보기
	public List<BoardDTO> list(Paging p) throws Exception;	
	//총 게시물수
	public int totalList() throws Exception;
	//검색
	public List<BoardDTO> search(BoardSearch boardsearch) throws Exception;
	
}
