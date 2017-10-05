package Huanjinjiaohu;

/**
 * Created by 余长胜 on 2017/4/26 0026.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo22 {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();

        if(line != null && !line.isEmpty()) {
        //  int res = resolve(line.trim());
          //  System.out.println(String.valueOf(res));
            System.out.println(line.length());
            System.out.println(line.trim());
            System.out.println(line.trim().length());
        }


    }

    // write your code here
/*
    public static int resolve(String expr) {

    }
*/
}
