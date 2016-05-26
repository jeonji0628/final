package com.KHbiz.workLog;

import java.sql.Date;

public class Division_workLogDTO {

	private String division;
	private String dailyPlan;
	private String dailyResult;
	private String noted;
	private String state;
	private String upload;
	private Date reg_date;
	private String id;
	private String position;
	private String job;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getDailyPlan() {
		return dailyPlan;
	}
	public void setDailyPlan(String dailyPlan) {
		this.dailyPlan = dailyPlan;
	}
	public String getDailyResult() {
		return dailyResult;
	}
	public void setDailyResult(String dailyResult) {
		this.dailyResult = dailyResult;
	}
	public String getNoted() {
		return noted;
	}
	public void setNoted(String noted) {
		this.noted = noted;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getUpload() {
		return upload;
	}
	public void setUpload(String upload) {
		this.upload = upload;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
}
