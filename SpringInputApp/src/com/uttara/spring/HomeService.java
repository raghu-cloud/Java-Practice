package com.uttara.spring;

import org.springframework.stereotype.Component;

@Component
public class HomeService {

	public HomeService() {
		System.out.println("in HS no-arg constr");
	}
	
	public String authenticate(LoginBean bean)
	{
		//apply logic by connecting to db;
		return "success";
	}
	
	public String registerData(RegBean bean)
	{
		//apply business logic by connecting to db
		//and return indication of success/failure
		System.out.println("in HS->registerData() "+bean);
		
		return "success";
	}
}







