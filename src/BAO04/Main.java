package BAO04;


import java.util.Scanner;

/**
 * Created by 余长胜 on 2017/4/11 0011.
 */
public class Main {
    public static void main(String[] arfs){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        greed(N);

    }
    public static int  greed(int N) {

        int count = 0;
        int sum = 0;

        int[] a = new int[N];
        for (int i = 2; sum < N; i++) {
            sum = i + sum;
            a[i - 2] = i;
            count++;

        }
        if (sum - N == 1) {
            for (int i = 0; i < count; i++) {
                a[i] = a[i + 1];
            }
            a[count - 2] = a[count - 1] + 1;
            a[count - 1] = 0;

        }
        else if (sum - N > 1) {
            int tmp = sum - N;
            for (int i = 0; i < count; i++) {
                if (a[i] == tmp) {
                    for (int j = i; j < count; j++) {
                        a[j] = a[j + 1];
                    }
                    a[count - 1] = 0;
                    count--;
                }
            }
        }
        int NUM = 1;
        for (int i = 0;i<count;i++){
            NUM = NUM*a[i];
        }
        System.out.println(NUM);
        return  NUM;
    }
}