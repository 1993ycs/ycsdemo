package OfferTest;

/**
 * 1+2+3+。。+n
 */
public class Demo17 {
    public static void main(String[] args) {
        System.out.println(add(3));
        System.out.println(add1(3));
    }

public static int add(int n){
    int sum = n;
     boolean res = n>0&&((sum = sum+ add(n-1)))>0;
     return sum;
}


public static int add1(int n){
    int sum = n;
    sum = (int)(Math.pow(n,2)+n)>>1;
    return sum;
}
}
