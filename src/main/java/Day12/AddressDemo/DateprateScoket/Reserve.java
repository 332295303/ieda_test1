package Day12.AddressDemo.DateprateScoket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
//用于接收数据
/*
* 1 创建datagramSocket对象 指定端口号
* 2 创建dategrampacket对象  指定里面的数组以及长度
* 3 调用datagramsocket对象的receive方法 datagrampacket 对象作为参数
* 4
* */
public class Reserve {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(10086);
        byte []by=new byte[1024];
        DatagramPacket packet=new DatagramPacket(by,by.length);
        socket.receive(packet);
        /*byte[] data = packet.getData(); //返回缓冲区 用数组用来接收
        String s=new String(data);*/
        System.out.println(new String(packet.getData(),0,packet.getLength()));
    }
}
