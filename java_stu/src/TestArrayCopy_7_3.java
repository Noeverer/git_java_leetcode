import java.util.Arrays;

public class TestArrayCopy_7_3 {
    public static void main(String[] args) {
        testBasicCopy();
        testBasicCopy2();
        testTableData();

}

    public static void testBasicCopy() {
        System.out.println("-----是个测试数组用的东西！！！------");
    }

    public static void testBasicCopy2() {
        String[] s1 = {"aa","bb","cc","dd","ee"};
        String[] s2 = new String[10];
        System.arraycopy(s1,2,s2,6,3);
        for (int i=0;i<s2.length;i++){
            System.out.println(i+ "--"+s2[i]); }
    }
    public static void testTableData() {
        Object[] stu1 = {1001,"刘向前",18,"student","2020.3.14"};
        Object[] stu2 = {1002,"刘向",18,"teacher","2020.3.15"};
        Object[] stu3 = {1003,"刘",18,"student","2020.3.16"};
        Object[][] tableData = new Object[3][];
        tableData[0] = stu1;
        tableData[1] = stu2;
        tableData[2] = stu3;
        for (Object[] temp:tableData){
            System.out.println(Arrays.toString(temp));
        }
    }


}

