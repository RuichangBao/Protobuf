using System;
using System.Collections;
using System.Collections.Generic;
using System.Net;
using System.Net.Sockets;
using UnityEngine;

public class NetWorkClient : MonoBehaviour
{
    public string ip = "127.0.0.1";
    public int port = 6666;

    private static byte[] readData = new byte[0xFFFF];
    private static Queue queue_sendMission;
    const int buffSize = 0xFFFF;
    TcpClient tcp;

    // Use this for initialization
    void Start()
    {
        IPAddress address = IPAddress.Parse(ip);
        IPEndPoint endpoint = new IPEndPoint(address, port);
        //创建服务端负责监听的套接字，参数（使用IPV4协议，使用流式连接，使用TCO协议传输数据）
        Socket socketClient = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp);
        socketClient.Connect(endpoint);
        if (socketClient.Connected)
        {
            Debug.LogError("链接成功");
            socketClient.Send(new byte[] { 1,2,3,4,5,6});
        }
        else
        {
            Debug.LogError("链接失败");
        }
    }
}