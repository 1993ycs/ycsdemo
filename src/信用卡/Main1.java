package 信用卡;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String [] s1 = str1.split(" ");
        String [] s2 = str2.split(" ");
        int [] arr1 = new  int[s1.length];
        int [] arr2  = new int[s2.length];
        for (int i = 0; i <s1.length ; i++) {
            arr1[i] = Integer.parseInt(s1[i]);
        }
        for (int i = 0; i <s2.length ; i++) {
            arr2[i] = Integer.parseInt(s2[i]);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        HashMap<Integer,Integer> map01 = new HashMap<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
           if (map.containsKey(arr1[i])) {

               map.put(arr1[i], map.get(arr1[i]) + arr2[i]);
               map01.put(arr1[i], map01.get(arr1[i]) + 1);
           }else {
               map.put(arr1[i], arr2[i]);
               map01.put(arr1[i], 1);
           }
           }

        System.out.println(map);
        int temp = 0;
        int sum = 0;
        int beforekey=0;
        for (Integer v: map.keySet()) {
            if (map.get(v)>sum) {
                sum = map.get(v);
                temp = v;
            }else if (map.get(v)==sum){
                if (map01.get(v)>map01.get(beforekey))
                        temp = v;
                else
                    temp = beforekey;
            }

            beforekey = v;
        }

        System.out.println(temp);
    }
}
