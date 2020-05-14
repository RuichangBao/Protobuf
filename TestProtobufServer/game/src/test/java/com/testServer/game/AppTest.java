package com.testServer.game;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import com.cmd.Request;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
	public static void main(String[] args)
	{
		Request request=new Request();
		Test(request);
	}
	
	/**
	 * 反射创建对象
	 * @param <T>
	 * @param t
	 * @return
	 */
	public static <T>T Test(T t) 
	{
		Class class1= t.getClass();
		T aaa=null;
		try
		{
			aaa= (T) class1.newInstance();
		}
		catch (Exception e)
		{
		}
		
		return aaa;
	}
}
