package BAO01;

import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25 0025.
 */
public class Demo01 {
    public  static  void main(String[] args){
       Scanner s1 = new Scanner(System.in);
       int n = s1.nextInt();
      // s1.close();
       System.out.println(n);
       int i =1;
        Map<Double,Double> map = new HashMap<>();

       while (s1.hasNext()){
           Scanner s2 = new Scanner(System.in);
           double [] arr = new double[2];

           int m =0;
           while (s2.hasNext()&&s2.next()!=" "){
              arr[i] = s2.nextDouble();
           }
           map.put(arr[0],arr[1]);
           s2.close();
       }

       System.out.println(map);
        }
    }



