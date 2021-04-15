package Day12.TcpDemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerDemmo {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket=new ServerSocket(10086);
        Socket accept = serverSocket.accept();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(accept.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new FileWriter("filefile.txt"));
       String line;
       while ((line=bufferedReader.readLine())!=null){
           bw.write(line);
           bw.newLine();
           bw.flush();
       }
       BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
       bufferedWriter.write("文件上传成功");
       bufferedWriter.newLine();
       bufferedWriter.flush();
       bufferedWriter.close();
       bw.close();
       serverSocket.close();
    }

}
