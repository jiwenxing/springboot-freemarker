package com.jverson.admin.web.wrap;

import java.util.List;

public class Discussion  {

		private String guid;
		private Long commentId;
		private Integer commentType;
		private Long associateId;
		private String pin;
		private Integer anonymousFlag;
		private Integer orderStatus;
		private String originalText;
		private String text;
		private Integer score;
		private Long recommentId;
		private Integer raiseCount;
		private Integer replyCount;
		private Long orderId;
		private Integer topStatus;
		private Integer textStatus;
		private Integer imageStatus;
		private Integer videoStatus;
		private List<ImageWrap> imageVos;
		private String auditNote;
		private Integer auditType;
		private Integer textRewardNum;
		private Integer textRewardStatus;
		private Integer imageRewardNum;
		private Integer imageRewardStatus;
		private String buyTime;
		private String productDesc;
		private Integer bizType;
		private String created;
		private String modified;

		private String clientCode;
		private Integer clientType;
		private String userIp;
	
		private String associateName;
		private Integer categoryOne;
		private Integer categoryTwo;
		private Integer categoryThree;
		private Long parentId;
		
		private Integer scoreLevel;
		private Integer recommentFlag;
		private Integer textLength;
//		private Integer rewardStatus;
		
		private String userNickName;
		private Integer userLevel;
		
		private String buyStartDate;
		private String buyEndDate;
		private String commentStartDate;
		private String commentEndDate;
		private Integer pageNum;
		private Integer pageSize;
		
		private String erp;
		
		private Long shopId;
	
	private String createdTh; 

	private String textStatusArr;

	private String replyStatusArr;
	
	private List<ReplyWrap> replys;
	
	public String getCreatedTh() {
		return createdTh;
	}

	public void setCreatedTh(String createdTh) {
		this.createdTh = createdTh;
	}

	public String getTextStatusArr() {
		return textStatusArr;
	}

	public void setTextStatusArr(String textStatusArr) {
		this.textStatusArr = textStatusArr;
	}

	public String getReplyStatusArr() {
		return replyStatusArr;
	}

	public void setReplyStatusArr(String replyStatusArr) {
		this.replyStatusArr = replyStatusArr;
	}

	public List<ReplyWrap> getReplys() {
		return replys;
	}

	public void setReplys(List<ReplyWrap> replys) {
		this.replys = replys;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Integer getCommentType() {
		return commentType;
	}

	public void setCommentType(Integer commentType) {
		this.commentType = commentType;
	}

	public Long getAssociateId() {
		return associateId;
	}

	public void setAssociateId(Long associateId) {
		this.associateId = associateId;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Integer getAnonymousFlag() {
		return anonymousFlag;
	}

	public void setAnonymousFlag(Integer anonymousFlag) {
		this.anonymousFlag = anonymousFlag;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOriginalText() {
		return originalText;
	}

	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Long getRecommentId() {
		return recommentId;
	}

	public void setRecommentId(Long recommentId) {
		this.recommentId = recommentId;
	}

	public Integer getRaiseCount() {
		return raiseCount;
	}

	public void setRaiseCount(Integer raiseCount) {
		this.raiseCount = raiseCount;
	}

	public Integer getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getTopStatus() {
		return topStatus;
	}

	public void setTopStatus(Integer topStatus) {
		this.topStatus = topStatus;
	}

	public Integer getTextStatus() {
		return textStatus;
	}

	public void setTextStatus(Integer textStatus) {
		this.textStatus = textStatus;
	}

	public Integer getImageStatus() {
		return imageStatus;
	}

	public void setImageStatus(Integer imageStatus) {
		this.imageStatus = imageStatus;
	}

	public Integer getVideoStatus() {
		return videoStatus;
	}

	public void setVideoStatus(Integer videoStatus) {
		this.videoStatus = videoStatus;
	}

	public List<ImageWrap> getImageVos() {
		return imageVos;
	}

	public void setImageVos(List<ImageWrap> imageVos) {
		this.imageVos = imageVos;
	}

	public String getAuditNote() {
		return auditNote;
	}

	public void setAuditNote(String auditNote) {
		this.auditNote = auditNote;
	}

	public Integer getAuditType() {
		return auditType;
	}

	public void setAuditType(Integer auditType) {
		this.auditType = auditType;
	}

	public Integer getTextRewardNum() {
		return textRewardNum;
	}

	public void setTextRewardNum(Integer textRewardNum) {
		this.textRewardNum = textRewardNum;
	}

	public Integer getTextRewardStatus() {
		return textRewardStatus;
	}

	public void setTextRewardStatus(Integer textRewardStatus) {
		this.textRewardStatus = textRewardStatus;
	}

	public Integer getImageRewardNum() {
		return imageRewardNum;
	}

	public void setImageRewardNum(Integer imageRewardNum) {
		this.imageRewardNum = imageRewardNum;
	}

	public Integer getImageRewardStatus() {
		return imageRewardStatus;
	}

	public void setImageRewardStatus(Integer imageRewardStatus) {
		this.imageRewardStatus = imageRewardStatus;
	}

	public String getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(String buyTime) {
		this.buyTime = buyTime;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public Integer getBizType() {
		return bizType;
	}

	public void setBizType(Integer bizType) {
		this.bizType = bizType;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getModified() {
		return modified;
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public Integer getClientType() {
		return clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public String getAssociateName() {
		return associateName;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public Integer getCategoryOne() {
		return categoryOne;
	}

	public void setCategoryOne(Integer categoryOne) {
		this.categoryOne = categoryOne;
	}

	public Integer getCategoryTwo() {
		return categoryTwo;
	}

	public void setCategoryTwo(Integer categoryTwo) {
		this.categoryTwo = categoryTwo;
	}

	public Integer getCategoryThree() {
		return categoryThree;
	}

	public void setCategoryThree(Integer categoryThree) {
		this.categoryThree = categoryThree;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getScoreLevel() {
		return scoreLevel;
	}

	public void setScoreLevel(Integer scoreLevel) {
		this.scoreLevel = scoreLevel;
	}

	public Integer getRecommentFlag() {
		return recommentFlag;
	}

	public void setRecommentFlag(Integer recommentFlag) {
		this.recommentFlag = recommentFlag;
	}

	public Integer getTextLength() {
		return textLength;
	}

	public void setTextLength(Integer textLength) {
		this.textLength = textLength;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public Integer getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Integer userLevel) {
		this.userLevel = userLevel;
	}

	public String getBuyStartDate() {
		return buyStartDate;
	}

	public void setBuyStartDate(String buyStartDate) {
		this.buyStartDate = buyStartDate;
	}

	public String getBuyEndDate() {
		return buyEndDate;
	}

	public void setBuyEndDate(String buyEndDate) {
		this.buyEndDate = buyEndDate;
	}

	public String getCommentStartDate() {
		return commentStartDate;
	}

	public void setCommentStartDate(String commentStartDate) {
		this.commentStartDate = commentStartDate;
	}

	public String getCommentEndDate() {
		return commentEndDate;
	}

	public void setCommentEndDate(String commentEndDate) {
		this.commentEndDate = commentEndDate;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getErp() {
		return erp;
	}

	public void setErp(String erp) {
		this.erp = erp;
	}

	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

}
