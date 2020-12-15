package qiuzhao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class qunaer {

    public static List<int[]> collect = new ArrayList<int[]>();

    public static void permutation(List a, int begin0, int begin, int mid1, int mid2, int end, int selectNum) {

        int[] temp = new int[selectNum];
        System.arraycopy(a, begin0, temp, 0, selectNum);
        collect.add(temp);

        for (int t = begin; t < mid1; t++) {
            for (int j = mid2; j < end; j++) {
                int temp0 = a[t];
                a[t] = a[j];
                a[j] = temp0;
                permutation(a, begin0, t + 1, mid1, j + 1, end, selectNum);
                a[j] = a[t];
                a[t] = temp0;
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  //总人数
        int n = sc.nextInt();  //挑选人数
        List<Integer> a = new ArrayList<>();
        for(int i=0; i<=m;i++){
            a.add(i);
        }
        int begin = 0; //从哪里开始选
        int selectNum = n; //选择几个

        int mid = begin + selectNum;
        if(mid <= m)
            permutation(a, begin, begin, mid, mid, a.size(), selectNum);

        int[][] b = new int[collect.size()][]; // 打印验证
        collect.toArray(b);
        for (int i = 0; i < b.length; i++) {
            int[] nums = b[i];
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[j]);
            }
            System.out.println();
        }
    }



}
 */
