package webserver_13.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    private ServerSocket serverSocket;


    public static void main(String[] args) throws IOException {
        Server01 server = new Server01();
        server.start();
    }
    public void start() throws IOException {
        try {
            serverSocket = new ServerSocket(8888);
            receive();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("服务器启动失败！！！");
        }
    }

    public void receive() throws IOException {
        try {
            Socket client = serverSocket.accept();
            System.out.println("客户端建立了连接！！！");
            InputStream input = client.getInputStream();
            byte[] das = new byte[1024*1024];
            int len = input.read(das);
            String requestinfo = new String(das,0,len);
            System.out.println("获取到：-->"+requestinfo);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("服务器建立了一个连接！！！");
        }

    }

    public void stop() {

    }
}
