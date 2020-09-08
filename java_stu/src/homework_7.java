import java.util.Arrays;

/*测试尚学堂第7章题目
*https://www.sxt.cn/Java_jQuery_in_action/seven-task.html
* */

public class homework_7 {
    public static void main(String args[]) {
        System.out.println("--------尚学堂的第七章作业------------");
        question1();
        question3();
        question4();
        question33();
    }

    public static void question1() {
        // 判断下面那种形式可以表示数组
        int a[] ={1,2,3,4};
//        int b[4] = {1,2,3,4};
        int c[];
        c = new int[] {1,2,3,4};
        int d[];
        d = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
    }

    public static void question3() {
//        int t[10] = new int[ ];
//        char [ ]a=new char[5];
//        char [] a ={"a","b"};
        String [] s = new String [10];
//        System.out.println();
//        double[ ] d [ ]=new double [4][ ];
//        double[][] d;
//        double d[][];
    }

    public static void question4() {
        int [ ] numbers=new int[ ]{1,2,3};
        System.out.println(Arrays.binarySearch(numbers, 2));
    }

    public static void question5() {
        float []f[] = new float[6][6];
//        float f[][] = new float[][];
//        float [6][]f = new float[6][6];
//        float [][]f = new float[6][];
    }

    public static void question33() {
        // 调换前后循序
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int temp =0;
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 1;
            j -= 1;
        }
        System.out.println(Arrays.toString(arr));
    }

}

