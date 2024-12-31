package org.springbootwebmvcapp.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String calculat() {
		return "calculator";
	}

	@RequestMapping("/add")
	public String addData() {
		return "addition";
	}
	
	@RequestMapping("/plus")
	public String addition(@RequestParam ("num1") int num1, @RequestParam("num2") int num2, Model m) {
		
		int addition=num1+num2;
		m.addAttribute("Result",addition );
		return "result";
		
	}
	
	@RequestMapping("/sub")
	public String subData() {
		return "subtraction";
	}
	
	@RequestMapping("/minus")
	public String subtraction(@RequestParam ("num1") int num1, @RequestParam("num2") int num2, Model m) {
		
		int subtraction=num1-num2;
		m.addAttribute("Result",subtraction );
		return "result";	
	}
	

	@RequestMapping("/div")
	public String divData() {
		return "division";
	}
	
	@RequestMapping("/division")
	public String division(@RequestParam ("num1") int num1, @RequestParam("num2") int num2, Model m) {
		
		int division=num1/num2;
		m.addAttribute("Result",division );
		return "result";	
	}
	@RequestMapping("/mul")
	public String mulData() {
		return "multiplication";
	}
	
	@RequestMapping("/multiply")
	public String multiplication(@RequestParam ("num1") int num1, @RequestParam("num2") int num2, Model m) {
		
		int multiplication=num1*num2;
		m.addAttribute("Result",multiplication );
		return "result";	
	}

}
