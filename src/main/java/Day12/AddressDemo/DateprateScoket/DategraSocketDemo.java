package Day12.AddressDemo.DateprateScoket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//DatagramSocket  套接字类 用来发送和接收数据
public class DategraSocketDemo {
    public static void main(String[] args)throws Exception {
        DatagramSocket socket=new DatagramSocket();
        InetAddress byAddress = InetAddress.getByName("172.20.10.11");
        byte [] by="hello world".getBytes();
        DatagramPacket datagramPacket=new DatagramPacket(by,by.length,byAddress,10086);
        socket.send(datagramPacket);
        socket.close();
    }
}
