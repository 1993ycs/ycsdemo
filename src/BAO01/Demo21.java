package BAO01;

import java.util.Scanner;

/**
 * 链家
 */
public class Demo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }
        int h = scanner.nextInt();
        int count = 0;
        int num = 30;
        for (int j = 0;j<arr.length;j++){
            if (h+num>=arr[j])
                count++;
        }

        System.out.println(count);

    }
}
