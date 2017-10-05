package OfferTest;
//斐波那契数列
public class Demo8 {
    public static void main(String[] args) {
        //System.out.println(Fibonacci(3));
        for (int i = 0; i <10; i++) {
            System.out.println(Fibonacci(i));
        }
    }
    public static long Fibonacci(long n) {
        if (n<=0)
            return 0;
        if (n==1)
            return 1;
        long fibOne = 0 ;
        long fibTwo= 1;
        while (n > 1) {
            fibTwo = fibOne + fibTwo;
            fibOne = fibTwo - fibOne;
            n--;
        }
        return fibTwo;
    }
}
