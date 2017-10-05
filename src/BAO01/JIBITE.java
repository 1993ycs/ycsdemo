package BAO01;

import java.util.Arrays;
import java.util.Scanner;

public class JIBITE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char [] c = string.toCharArray();
        Arrays.sort(c);
        System.out.println(c);

    }

    public static String med(String s){
        int [] arr = new int[36];
        String [] arrs = {"a","b","c","d","e","f"
                ,"g","h","i","j","k",
                "l","m","n","o","p"
                ,"q","r","s","t","u"
                ,"v","w","x","y",
                "z","0","1","2",
                "3","4","5",
                "6","7","8","9"};
        StringBuilder ss = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if (c=='a'){
                arr[0]++;
                continue;
            }else if (c=='b'){
                arr[1]++;
            } else if (c=='c'){
                arr[2]++;
            }
            else if (c=='d'){
                arr[3]++;
            }
            else if (c=='e'){
                arr[4]++;
            }
            else if (c=='f'){
                arr[5]++;
            }
            else if (c=='g'){
                arr[6]++;
            }
            else if (c=='h'){
                arr[7]++;
            }
            else if (c=='i'){
                arr[8]++;
            }
            else if (c=='j'){
                arr[9]++;
            }
            else if (c=='k'){
                arr[10]++;
            }
            else if (c=='l'){
                arr[11]++;
            }
            else if (c=='m'){
                arr[12]++;
            }
            else if (c=='n'){
                arr[13]++;
            }
            else if (c=='o'){
                arr[14]++;
            }
            else if (c=='p'){
                arr[15]++;
            }
            else if (c=='q'){
                arr[16]++;
            }
            else if (c=='r'){
                arr[17]++;
            }
            else if (c=='s'){
                arr[18]++;
            }
            else if (c=='t'){
                arr[19]++;
            }
            else if (c=='u'){
                arr[20]++;
            }
            else if (c=='v'){
                arr[21]++;
            }
            else if (c=='w'){
                arr[22]++;
            }
            else if (c=='x'){
                arr[23]++;
            }
            else if (c=='y'){
                arr[24]++;
            }
            else if (c=='z'){
                arr[25]++;
            }
            else if (c=='0'){
                arr[26]++;
            }
            else if (c=='1'){
                arr[27]++;
            }
            else if (c=='2'){
                arr[28]++;
            }
            else if (c=='3'){
                arr[29]++;
            }
            else if (c=='4'){
                arr[30]++;
            }
            else if (c=='5'){
                arr[31]++;
            }
            else if (c=='6'){
                arr[32]++;
            }
            else if (c=='7'){
                arr[33]++;
            }
            else if (c=='8'){
                arr[34]++;
            } else if(c=='9'){
                arr[35]++;
            }

            for (int j = 0; j < arr.length; j++) {
                int m = arr[j];
                for (int k = 0;k<m;k++){
                    ss.append(arrs[j]);
                }
            }
        }
        System.out.println(arr[0]);
        return ss.toString();


    }



}
