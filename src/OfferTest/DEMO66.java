package OfferTest;
//1+2+3.。。+n
public class DEMO66 {

    public static void main(String[] args) {
        System.out.println(func(0));
        System.out.println(func02(-1));
    }
    public static int func(int n){
        int sum = n;
        boolean flag =  (n>0)&&((sum+=func(n-1))>0);
        return sum;
    }
    public static int func02(int n){

        int sum = n;
        boolean ans = (n>0)&&((sum+=func02(n-1))>0);
        return sum;
    }

}

