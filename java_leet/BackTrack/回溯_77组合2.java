package BackTrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 通过List<List<Integer>>可以发现其实List是一个接口，但是我们需要使用时一定是一个类对象
 * 相当于接口是可以预留给类，最后进行初始化的
 * ArrayList
 */

public class 回溯_77组合2 {
    public static void main(String[] args) {
        int n =4,k=2;
        List<List<Integer>> ans;
        ans = combine(n,k);
        System.out.println(ans.toString());
    }

    public static List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        // 相当于我外面是一个ArrayList类，里面确定是一个List接口，但是我还没有进行初始类的工作，
        // 后面在里面调用的back时，还是往ArrayList里面添加ArrayList<Integer>
        if (k <= 0 || n <= 0) {
            return res;
        }
        ArrayList<Integer> track = new ArrayList<>();
        backtrack(n, k, 1, track , res);
        return res;
    }

    public static void backtrack(int n, int k , int start , ArrayList<Integer> track, ArrayList<List<Integer>> res){
            if (k == track.size()) {
                res.add(new ArrayList<Integer>(track));
                return;
            }
            // 注意 i 从 start 开始递增
            for (int i = start; i <= n; i++) {
                // 做选择
                track.add(i);
                backtrack(n, k, i + 1, track,res);
                // 撤销选择
                track.remove(track.size()-1);
            }
        }

}
