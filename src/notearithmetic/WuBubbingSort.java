package notearithmetic;

/**
 * Created by Administrator on 2017/7/18.
 *
 * 冒泡排序
 *
 * -for循环  对比出一次最大的数
 * -嵌套一个for循环  两两比较
 * -再嵌套个if语句   前面比后面大 交换
 */
public class WuBubbingSort {
    public void testBubbingSort(){
        int [] a = {4,6,10,1,3,5,7,9,8,2};
        for (int x:a){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("-----------------");
        int temp;
        int size = a.length;
        for (int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int x:a){
            System.out.print(x+" ");
        }
    }
}
