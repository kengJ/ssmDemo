package com.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Admin;
import com.service.AdminService;

@Controller
public class AdminController {

	@Resource
	private AdminService adminService;
	
	@RequestMapping(value="findAdmin",method=RequestMethod.POST)
	public String FindAdmin(){
		return adminService.FindAdmin().toString();
	}
	
	@RequestMapping(value="findUserById",method=RequestMethod.POST)
	public String FindUserById(Integer UserId){
		return adminService.FineAdminById(UserId).toString();
	}
	
	@RequestMapping(value="addAdmin",method=RequestMethod.PUT)
	public boolean AddAdmin(Admin admin){
		return adminService.AddAdmin(admin);
	}
	
	@RequestMapping(value="delAdmin",method=RequestMethod.DELETE)
	public boolean DelAdmin(Integer AdminId){
		return adminService.DelAdmin(AdminId);
	}
	
	@RequestMapping(value="updateAdmin",method=RequestMethod.PUT)
	public boolean UpdateAdmin(Admin admin){
		return adminService.UpdateAdmin(admin);
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public String LoginAdmin(Admin admin){
		System.out.println(admin.getAdminName());
		return "redirect:/hello";
	}
}
