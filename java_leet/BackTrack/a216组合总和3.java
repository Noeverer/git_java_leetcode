package BackTrack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 *
 * 说明：
 *
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 *
 * 输入: k = 3, n = 7
 * 输出: [[1,2,4]]
 * 示例 2:
 *
 * 输入: k = 3, n = 9
 * 输出: [[1,2,6], [1,3,5], [2,3,4]]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class a216组合总和3 {

    public static void main(String[] args) {
         List<List<Integer>> res = new ArrayList<>();
//        Scanner scan =new Scanner(System.in);
//        String[] sc = scan.nextLine().split(",");
//        while(scan.hasNext()){
//            int k = Integer.valueOf(sc[0]);
//            int n = Integer.valueOf(sc[1]);
//        没有解决从控制台解决输入输出的问题
            int k=3,n=9;
            int start = 1;
            List<Integer> path = new ArrayList<Integer>();
            back(k,n,path,start,res);
            System.out.println(res);
    }
    public static void back(int k,int n,List<Integer> path,int start,List<List<Integer>> res){
        if(path.size()==k){
            if(sum(path)==n){
                res.add(new ArrayList<>(path));
                return;
            }
        }
        for(int i=start;i<=9;i++){
            if(path.size()>k){
                break;
            }
            path.add(i);
            back(k,n,path,i+1,res);
            path.remove(path.size()-1);
        }
    }

    public static int sum(List<Integer> path){
        int ans = 0;
        for (int pa:path){
            ans += pa;
        }
        return ans;
    }

}
