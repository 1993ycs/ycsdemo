package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by 余长胜 on 2017/4/24 0024.
 */
public class TestListIterator {
    public static void main(String[] args) {
        String [] books =  {"123","234","111"};
        List booklist = new ArrayList();
        for (int i = 0; i <books.length ; i++) {
            booklist.add(books[i]);
        }
        ListIterator it = booklist.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
            it.add("------分隔符------");
        }
        System.out.println("反向迭代");
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
        List list = Arrays.asList(books);
        System.out.println(list);
        System.out.println(list.getClass());
    }
}
