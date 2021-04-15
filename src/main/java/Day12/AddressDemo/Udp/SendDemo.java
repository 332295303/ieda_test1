package Day12.AddressDemo.Udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//多人聊天发送端
public class SendDemo {
    public static void main(String[] args)throws  Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket ds= new DatagramSocket();
        String line;
        String addRess="172.20.10.11";
        while ((line=br.readLine())!="886"){

            DatagramPacket dp=new DatagramPacket(line.getBytes(),line.length(), InetAddress.getByName(addRess),15555);
            ds.send(dp);
        }
        ds.close();
    }
}
