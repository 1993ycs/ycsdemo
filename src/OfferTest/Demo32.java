package OfferTest;

/**
 * 1 --- n  1出现的次数
 */
public class Demo32 {

    public static void main(String[] args) {
        med(21345);
        med(-2);
    }


    public  static  void  med(int n){


        if (  !(n>0)){
            System.out.println("输入错误");
        }
        long res = 0;

        StringBuilder s = new StringBuilder();
        for (int i = 1;i<=n;i++){
            s = s.append(i);
        }

        String ss = s.toString();

        for (int j = 0 ;j<ss.length();j++){
            if (ss.charAt(j) == '1')
                res++;
        }
        System.out.println(res);
    }
}
