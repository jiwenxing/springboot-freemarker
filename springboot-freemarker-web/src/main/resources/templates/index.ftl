<!DOCTYPE html>
<html lang="en">
<head>
<#import "/spring.ftl" as spring>
<meta charset="utf-8">
<title>Springboot Freemarker</title>
<link href="//jverson.com/favicon.ico" type="image/x-icon"
	rel="shortcut icon">
<link rel="stylesheet" href="/css/bootstrap.min.css" />
</head>
<body>

	<div class="container-fluid" style="padding-top: 15px;">
		<div class="panel panel-default">
			<div class="panel-heading"><@spring.message "index.title"/>  <span class="language"><a href="?lang=en_US">English(US)</a><a href="?lang=zh_CN">简体中文</a></span></div>
			<div class="panel-body">
				<form class="form-horizontal" id="search">
					<div class="form-group">
						<label for="categoryId" class="col-sm-1 control-label"><@spring.message "index.search.cat"/></label>
						<div class="col-sm-1">
							<select class="form-control" name="categoryOne">
								<option value=""><@spring.message "index.search.cat.one"/></option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
							</select>
						</div>
						<div class="col-sm-1">
							<select class="form-control" name="categoryTwo">
								<option value=""><@spring.message "index.search.cat.two"/></option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
							</select>
						</div>
						<div class="col-sm-1">
							<select class="form-control" name="categoryThree">
								<option value=""><@spring.message "index.search.cat.three"/></option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
							</select>
						</div>
						<label for="associateId" class="col-sm-1 control-label"><@spring.message "index.search.skuId"/></label>
						<div class="col-sm-1">
							<input type="text" class="form-control" name="associateId">
						</div>
						<label for="associateName" class="col-sm-1 control-label"><@spring.message "index.search.skuName"/></label>
						<div class="col-sm-2">
							<input type="text" class="form-control" name="associateName">
						</div>
					</div>
					<div class="form-group">
						<label for="venderId" class="col-sm-1 control-label"><@spring.message "index.search.vendorId"/></label>
						<div class="col-sm-1">
							<input type="text" class="form-control" name="vendorId">
						</div>
						<label for="venderType" class="col-sm-1 control-label"><@spring.message "index.search.vendorType"/></label>
						<div class="col-sm-3" id="isPop">
							<label class="checkbox-inline"> <input type="checkbox" name="vendorType" value="1"> <@spring.message "index.search.vendorType.tmall"/> </label> 
							<label class="checkbox-inline"> <input type="checkbox" name="vendorType" value="2"> <@spring.message "index.search.vendorType.pop"/> </label> 
						</div>
					</div>
					<div class="form-group">
					    <label for="time" class="col-sm-1 control-label"><@spring.message "index.search.auditStatus"/></label>
						<div class="col-sm-3" id="textStatus">
							<label class="checkbox-inline"> <input type="checkbox"  value="1" name="textStatusArr"><@spring.message "index.search.audit.done"/></label>
							<label class="checkbox-inline"> <input type="checkbox"  value="2" name="textStatusArr"><@spring.message "index.search.audit.waiting"/></label> 
							<label class="checkbox-inline"> <input type="checkbox"  value="-1" name="textStatusArr"><@spring.message "index.search.audit.del"/></label> 
						</div>
						<label for="time" class="col-sm-1 control-label"><@spring.message "index.search.comment.time"/></label>
						<div class="col-sm-2">
							<input type="text" class="form-control date-time" id="s_sdate" placeholder="start time" name="commentStartDate">
						</div>
						<div class="col-sm-2">
							<input type="text" class="form-control date-time" id="s_edate" placeholder="end time" name="commentEndDate">
						</div>
					</div>
					
					<div class="form-group">
						<label for="" class="col-sm-1 control-label"><@spring.message "index.search.score.level"/></label>
						<div class="col-sm-1">
							<select class="form-control" name="scoreLevel">
								<option value=""><@spring.message "index.search.select.choose"/></option>
								<option value="1"><@spring.message "index.search.score.good"/></option>
								<option value="2"><@spring.message "index.search.score.general"/></option>
								<option value="3"><@spring.message "index.search.score.bad"/></option>
							</select>
						</div>
						<label for="" class="col-sm-1 control-label"><@spring.message "index.search.content.keyword"/></label>
						<div class="col-sm-2">
							<input type="text" class="form-control" name="text">
						</div>
					</div>
					
					<div class="form-group">
						<div class="col-sm-offset-1 col-sm-12">
							<button type="button" class="btn btn-info right-space" id="searchBtn"><@spring.message "index.search.btn"/></button>
							<button type="button" class="btn btn-danger" id="resetBtn"><@spring.message "index.search.reset"/></button>
						</div>
					</div>
				</form>
                    
				
			</div>
		</div>
		<div id="dataList" class="content">
		</div>
	</div>

	<!-- 模态框（Modal） -->
	<div class="modal fade" id="replyModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	    <input type="hidden" id="cur-comment-id" />
	    <input type="hidden" id="cur-comment-pin" />
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
						&times;
					</button>
					<h4 class="modal-title" id="myModalLabel">
						<@spring.message "index.reply.modal.title"/>
					</h4>
				</div>
				<div class="modal-body">
					<@spring.message "index.reply.modal.reply.user"/>
					<textarea class="form-control top-space" rows="3" placeholder="<@spring.message "index.reply.modal.placeholder"/>"></textarea>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">
					    <@spring.message "index.reply.modal.close"/>
					</button>
					<button type="button" class="btn btn-primary">
						<@spring.message "index.reply.modal.save"/>
					</button>
				</div>
			</div><!-- /.modal-content -->
		</div><!-- /.modal -->
	</div>

	<script type="text/javascript" src="/js/jquery.min.js"></script>
	<script type="text/javascript" src="/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/wdatepicker/WdatePicker.js"></script>
	<script type="text/javascript" src="/js/bootstrap-paginator.js"></script>
	<script type="text/javascript" src="/js/jquery.validate.min.js"></script>
	<script type="text/javascript" src="/js/index.js"></script>
  </body>

  <style type="text/css">
	 .right-space {
	    margin-right: 15px;
	 }
	 .top-space {
	    margin-top: 10px;
	 }
	 .content {
	    border: solid 1px;
	    border-color: #ddd;
	    border-radius: 5px;
	    padding: 10px;
	 }
	 .page-info {
	    margin-bottom: 10px;
	 }
	 .total {
	    float: left;
	    line-height: 32px;
	    margin-right: 10px;
	    border: 1px solid #e3e3e3;
	    padding: 0 10px;
	    margin-top: 20px;
	    border-radius: 5px;
	    color: #337ab7;
	 }
	 .title {
	    font-weight: bold;
	 }
	 .font-small {
	    font-size: 14px;
	 }
	 .arrow {
	   color: blue;
	   margin-left: 2px;
	   font-weight: bold;
	   padding-bottom: 0px;
	 }
	 .collapse-p{
	   bottom: -10px;
	   position: absolute;
	 }
	 .delReplyBtn{
	   color: red;
	 }
	 .language{
	   float: right;
	 }
	 .language a {
	     margin-right: 10px;  
	 }
	 .image-pos2{
	    margin-top: 15px;
        margin-bottom: 0px;
	 }
	 .image-pos1{
	    padding-left: 0px;
	 }
	 .reply-btn{
	    color: blue;
	 }
	 #curCommentPin{
	   font-weight: bold;
       margin: 0 2px;
	 }
  </style>

</html>