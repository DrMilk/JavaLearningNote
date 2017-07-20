package notearithmetic;

/**
 * Created by Administrator on 2017/7/20.
 *
 * 直接查找
 */
public class WuDirectSearch {
    public int testWuDirectSearch(int [] a,int key){
        int index = -1;
        for (int i=0;i<a.length;i++){
            if (key==a[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}
