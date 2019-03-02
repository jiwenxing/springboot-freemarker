<#import "/spring.ftl" as spring>
<#if result.data?has_content >
	<input type="hidden" id="pageNum" value="${result.data.pageNum!"0"}"/>
	<input type="hidden" id="pageSize" value="${result.data.pageSize!"0"}"/>
	<input type="hidden" id="total" value="${result.data.total!"0"}"/>
	<!-- <input type="hidden" id="totalPageNum" value="${(result.data.total/result.data.pageSize+1)!"0"?ceiling}"/> -->
	<div>
	    <span class="total">${result.data.total} Items, ${(result.data.total/result.data.pageSize)?ceiling} Pages</span>
	    <div id="Paginator"><ul id="pageLimit"></ul></div>
	</div>
	
	<#assign comments = result.data.list />
	<#list  comments  as  item>
		<div class="well well-lg" style="position: relative;">
			<div class="row" data-id="${item.commentId}" data-pin="${item.pin}">
			  <div class="col-xs-2"><span class="title"><@spring.message "index.search.orderId"/>：</span>${item.orderId?string["0"]!}</div>
			  <div class="col-xs-2"><span class="title"><@spring.message "index.search.vendorId"/>：</span>${item.guid!}</div>
			  <div class="col-xs-2"><span class="title"><@spring.message "index.search.vendorType"/>：</span>${item.parentId!}</div>
			  <div class="col-xs-2"><span class="title"><@spring.message "index.search.auditStatus"/>：</span>${item.textStatus!}</div>
			  <div class="col-xs-3"><span class="title"><@spring.message "index.search.skuName"/>：</span>${item.associateName!}</div>
			  <button type="button" class="btn btn-default reply-btn" data-toggle="modal" data-target="#replyModal">
			     <span class="glyphicon glyphicon-duplicate" aria-hidden="true"></span> <@spring.message "index.search.reply.btn"/>
			  </button>
			</div>
			<blockquote class="top-space">
			  <div class="row">
				  <div class="col-xs-12 font-small"><span class="title"><@spring.message "index.search.score.level"/>：&nbsp &nbsp</span>${item.scoreLevel!}</div>
			  </div>
			  <div class="row top-space">
				  <div class="col-xs-12 font-small"><span class="title"><@spring.message "index.search.content.keyword"/>：&nbsp &nbsp</span>${item.text!}</div>
			  </div>
			  <#if item.imageVos?has_content >
				  <div class="row top-space">
					  <div class="col-xs-1 font-small"><span class="title"><@spring.message "index.search.show.images"/>：</span></div>
					  <#list  item.imageVos  as  image>
						  <div class="col-xs-1 col-md-1 image-pos1">
						    <a class="thumbnail image-pos2" id="${image.id?string["0"]!}">
						      <img src="${image.url!}" alt="">
						    </a>
						  </div>
					  </#list>
				  </div>
			   </#if>
			</blockquote>
			<!-- 评价回复 -->
			<#if item.replys?has_content >
			    <div class="row">
				  <div class="col-xs-12 font-small"><span class="title"><@spring.message "index.search.comment.replys"/></span>（${item.replyCount!0}）：</div>
			    </div>
			    <#list  item.replys  as  reply>
			        <#if (reply_index==2)>
			          <div href="#collapseOne${reply.id}" class="panel-heading arrow" data-toggle="collapse">﹀</div>
					  <div id="collapseOne${reply.id}" class="collapse">
					</#if>
					<div class="row top-space">
					  <div class="col-xs-12 font-small" data-id="${reply.id}">
					      ${reply.replyAccount!}回复：&nbsp ${reply.content!} &nbsp &nbsp &nbsp &nbsp ${reply.replyDate!}&nbsp &nbsp &nbsp &nbsp
					      <a class="delReplyBtn">DELETE</a>
					  </div>
					</div>
			        <#if (reply_index==item.replys?size-1)>
			          </div>
					</#if>
			    </#list>
			<#else>
			    <div class="row top-space">
				  <div class="col-xs-12 font-small"><span class="title"><@spring.message "index.search.comment.replys"/></span>（0）</div>
			    </div>
			</#if>
		</div>
	</#list>
<#else>
    <input type="hidden" id="total" value="0"/>
    <font color="red"> nothing! </font>
</#if>