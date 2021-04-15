package Day12.AddressDemo;

import com.sun.jndi.cosnaming.IiopUrl;
import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.net.InetAddress;
import java.net.UnknownHostException;
//InetAddress.getByName("172.20.10.11")  方法演示
public class AddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("172.20.10.11");
        System.out.println(byName.getAddress());
        System.out.println(byName.getHostAddress());//获取主机地址
        System.out.println(byName.getHostName());//获取主机名字
    }
}
