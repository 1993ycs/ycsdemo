package Collection;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/**
 * Created by 余长胜 on 2017/4/24 0024.
 */
public class TestEnumSet {
    public static void main(String[] args) {
        Collection c  = new HashSet();
        c.clear();
        c.add(Season.FAIL);
        c.add(Season.SPRING);

        EnumSet bb = EnumSet.copyOf(c);
        System.out.println(bb);
        c.add("123");
        c.add("233");
        System.out.println(c);
        //bb = EnumSet.copyOf(c);
    }
}
enum Season{
    SPRING,SUNMMER,FAIL,WINTER
}