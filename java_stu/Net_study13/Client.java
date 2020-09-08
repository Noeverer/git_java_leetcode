package Net_study13;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("------client-----------");
        //1.连接客户端
        Socket client = new Socket("localhost",8888);
        //2.发送消息到客户端
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String msg = console.readline();
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF(msg);
        dos.flush();
    }
}
