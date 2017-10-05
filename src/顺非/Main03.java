package 顺非;

import java.util.Scanner;

public class Main03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            long m = scanner.nextLong();
            long count = 0;
            for (int i = 1; i <=m; i++) {
                if (med(i))
                    count++;



            }
            long t =(long) Math.pow(10,9)+7;
          count = count%t;
            System.out.println(t);
        }
        public  static  boolean med(long m){
            boolean flag = true;
            while (m>0){
                long n = m%10;
                //System.out.println(n);
                if (n!=7&&n!=4){
                    flag=false;
                    break;}

                m = m/10;
            }
            return flag;
        }

}
