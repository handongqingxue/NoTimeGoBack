package com.noTimeGoBack.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.noTimeGoBack.util.Part1Util;

//eclipse搭建maven项目:https://blog.csdn.net/weixin_62332711/article/details/125630418
@Controller
@RequestMapping(MainController.MODULE_NAME)
public class MainController {

	public static final String MODULE_NAME="/main";

	@RequestMapping(value="/goPage")
	public String goPage(HttpServletRequest request) {
		
		String url = null;
		String page = request.getParameter("page");
		if("directory".equals(page)){//http://localhost:8080/NoTimeGoBack/main/goPage?page=directory
			url="/directory";
		}
		else if("chapter".equals(page)){//http://localhost:8080/NoTimeGoBack/main/goPage?page=chapter&num=1
			Integer num = Integer.valueOf(request.getParameter("num"));
			String content = Part1Util.getChapterByNum(num);
			request.setAttribute("content", content);
			url="/chapter";
		}
		return url;
	}
}
