package com.quickpark.in.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.quickpark.in.model.Coordinates;
import com.quickpark.in.model.Property;
import com.quickpark.in.model.User;
import com.quickpark.in.service.CoordinatesService;
import com.quickpark.in.service.ReturnCoordinatesService;
import com.quickpark.in.service.ReturnOwnerDataService;

@Controller
public class VehicleOwnerController {
	

	@Autowired
	private ReturnCoordinatesService returnCoordinatesService;

	@RequestMapping(value = "/showparking")
	public ModelAndView displayMarkers() {
		

		List<Coordinates> clist = returnCoordinatesService.list();
		System.out.println("In ShowParkingController");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("ParkingSpots");
		mv.addObject("size", clist);
		mv.addObject("clist", clist);
		System.out.println(clist);
		return mv;
	}

	@Autowired
	private ReturnOwnerDataService returnOwnerDataService;

	@RequestMapping(value = "/propertyownerdetails", method = RequestMethod.POST)
	//@ResponseBody
	public ModelAndView displayData(@RequestParam("SendName") int name, HttpSession session,HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("vehicleowner"))
		{
		//System.out.println("In New Json Controller");
		Coordinates detailsList = returnOwnerDataService.ownerDetails(name);
		
		//System.out.println("hi"+detailsList);
		mv.setViewName("showparkinginfo");
		mv.addObject("detailsList", detailsList);
		//System.out.println(detailsList);
		return mv;
		}
		else
		{
			mv.setViewName("login");
			
			return mv;
		}

	}
	
	@RequestMapping(value="/submitbooking",method = RequestMethod.POST)
	public ModelAndView spropertyregister(@ModelAttribute("cord") Coordinates cord,HttpServletRequest request)
	{
		System.out.println("INSIDE CORD -- >> " + cord);
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("vehicleowner"))
		{
		String username=(String) request.getSession().getAttribute("userName");	
	int i=returnOwnerDataService.booking(cord, username);
	if(i==1)
	{
		
		mv.setViewName("payment");
		return mv;  
	}
	else
	{
		mv.setViewName("showparkinginfo");
		return mv; 
	}
		}
		else
		{
			mv.setViewName("login");
			
			return mv;
		}
	}
	
	@RequestMapping(value="/submitbooking",method = RequestMethod.GET)
	public ModelAndView spropertyregister(HttpServletRequest request)
	{ModelAndView mv = new ModelAndView();
	if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("vehicleowner"))
	{
		
		mv.setViewName("showparkinginfo");
		return mv;
	}
	else
	{
		mv.setViewName("login");
		
		return mv;
	}
	
	}
	
	@RequestMapping(value="/booking",method = RequestMethod.GET)
	public ModelAndView propertyregister(HttpServletRequest request )
	{
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("vehicleowner"))
		{
		
		
		mv.setViewName("bookparking");
		return mv;  
	}
	else
	{
		mv.setViewName("login");
		
		return mv;
	}
		
	}
}
