package com.testServer.game;

import javax.xml.validation.Schema;

import com.cmd.Request;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
/**
 * Hello world!
 *
 */
public class GameMain
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		Request request=new Request(1,2);
		byte[]data= MySerializerUtil.serialize(request,Request.class);
		Request request2=MySerializerUtil.deSerialize(data, Request.class);
		
		System.out.println(request2.toString());
	}
	
}
