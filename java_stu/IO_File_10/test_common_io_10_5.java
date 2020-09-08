import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class test_common_io_10_5 {
    public static void main(String[] args) throws IOException {
//        SizeOfFile();
//        ReadFile();
//        OutFile();
        CommonCopy();
    }

    public static void SizeOfFile() {
        //文件的大小
        long len1 = FileUtils.sizeOf(new File("a.txt"));
        System.out.println(len1);
//        len2 = new FileUtils.sizeOfDirectory('');
//        System.out.println(len2);
    }

    public static void ReadFile() throws IOException {
        //read file all
        String msg = FileUtils.readFileToString(new File("a.txt"),"UTF-8");
        System.out.println(msg);
        //read file as bytes
        byte[] msg_b = FileUtils.readFileToByteArray(new File("a.txt"));
        System.out.println(msg_b.length);
        //read one line
        List<String> msg_list = FileUtils.readLines(new File("a.txt"),"utf8");
        for (String msg_ls:msg_list){
            System.out.println("---"+msg_ls);
        }
        //read as iterate
        LineIterator msg_iter = FileUtils.lineIterator(new File("a.txt"),"utf8");
        while (msg_iter.hasNext()){
            System.out.println("+++"+msg_iter.nextLine());
        }
    }

    public static void OutFile() throws IOException {
        //output file as format as utf8
        FileUtils.write(new File("10_5_io.txt"),"你好哇，这里是学在学习文件写入！！！\r\n","utf8",true);
        //output file as format as utf8
        FileUtils.writeStringToFile(new File("10_5_io_1.txt"),"好呀，练习writeStringToFile\r\n","utf8",true);
        //output file as bytes
        FileUtils.writeByteArrayToFile(new File("10_5_bytes.txt"),"有钱淫的生活就是那么枯燥且乏味".getBytes("utf8"),true);
    }

    public static void CommonCopy() throws IOException {
        //copy file
        FileUtils.copyFile(new File("a-copy.jpg"),new File("a-copy2.png"));
    }


}
