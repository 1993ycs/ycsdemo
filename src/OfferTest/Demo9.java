package OfferTest;
//位运算
public class Demo9 {
    public static void main(String[] args) {
        System.out.println(1&1);
        System.out.println(8&1);
        Integer.bitCount(9);
        int flag = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println(flag<<=1);
        }
    }
}
