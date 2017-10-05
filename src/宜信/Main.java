package 宜信;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int w = scanner.nextInt();

        System.out.println(func(n,w));


    }

    public  static long func(int n,int w){
        long sum = 1;
        for (int i = 1; i <= w; i++) {
            if (i%2==1)
                sum = n*sum;
            else
                sum = sum*(n-1);
        }

        long num = (long)Math.pow(n,w);
        sum = num-sum;
        return (sum%100003);
    }
}
