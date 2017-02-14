package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.User;
import com.service.UserService;

@Controller
@RequestMapping(value="/User")
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping(value="findUser",method=RequestMethod.POST)
	public String FindUser(){
		return userService.finUser().toString();
	}
	
//	@RequestMapping(value="findUserById",method=RequestMethod.POST)
//	public String FindUserById(Integer UserId){
//		return userService.findUserById(UserId).toString();
//	}
//	
//	@RequestMapping(value="addUser",method=RequestMethod.PUT)
//	public boolean AddUser(User user){
//		return userService.AddUser(user);
//	}
//	
//	@RequestMapping(value="delUser",method=RequestMethod.DELETE)
//	public boolean DelUser(Integer UserId){
//		return userService.DelUser(UserId);
//	}
//	
//	@RequestMapping(value="updateUser",method=RequestMethod.PUT)
//	public boolean UpdateUser(User user){
//		return userService.UpdateUser(user);
//	}
}
