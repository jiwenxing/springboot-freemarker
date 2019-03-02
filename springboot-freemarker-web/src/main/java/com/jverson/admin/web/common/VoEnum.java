package com.jverson.admin.web.common;

public enum VoEnum {
	SUCCESS(0, "成功"),
	EX(-1, "系统异常"),
	INVALID_PARAMS(-2, "参数异常"),
	BIZ_VALIDATE_FAILED(-3, "业务校验失败"),
	
	SWITCH_OPEN(999, "降级开关已打开");

	private int code;
	private String msg;

	private VoEnum(int code,  String msg) {
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
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
