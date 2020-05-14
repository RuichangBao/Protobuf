using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using ProtoBuf;

[ProtoContract]
public class Request
{
    [ProtoMember(1)]
    public int a;

    [ProtoMember(2)]
    public int b;


    public Request()
    {

    }


    public Request(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    public override string ToString()
    {
        return "a:"+a+"     b:"+b;
    }
}