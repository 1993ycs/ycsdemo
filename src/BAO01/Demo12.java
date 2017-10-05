package BAO01;

import java.util.Arrays;
import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] h = new int[n];


            for (int i = 0; i < n; i++) {
                h[i] = scanner.nextInt();
            }



      //Scanner scanner1 = new Scanner(System.in);
         int m = scanner.nextInt();
        int [] w = new int[m];

            for (int i = 0; i < m; i++) {
                w[i] = scanner.nextInt();
            }
        //scanner.close();
        System.out.println(Arrays.toString(h));
        System.out.println(Arrays.toString(w));
        System.out.println(Demo12.toDo(h,w));

    }
    public static int toDo(int [] h,int [] w){
        Arrays.sort(h);
        Arrays.sort(w);
        System.out.println(Arrays.toString(h));
        System.out.println(Arrays.toString(w));
        int count = 0;
        for (int i = w.length - 1 ;i>=0;--i){
            for (int j = h.length-1;j>=0;--j){
                if (w[i]>=h[j]){
                    count++;
                    h[j] = w[i]+1;
                    break;
                }
            }
        }
        return count;
    }
}
