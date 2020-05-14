using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;
using UnityEngine;
using ProtoBuf;

public class MySerializerUtil
{

    public static byte[] Serialization<T>(T obj)
    {
        if (obj == null)
        {
            Debug.LogError("序列化对象为空");
            return new byte[0];
        }
        using (MemoryStream memoryStream = new MemoryStream())
        {
            Serializer.Serialize(memoryStream, obj);
            byte[] data = new byte[memoryStream.Length];
            memoryStream.Position = 0L;
            memoryStream.Read(data, 0, data.Length);
            memoryStream.Dispose();
            return data;
        }
    }


    public static T NoSerialization<T>(byte[] data)
    {
        MemoryStream memoryStream = new MemoryStream(data);
        return Serializer.Deserialize<T>(memoryStream);
    }


    /*********************C#序列化反序列化 Start***************************
    public static byte[] Serialization(object obj)
    {
        using (MemoryStream memoryStream = new MemoryStream())
        {
            BinaryFormatter binaryFormatter = new BinaryFormatter();
            binaryFormatter.Serialize(memoryStream, obj);
            return memoryStream.GetBuffer();
        }
    }
    public static object NoSerialization(byte[] data)
    {
        using (MemoryStream memoryStream = new MemoryStream(data))
        {
            BinaryFormatter binaryFormatter = new BinaryFormatter();
            return binaryFormatter.Deserialize(memoryStream);
        }
    }
    *********************C#序列化反序列化 end***************************/
}
