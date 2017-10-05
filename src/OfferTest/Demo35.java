package OfferTest;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Collections;
import java.util.HashMap;

//字符串中第一个只出现一次的字符
public class Demo35 {

    public static void main(String[] args) {

        String sss = "asjfvjavfjashvfhjakbnbv.kS";
        System.out.println(med(sss));
        System.out.println(med("google")); // l
        System.out.println(med("aabccdbd")); // '\0'
        System.out.println(med("abcdefg")); // a
        System.out.println(med("gfedcba")); // g
        System.out.println(med("zgfedcba")); // g

    }



    public static String med(String s){
        if (s.equals(null)|| s.length()<=0){
            return "输入错误";
        }


        HashMap<Character,Integer> map = new HashMap();

        //  StringBuilder s = new StringBuilder(ss);

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
            {
                int value = map.get(s.charAt(i))+1;
                map.put(s.charAt(i),value);
            }
            else
                map.put(s.charAt(i),1);


        }
        String str;
        for (int i = 0;i<s.length();i++){
            int res = map.get(s.charAt(i));
            if (res == 1){
                 str =  Character.toString(s.charAt(i));
                 return str;
            }
        }
        return "没有";

    }
}
