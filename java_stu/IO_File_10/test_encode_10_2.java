import java.io.*;
import java.nio.Buffer;
import java.util.TreeSet;


public class test_encode_10_2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
//        TestEncode();
//        ContentDecode();
//        read_file();
//        put_file("b.txt");
        copy("a.txt","c.txt");
        copy("a.jpg","a-copy.jpg");
    }

    public static void TestEncode() {
        File msg = new File("a.txt");
//        msg = new String(msg);
        StringBuffer sb = new StringBuffer();
        sb.append(msg);
        System.out.println(sb);
    }

    //encoding : utf8[] => bytes => utf8
    public static void ContentDecode() throws UnsupportedEncodingException{
        String msg = "此刻，你在世界的中心，或者就在中心的边缘。";
        byte[] byte_data = msg.getBytes();
        msg = new String(byte_data,0,byte_data.length,"utf8");
        System.out.println(msg);
    }

    public static void read_file() {
//        InputStream fis = null;
        File fs = new File("a.txt");
        InputStream fr = null;
        try{
            fr = new FileInputStream(fs);
            StringBuffer sb = new StringBuffer("=>");
            int flag_end;
            while((flag_end=fr.read())!=-1){
                //为什么fis.read()不管有没有东西全是输入为-1？？【因为之前source dir 在Java_shu目录下面】]
                System.out.println((char)flag_end);
                sb.append((char)flag_end);
            }
            System.out.println(sb);
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
               if(fr!=null){
                   fr.close();
               }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void put_file(String putfile_path) {
        File fs = new File(putfile_path);
        OutputStream fo = null;
        try {
            fo = new FileOutputStream(fs,true);
            String msg = "Io is so easy\r\n";
            byte[] msg_byte = msg.getBytes();
            fo.write(msg_byte,0,msg_byte.length);
            fo.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(fo!=fo){
                    fo.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copy(String indir, String outdir) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(indir);
            fos = new FileOutputStream(outdir,true);
            byte[] fos_col = new byte[1024];

            int b_len = -1;
            while ((b_len=fis.read(fos_col))!=-1){
                fos.write(fos_col,0,b_len);  //好像还是copy不进去【只是idea刷新比较延迟，方法还是正确的】
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try{
                if(fis!=null){
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
