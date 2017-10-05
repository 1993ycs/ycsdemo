package OfferTest;

import java.math.BigInteger;
import java.sql.Date;

public class Demo67 {

    public static void main(String[] args) {

        long res = new java.util.Date().getTime();
        System.out.println(Add(1000000000,1000000000));
        System.out.println(new java.util.Date().getTime()-res);
        long res1 = new java.util.Date().getTime();
        System.out.println(add(1000000000,1000000000));
        System.out.println(new java.util.Date().getTime()-res1);

    }

    public static int Add(int num1,int num2) {
          BigInteger sum1 = BigInteger.valueOf(num1);
          BigInteger sum2 = BigInteger.valueOf(num2);
          BigInteger sum = sum1.add(sum2);


          String res = sum.toString();
          int res2 = Integer.valueOf(res);
        return res2;
 }


    public static int add(int num1,int num2) {

        while(num2!=0){
            int temp=num1^num2;
            num2=(num1&num2)<<1;
            num1=temp;
        }
        return num1;

    }
}
