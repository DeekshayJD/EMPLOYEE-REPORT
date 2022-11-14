package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Maincontroller {

	
	
	@RequestMapping("/")
	public String viewhome(){
		
		return "home";
	}
	
	
}
