package BAO3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public class Test004 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int [] A = new int [n];
        int [] B = new int [n];

            for (int j = 0; j < n; j++) {
                A[j] = scanner.nextInt();
            }
            for (int k = 0; k < n; k++) {
                B[k] = scanner.nextInt();
            }
          //  System.out.println(n+" "+q);
          //  System.out.println(Arrays.toString(A));
            //System.out.println(Arrays.toString(B));
            int [][] arrq = new int[q][2];
            for (int m =0;m<q;m++){
                for (int i = 0; i <2 ; i++) {
                    arrq[m][i] =scanner.nextInt();
                }
            }
           // System.out.println(Arrays.toString(arrq));

        for (int i = 0;i<q;i++){
            int count =0;
            for (int j = 0; j <n ; j++) {
                if (A[j]>=arrq[i][0]&&B[j]>=arrq[i][1]){
                    ++count;
                }

            }
            System.out.println(count);
        }

        }
    }

