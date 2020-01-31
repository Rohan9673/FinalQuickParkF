package com.quickpark.in.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.quickpark.in.model.User;
import com.quickpark.in.service.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationService registrationservice;

	public void setRegistrationservice(RegistrationService registrationservice) {
		this.registrationservice = registrationservice;
	}
	
	
	@RequestMapping(value="/propertyregitration",method = RequestMethod.GET)
	public String save()
	{	
			return "home";
	}
	
	@RequestMapping(value="/propertyregitration",method = RequestMethod.POST)
	public String spropertyregister(@Valid@ModelAttribute("owner") User owner,BindingResult result)
	{	
		if (result.hasErrors()) {
			
			 
			return "propertyownerregister";	 
		} 
		 
		  
		if(registrationservice.propertRegister(owner))
			return "login";
		else 
			return "home";
	}

	
	@RequestMapping(value="/vehicleownerregister",method = RequestMethod.POST)
	public String vehicleregister(@Valid@ModelAttribute("owner") User owner,BindingResult result)
	{	
		if (result.hasErrors()) {
			
			 
			return "propertyownerregister";	 
		} 
		 
		  
		if(registrationservice.vehicleRegister(owner))
			return "login";
		else 
			return "home";
	}
	
	@RequestMapping(value="/check_avail",method = RequestMethod.GET)
	@ResponseBody
	public String isUsername(@RequestParam String userName)
	{
		if(registrationservice.isUsername(userName ))
			return "UserName Already Exist";
		else
			return "UserName Available";
	}

	
	
}
