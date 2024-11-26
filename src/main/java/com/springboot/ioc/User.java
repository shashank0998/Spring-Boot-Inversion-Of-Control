package com.springboot.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class User 
{
	// called as field injection
	/* @Autowired */
	Order order;
	
	
	
	// its called as constructor injection
	@Autowired
	@Lazy
	public User(Order order)
	{
		this.order = order;
		System.out.println("Initializing User...");
	}

	/*
	 * @Autowired public User(OnlineOrder onlineOrder) { this.onlineOrder =
	 * onlineOrder; System.out.println("Initializing User...");
	 * 
	 * }
	 */

	
	
	// its callec as setter injection
	/*
	 * @Autowired public void setOrder(Order order) { this.order = order; }
	 * 
	 */
	
}
