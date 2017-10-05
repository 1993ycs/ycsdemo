package 网易;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
        int x = scanner.nextInt();//租金
        int f = scanner.nextInt();//f个水果
        int d = scanner.nextInt();//d元钱
        int p = scanner.nextInt();//p元每个

         med(x,f,d,p);
         */
        long x = scanner.nextLong();//租金
        long f = scanner.nextLong();//f个水果
        long d = scanner.nextLong();//d元钱
        long p = scanner.nextLong();//p元每个


    }

    public  static void med(long x,long f,long d,long p){
        if (d<=0||d/x<1)
        {
            System.out.println(0);
        }
        int count = 0;
        while (d/x>=1&&f>=1)
        {
            count++;
            f--;
            d = d-x;
        }
        while (d/(x+p)>=1)
        {
            count++;
            d= d-(x+p);
        }
        System.out.println(count);

    }
}
