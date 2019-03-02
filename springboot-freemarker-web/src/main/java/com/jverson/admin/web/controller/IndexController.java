package com.jverson.admin.web.controller;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.jverson.admin.web.common.PageVo;
import com.jverson.admin.web.common.ResultVo;
import com.jverson.admin.web.wrap.Discussion;
import com.jverson.admin.web.wrap.ImageWrap;
import com.jverson.admin.web.wrap.ReplyWrap;


@Controller
@RequestMapping("freemarker")
public class IndexController {
	private static PageVo<Discussion> pageVo = new PageVo<Discussion>();
	private static ResultVo<PageVo<Discussion>> resultVo = new ResultVo<PageVo<Discussion>>();
	
	@RequestMapping(value = "/index", method = RequestMethod.GET, produces = { "text/html;charset=UTF-8" })
    public String index(Model model) {
        return "/index";
    }

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = { "text/html;charset=UTF-8" })
	public String getList(Model model, Discussion commentWrap) {
		pageVo.setPageNum(commentWrap.getPageNum());
		pageVo.setPageSize(commentWrap.getPageSize());
		resultVo.setData(pageVo);
		resultVo.setCode(0);
		System.out.println(JSON.toJSONString(resultVo));
        model.addAttribute("result", resultVo);
		return "/list";
	}

	
	private static List<String> ctext = Arrays.asList(
			"wonderful shopping experience", 
			"ประสบการณ์การช็อปปิ้งที่ยอดเยี่ยม", "nice shopping experience",
			"东西很好和描述的一样",
			"Product quality is not good."); 

	static {
		List<Discussion> list = Lists.newArrayList();
		for (int i = 0; i < ctext.size(); i++) {
			Discussion comment = new Discussion();
			comment.setScoreLevel(i);
			comment.setCommentId((long)i+1);
			comment.setGuid("guid_8888x_" + i);
			comment.setCommentType(i%2);
			comment.setAssociateId(Long.valueOf("100010" + i));
			if (i%4==0) {
				comment.setAssociateName("Iphone X max");
			}else if (i%4==1) {
				comment.setAssociateName("macbook pro");
			}else if (i%4==2) {
				comment.setAssociateName("Macbook air");
			}else {
				comment.setAssociateName("iphone 6");
			}
			
			comment.setParentId(Long.valueOf("999999" + i%4));
			comment.setOrderId(Long.valueOf("4444444"+i));
			comment.setCategoryOne(670+i);
			comment.setCategoryTwo(671+i);
			comment.setCategoryThree(672+i);
			
			comment.setText(ctext.get(i));
			if (i%2==0) {
				List<ImageWrap> images = Lists.newArrayList();
				ImageWrap image = new ImageWrap();
				image.setId(Long.valueOf("222222" + i));
				image.setUrl("http://album.jverson.com/Thailand/20160914_175156.jpg");
				images.add(image);
				if (i==0) {
					image = new ImageWrap();
					image.setId(Long.valueOf("222222" + i));
					image.setUrl("http://album.jverson.com/Thailand/20160916_112725.jpg");
					images.add(image);
				}
				comment.setImageVos(images);
			}
			comment.setTextStatus(i%3);
			comment.setImageStatus(i%3);
			if (i%2==0) {
				comment.setImageStatus((i+1)%3);
			}
			comment.setVideoStatus(i%3);
			comment.setTopStatus(i%2);
			
			comment.setScore(i%5+1);
			comment.setRaiseCount(i*3);
			comment.setReplyCount(i*6);
			if (i%2==0) {
				comment.setRecommentId((long)15-i);
			}
			
			comment.setAuditType(i%2);
			if (i%3==0) {
				comment.setTextRewardNum(i*10);
				comment.setImageRewardNum(i*20);
			}
			
			comment.setPin("pj_"+i);
			comment.setUserIp("192.168.1." + i);
			comment.setClientCode("TH");
			if (i%2==0) {
				comment.setClientCode("MY");
			}
			comment.setClientType(i%5);
			Instant timeStamp = Instant.now();
			comment.setBuyTime(timeStamp.minusSeconds((long)60*60*24*5*i).toString());
			comment.setCreated(timeStamp.minusSeconds((long)60*60*24*2*i).toString());
			comment.setModified(timeStamp.minusSeconds((long)60*60*24*i).toString());
			comment.setOriginalText("lalala");
			comment.setUserNickName("nick_name");
			wrapReplys(comment);
			list.add(comment);
		}
		pageVo.setList(list);
		pageVo.setTotal(list.size());
	}
	
	
	private static void wrapReplys(Discussion commentWrap) {
		if (commentWrap.getCommentId()%3==0) {
			ReplyWrap replyWrap = new ReplyWrap();
			replyWrap.setId(commentWrap.getCommentId());
			replyWrap.setContent("我是回复内容！");
			replyWrap.setReplyAccount("客服");
			replyWrap.setReplyDate("2018-06-25 10:06");
			commentWrap.setReplys(Lists.newArrayList(replyWrap));
			commentWrap.setReplyCount(1);
		}
		
		if (commentWrap.getCommentId()%3==1) {
			List<ReplyWrap> replyWraps = Lists.newArrayList();
			commentWrap.setReplyCount(2);
			ReplyWrap replyWrap = new ReplyWrap();
			replyWrap.setId(commentWrap.getCommentId());
			replyWrap.setContent("我是回复内容！");
			replyWrap.setReplyAccount("客服");
			replyWrap.setReplyDate("2018-06-25 10:06");
			replyWraps.add(replyWrap);
			replyWrap = new ReplyWrap();
			replyWrap.setId(commentWrap.getCommentId()+1);
			replyWrap.setContent("感谢亲的认可，我们会更加努力！");
			replyWrap.setReplyAccount("商家");
			replyWrap.setReplyDate("2018-08-25 10:06");
			replyWraps.add(replyWrap);
			replyWrap = new ReplyWrap();
			replyWrap.setId(commentWrap.getCommentId()+2);
			replyWrap.setContent("您反馈的一键我们已经收到！");
			replyWrap.setReplyAccount("abc1");
			replyWrap.setReplyDate("2018-08-25 10:06");
			replyWraps.add(replyWrap);
			replyWrap = new ReplyWrap();
			replyWrap.setId(commentWrap.getCommentId()+3);
			replyWrap.setContent("感谢亲的认可，我们会更加努力！");
			replyWrap.setReplyAccount("abc921");
			replyWrap.setReplyDate("2018-08-25 10:06");
			replyWraps.add(replyWrap);
			replyWrap = new ReplyWrap();
			replyWrap.setId(commentWrap.getCommentId()+3);
			replyWrap.setContent("感谢亲的认可，我们会更加努力！");
			replyWrap.setReplyAccount("abc921");
			replyWrap.setReplyDate("2018-08-25 10:06");
			replyWraps.add(replyWrap);
			commentWrap.setReplys(replyWraps);
			commentWrap.setReplyCount(replyWraps.size());
		}
		
	}

	
}
