package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Created by 余长胜 on 2017/4/24 0024.
 */
public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap books = new LinkedHashMap();
        books.put("11","aa");
        books.put("33","cc");

        books.put("22","bb");

        for (Object key:books.keySet()) {
            System.out.print(key +"-------->");
            System.out.println(books.get(key));
        }
        LinkedHashMap book = new LinkedHashMap();
        book.put(11,22);
        book.put(33,44);
        book.put(22,33);

        System.out.println(book);
        TreeMap map = new TreeMap();
        map.put(1,"11");
        map.put(3,"33");
        map.put(2,"22");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.put(1,"12");
        System.out.println(map.entrySet());
       /// System.out.println(Arrays.toString(map.keySet()));
    }
}
