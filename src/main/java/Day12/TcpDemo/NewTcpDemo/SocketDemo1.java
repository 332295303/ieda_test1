package Day12.TcpDemo.NewTcpDemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketDemo1 {
    public static void main(String[] args)throws Exception {
        Socket s=new Socket(InetAddress.getByName("172.20.10.11"),5555);
        OutputStream outputStream = s.getOutputStream();
        outputStream.write("服务器 你好 我是客户端".getBytes());
        InputStream inputStream = s.getInputStream();
        byte [] by=new byte[1024];
        inputStream.read(by);
        String s1=new String(by,0,by.length);
        System.out.println(s1);

    }
}
