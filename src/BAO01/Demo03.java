package BAO01;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25 0025.
 */
public class Demo03 {
    public static void main(String[] args) {


        int m = 0;
        int n = 0;
        int k = 0;
        while (m < 3) {

            Scanner scanner03 = new Scanner(System.in);
            if (m == 0) {
                //int n ;
                n = scanner03.nextInt();
            } else if (m == 2) {
                //int k ;
                k = scanner03.nextInt();
            } else
                continue;
            m++;
            scanner03.close();
        }
        System.out.println(n+ " "+ m);
    }

}