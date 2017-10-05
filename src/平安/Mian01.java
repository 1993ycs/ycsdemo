package 平安;


import java.util.Arrays;
import java.util.Scanner;

public class Mian01 {
    /**
     * @param args
     * 用1元，2元，5元，10元，20元和50元的纸币组成100元，共有多少种情况。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new  int[7];
        String string  =scanner.nextLine();
        String [ ] strings= string.split(",");
        for (int i = 0; i <strings.length ; i++) {

            if (i==0)
            {
                    arr[i] = Integer.parseInt(strings[i].substring(2,strings[i].length()+1));
            }else {
                arr[i] = Integer.parseInt(strings[i].substring(3, strings[i].length()+1));
            }

        }

        System.out.println(Arrays.toString(arr));

       // System.out.println("a1=22".substring(3,"a122".length()+1));
    }
}
