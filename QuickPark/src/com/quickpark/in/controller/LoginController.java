package com.quickpark.in.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.quickpark.in.model.User;

import com.quickpark.in.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginservice;

	public void setLoginservice(LoginService loginservice) {
		this.loginservice = loginservice;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView userLogin() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");

		return mv;

	}
	
	@RequestMapping(value = "/propownerregitration", method = RequestMethod.GET)
	public ModelAndView propregistartionpage() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("propertyownerregister");

		return mv;

	}
	

	@RequestMapping(value = "/vehicleownerregitration", method = RequestMethod.GET)
	public ModelAndView vehicleregistartionpage() {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("vehicleownerregister");

		return mv;

	}
	
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView usersession(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView mv = new ModelAndView();
		

			if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("vehicleowner"))
			{
				request.setAttribute("location","VehicleOwnerHome");	
				mv.setViewName("VehicleOwnerHome");
				
			}
			else if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("propertyowner"))
			{
				request.setAttribute("location","PropertyOwnerHome");
				mv.setViewName("PropertyOwnerHome");
			
			}
			else if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("admin"))
			{
				request.setAttribute("location","AdminHome");
				mv.setViewName("AdminHome");
				
			}
		
			else
			{
				mv.setViewName("login");
			}

		return mv;

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView userLogin(@RequestParam("userName") String userName, @RequestParam("password") String password,HttpServletRequest request,HttpServletResponse response)
	{	
		ModelAndView modelview = new ModelAndView();
		User log = new User();
		log.setUserName(userName);
		log.setPassword(password);

		//System.out.println(UserName+" "+Password);
		User log1=loginservice.validateUser(log);
		
		
			if(log1!=null)
			{
		if (log1.getUserName() != null ) {

			if(log1.getRole().equalsIgnoreCase("vehicleowner"))
			{
				modelview.setViewName("VehicleOwnerHome");
				request.getSession().setAttribute("userName", userName);
				request.getSession().setAttribute("role",log1.getRole() );
			}
			else if(log1.getRole().equalsIgnoreCase("propertyowner"))
			{
				modelview.setViewName("PropertyOwnerHome");
				request.getSession().setAttribute("userName", userName);
				request.getSession().setAttribute("role",log1.getRole() );
			}
			else if(log1.getRole().equalsIgnoreCase("admin"))
			{
				modelview.setViewName("AdminHome");
				request.getSession().setAttribute("userName", userName);
				request.getSession().setAttribute("role",log1.getRole() );
			}
		}
		
			}
		else {

			modelview.addObject("msg", "Invalid User Id or Password.");
			modelview.setViewName("login");
		}
		

		return modelview;

	}



@RequestMapping(value = "logout", method = RequestMethod.GET)
public ModelAndView userLogout(HttpServletRequest request,HttpServletResponse response) {

	request.getSession().invalidate();
	ModelAndView mv = new ModelAndView();
	mv.setViewName("login");
	return mv;

}



	
	

}
