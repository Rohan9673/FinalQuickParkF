package com.quickpark.in.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.oracle.webservices.internal.api.message.PropertySet.Property;
import com.quickpark.in.model.User;
import com.quickpark.in.service.CoordinatesService;
import com.quickpark.in.service.LoginService;
import com.quickpark.in.service.PropertyAvailableStatusService;

@Controller
public class PropertyOwnerHomeController {

	@Autowired
	private PropertyAvailableStatusService s;

	public void setS(PropertyAvailableStatusService s) {
		this.s = s;
	}


	@GetMapping
	@RequestMapping(value = "/prop")
	public ModelAndView availableStatus(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("propertyowner"))
		{
			mv.setViewName("propertyavailchang");

			return mv;
		}
		else
		{
			mv.setViewName("login");

			return mv;
		}

	}




	@RequestMapping(value = "/prop",method = RequestMethod.POST)
	public ModelAndView availablechange(@RequestParam("status") String status,HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("propertyowner"))
		{
			//property p=new property();
			int avaliableStatus=0;
			if(status.equalsIgnoreCase("available"))
			{

				avaliableStatus=1;
			}
			else
			{
				avaliableStatus=0;
			}

			//p.setAvailable_slot(status1);
			int i=s.propertyAvaliablesatus(avaliableStatus);
			System.out.println(i);
			if(i>0)
			{

				mv.addObject("msg","update Successfully");
				mv.setViewName("propertyavailchang");
			}
			else
			{

				mv.addObject("msg", "update Unsucsessfully");
				mv.setViewName("propertyavailchang");
			}



			mv.setViewName("propertyavailchang");

			return mv;
		}
		else
		{
			mv.setViewName("login");

			return mv;
		}

	}




	@RequestMapping(value = "/Propertyinsert", method = RequestMethod.GET)
	public ModelAndView addProperty(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("propertyowner"))
		{


			mv.setViewName("insertslot");

			return mv;
		}
		else
		{
			mv.setViewName("login");

			return mv;
		}
	}

	@RequestMapping(value = "/addressinsert", method = RequestMethod.POST)
	public ModelAndView addaddress(@RequestParam("slot") int slot,HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("propertyowner"))
		{


			mv.setViewName("insertslot");
			request.getSession().setAttribute("slot",slot );

			mv.setViewName("AddParking");

			return mv;
		}
		else
		{
			mv.setViewName("login");

			return mv;
		}
	}




	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public ModelAndView select(User p , HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null)
		{
			User p2=new User();


			try {
				p2=s.selectAll();
			}catch(Exception e)
			{

			}
			mv.addObject("p2", p2);
			mv.setViewName("propertyownerupdate");

			return mv;
		}
		else
		{
			mv.setViewName("login");

			return mv;
		}
	}

	@RequestMapping(value="/update",method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("owner") User owner, HttpServletRequest request)
	{	ModelAndView mv = new ModelAndView();
	if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("propertyowner"))
	{

		int j=s.updateDetails(owner);

		if(j!=0)
		{
			mv.addObject("msg", "update sucsessfully");
			mv=select(owner , request);
		}
		else 
		{
			mv.addObject("msg", "update unsucsessfully try again");
			mv.setViewName("PropertyOwnerHome");
		}
		return mv;
	}
	else
	{
		mv.setViewName("login");

		return mv;
	}
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView delete(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("propertyowner"))
		{


			mv.setViewName("deletepropertyowneraccount");

			return mv;
		}
		else
		{
			mv.setViewName("login");

			return mv;
		}

	}

	@RequestMapping(value = "/delete1", method = RequestMethod.GET)
	public ModelAndView delete1(HttpServletRequest request,HttpServletResponse response) {

		ModelAndView mv = new ModelAndView();
		if(request.getSession().getAttribute("userName")!=null && request.getSession().getAttribute("role").equals("propertyowner"))
		{
			String username=(String) request.getSession().getAttribute("userName");

			int i=s.delete(username);
			if(i==1)
			{

				mv.addObject("msg", "delete sucsessfully try again");
				mv.setViewName("deletepropertyowneraccount");
			}
			else
			{
				mv.addObject("msg", "delete unsucsessfully try again");
				mv.setViewName("deletepropertyowneraccount");
			}
			return mv;
		}
		else
		{
			mv.setViewName("login");

			return mv;
		}
	}
	
	
	@Autowired
	private CoordinatesService coordinatesService;

	@RequestMapping(value = "/coordinates", method = RequestMethod.POST)
	public ModelAndView saveCoordinates(@RequestParam("latitude") String latitude,
			@RequestParam("longitude") String longitude, HttpSession session ,HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		int slot=(int) request.getSession().getAttribute("slot");
		String username=(String) request.getSession().getAttribute("userName");
		
		com.quickpark.in.model.Property p=new com.quickpark.in.model.Property();
		//Property p= new Property();
		//Coordinates cord = new Coordinates();
		//cord.setLatitude(latitude);
		//cord.setLongitude(longitude);
		p.setLatitude(latitude);
		p.setLongitude(longitude);
		int cord1 = coordinatesService.saveCoordinates(p,slot,username);

		if (cord1 != 0) {
			session.setAttribute("username", "Coordinates");
			mv.setViewName("PropertyOwnerHome");
		} else {
			mv.addObject("msg", "coordiantes not saved");
			mv.setViewName("Index");
		}
		return mv;
	}






}
