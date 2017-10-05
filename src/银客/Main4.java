package 银客;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {




    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String a1 = scanner.nextLine().trim();
        String a2 = scanner.nextLine().trim();
        String [] b1 = a1.substring(6,a1.length()-2).split(",");
        String  [] b2 = a2.substring(6,a2.length()-2).split(",");
        int [] a = new int[b1.length];
        for (int i = 0; i <b1.length; i++) {
            a[i] = Integer.parseInt(b1[i]);
        }
        int [] b= new int[b2.length];
        for (int i = 0; i <b2.length ; i++) {
            b[i] = Integer.parseInt(b2[i]);
        }
//        System.out.println(Arrays.toString(maxSubstring(a,b)));

    }

}
