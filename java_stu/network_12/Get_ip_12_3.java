package network_12;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Get_ip_12_3 {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        //返回IP地址：192.168.1.110
        System.out.println(addr.getHostAddress());
        //输出计算机名：Robotliu
        System.out.println(addr.getHostName());


        //根据DNS中域名地址，返回IP地址
        InetAddress addre = InetAddress.getByName("www.sxt.cn");
        // 返回 sxt服务器的IP:59.110.14.7
        System.out.println(addre.getHostAddress());
        // 输出：www.sxt.cn
        System.out.println(addre.getHostName());
    }
}
