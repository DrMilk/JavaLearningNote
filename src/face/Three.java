package face;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int all = 0;
        int a,b;
        int [] count = new int[n];
        for(int i = 0; i < n; i++){
            count[i] = sc.nextInt();
        }
        if(n%2==1){
            a=n/2;
            b=a-1;
            for(int i=0;i<n-1;i++){
                all += Math.abs(count[a]-count[b]);
                a=b;
                if(i%2==1){
                    b = b-(i+1);
                }else {
                    b = b+(i+1);
                }
            }
        }
    }
}
