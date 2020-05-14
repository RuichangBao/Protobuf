package com.testServer.game;

import javax.xml.validation.Schema;

import com.cmd.Request;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		Request request=new Request(1,2);
		
	}
	
//	/**
//	 * 序列化为protostuff格式，体积非常小
//	 * 
//	 * @param obj
//	 * @return
//	 */
//	public static <T> byte[] serializer_protobufIOUtil(T obj)
//	{
//		Class<T> clazz = (Class<T>) obj.getClass();
//		LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
//		try
//		{
//			Schema<T> schema = getSchema(clazz);
//
//		        return ProtobufIOUtil.toByteArray(obj, schema, buffer);//
//		}
//		catch (Exception e)
//		{
//			throw new IllegalStateException(e.getMessage(), e);
//		}
//		finally
//		{
//			buffer.clear();
//		}
//	}
}
