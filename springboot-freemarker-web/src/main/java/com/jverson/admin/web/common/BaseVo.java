package com.jverson.admin.web.common;

import java.io.Serializable;



public class BaseVo implements Serializable {
	
	private static final long serialVersionUID = 570426800006802576L;

	/**
	 * 成功0，系统异常-1，
	 */
	protected int code;

	/**
	 * 成功，系统异常
	 */
	protected String msg;

	public BaseVo() {
		super();
	}
	
	public BaseVo(VoEnum voEnum) {
		super();
		this.code = voEnum.getCode();
		this.msg = voEnum.getMsg();
	}
	
	public BaseVo(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public boolean isSuccess() {
		return this.code==0;
	}
	public boolean isFailed() {
		return this.code!=0;
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void copyBaseInfo(BaseVo baseVo){
		this.code = baseVo.getCode();
		this.msg = baseVo.getMsg();
	}
}
