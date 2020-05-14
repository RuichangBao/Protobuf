package com.cmd;

public class Request
{
	public int a;
	public int b;

	public Request()
	{}

	public Request(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString()
	{
		return "Request [a=" + a + ", b=" + b + "]";
	}	
}
