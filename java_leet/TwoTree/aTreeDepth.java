package TwoTree;

import com.sun.source.tree.Tree;
import java.util.ArrayList;

/**
 * 给定先序和中序，求取树的深度
 */


public class aTreeDepth {
    public int dfs(TreeNode pre , TreeNode in , int n){
        if (n==0){
            return 0;
        }
        for(int i=0;i<n;i++){
            if (in.val ==pre.val){
                break;
            }
//            int left = dfs((ArrayList) pre.subList(0,i),in,i);
//            int right = dfs(pre.subList(),in+i+1,n-i-1);
//            return math.max(left,right)+1;
        }
        return 1;
    }
}
