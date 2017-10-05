package 宜信;

import java.util.Arrays;
import java.util.Scanner;

public class Mian2 {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);
        String  string  = scanner.nextLine();
        String  [] strings = string.split(" ");
        System.out.println(Arrays.toString(strings));
        String source = strings[0];
        String tar = strings[1];
        System.out.println(source);
        System.out.println(tar);
        System.out.println(func(source,tar));
    }


    public  static  int   func(String soc,String tar){
        if (tar==null||soc==null)
            return  -1;

        if (tar.length()>soc.length())
            return  -1;
       int j = 0;
       int k = tar.length();
        for (int i = 0; i <=soc.length()-k ; i++) {
            if (soc.substring(i,i+k).equals(tar)){
            return i;

            }
        }

        return  -1;
        }
}
