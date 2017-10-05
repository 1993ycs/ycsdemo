package BAO01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;



public class C {


/*
计算数组中最大子串
 */

    /**
     * 余长胜
     *
     */

        public static void main(String[] args) {

         /*
            Scanner scanner = new Scanner(System.in);
            int [] arr = new int[100];
            int i = 0;
            while (scanner.hasNext()){
                arr[i] = scanner.nextInt();
            }
            max(arr);
        */
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            String[] a = string.split(" ");

            int[] arrs = new int[a.length];
            for (int i = 0; i < string.length(); i++) {
                arrs[i] = Integer.parseInt(a[i]);
            }

            System.out.println(findNum(arrs));


        }

        private static int findNum(int[] a){
            int maxSum = 0;
            int thisSum = 0;
            for (int anA : a) {
                thisSum += anA;
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                } else if (thisSum < 0) {
                    thisSum = 0;
                }
            }
            return maxSum;
        }
    }

