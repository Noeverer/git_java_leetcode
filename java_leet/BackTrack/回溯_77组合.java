package BackTrack;

import javax.naming.CompositeName;
import java.util.*;

public class 回溯_77组合 {
//    public static LinkedList<List<Integer>> res ;
//    List<List<Integer>> res = new LinkedList<>();


    public static List<List<Integer>> reses = new ArrayList<>();
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        while(ac.hasNext()){
            int n = ac.nextInt();
            int k = ac.nextInt();
            if(n<k || k<=0){
                System.out.println("No");
            }
//            List<List<Integer>> reses = new ArrayList<>();
            LinkedList<Integer> curr = new LinkedList<>();
            back(curr,1,k,n,reses);
            // res.add(Collections.singletonList(1));
            System.out.println(reses);
            break;
        }
    }

    public static void back(List<Integer> curr, int site, int k, int n,List<List<Integer>> reses){
        if(curr.size() == k){
//            System.out.println(reses);
            reses.add(new ArrayList<>(curr));
            return;
        }
        if(k>0){
            for(int i = site;i<=n;i++){
                curr.add(i);
                back(curr,i+1,k,n,reses);
                curr.remove(curr.size()-1);
            }
        }
    }

}
