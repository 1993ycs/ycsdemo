package Collection;

import java.util.*;

import static java.util.Collections.*;

/**
 * Created by 余长胜 on 2017/4/24 0024.
 */
public class TestUnchangeColl {
    public static void main(String[] args) {
        List  list = emptyList();
        Set set = singleton("111");
        Map books = new HashMap();
        books.put("11",111);
        books.put("22",222);
     ///   Map map01 = new unmodifiableMap(books);
        set.add("2222");
        System.out.println(set);
        System.out.println(books);
    }
}
