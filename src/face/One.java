package face;

/**
 * Created by Administrator on 2017/8/12.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp;
        boolean state = true;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            temp = sc.nextInt();
            list.add(temp);
        }
        if(n%2==1){

        } else {
            for(int i=n-1;i>=0;i--){
                if(i%2==0){

                }
                System.out.print(b.get(i));
                if(i!=0)
                    System.out.print(" ");
            }
        }
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            if(state){
//                b.add((Integer) iterator.next());
//                state=false;
//            }else {
//                b.add(0, (Integer) iterator.next());
//                state=true;
//            }
//        }
//        if(n%2==1){
//            for(int i=n-1;i>=0;i--){
//                System.out.print(b.get(i));
//                if(i!=0)
//                    System.out.print(" ");
//            }
//        }else {
//            for(int i=0;i<n;i++){
//                System.out.print(b.get(i));
//                if(i!=n-1)
//                    System.out.print(" ");
//            }
//        }

    }
}