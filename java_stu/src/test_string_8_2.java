public class test_string_8_2 {
    /*总体而言：Builder操作性没有Buffer强，
    并且8.2.2章节说Buffer也还比较安全，但是效率比较低
    1. String：不可变字符序列。
    2. StringBuffer：可变字符序列，并且线程安全，但是效率低。
    3. StringBuilder：可变字符序列，线程不安全，但是效率高(一般用它)。
    ----总结于【8.2.3】
    * */

    public static void main(String[] args) {
        /*StringBuilder*/
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            sb.append((char) ('a' + i));//追加单个字符
        }
        System.out.println("Builder 添加ascii码转化："+sb.toString());//转换成String输出
        sb.append(", I can sing my abc!");//追加字符串
        System.out.println("String Builder:"+sb.toString());

//        /**StringBuffer*/
        StringBuffer sb2 = new StringBuffer("中华人民共和国");
        sb2.insert(0, "爱").insert(0, "我");//插入字符串
        System.out.println("String Buffer:"+sb2);
        sb2.delete(0, 2);//删除子字符串
        System.out.println("改变字符串长度String Buffer："+sb2);
        sb2.deleteCharAt(0).deleteCharAt(0);//删除某个字符
        System.out.println(sb2.charAt(0));//获取某个字符
        System.out.println(sb2.reverse());//字符串逆序
    }
}

