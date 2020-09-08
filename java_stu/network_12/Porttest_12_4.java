package network_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

public class Porttest_12_4 {
    public Porttest_12_4() throws Exception {
    }

    public static void main(String[] args) throws Exception {
        GetHost();
        GetWebsite();
    }

    public static void GetWebsite() throws Exception {
        URL url = new URL("https://www.jd.com");

        //添加header
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.132 Safari/537.36");

        InputStream is = url.openStream();
//        BufferedReader br = new BufferedReader(new InputStreamReader(is,"utf8"));
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf8"));
        String msg = null;
        while((msg = br.readLine())!=null) {
            System.out.println(msg);
        }
        br.close();
    }

    public static void GetHost() {
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 8080);
        InetSocketAddress socketAddress2 = new InetSocketAddress("localhost", 9000);
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress2.getAddress());
        System.out.println(socketAddress.getPort());
        System.out.println(socketAddress2.getPort());
    }
}
