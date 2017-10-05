package 排序查找;

import java.util.Arrays;
import java.util.Date;

//冒泡
public class Maopao{
    public static void main(String[] args) {
        int a []  = {0,1,0,2,5,3,4,6,7,2};
        //bubbleSort1(a);
        //bubbleSort(a);
        bubbleSort3(a);
    }

//原始
    public static void bubbleSort1(int[]a){
        int n = a.length;
        int temp = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = 1; j <n-i ; j++) {
                if (a[j-1]>a[j])
                {
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }

            } System.out.println(Arrays.toString(a));
        }

        System.out.println(Arrays.toString(a));
    }


    public static void bubbleSort2(int [] a){


        int n = a.length;
        boolean flag;
        int  temp = 0;
        flag = true;
        while (flag){
            flag = false;
            for (int j = 1; j < n; j++) {
                if (a[j-1]>a[j]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    flag = true;
                }
                n--;

            }
        }

        System.out.println(Arrays.toString(a));
    }



    public static void bubbleSort3(int [] a) {
       // System.out.println(new Date());
        int k ,j;
        int flag;
        int temp = 0;
        flag= a.length;
        while (flag>0){
            k = flag;
            flag =0;
            for ( j = 1; j <k ; j++) {
                if (a[j-1]>a[j]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    flag = j;
                }
            }
         //   System.out.println("第"+j+"次"+Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
        //System.out.println(new Date());
    }
}