package com.KHbiz.workLog;

import java.util.List;

import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.KHbiz.board.BoardDTO;
import com.KHbiz.board.Paging;
@Repository
public class Division_workLogDAOImpl implements Division_workLogDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private static final String Namespace = "Division_workLogMapper.";
	
	@Override
	public List<Division_workLogDTO> list(Paging p) throws Exception {
		List<Division_workLogDTO> ar = sqlSession.selectList(Namespace+"list",p);
		return ar;
	}
	@Override
	public void write(Division_workLogDTO divisionworkLogDTO) throws Exception {
		sqlSession.insert(Namespace+"write",divisionworkLogDTO);
		
	}
	@Override
	public void update(Division_workLogDTO divisionworkLogDTO) throws Exception {
		sqlSession.update(Namespace+"update",divisionworkLogDTO);
		
	}
	
	@Override
	public void delete(int num) throws Exception {
		sqlSession.delete(Namespace+"delete",num);
		
	}
	
	@Override
	public Division_workLogDTO view(int num) throws Exception {
		return sqlSession.selectOne(Namespace+"view",num);
		
	}
}
