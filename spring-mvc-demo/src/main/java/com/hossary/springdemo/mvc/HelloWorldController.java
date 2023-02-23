package com.hossary.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/main")
public class HelloWorldController {
	// need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		
		return "helloworld-form";
		
	}
	
	
	//need controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormversiontwo")
	public String letsShoutOut(HttpServletRequest request,Model model) {
		String theName = request.getParameter("studentName");
		
		theName=theName.toUpperCase();
		String theMessage = "YO! "+theName;
		
		model.addAttribute("message",theMessage);
		
		
		
		
		
		return "helloworld";
	}

	@RequestMapping("/processFormversionthree")
	public String processFormversionthree(@RequestParam("studentName")String theName,Model model) {
		
		
		theName=theName.toUpperCase();
		String theMessage = "Hey My Friend From v3! "+theName;
		
		model.addAttribute("message",theMessage);
		
		
		
		
		
		return "helloworld";
	}

}
