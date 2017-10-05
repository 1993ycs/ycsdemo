package 排序查找;

import java.util.Arrays;

public class Insert_Sort {
    public static void main(String[] args) {
        int a []  = {0,1,0,2,5,3,4,6,7,2};


        insetSort2(a);
    }

    public static void insetSort(int[] a){
        int i,j;
        int n = a.length;
        for (i = 1; i < n; i++) {
            if (a[i]<a[i-1]){
                int temp = a[i];
                for ( j = i-1; j >=0&&a[j]>temp ; j--) {
                    a[j+1] = a[j];

                }
                a[j+1] = temp;
            }
        }

        System.out.println(Arrays.toString(a));
    }
    public static void insetSort2(int[] a){
        int i,j;
        int n = a.length;
        for (i = 1; i < n; i++) {
            for ( j = i-1; j>=0&&a[j]>a[j+1] ; j--) {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
