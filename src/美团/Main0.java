package 美团;

import java.util.Arrays;
import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        //   System.out.println(Arrays.toString(arr));
        yesOrNo(arr);
    }


    public  static  void yesOrNo(int [] arr){
        int sum = 0;
        int  m = arr.length;
        for (int i = 0; i <m-1 ; i++) {
            sum +=arr[i];
        }if (sum<=arr[m-1]){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
    }
}
