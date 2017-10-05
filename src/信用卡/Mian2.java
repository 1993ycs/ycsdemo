package 信用卡;

import java.util.Scanner;

public class Mian2 {
    static  int sum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            if (string.contains("u51"))
                sum++;
        }
        System.out.println(sum);
    }
}
