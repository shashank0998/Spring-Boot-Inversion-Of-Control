package com.springboot.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order 
{
	
	User user;

	@Autowired
	public Order(User user)
	{
		System.out.println("Intializing Order..");
	}

}
