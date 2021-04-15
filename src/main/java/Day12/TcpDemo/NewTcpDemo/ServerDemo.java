package Day12.TcpDemo.NewTcpDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) {
        ServerSocket s = null;

        try{
            s=new ServerSocket(5555);
            Socket accept = s.accept();
            InputStream inputStream = accept.getInputStream();
            byte []by=new byte[1024];
            int read = inputStream.read(by);
            String s1=new String(by,0,read);
            System.out.println(s1);
            OutputStream outputStream = accept.getOutputStream();
            outputStream.write("客户端你好  服务器收到".getBytes());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                s.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
