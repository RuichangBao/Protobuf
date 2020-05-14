using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System;
using System.IO;
using Microsoft.Win32.SafeHandles;
using System.Runtime.Serialization.Formatters.Binary;
using System.Net;

public class Test : MonoBehaviour
{

    // Use this for initialization
    void Start()
    {
        Debug.LogError(Dns.GetHostName().ToString());
        //测试修改
        //Request request = new Request(1, 2);
        //byte[] data= MySerializerUtil.Serialization(request);
        //Debug.LogError("序列化完成");
        //Request re2 = MySerializerUtil.NoSerialization<Request>(data);
        //Debug.LogError(re2.ToString());
    }
}