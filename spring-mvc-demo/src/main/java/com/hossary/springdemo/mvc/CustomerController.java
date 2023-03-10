package com.hossary.springdemo.mvc;




import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;





@Controller
@RequestMapping("/customer")
public class CustomerController {

	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		
		StringTrimmerEditor stringTrimmer=new StringTrimmerEditor(true);
		
		databinder.registerCustomEditor(String.class, stringTrimmer);
		
	
	} 
	   
	     
	@RequestMapping("/showForm")
	public String showForm(Model themodel) {
		
		themodel.addAttribute("customer",new Customer());
		
		return "customer-form";
			 
	}
	 
	@RequestMapping("/processForm")
	public String  processForm(
			@Valid@ModelAttribute("customer")Customer thecustomer,
			BindingResult theBindingResult) {
		      
		
		
		    
		System.out.println("last name:|"+thecustomer.getLastName()+"|");
		System.out.println("first name:|"+thecustomer.getFirstName()+"|");
		System.out.println("\n\n\n\n");
		System.out.println(theBindingResult);
		if(theBindingResult.hasErrors()) {
			  
			return "customer-form";
		}   
		else { 
			    
			return "customer-confirmation";
		}  
	        
		        
		      
    
		 
		
	}
}
