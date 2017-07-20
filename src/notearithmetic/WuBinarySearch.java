package notearithmetic;

/**
 * Created by Administrator on 2017/7/20.
 *
 * 二分查找
 */
public class WuBinarySearch {
    public void testWuBinarySearch(){

    }
    public int recursionSearch(int []array,int value,int low,int high){
        if(low<=high){
            int mid=(low+high)/2;
            if(value==array[mid]){
                return mid;
            }else if(value<array[mid]){
                return recursionSearch(array,value,low,mid-1);
            }else if(value>array[mid]){
                return recursionSearch(array,value,mid+1,high);
            }
        }
        return -1;
    }
    public int norecursionSearch(int []array,int value){
        int low=0;
        int high=array.length-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(value==array[mid]){
                return mid;
            }else if(value<array[mid]){
                high=mid-1;
            }else if(value>array[mid]){
                low=mid+1;
            }

        }
        return -1;
    }
}
