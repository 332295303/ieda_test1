package Day12.NewFileCopy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(9999);
        //拿到客服的的链接
        //服务器一直运行
        while(true){
            // 拿到一个新的Socket  就创建一个线程
            new Thread(new ThreadDemo(ss.accept())).start();
        }

    }
}
