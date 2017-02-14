package com.controller;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Sex;
import com.service.SexService;

@RestController
@RequestMapping("Sex")
public class SexController {

	@Resource
	private SexService sexService;
	
	@RequestMapping(value="AddSex",method=RequestMethod.POST)
	public boolean AddSex(@RequestParam("SexType")String SexType){
		return sexService.AddSex(SexType);
	}
	
	@RequestMapping(value="DelSex",method=RequestMethod.DELETE)
	public boolean DelSex(@RequestParam("SexId") Integer SexId){
		return sexService.DelSex(SexId);
	}
	
	@RequestMapping(value="UpdateSex",method=RequestMethod.PUT)
	public boolean UpdateSex(Sex sex){
		return sexService.UpdateSex(sex);
	}
	
	@RequestMapping(value="findSex",method=RequestMethod.POST)
	public String FindSex(){
		return sexService.findSex().toString();
	}
	
	@RequestMapping(value="findSexById",method=RequestMethod.POST)
	public String FindSexById(@RequestParam("SexId")Integer SexId){
		return sexService.findSexById(SexId).toString();
	}
}
