package writtentest;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/14.
 */
public class NoteOne {
    // 二叉树  前序 ：左右根   中序 ： 左根右   后序 ： 跟左右

    public static void main(String[] args){
        int [] a = {1,3,5,7,9};
        int [] b = {2,4,5,7,9};
        for(int i = 0;i<a.length;i++){
            if(a[i]==b[i]){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
