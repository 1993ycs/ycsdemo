package 排序查找;

import java.util.Arrays;

public class KuaiPai {

    public static void main(String[] args) {
        int a []  = {0,1,0,2,5,3,4,6,7,2};
       System.out.println(Arrays.toString(KuaiPai(a,0,a.length-1)));


    }

    public  static int[] KuaiPai(int [] a,int l,int r){
//        int l = 0;
//        int r = a.length-1;
        ;
       if (l<r){
           int i =l,j=r,num = a[i];
           while (i<j&&a[j]>=num)
               j--;
           if (i<j){
               a[i++] = a[j];
           }
           while (i<j&&a[j]<num)
               i++;
           if (i<j){
               a[j--] = a[i];
           }
           a[i] = num;
           KuaiPai(a,l,i-1);
           KuaiPai(a,i+1,r);
       }
      return a;
    }
}
