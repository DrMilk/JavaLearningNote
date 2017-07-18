package notearithmetic;

/**
 * Created by Administrator on 2017/7/18.
 *
 * 选择排序
 *
 */
public class WuSelectionSort {
    public void testWuSelectionSort(){
        int [] a = { 2,7,9,10,5,4,1,3,6,8};
        int min,max;
        min = a[0];
        max = a[0];
        for (int i=1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
        }
    }
}
