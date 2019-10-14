package com.accenture.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping( value="/loginpage",  method = RequestMethod.GET)
	public String loginPage() {
		return "loginPage";
	}
	

	@RequestMapping( value="/login",  method = RequestMethod.POST)
	public String login(HttpServletRequest request , Model model) {
	 String user=request.getParameter("userId");
	 String password=request.getParameter("password");
	 
	if(user.equals("user")&& password.equals("password")) {
		model.addAttribute("status", "SuccessFully Login");
	}
	else {
		model.addAttribute("status", "Login Failed");

	}
	 return "status";
	}
}
