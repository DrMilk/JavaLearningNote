package notearithmetic;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/7/20.
 *
 * 快速排序
 * for循环 一个扫描出 分开两部分  比基准小的 比基准大的
 *
 */
public class WuQuickSort {
    // 1.递归
    public void testWuQuickSotr(int [] a,int start,int end){
        if(start<end){
            int base = a[start];
            int temp ;
            int i = start, j = end;
        }
    }
    public WuQuickSort(){}
    public static void sort(int a[], int low, int hight) {
        int i, j, index;
        if (low > hight) {
            return;
        }
        i = low;
        j = hight;
        index = a[i]; // 用子表的第一个记录做基准
        while (i < j) { // 从表的两端交替向中间扫描
            while (i < j && a[j] >= index)
                j--;
            if (i < j)
                a[i++] = a[j];// 用比基准小的记录替换低位记录
            System.out.println(" ←"+Arrays.toString(a));
            while (i < j && a[i] < index)
                i++;
            if (i < j) // 用比基准大的记录替换高位记录
                a[j--] = a[i];
            System.out.println("→ "+Arrays.toString(a));
        }
        a[i] = index;// 将基准数值替换回 a[i]
        System.out.println("总"+Arrays.toString(a));
        sort(a, low, i - 1); // 对低子表进行递归排序
        sort(a, i + 1, hight); // 对高子表进行递归排序

    }
    public static void main(String[] args) {
        int a[]={49, 38, 65, 97, 76, 13, 27, 59};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
