package qiuzhao;

import javafx.scene.shape.LineTo;

import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int ans = 0;
        ans = maxPC(length);
        System.out.println(ans);
    }


    public static int maxPC(int length){

        int[] pros = new int[length+1];
        pros[0]=0;
        pros[1]=1;
        pros[2]=2;
        pros[3]=3;

        if (length<2){
            return 0;
        }
        else if (length==2){
            return 1;
        }
        else if (length==3){
            return 2;
        }else {

        for (int i=4;i<=length;i++){
            int maxmod =0;
            for(int j=1;j<=i/2;j++){
                int pro = pros[j]*pros[i-j];
                if (pro>maxmod) {
                    maxmod = pro;
                }
            }
            pros[i]=maxmod;
        }
        return pros[length];
        }
    }

}
