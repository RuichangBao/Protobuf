package com.testServer.game;

/**
 * @author 包小威 用来控制协议的收发
 */
public class Agreement extends Thread
{
	@Override
	public void run()
	{
		while (true)
		{
			System.out.print("hello");
		}

	}
}
