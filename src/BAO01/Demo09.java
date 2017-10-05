package BAO01;

import java.util.Scanner;

/**
 * author yuchangsheng
 */
public class Demo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();



    }

        public static String multiply(String num1, String num2) {
            // 先把string翻转
            String n1 = new StringBuilder(num1).reverse().toString();
            String n2 = new StringBuilder(num2).reverse().toString();
            System.out.println(n1);
            System.out.println(n2);

            int[] d = new int[n1.length()+n2.length()];
            for(int i=0; i<n1.length(); i++){
                for(int j=0; j<n2.length(); j++){
                    d[i+j] += (n1.charAt(i)-'0') * (n2.charAt(j)-'0');
                }
            }

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<d.length; i++){
                int digit = d[i]%10;
                int carry = d[i]/10;
                if(i+1<d.length){
                    d[i+1] += carry;
                }
                sb.insert(0, digit);
            }

            while(sb.charAt(0)=='0' && sb.length()>1){
                sb.deleteCharAt(0);
            }
            return sb.toString();
        }

    }