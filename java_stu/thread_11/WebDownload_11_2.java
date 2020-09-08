package thread_11;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/*创建线程的方式1：
* java创建线程的其中一中办法：使用extends，修改run方法
* 但是这种方式的缺点在于Thread只能使用单继承的方式【即我们所写的WebDownload不能给别人继承使用】
*
* 创建线程的方式2：
* 实现重新实现implement的方式【我的理解就是添加】
* */

public class WebDownload_11_2 implements Runnable{
//    public class WebDownload_11_2 extends Thread{
    private String url;
    private String name;

    //***### reconstruct => point the class WebDownload_11_2 argument ###***
    public WebDownload_11_2(String url, String name) {
        this.name = name;
        this.url = url;
    }

    @Override
    public void run() {
        WebDownload_11_2 wb = new WebDownload_11_2(url,name);
        wb.WebDownload(url,name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        WebDownload_11_2 dt1 = new WebDownload_11_2("http://5b0988e595225.cdn.sohucs.com/images/20180811/777ca7fe36194865b8270b8f762a0255.jpeg","1.jpeg");
        WebDownload_11_2 dt2 = new WebDownload_11_2("http://5b0988e595225.cdn.sohucs.com/images/20180811/777ca7fe36194865b8270b8f762a0255.jpeg","2.jpeg");
        WebDownload_11_2 dt3 = new WebDownload_11_2("http://5b0988e595225.cdn.sohucs.com/images/20180811/777ca7fe36194865b8270b8f762a0255.jpeg","3.jpeg");

        //multi download【使用extends Thread 】
//        dt1.start();
//        dt2.start();
//        dt3.start();

        //相当于添加进代理池进行运行【使用implement Runable】
//        new Thread(dt1).start();
//        new Thread(dt2).start();
//        new Thread(dt3).start();
    }

    // under the file class WebDownload implement method WebDownload

    //好像只有设置静态对象才可以两个java文件中相互调用
    public void WebDownload(String url, String name) {
        try{
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            System.out.println("Un use URL");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Download Error");
        }
    }
}
