package com.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.model.Admin;
import com.service.AdminService;

@Controller	
@RequestMapping("/Admin")
public class AdminController {

	@Resource
	private AdminService adminService;
	
	@RequestMapping(value="GetList",method=RequestMethod.POST)
	@ResponseBody
	public List<Admin> FindAdmin(){
		return adminService.FindAdmin();
	}
	
	@RequestMapping(value="Add",method=RequestMethod.PUT)
	public boolean AddAdmin(Admin admin){
		return adminService.AddAdmin(admin);
	}
	
	@RequestMapping(value="Delete",method=RequestMethod.DELETE)
	public boolean DelAdmin(Integer AdminId){
		return adminService.DelAdmin(AdminId);
	}
	
	@RequestMapping(value="Edit",method=RequestMethod.PUT)
	public boolean UpdateAdmin(Admin admin){
		return adminService.UpdateAdmin(admin);
	}
	
	@RequestMapping(value="Login",method=RequestMethod.POST)
	public ModelAndView LoginAdmin(Admin admin){
		ModelAndView mv =new ModelAndView();
		if(adminService.LoginAdmin(admin)){
			mv.setViewName("Admin/index");
			mv.addObject("admininfo", admin);
		}else{
			mv.setViewName("redirect:/index");
		}
		return mv;
	}
	
}
