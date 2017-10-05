package BAO3;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public class Test002 {
    public static void main(String[] args){
        Scanner sc2 = new Scanner(System.in);
        int m = sc2.nextInt();
        int [] arr = new int[m];
        for (int i = 0; i <m ; i++) {
            int sc = sc2.nextInt();
            arr[i] = sc;
        }
        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[j]);
        }

    }
   // public static int Find(int [] mm){

    //}

}
