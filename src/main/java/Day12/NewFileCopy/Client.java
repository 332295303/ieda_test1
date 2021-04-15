package Day12.NewFileCopy;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws Exception {
        Socket s=new Socket("172.20.10.11",9999);
        //读取本地文件
        BufferedReader br=new BufferedReader(new FileReader("1.txt"));
        String line;
        //拿到客户端的输出流
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        while ((line=br.readLine())!=null){
                bw.write(line);//向服务端发送数据
                bw.newLine();
                bw.flush();
        }
        s.shutdownOutput();
        BufferedReader brServer=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String s1;
        s1 = brServer.readLine();
        System.out.println(s1);
        brServer.close();
        bw.close();
        br.close();
        s.close();
    }
}
