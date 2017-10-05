package Collection;

import java.util.LinkedList;

/**
 * Created by 余长胜 on 2017/4/24 0024.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList books = new LinkedList();
        books.offer("111");
        books.push("222");
        books.offerFirst("333");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }
        System.out.println(books.peekFirst());
        System.out.println(books.peekLast());
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.pollLast());
        System.out.println(books);
    }
}