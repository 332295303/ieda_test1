package Day12.CopyFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws Exception{
        ServerSocket ss=new ServerSocket(6666);
        Socket ss1 = ss.accept();
        FileWriter fileWriter=new FileWriter("wenjian.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(ss1.getInputStream()));
        String line;
        while ((line=br.readLine())!=null){
            fileWriter.write(line);
            fileWriter.flush();
        }
    }
}
