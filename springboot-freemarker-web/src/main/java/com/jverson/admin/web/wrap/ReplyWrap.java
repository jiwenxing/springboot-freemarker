package com.jverson.admin.web.wrap;

public class ReplyWrap {

	private Long id;
	
	//1，正常 5，沉底
	private Integer status;
	
	//0，普通用户；1，商家用户
	private Integer type;
	
	//0回复评论1回复回复
	private Integer replyType;
	
	//商家id
	private Integer vendorId;
	
	//回复内容
	private String content;
	
	//回复人账号
	private String replyAccount;
	
	//回复人账号
	private String replyDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getReplyType() {
		return replyType;
	}

	public void setReplyType(Integer replyType) {
		this.replyType = replyType;
	}

	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReplyAccount() {
		return replyAccount;
	}

	public void setReplyAccount(String replyAccount) {
		this.replyAccount = replyAccount;
	}

	public String getReplyDate() {
		return replyDate;
	}

	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}
	
	
	
}
