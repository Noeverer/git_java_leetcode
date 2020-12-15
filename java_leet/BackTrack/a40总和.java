package BackTrack;

import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class a40总和 {
    private static List<List<Integer>> ans;


    public static void main(String[] args) {
        int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> res = combinationSum2(candidates, target);
        System.out.println("输出 => " + res);

    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        ArrayList<Integer> new_can = new ArrayList<>();
//        Arrays.sort(candidates);
        List<Integer> cur = new ArrayList<>();
        back(cur,0,target,candidates);
        System.out.println(ans);
        return ans;
    }

    public static void back(List<Integer> cur, int site, int target, int[] candidates) {
        int sum = 0;
        for(int cu:cur){
            sum = sum + cu;
        }
        if(sum == target){
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=site;i<candidates.length;i++){
            cur.add(candidates[i]);
            back(cur,i+1,target,candidates);
            cur.remove(cur.size()-1);
        }
    }
}
