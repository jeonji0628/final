package com.KHbiz.workLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Division_workLogServiceImpl implements Division_workLogService {

	@Autowired
	private Division_workLogDAO ddao;
	
}
