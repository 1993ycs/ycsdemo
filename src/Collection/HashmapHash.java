package Collection;

import java.util.HashMap;

public class HashmapHash {


    public static void main(String[] args) {
        System.out.println(hash(0));
        System.out.println(hash(1));
        System.out.println(hash(2));
        System.out.println(hash(21321));
        System.out.println(hash(12121212));

        Object o = new Object();

        HashMap map;
    }

    static int hash(int h) {
               // This function ensures that hashCodes that differ only by
               // constant multiples at each bit position have a bounded
               // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
}
