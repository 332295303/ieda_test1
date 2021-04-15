package Day12.AddressDemo.Udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receice {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket=new DatagramSocket(15555);
        while (true){

            byte [] by=new byte[1024];
            DatagramPacket datagramPacket=new DatagramPacket(by,by.length);
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        }


    }
}
