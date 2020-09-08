package thread_11;
import org.apache.commons.io.FileUtils;
import java.lang.Thread;


//主函数extends方法后，这个函数就具有Thread的属性
public class thread_create_11_1 {

    public static void main(String[] args) {
        CreateThread st = new CreateThread();
        st.start();  //非重写类，多线程同时执行，是别人封装好叻，不保证线程立即执行
//        st.run();  //普通方式的调用，先执行run，再去执行接下来
        for (int i=8;i<13;i++){
            System.out.println(i+">>>一边写代码");
        }
    }

    //对Thread.run类进行重写
    public static class CreateThread extends Thread {
        @Override
        public void run() {
            for (int i=0;i<=5;i++){
                System.out.println(i+"+++一边听歌");
            }
        }
    }

}
