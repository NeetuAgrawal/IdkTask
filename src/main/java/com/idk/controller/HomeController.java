package com.idk.controller;

import java.io.*;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	static HashMap<Integer,String> timeslots=  new HashMap<Integer,String>();
	
	static {
		timeslots.put(1, "9:00 AM");
		timeslots.put(2, "9:30 AM");
		timeslots.put(3, "10:00 AM");
		timeslots.put(4, "10:30 AM");
		timeslots.put(5, "11:00 AM");
		timeslots.put(6, "11:30 AM");
		timeslots.put(7, "12:00 PM");
		timeslots.put(8, "12:30 PM");
		timeslots.put(9, "1:00 PM");
		timeslots.put(10, "1:30 PM");
		timeslots.put(11, "2:00 PM");
		timeslots.put(12, "2:30 PM");
		timeslots.put(13, "3:00 PM");
		timeslots.put(14, "3:30 PM");
		timeslots.put(15, "4:00 PM");
		timeslots.put(16, "4:30 PM");
		timeslots.put(17, "5:00 PM");
		timeslots.put(18, "5:30 PM");
		
		
		
	}
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		/*Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		*/
		
		model.addAttribute("timeslots", timeslots );
		
		return "home";
	}
	
	@RequestMapping(value="/appointment", method=RequestMethod.GET)
	public @ResponseBody String getValues(@RequestParam("userName")String userName,@RequestParam("appDate") String appDate, @RequestParam("appTime") int timeslotId) {
		if(!userName.equals("")) {
			
			if(!appDate.equals("")) {
				
				//check from database does it exist with how many rows
				//if it exist with less than 16 rows.. update slotlist and send it to home page with username and date choosen
				
			}
		}
		
		return "";
		
		//return "UserName :  "+userName+ "\nAppointment Date "+appDate+"\n appointment Time : "+timeslotId;
	}
	
	/*@RequestMapping(value="/showImage" , produces={"image/jpeg","image/jpg"})
	@ResponseBody
	public String defaultMethod(){
		return "";
	}*/
	
	/*@ResponseBody
	@RequestMapping(value = "/photo2", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] testphoto() throws IOException {
	    InputStream in = Context.getResourceAsStream("/images/no_image.jpg");
	    return IOUtils.toByteArray(in);
	}*/
	
}
