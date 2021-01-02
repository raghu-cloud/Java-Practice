package com.uttara.spring;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/SpringInputApp")
public class HomeController {

	@Autowired
	HomeService service;
	
	public HomeController() {
		System.out.println("in HC no-arg constr");
	}
	
	@RequestMapping("/")
	public String showHome()
	{
		System.out.println("in HC->showHome()");
		return "Home";
	}
	
	@RequestMapping("/openLoginView")
	public String showLoginView(Model model)
	{
		System.out.println("in HC->showLoginView()");
		model.addAttribute("log", new LoginBean());
		return "Login";
	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute("log") @Valid LoginBean bean,BindingResult vresult)
	{
		System.out.println("in HC->login() bean = "+bean);
		if(vresult.hasErrors())
		{
			return "Login";
		}
		else
		{
			//validation has succeeded!
			String msg = service.authenticate(bean);
			if(msg.equals("success"))
				return "Success";
			else
			{
				return "Login";
			}
		}
	}
	
	@RequestMapping("/openRegisterView")
	//pre-processing method for Register view
	public String showRegisterView(Model model)
	{
		System.out.println("in HC->showRegisterView()");
		
		model.addAttribute("reg", new RegBean());
		
		return "Register";
	}
	
	@RequestMapping("/register")
	//post-processing usecase
	public String register(@ModelAttribute("reg") @Valid RegBean bean,BindingResult vresult)
	{
		System.out.println("in HC->register() "+bean);
		
		if(vresult.hasErrors())
		{
			//input validations have failed
			return "Register";
		}
		else
		{
			String result = service.registerData(bean);
			
			if(result.equals("success"))
				return "Success";
			else
			{
				//business logic failure...
				
				return "Register"; 
					
			}
		}
	}
}





