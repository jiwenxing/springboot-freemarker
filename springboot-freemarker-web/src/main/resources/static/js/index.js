$(function() {
	const pageSize = 3;
	
	function loadData(url,param){
		$.ajax({
			url : url+"?date="+new Date().getTime(),
			type : "GET", 
			data : param?param:{},
			dataType : "html",
			success : function(result){
				$("#dataList").html(result);
				if($("#total").val() > 0){
					refreshPaginator($("#pageNum").val(), Math.ceil($("#total").val()/pageSize));
				}
			}
		});
	}
	
	loadData("list",{"pageNum":1, "pageSize":pageSize});
	
	
	$("#searchBtn").click(function(){
		var paramObj = $("#search").serializeObject();
		paramObj.pageNum = 1;
		paramObj.pageSize = pageSize;
		handleCheckbox(paramObj);
		loadData("list", paramObj);
	});
	
	
    $("#resetBtn").click(function() {
    	$('#search').find('input[type=text]').each(function (){ 
    		$(this).val('');
    	});
    	$('#search').find('input[type=checkbox]').each(function (){ 
    		if($(this).is(":checked")){
    			$(this).attr("checked", false);
    		}
    	});
    	$('#search').find('select').each(function (){ 
    		$(this).find("option:first").prop("selected",true);
		});
    });
	

    //日期控件
    $(".date-time").focus(function(){
		var params = {lang:"en", dateFmt:'yyyy-MM-dd HH:mm:ss'};
		if ("s_sdate" === $(this).attr("id") && $("#s_edate").val() != "") {
			params.maxDate = $("#s_edate").val();
		}
		if ("s_edate" === $(this).attr("id") && $("#s_sdate").val() != "") {
			params.minDate = $("#s_sdate").val();
		}
		WdatePicker(params);
	});
    
    //分页控件
    function refreshPaginator(pageNum, totalPages){
    	$('#pageLimit').bootstrapPaginator({    
    		currentPage: pageNum,    
    		totalPages: totalPages,    
    		size:"normal",    
    		bootstrapMajorVersion: 3,    
    		alignment:"right",    
    		numberOfPages: pageSize,    
    		itemTexts: function (type, page, current) {        
    			switch (type) {            
    			case "first": return "First";            
    			case "prev": return "Prev";            
    			case "next": return "Next";            
    			case "last": return "Last";            
    			case "page": return page;
    			}
    		},
    		onPageClicked: function(e,originalEvent,type,page){
    			var paramObj = $("#search").serializeObject();
    			paramObj.pageNum = page;
    			paramObj.pageSize = pageSize;
    			handleCheckbox(paramObj);
    			loadData("list", paramObj);
    		}
    	});
    }
    
    //控制店铺checkbox只能选择一个
    $('#isPop').find('input[type=checkbox]').bind('click', function(){
    	$('#isPop').find('input[type=checkbox]').not(this).attr("checked", false);
    });
    
    //绑定点击删除操作
    $("#dataList").delegate(".delReplyBtn","click",function(){  
    	console.log($(this).parent().data("id"));
    });
    
    //绑定点击回复操作
    $("#dataList").delegate(".reply-btn","click",function(){  
//    	console.log($(this).parent().data("id"));
//    	console.log($(this).parent().data("pin"));
    	const id = $(this).parent().data("id");
    	const pin = $(this).parent().data("pin");
    	$("#cur-comment-id").val(id);
    	$("#cur-comment-pin").val(pin);
    	$("#curCommentPin").text(pin);
    });
    
    //checkbox多选框传值处理
    function handleCheckbox(paramObj){
    	//文本审核状态
		var str = "";
		$('#textStatus').find('input[type=checkbox]').each(function (){ 
			if($(this).is(":checked")){
			  if(str==""){
					str += $(this).val();
			  }else{
					str += "," + $(this).val(); 
			  }
			}
		});
		console.log("str = " + str);
		if (str != "") {
			paramObj.textStatusArr = str;
		}
		//回复状态
		str = "";
		$('#replyStatus').find('input[type=checkbox]').each(function (){ 
			if($(this).is(":checked")){
			  if(str==""){
					str += $(this).val();
			  }else{
					str += "," + $(this).val(); 
			  }
			}
		});
		console.log("str = " + str);
		if (str != "") {
			paramObj.replyStatusArr = str;
		}
    }
    
    //formdata 转 请求体
    $.fn.serializeObject = function() {
        var o = {};
        var a = this.serializeArray();
        $.each(a, function() {
            if (o[this.name] !== undefined) {
                if (!o[this.name].push) {
                    o[this.name] = [o[this.name]];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
      };
   
})

