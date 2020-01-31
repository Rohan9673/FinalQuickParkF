package com.quickpark.in.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.quickpark.in.model.PropertyUser;
import com.quickpark.in.model.User;
import com.quickpark.in.model.Property;
import com.quickpark.in.service.AdminHomeService;

@Controller
public class AdminHomeController {

	@Autowired
	AdminHomeService adminhomeservice;
	
	
	

	public void setAdminhomeservice(AdminHomeService adminhomeservice) {
		this.adminhomeservice = adminhomeservice;
	}
	
	
	@RequestMapping(value="/propertyownerlist",method = RequestMethod.GET)
	public ModelAndView selectPropertyOwner(HttpServletRequest request)
	{	
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("admin"))
		{
		List<User> li=adminhomeservice.selectPropertyOwner();
		System.out.print(li);
		mv.addObject("li",li);
		mv.setViewName("listofpropertyowner");
		}
		else
		{
			mv.setViewName("login");
			
			return mv;
		}
	
		return mv;
	}
	
	@RequestMapping(value="/vehicleownerlist",method = RequestMethod.GET)
	public ModelAndView selectVehicleOwner(HttpServletRequest request)
	{	
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("admin"))
		{
		List<User> li=adminhomeservice.selectVehicleOwner();
		
		mv.addObject("li",li);
		mv.setViewName("listofvehicleowner");
		
		
		
		return mv;
		}
		else
		{
			mv.setViewName("login");
			
			return mv;
		}
	}
	
	
	@RequestMapping(value = "/selectproperty", method = RequestMethod.GET)
	public ModelAndView userProperty(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("admin"))
		{
		List<PropertyUser> li=(List<PropertyUser>)adminhomeservice.selectProperty();
	
		mv.addObject("li",li);
		//System.out.println(li);
		mv.setViewName("listproperty");
		return mv;
	}
	else
	{
		mv.setViewName("login");
		
		return mv;
	}
	}
	
	@RequestMapping(value = "/blockpropertyowner",method = RequestMethod.POST)
	public ModelAndView blockPropertyOwner(@RequestParam("user_id") int user_id,HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null)
		{
		
		int i=adminhomeservice.propertyOwnerBlock(user_id);
		
		if(i>=1)
		{
			
			mv.addObject("msg", "update sucsessfully");
			mv=selectPropertyOwner(request);
			
			
		}
		else
		{
			
			mv.addObject("msg", "update unsucsessfully try again");
			mv.setViewName("listofpropertyowner");
		}
		
		
		
		
		return mv;
		}
		else
		{
			mv.setViewName("login");
			
			return mv;
		}
	}	
	
	@RequestMapping(value = "/blockvehicleowner",method = RequestMethod.POST)
	public ModelAndView blockVehicleOwner(@RequestParam("user_id") int user_id,HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("admin"))
		{
		
		System.out.println(user_id);
		int i=adminhomeservice.vehicleOwnerBlock( user_id);
		
		if(i>=1)
		{
			System.out.println(i);
			mv.addObject("msg", "update sucsessfully");
			mv=selectVehicleOwner(request);
			
			
		}
		else
		{
			
			mv.addObject("msg", "update unsucsessfully try again");
			mv.setViewName("listofvehicleowner");
		}
		
		
		
		
		return mv;
	}
	else
	{
		mv.setViewName("login");
		
		return mv;
	}

	}	
	
}
