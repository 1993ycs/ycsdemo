package BAO04;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
/**
 * Created by 余长胜 on 2017/4/11 0011.
 */
public class DEMO0033 {
    static int run(String numbers){
        int [] aa = new int[9];
        for (int i = 0; i <9 ; i++) {
            aa[i] = Integer.valueOf(numbers,i);
        }
        System.out.println(Arrays.toString(aa));
        int res = 10;
        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numbers = new String();
        for(int rows=3; rows>0; rows--){
            for(String n: scan.nextLine().split(" ")){
                numbers += n;
            }
        }
        System.out.println(numbers);
        int res = run(numbers);

        System.out.println(String.valueOf(res));
    }
}
