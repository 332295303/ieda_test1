package Day12.NewFileCopy;

import java.io.*;
import java.net.Socket;

public class ThreadDemo implements  Runnable  {
    Socket s;
    ThreadDemo(Socket socket){
        s=socket;
    }
    public void run() {
        try {

            int count=0;
            //拿到读取流
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String line;
            //创建文件输入流

            File file=new File("file"+count+"");
            while (file.exists()){
                count++;
               file=new File("file"+count+"");

            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));


            while ((line = br.readLine()) != null) {//将流中数据写道文件中
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            BufferedWriter bwClient = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwClient.write("文件上传成功");
            bwClient.newLine();
            bwClient.flush();
            bwClient.close();
            bw.close();
            br.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


}
