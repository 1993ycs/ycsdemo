package wangyi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int num = c.nextInt();
        int num1 = num;
        while (num%10==0){
            num=num/10;
        }
        num = Integer.parseInt(new StringBuffer(String.valueOf(num)).reverse().toString());
       // System.out.println(num);
        System.out.println(num+num1);
    }
}
