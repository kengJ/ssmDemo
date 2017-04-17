package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.BaseDao;
import com.service.UserService;

@Controller
@RequestMapping("/Test")
public class TestController {
	
	@Resource
	private BaseDao baseDao;
	@Resource
	private UserService userService;
	
	@RequestMapping("test.do")
	public String test(){
//		baseDao.saveObject("", obj);
		System.out.println(userService.finUser());
		return "success";
	}
	
	@RequestMapping(value="sessionTest")
	public void testSession(HttpSession session){
		//System.out.println(test);
		System.out.println("save session");
		session.setAttribute("test", "test");
//		return "forward:/Test/sessionTest2";
	}
	
	@RequestMapping(value="sessionTest2")
	public void testSession2(HttpSession session){
		//System.out.println(test);
		System.out.println("get session");
		System.out.println(session.getAttribute("test"));
//		return "forward:/Test/sessionTest2";
	}
}
