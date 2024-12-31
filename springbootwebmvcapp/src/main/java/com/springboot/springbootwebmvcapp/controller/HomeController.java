package com.springboot.springbootwebmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String prelogin() {
		System.out.println("in login");
		return"login";
	
	}
	@RequestMapping("/openregpage")	
	public String preRegister() {
		System.out.println("In Reg");
		return"register";
		
	}

}
