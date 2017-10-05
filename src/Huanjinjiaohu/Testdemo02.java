package Huanjinjiaohu;

import java.util.Scanner;

/**
 * Created by 余长胜 on 2017/4/25 0025.
 */
public class Testdemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aN = 5;
        int bN = 8;
        int cN = 10;
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <=a ; i++) {
            for (int j = 0; j <=b ; j++) {
                for (int k = 0; k <=c ; k++) {
                    if (n==i*aN+j*bN+k*cN){
                      count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
