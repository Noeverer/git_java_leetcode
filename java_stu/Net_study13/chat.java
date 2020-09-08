package Net_study13;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class chat {
    public static void main(String[] args) throws IOException {
        System.out.println("-----sever----");
        //1.指定端口接受
        ServerSocket sever = new ServerSocket(8888);
        //2.阻塞式等待连接
        Socket client = sever.accept();
        System.out.println("一个客户端建立连接");
        //3.接受消息
        DataOutputStream dis = new DataOutputStream(client.getOutputStream());
        String datas = dis.readUTF();

        //4.返回消息
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF(msg);
        dos.flush();
    }
}
