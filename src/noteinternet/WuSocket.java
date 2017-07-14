package noteinternet;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2017/7/13.
 *
 * 1.IP和端口的具体意义
 *  - IP定位网络中的一台主机
 *  - 端口定位主机的一个网络程序
 * 2. InetAddress :对象表示网路中的一个地址
 * InetAddress address = InetAddress.getByName();
 *
 * 3 TCP/IP 编程：
 * - 服务器/客户端，B\S C\S 客户端发送请求到服务器，服务器接收请求，给予响应到客户端
 * - ServerSocket
 * - Socket
 */
public class WuSocket {
    /**
     *  InetAddress:表示互联网（或局域网）的一台主机的地址
     *  Internet上的主机有两种方式表示地址：
     * 域名：www.baidu.com
     * IP 地址：61.135.169.125
     * InetAddress 类对象含有一个 Internet 主机地址的域名和IP地址：www.baidu.com/61.135.169.125。
     */
    public void testInetAddress() throws UnknownHostException {
        InetAddress address = InetAddress.getByName("www.baidu.com");
        System.out.println(address);
        InetAddress address1 = InetAddress.getLocalHost();
        System.out.println(address1);
    }

    public void testServerSocket(){
        try {
            //创建 ServerSocket 对象
            ServerSocket serverSocket = new ServerSocket(8989);
            //接收客户端的请求 ,并得到Socket 对象
            Socket socket = serverSocket.accept();

            //通过输入输出流 和客户端进行交互
            OutputStream out = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(out);
            pw.write("来自服务器的问候");
            pw.close();
            out.close();

            //遍历 Socket 资源
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void testSocket(){
        try {
        InetAddress address = InetAddress.getByName("192.168.1.104");
        //创建Socket 对象：同时也向服务器端发送请求
            Socket socket = new Socket(address,8989);

            //通过输入输出流与服务端进行交流
            InputStream is = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            System.out.println(reader.readLine());
            reader.close();
            is.close();
            //关闭socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testServerSocket2() throws IOException{
        ServerSocket serverSocket = new ServerSocket(8686);
        Socket socket = serverSocket.accept();

        InputStream is = new FileInputStream("F:\\测试.txt");
        byte [] bytes = new byte[1024];
        int len = 0;

        OutputStream outputStream = socket.getOutputStream();
        while ((len = is.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
        }
        outputStream.close();
        is.close();
        socket.close();
        serverSocket.close();
    }

    public void testClientSocket2() throws IOException{
        InetAddress inetAddress = InetAddress.getByName("192.168.1.104");
        Socket socket = new Socket(inetAddress,8686);
        InputStream is = socket.getInputStream();
        OutputStream os = new FileOutputStream("F:\\测试1.txt");
        byte [] buffer = new byte[1024];
        int len = 0;
        while ((len = is.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        is.close();
        os.close();
        socket.close();
    }
}
