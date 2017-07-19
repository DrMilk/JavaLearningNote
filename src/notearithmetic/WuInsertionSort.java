package notearithmetic;

/**
 * Created by Administrator on 2017/7/19.
 *
 * 插入排序
 * for循环   拿一个数进行比较  然后插入争取的为我i只
 * for循环  拿一个数从后往前比较 直到这个数碰到比它自己小的 就停止
 */
public class WuInsertionSort {
    public void testWuInsertionSort(){
        int[] a={12,57,8,4,6,10};
        int size = a.length,temp,j;
        //从第二个元素开始循环
        for(int i = 1;i<size;i++){
            //当前要比较元素取出来放到temp；
            temp = a[i];
            for(j=i;j>0&&temp<a[j-1];j--){
                //集体后移
                a[j]=a[j-1];
            }
            //插入
            a[j] = temp;
        }
        for (int x:a){
            System.out.print(x+" ");
        }
    }
}
