package 银客;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }
    public static  int func(int [] a,int [] b){
        if (a==null||b==null||a.length==0||b.length==0)
                return -1;

        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i <b.length ; i++) {
            if (a[i]!=b[i])
                return a[i];

        }

        return a[a.length-1];

    }
}
