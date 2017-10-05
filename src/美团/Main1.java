package 美团;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
      //  System.out.println(med0(arr,k));

        System.out.println(getK(arr,k));

    }
//
//    public static  int med(int [] arr,int k){
//        if (arr.length<1){
//            return -1;
//        }
//        int target = 0;
//        int num = 0;
//        for (int i = arr.length; i >0 ; --i) {
//            for (int j = i; j >0 ; --j) {
//                num = num +arr[j];
//            }
//            if (num %k == 0){
//                return i;
//            }
//           // return  -1;
//        }
//        return  -1;
//    }public static int med(int array[], int K) {

    public static int med(int array[], int K) {
        int sum = 0;
        int len = array.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                for (int m = j; m < len - j; m++) {
                    sum += array[m];
                }
                if (sum % K == 0) {
                    return len-j;
                }
            }

        }

        return 0;
    }
    public static int med0(int array[], int K) {
        int sum = 0;
        int length = array.length;
        for (int i = length; i >=0; --i) {
            for (int j = length-1; j >= i; --j) {
                for (int m = j; m >length - j; --m) {
                    sum += array[m];
                }
                if (sum % K == 0) {
                    return j;
                }
            }

        }

        return 0;
    }
public static  int getK(int []arr,int k){

        int sum = 0;
        int[]  sumk = new int[arr.length];
    for (int i = arr.length-1; i >=0; i--) {
        sumk[i] = arr[i]%k;
        if (sumk[i] == 0){
            sum = sum+1;
        }


        for (int j = i+1; j < arr.length; j++) {
            sumk[j] = (sumk[j]+arr[j])%k;
            if (sumk[j] == 0){
                sum+= 1;
            }
        }
    }
    return sum;
}
}
