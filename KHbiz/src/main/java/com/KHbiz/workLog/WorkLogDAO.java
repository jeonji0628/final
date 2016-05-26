package com.KHbiz.workLog;

import java.util.List;

import com.KHbiz.workLog.WorkLogDTO;

public interface WorkLogDAO {

	//개인업무일지 쓰기 
	public WorkLogDTO write(WorkLogDTO wdto) throws Exception; 
	// 보기 
	public WorkLogDTO view(int num) throws Exception;	
	//개인업무일지 수정
	public void update(WorkLogDTO bdto) throws Exception;
	//목록보기
	public List<WorkLogDTO> list() throws Exception;
	//삭제
	public String delete(int num) throws Exception;
	
}
