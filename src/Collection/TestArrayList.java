package Collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 余长胜 on 2017/4/24 0024.
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("123");
        list.add("5555");
        list.add("ndkjnasd");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        //    it.remove();
            //it.next()=(String)it.next()+"123";
        }
        System.out.println(list.getClass());
        System.out.printf(list.toString());
    }
}
