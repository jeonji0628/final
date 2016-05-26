package com.KHbiz.workLog;

import java.util.List;

import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.KHbiz.workLog.WorkLogDTO;
@Repository
public class WorkLogDAOImpl implements WorkLogDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private static final String Namespace = "WorkLogMapper.";
	
@Override
public WorkLogDTO write(WorkLogDTO wdto) throws Exception {
	// TODO Auto-generated method stub
	return null;
}
@Override
	public WorkLogDTO view(int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	} 
@Override
	public void update(WorkLogDTO wdto) throws Exception {
		// TODO Auto-generated method stub
		
	} 
@Override
	public List<WorkLogDTO> list() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
@Override
	public String delete(int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
