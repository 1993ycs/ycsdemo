package BAO04;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by 余长胜 on 2017/4/11 0011.
 */
public class Demo01 {
    public static void main(String[] args){
        Collection c = new ArrayList();
        c.add("孙悟空");
        c.add("hoodhapshijan");
        c.add(2);
        c.add(8);
        c.add("你好啊！");
        System.out.println(c.size()+"元素个数");
        System.out.println(c.contains(2));
        System.out.println(c);
        Collection books = new HashSet();
        books.add("语文书");
        books.add("数学书");
        books.add("你好啊");
        books.add("你好啊");
        System.out.println(c.containsAll(books));
        c.removeAll(books);
        System.out.println(c);
       // c.clear();
        System.out.println(c);
        books.removeAll(c);
        System.out.println(books);
        Iterator it = books.iterator();
        while (it.hasNext()){
            String nest = (String) it.next();
            System.out.println(nest);
            it.remove();
        }
        System.out.println(books);
        for (Object ob: c) {
            String cc = (String)ob;
                System.out.println(cc);
                c.remove(cc);

        }
        System.out.println(c);
    }
}
