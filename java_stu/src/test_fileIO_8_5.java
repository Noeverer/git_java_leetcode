import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class test_fileIO_8_5 {
    public static void main(String[] args) throws IOException {
//        CreateFile();
//        EpochFile();
        ShowDir("I:/Java_shu",0);
    }

    public static void CreateFile() throws IOException {
        System.out.println(System.getProperty("user.dir"));
        File f = new File("a.txt"); //相对路径：默认放到user.dir目录下面
        f.createNewFile();//创建文件
        File f2 = new File("I:/b.txt");//绝对路径
        f2.createNewFile();
    }

    public static void EpochFile() {
        File f = new File("I:/b.txt");
        System.out.println("File是否存在："+f.exists());
        System.out.println("File是否是目录："+f.isDirectory());
        System.out.println("File是否是文件："+f.isFile());
        System.out.println("File最后修改时间："+new Date(f.lastModified()));
        System.out.println("File的大小："+f.length());
        System.out.println("File的文件名："+f.getName());
        System.out.println("File的目录路径："+f.getPath());
    }

    public static void CreateDir() throws IOException {
        File f = new File("I:/c.txt");
        f.createNewFile(); // 会在d盘下面生成c.txt文件
        f.delete(); // 将该文件或目录从硬盘上删除
        File f2 = new File("d:/电影/华语/大陆");
        boolean flag = f2.mkdir(); //目录结构中有一个不存在，则不会创建整个目录树
        System.out.println(flag);//创建失败
    }


    /*不断递归调用打印根目录
    *学到1. 函数中迭代调用；2.File添加进list进行for循环
    * */
    public static void ShowDir(String filepath, int level) {
        File f = new File(filepath);
        PrintFile(f,level);
    }
    // 添加private变成私有，默认不写是公用
        static void PrintFile(File file,int level){
            for (int i=0;i<level;i++){
                System.out.print("---");
            }
            System.out.println(file.getName());
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for(File temp : files){
                    PrintFile(temp,level+1);
                }
            }
        }


}
