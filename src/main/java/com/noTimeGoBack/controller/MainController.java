package com.noTimeGoBack.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.noTimeGoBack.util.*;

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
			
			List<String> titleList=new ArrayList<String>();
			
			titleList.add(Part1Util.CHAP1_TIT_NAME);
			titleList.add(Part1Util.CHAP2_TIT_NAME);
			titleList.add(Part1Util.CHAP3_TIT_NAME);
			titleList.add(Part1Util.CHAP4_TIT_NAME);
			titleList.add(Part1Util.CHAP5_TIT_NAME);
			titleList.add(Part1Util.CHAP6_TIT_NAME);
			titleList.add(Part1Util.CHAP7_TIT_NAME);
			titleList.add(Part1Util.CHAP8_TIT_NAME);
			titleList.add(Part1Util.CHAP9_TIT_NAME);
			titleList.add(Part1Util.CHAP10_TIT_NAME);
			titleList.add(Part2Util.CHAP11_TIT_NAME);
			titleList.add(Part2Util.CHAP12_TIT_NAME);
			titleList.add(Part2Util.CHAP13_TIT_NAME);
			titleList.add(Part2Util.CHAP14_TIT_NAME);
			
			request.setAttribute("titleList", titleList);
			
			url="/directory";
		}
		else if("chapter".equals(page)){//http://localhost:8080/NoTimeGoBack/main/goPage?page=chapter&num=1
			Integer num = Integer.valueOf(request.getParameter("num"));
			
			String content = null;
			if(num>=1&&num<=10)
				content = Part1Util.getChapterByNum(num);
			else if(num>=11&&num<=20)
				content = Part2Util.getChapterByNum(num);
			request.setAttribute("content", content);
			
			url="/chapter";
		}
		return url;
	}
}
