package BAO01;

import java.awt.image.Kernel;
import java.util.Arrays;
import java.util.Scanner;

public class DIDI2 {

    public static void main(String[] args) {
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
        System.out.println(maxK(a,K));
    }

    public static  int maxK(int [] arr,int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
}
