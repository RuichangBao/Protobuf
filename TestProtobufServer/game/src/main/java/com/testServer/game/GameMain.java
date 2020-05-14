package com.testServer.game;

import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import com.cmd.Request;

/**
 * Hello world!
 *
 */
public class GameMain
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		Agreement agreement = new Agreement();
		agreement.start();

		Request request = null;
		byte[] data = MySerializerUtil.serialize(request);
		Request request2 = MySerializerUtil.deSerialize(data, Request.class);

		System.out.println(request2.toString());

	}

}
