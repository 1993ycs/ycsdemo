package BAO01;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Demo08 extends  Thread{
       @Override
        public void run(){
            System.out.println(this.getName()+"  "+this.getId());
            for (int i = 0;i<100;i++){
                System.out.println("第"+i+"次");
            }
            System.out.println("结束");
        }

    public static void main(String[] args) {
        String string = "fafas489498sfsa44sfsa";
        System.out.println(string.replaceAll("\\d",""));
        Map<Integer,Integer> map =  new HashMap();

        map.put(2,3);
        map.put(3,4);
        boolean bl =  map.isEmpty();
        System.out.println(map.keySet());
        System.out.println(map.size());
        System.out.println(map.containsKey(0));
        System.out.println(map.keySet().toString());
        Map map1 =  new ConcurrentHashMap();
        map.put(1,3);
        map.put(1,2);
        map1.remove(1);
        System.out.println(map.get(1)+"1232232");
        String a = new String("123");
        String b = new String("123");
        System.out.println(a==b);
        map1.put(a,1);
        map1.put(b,2);
        System.out.println(map1.toString());
        Map map2 = new ConcurrentHashMap();

    }



}
