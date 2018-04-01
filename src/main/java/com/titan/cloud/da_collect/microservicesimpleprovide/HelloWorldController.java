package com.titan.cloud.da_collect.microservicesimpleprovide;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.titan.da.collect.domain.User;

@RestController
public class HelloWorldController {

	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		//user.setUsserName("小明");
		//user.setPassword("xxxx");
		return user;
	}

	@RequestMapping("/personnel")
	public String index() {
		count();
		return "Hello personnel file";
	}

	private void count() {
		// TODO Auto-generated method stub
		int a ,b,c;
		a=10;
		b=20;
		c=a+b;
		c=0;
		System.out.println("aaa bcd");
		
		
	}
	
	
}