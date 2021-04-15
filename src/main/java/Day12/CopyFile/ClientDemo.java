package Day12.CopyFile;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args)throws  Exception {
        Socket s=new Socket(InetAddress.getByName("172.20.10.11"),6666);
        File file=new File("filefile.txt");
        if (!file.exists()){
            file.createNewFile();
        }

        FileReader fileReader=new FileReader(file);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br=new BufferedReader(fileReader);
        String line;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
      /*  InputStream inputStream = s.getInputStream();
        byte [] by=new byte[1024];
        while (inputStream.read(by)){

        }
        int len = inputStream.read(by);*/
    /*    String str=new String(by,0,len);*/
      //  System.out.println(str);

    }
}
