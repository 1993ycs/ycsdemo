package Collection;

import java.util.*;

/**
 * Created by 余长胜 on 2017/4/24 0024.
 */
public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet books = new LinkedHashSet();
        books.add("123");
        books.add("456");
        books.add("789");
        HashSet name = new HashSet();
        name.add(123);
        name.add(111);
        name.add(1236);
        System.out.println(books);
        System.out.println(name);
        TreeSet book = new TreeSet();
        book.add(222);
        book.add(666);
        book.add(111);
        System.out.println(book);
        System.out.println(book.first());
        System.out.println(book.last());
        System.out.println(book.lower(222));
        System.out.println(book.headSet(2));
        System.out.println(book.tailSet(2));


    }
}
