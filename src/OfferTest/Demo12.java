package OfferTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 调整数组数据  计数在偶数前面
 */
public class Demo12 {
    public static void main(String[] args) {
        int[] arr = {0,1,3,1,5,8,6,2,5,6,1};
        med2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void med1(int [] arr){

        if (arr == null ||arr.length<2){
            return;
        }
     //   int len = arr.length;
        int i = 0;
        int j = arr.length-1;
        for (;i<=j;i++){
            while (arr[i]%2 == 1){
                i++;
            }
            while (arr[j]%2 == 0){
                j--;
            }
            int temp = arr[i];

            arr[i] = arr[j];
            arr[j] = temp;


        }

    }

    public static  void med2(int[] arr){
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList();
        for (Integer item:arr) {
            if (item%2 == 1){
                list.add(item);
            }else {
                list1.add(item);
            }
        }
        int i = 0;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            arr[i] =(int) iterator.next();
            i++;
        }
        Iterator iterator1 = list1.iterator();
        while (iterator1.hasNext()){
            arr[i] = (int)iterator1.next();
            i++;
        }


    }
}
