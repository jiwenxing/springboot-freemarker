package com.jverson.admin.web.common;

import java.io.Serializable;
import java.util.List;

public class PageVo<T> implements Serializable{
	private static final long serialVersionUID = 971308842684796466L;
    private int total;
//  从第0页开始
	private int pageNum;
	private int pageSize;
    private List<T> list;
    
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * 计算是否有下一页
	 * @return
	 */
	public boolean getHasPreviousPage(){
		if (pageSize*(pageNum+1)>total){
			return false;
		}else {
			return true;
		}
	}
}
