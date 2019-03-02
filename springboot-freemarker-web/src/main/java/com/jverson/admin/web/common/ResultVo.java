package com.jverson.admin.web.common;

import java.util.List;


public class ResultVo<T> extends BaseVo {

	private static final long serialVersionUID = -7336716286909182971L;

	private T data;

	private List<T> list;

	public ResultVo() {
		super();
	}

	public ResultVo(VoEnum voEnum) {
		super(voEnum);
	}
	
	public ResultVo(int code, boolean success, String msg) {
		super(code, msg);
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public void reset(VoEnum voEnum){
		voEnum = voEnum != null ? voEnum : VoEnum.SUCCESS ;
		this.code = voEnum.getCode();
		this.msg = voEnum.getMsg();
		this.data = null;
		this.list = null;
	}

}
