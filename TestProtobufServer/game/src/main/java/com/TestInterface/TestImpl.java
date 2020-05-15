package com.TestInterface;

import org.springframework.stereotype.Service;

@Service
public class TestImpl implements TestService
{
	//@PostConstruct
	private void init()
	{
		
	}
	
	public void Print()
	{
		System.out.println("TestService Print");
	}

}
