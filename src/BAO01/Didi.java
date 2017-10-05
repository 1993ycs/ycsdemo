package BAO01;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Arrays;
import java.util.Scanner;

public class Didi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] a = string.split(" ");

        int[] arrs = new int[a.length];
        for (int i = 0; i < string.length(); i++) {
            arrs[i] = Integer.parseInt(a[i]);
        }

        System.out.println(findNum(arrs));

    }

    public static int findNum (int [] arr){

        int maxNum = Integer.MIN_VALUE;
        int curNum = 0;
        for (int i =0 ;i<arr.length;i++){
            if (curNum<=0){
                curNum = arr[i];
            }else {
                curNum += arr[i];
            }
            if (maxNum <curNum){
                maxNum = curNum;
            }
        }
        return maxNum;
    }

}
