package 搜狗;

import java.util.Arrays;
import java.util.Scanner;

//京东
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
     //   String [] arr = s.split("");
        char[] chars = s.toCharArray();
     //   System.out.println(Arrays.toString(arr));

        int n = chars.length;
        int i = 0;
        int j = n;
        long sum = 0;
        int tol =0;

        for (int k = n; k>=0 ; k--) {
            if (chars[k] == ')'){
                tol++;
            }else if (chars[i] == '('){
                sum = (sum*tol)%1000000007;
                tol--;
            }
        }
        System.out.println(sum);
    }

}
