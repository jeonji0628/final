package com.KHbiz.workLog;

import java.util.List;

import com.KHbiz.board.Paging;

public interface Division_workLogDAO {

	//글 쓰기
	public void write(Division_workLogDTO divisionworkLogDTO) throws Exception;
	//수정
	public void update(Division_workLogDTO divisionworkLogDTO) throws Exception;
	//삭제
	public void delete(int num) throws Exception;
	//보기
	public Division_workLogDTO view(int num) throws Exception;
	//목록
	public List<Division_workLogDTO> list(Paging p) throws Exception;
}
