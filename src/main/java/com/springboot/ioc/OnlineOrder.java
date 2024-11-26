package com.springboot.ioc;

import org.springframework.stereotype.Component;

@Component
public class OnlineOrder
{
	public OnlineOrder()
	{
		System.out.println("Initializing OnlineOrder...");
	}
}
