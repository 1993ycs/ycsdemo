package BAO04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 余长胜 on 2017/4/22 0022.
 */
public class mmm {
    public static void main(String[] arss){
        Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();


        String [] strings = str.split(" ");
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i <strings.length ; i++) {
            Swap(strings[i]);
            if (i!=strings.length-1){
                System.out.print(" ");
            }

        }



    }


    public static String Swap(String str1){


        StringBuilder str3 = new StringBuilder(str1);

        str3 = str3.reverse();
        String string = str3.toString();
        System.out.print(string);
        return string;
        }

}
