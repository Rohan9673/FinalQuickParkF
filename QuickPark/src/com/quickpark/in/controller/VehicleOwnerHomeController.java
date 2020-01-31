package com.quickpark.in.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.quickpark.in.model.User;

import com.quickpark.in.service.VehicleOwnerHomeService;


@Controller
public class VehicleOwnerHomeController {
	@Autowired
	VehicleOwnerHomeService s;
	
	@RequestMapping(value ="/updatevehicleowner",method = RequestMethod.GET)
	public ModelAndView select(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("vehicleowner"))
		{
			
		User p2=new User();
		
		
	
		try {
		 p2=s.selectAll();
		}catch(Exception e)
		{
			
		}
		mv.addObject("p2", p2);
		mv.setViewName("VehicleOwnerUpdate");
		
		return mv;
		}
		else
		{
			mv.setViewName("login");
			
			return mv;
		}

	}
	
	@RequestMapping(value="/updatevehicleowner",method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("owner") User owner,HttpServletRequest request)
	{	
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null&& request.getSession().getAttribute("role").equals("vehicleowner"))
		{
		int j=s.updateDetails(owner);
		 
		if(j!=0)
		{
			mv.addObject("msg","update unsucsessfully try again");
		    mv=select(request);
		}
		else 
		{
			mv.addObject("msg","update unsucsessfully try again");
			mv=select(request);
		}
		return mv;
	}
	else
	{
		mv.setViewName("login");
		
		return mv;
	}
	}
	
	@RequestMapping(value = "/deletevehicleOwner1", method = RequestMethod.GET)
	public ModelAndView delete(HttpServletRequest request) {
		
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null&& request.getSession().getAttribute("role").equals("vehicleowner"))
		{
		
		
		mv.setViewName("vehicleownerdelete");
		
		return mv;
		}
		else
		{
			mv.setViewName("login");
			
			return mv;
		}
	}
	
	@RequestMapping(value = "/deletevehicleOwner", method = RequestMethod.GET)
	public ModelAndView delete1(HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("vehicleowner"))
		{
		String username=(String) request.getSession().getAttribute("userName");
		
		int i=s.delete(username);
		if(i==1)
		{
			
		mv.addObject("msg", "delete sucsessfully");
		mv=delete(request);
		}
		else
		{
			mv.addObject("msg", "delete unsucsessfully try again");
			mv=delete(request);
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


