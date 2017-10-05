package BAO01;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //BigDecimal m = scanner.nextBigDecimal();
        long m = scanner.nextInt();
        int [] arr  = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();

        }

        System.out.println(Demo10.toDo(arr,n));

    }
    public static  Integer toDo(int [] arr,int length){
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
        if (length<3){
            return null;
        }
        int x = arr[length-1];
        if (x==0){
            return 0;
        }

        int y1 = arr[0]*arr[1];
        int y2 = arr[length-2]*arr[length-3];
        if (x<0){
            return y2*x;
        }
        if (y1>y2){
            return y1*x;
        }
        else {
            return y2*x;
        }
    }
}
