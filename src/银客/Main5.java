package 银客;

import java.util.Scanner;

public class Main5 {


        // 求解两个字符号的最长公共子串
        public static String maxSubstring(String strOne, String strTwo){
            // 参数检查
            if(strOne==null || strTwo == null){
                return null;
            }
            if(strOne.equals("") || strTwo.equals("")){
                return null;
            }
            // 二者中较长的字符串
            String max = "";
            // 二者中较短的字符串
            String min = "";
            if(strOne.length() < strTwo.length()){
                max = strTwo;
                min = strOne;
            } else{
                max = strTwo;
                min = strOne;
            }
            String current = "";
            // 遍历较短的字符串，并依次减少短字符串的字符数量，判断长字符是否包含该子串
            for(int i=0; i<min.length(); i++){
                for(int begin=0, end=min.length()-i; end<=min.length(); begin++, end++){
                    current = min.substring(begin, end);
                    if(max.contains(current)){
                        return current;
                    }
                }
            }
            return null;
        }

        public static void main(String[] args) {
            Scanner scanner  = new Scanner(System.in);
            String a1 = scanner.nextLine().trim();
            String a2 = scanner.nextLine().trim();
            String  b1 = a1.substring(6,a1.length()-2);
            String  b2 = a2.substring(6,a2.length()-2);
            String result = maxSubstring(b1, b2);
            if (result.charAt(result.length()-1)==','&&result.charAt(0)==',')
                System.out.println(result.substring(1,result.length()-1));
            else if (result.charAt(result.length()-1)==',')
                System.out.println(result.substring(0,result.length()-1));
            else  if (result.charAt(0)==',')
                System.out.println(result.substring(1,result.length()));
            else
                System.out.println(result);

        }

}
