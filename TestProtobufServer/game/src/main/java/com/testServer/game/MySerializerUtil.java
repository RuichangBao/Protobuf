package com.testServer.game;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;

public class MySerializerUtil
{
	public static <T> byte[] serialize(T t)
	{
		if(t==null)
		{
			System.err.println("序列化对象为空");
			return new byte[] {};
		}
		//缓冲区
		LinkedBuffer linkedBuffer= LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
		Class clazz=t.getClass();
		//缓冲对象
		RuntimeSchema<T> runtimeSchema=RuntimeSchema.createFrom(clazz);
		//将对象序列化成字节数组
		return ProtobufIOUtil.toByteArray(t,runtimeSchema ,linkedBuffer);
	}

	public static <T> T deSerialize(byte[] data, Class<T> clazz)
	{
		RuntimeSchema<T> runtimeSchema = RuntimeSchema.createFrom(clazz);
		T t = runtimeSchema.newMessage();
		ProtobufIOUtil.mergeFrom(data, t, runtimeSchema);
		return t;
	}
}
