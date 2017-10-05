package 排序查找;

import java.util.Arrays;

public class Bubble_Sort_Test {
    public static void main(String[] args) {
        int a []  = {0,1,0,2,5,3,4,6,7,2};

        bubbleSort(a);

    }
    public static void bubbleSort(int [] a){
        int m = a.length;
        boolean flag = true;
        int temp = 0;
        while (flag){
            flag = false;
            for (int i = 1; i <m ; i++) {
                if (a[i-1]>a[i]){
                    temp = a[i];
                    a[i]  =a[i-1];
                    a[i-1] = temp;
                    flag = true;
                }
                 m--;

            }

        }

        System.out.println(Arrays.toString(a));
    }
}
