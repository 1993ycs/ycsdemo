package BAO01;

import java.util.Scanner;

public class Main01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[100];
        int K = 0;
        while (scanner.hasNext()){
            String str = scanner.nextLine();
            K = scanner.nextInt();
            String [] arr = str.split(" ");
            a = new int[arr.length];
            for (int i =0;i<a.length;i++){
                a[i] = Integer.parseInt(arr[i]);
            }

        }

    }
    //数组A，A的开始位置，结束位置，数组B，B的开始位置，结束位置，第K大元素
    private static int getTopK(int[] arrA, int sa, int ea, int[] arrB, int sb,
                               int eb, int k) {
        int ma=(sa+ea)/2;
        int mb=(sb+eb)/2;
        if(sa>ea){
            return arrB[sb+k-1];
        }
        if(sb>eb){
            return arrA[sa+k-1];
        }
        if(arrA[ma]>=arrB[mb]){
            if((ma-sa+1)+(mb-sb+1)>k){
                return getTopK(arrA,sa,ma-1,arrB,sb,eb,k);
            }
            else{
                return getTopK(arrA,sa,ea,arrB,mb+1,eb,k-(mb+1-sb));
            }
        }
        else{
            if((ma-sa+1)+(mb-sb+1)>k){
                return getTopK(arrA,sa,ea,arrB,sb,mb-1,k);
            }
            else{
                return getTopK(arrA,ma+1,ea,arrB,sb,eb,k-(ma+1-sa));
            }
        }
    }
}