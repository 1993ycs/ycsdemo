package 排序查找;

import java.util.Arrays;

public class Quick_Sort_Test {

    public static void main(String[] args) {
        int a []  = {0,1,0,2,5,3,4,6,7,2};
        System.out.println(Arrays.toString(quickSort(a,0,a.length-1)));
    }


    public static int[] quickSort(int[] a,int m,int n){
        if (m<n){
            int i =m,j=n;
            int num = a[i];
            while (i<j&&a[j]>=num)
                j--;
            if (i<j){
                a[i++] = a[j];
            }

            while (i<j&&a[i]<num)
                i++;
            if (i<j){
                a[j--] = a[i];
            }
            a[i] = num;
            quickSort(a,m,i-1);
            quickSort(a,i+1,n);

        }
       return a;
    }
}
