package MapAndCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class testConcurrentHashMap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();
        HashSet map1 = new HashSet();
        ArrayList list = new ArrayList();
        map1.add(1);
        map1.add(2);
        map1.add(3);
        System.out.println(map1);
        System.out.println(map1.toArray().toString());
        System.out.println(map1.toString());
        list.add(map1);
        System.out.println(list);

        System.out.println(Arrays.asList(list));


    }

}
