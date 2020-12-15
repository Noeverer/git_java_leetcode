package qiuzhao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 测试牛客网的二位输入问题
 */

class 牛客二维输入问题{
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        List<Integer> list = new ArrayList<>();
//        for(int i=0;i<r;i++){
//            String str = sc.nextLine();
//            String[] nums = str.split(" ");
//            for (int j=0;j<c;j++){
//                list.add(Integer.valueOf(nums[j]));
//            }
//            System.out.println(list);
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        ArrayList<List<Integer>> lists = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            String[] nums = sc.nextLine().split(" ");
//            List<Integer> list = Arrays.stream(nums).map(Integer::valueOf).collect(Collectors.toList());
//            lists.add(list);
//        }
//
//        for (List<Integer> list : lists) {
//            for (int i = 0; i < list.size(); i++) {
//                System.out.print(list.get(i) + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        //出现问题在于无法将string的类型转换为character
//        Scanner sc = new Scanner(System.in);
//        int r = sc.nextInt();
//        int c = sc.nextInt();
//        ArrayList<List<Character>> grid = new ArrayList<>();
//        while(r>=0){
//            String ro = sc.nextLine();
//            String[] row = ro.split(" ");
//            List<Character> cl = new ArrayList<>();
//            for(int j=0;j<c+1;j++){
//                cl.add(ro.charAt(j));
//            }
//            grid.add(cl);
//            r--;
//        }
//    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int[][] myArray = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                myArray[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }

    }



}
