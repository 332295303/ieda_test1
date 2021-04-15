package Day12.TcpDemo;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketDemo {
    public static void main(String[] args)throws Exception {
        Socket s=new Socket(InetAddress.getByName("172.20.10.11"),10086);
        OutputStream outputStream = s.getOutputStream();
        outputStream.write("hello tco 你好".getBytes());
        s.close();

    }
}
