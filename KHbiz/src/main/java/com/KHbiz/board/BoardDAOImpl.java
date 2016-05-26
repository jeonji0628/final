package com.KHbiz.board;

import java.util.List;

import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private static final String Namespace = "BoardMapper.";
	
	@Override
	public void write(BoardDTO bdto) throws Exception {
		int num = sqlSession.insert(Namespace+"write",bdto);
		
	}
	@Override
	public void update(BoardDTO bdto) throws Exception {
		sqlSession.update(Namespace+"update",bdto);
		
	}
	@Override
	public void delete(int num) throws Exception {
		sqlSession.delete(Namespace+"delete",num);
	}
	@Override
	public List<BoardDTO> list(Paging p) throws Exception {
		List<BoardDTO> ar = sqlSession.selectList(Namespace+"list",p);
		return ar;
	}
	@Override
	public BoardDTO view(int num) throws Exception {		
		return sqlSession.selectOne(Namespace+"view",num);		
	}
	
	@Override
	public int totalList() throws Exception {		
		return sqlSession.selectOne(Namespace+"totalList");
	}
	@Override
	public List<BoardDTO> search(BoardSearch boardsearch) throws Exception {
		List<BoardDTO> ar = sqlSession.selectList(Namespace+"search",boardsearch);
		return ar;
	}
}
