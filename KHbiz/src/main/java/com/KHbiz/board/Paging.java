package com.KHbiz.board;

public class Paging {

	private String type;
	private int startRow;
	private int lastRow;
	private int startNum;
	private int lastNum;
	private int totalBlock;
	private int curBlock;
	private int perPage;
	private int perBlock;
	
	public void paging() {
		// TODO Auto-generated method stub
	}
	
	public Paging(int curpage, int totalList) {
		perPage = 10;
		perBlock = 10;
		setNumber(curpage, totalList);
	}
	
	private void setNumber(int curpage, int totalList){
		this.startRow = (curpage-1)*perPage+1;
		this.lastRow = curpage * perPage;
		int totalpage = sum(totalList, perPage);
		totalBlock = sum(totalpage, perBlock);
		curBlock = sum(curpage,perBlock);
		startNum = (curBlock-1)*perBlock+1;
		if(curBlock == totalBlock){
			lastNum = totalpage;
		}else{
			lastNum = curBlock*perBlock;
		}
		
	}

	private int sum(int num1, int num2){
		int num = 0;
		if(num1 % num2 == 0){
			num = num1 / num2;
		}else{
			num = num1 / num2 +1;
		}
		return num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getstartRow() {
		return startRow;
	}

	public void setstartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getlastRow() {
		return lastRow;
	}

	public void setlastRow(int lastRow) {
		this.lastRow = lastRow;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getLastNum() {
		return lastNum;
	}

	public void setLastNum(int lastNum) {
		this.lastNum = lastNum;
	}

	public int getTotalBlock() {
		return totalBlock;
	}

	public void setTotalBlock(int totalBlock) {
		this.totalBlock = totalBlock;
	}

	public int getCurBlock() {
		return curBlock;
	}

	public void setCurBlock(int curBlock) {
		this.curBlock = curBlock;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getPerBlock() {
		return perBlock;
	}

	public void setPerBlock(int perBlock) {
		this.perBlock = perBlock;
	}
	
	
	
	
}
