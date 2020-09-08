package thread_11;

public class Start_Run_11_3 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<50;i++){
            System.out.println(i+"---一边听歌");
        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Start_Run_11_3 sr = new Start_Run_11_3(); // implement class
        Thread t = new Thread(sr); //创建代理类的对象【相当于python中添加进线程池的作用???】

        //也可以使用匿名方式进行申明【前提是只使用一次的对象】
        //Thread t = new Thread(new Start_Run_11_3());

        t.start();
//        t.run();
        for (int i=51;i<100;i++){
            System.out.println(i+"+++一边敲代码");
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("using total time: %d\n",(endTime-startTime));
    }
}
