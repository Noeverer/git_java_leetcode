package qiuzhao;

/**
 *
 * 糖果个数  {3,5,7,2,8,8,15,3}
 * 可选的位置{1,0,1,0,1,0,1,0}
 * 其中可让其中3全为连续1，连续1周围不能为1
 */


public class 奇安信1 {
    public static void main(String[] args) {
        int[] candies = {3,42,7,2,88,8,15,3};
        int[] coin = {1,0,1,0,1,0,1,0};
        int n = 3;
        int res = 0;
        res = maxCandies(candies,coin,n);
        System.out.println(res);
    }

    public static int maxCandies(int[] candies , int[] coin,int n){
        int ans=0;
        int[] coins = coin;
        if(coin[n]!=1){
            for(int i=0;i<n+1;i++){
                ans += candies[i];
            }
        }
        for(int i=0;i<coin.length-n-1;i++){
            int[] check = coins.clone();
                if (check[i]==0 && check[i+n+1]==0){
                    for (int j=i+1;j<i+n+1;j++){
                        check[j]=1;
                    }
                    System.out.println(check);
                    int sum = 0;
                    for(int con=0;con<coin.length;con++){
                        if(check[con]==1){
                            sum += candies[con];
                        }
                    }
                    ans = Math.max(ans,sum);
                }
        }
        return ans;

    }
}
