package com.KHbiz.workLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkLogServiceImpl implements WorkLogService {

	@Autowired
	private WorkLogDAO wdao;
	
}
