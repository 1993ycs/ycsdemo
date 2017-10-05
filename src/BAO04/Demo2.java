package BAO04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 余长胜 on 2017/4/11 0011.
 */
public class Demo2 {
    public static void main(String[] ARGS){
        List fixedList = Arrays.asList("你好啊","哈哈哈");
        System.out.println(fixedList.getClass());
        for (int i = 0; i < fixedList.size(); i++) {
            System.out.println(fixedList.get(i));
        }
      //  fixedList.add("你好啊");
        //fixedList.remove("哈哈哈");

        System.out.println("-----010101010---------");
        LinkedList books = new LinkedList();
        books.offer("后面的一个");
        books.push("哈哈哈");
        books.offerFirst("你好啊");
        for (int i = 0; i <books.size() ; i++) {
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
