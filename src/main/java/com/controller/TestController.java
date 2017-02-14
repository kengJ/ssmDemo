package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
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
}
