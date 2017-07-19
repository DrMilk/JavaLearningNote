package notearithmetic;

/**
 * Created by Administrator on 2017/7/18.
 *
 * 选择排序
 * 第一层for循环是比较一轮 每次比较出一个最小的数
 * 第二册for循环是两两比较 结果比较出一个最小的数
 * if条件 如果后面比前面小 进行调换
 */
public class WuSelectionSort {
    public void testBigSmallCount(){
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
    public void testWuSelection(){
        int [] a ={2,7,9,10,5,4,1,3,6,8};
        int n = a.length;
        for(int k=0;k<n-1;k++){
            int min = k;
            for (int i=k+1;i<n;i++){
                if(a[i]<a[min]){
                    min=i;
                }
            }
            if(k!=min){
                int temp = a[k];
                a[k] = a[min];
                a[min] = temp;
            }
        }
        for(int x:a){
            System.out.print(x+"");
        }
    }
}
