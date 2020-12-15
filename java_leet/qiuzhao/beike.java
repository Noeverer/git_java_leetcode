package qiuzhao;

import java.util.Scanner;

public class beike {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int num = sc.nextInt();
            String str = sc.next();
            int max = 0;
            for (int i = 1; i <= num/2; i++) {
                if (str.substring(0, i).equals(str.substring(i, 2*i))) {
                    if (i > max) {
                        max = i;
                    }
                }
            }
            System.out.println(num - max + 1);
        }
    }
}
