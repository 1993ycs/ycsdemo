package 宜信;

import java.util.Arrays;
import java.util.Scanner;

public class MAIN1 {

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
        boolean flag = false;
        for (int i = 0; i <=soc.length()-k ; i++) {
            if (soc.charAt(i)==tar.charAt(j))
            {

                flag = true;
                if (j==k-1){
                    return i-k+1;

                }else {
                    j++;
               //     System.out.println(i);
                //    System.out.println(j);

                }

            }else if(flag==true&&soc.charAt(i)!=tar.charAt(j)){
                flag =false;
                i = i-j+1;
               // System.out.println(i);
                j = 0;

            }
        }

        return -1;


    }
}
