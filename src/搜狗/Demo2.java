package 搜狗;

import java.math.BigDecimal;
import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
      // BigDecimal n = scanner.nextBigDecimal();
       if (n<1||n>100000)
          System.out.println();
       if (n==2){
           System.out.println(6);
           return;
       }
       int count = 0;
       // BigDecimal count = BigDecimal.valueOf(0);
        for (int a = 1; a<=n ; a++) {
            for (int b = 1; b <=n ; b++) {
                for (int c = 1; c <=n ; c++) {
                    for (int d = 1; d <=n ; d++) {
                        if (Math.pow(a,b)==Math.pow(c,d))
                            count++;


                    }
                }
            }
        }

        System.out.println(count%1000000007);
    }
}
