package BAO01;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/24 0024.
 */
public class Weiyunsuan {
    /*
    public static int NumberOf1(int n){
        int flag =1;
        int num = 0;
        for (int i =0;i<32;i++) {
            if ((flag &n)!=0){
                num++;
            }
            flag<<=1;
        }
        System.out.println(num);
        return num;

    }
    */
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
            int flag =1;
            int num = 0;
            for (int i =0;i<32;i++) {
                if ((flag &N)!=0){
                    num++;
                }
                flag<<=1;
            }
            System.out.println(num);
            //return num;




    }
}
