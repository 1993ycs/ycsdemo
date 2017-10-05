public class LRUtest {

    public static void main(String[] args) {
        Lru lru = new Lru(10);
        for (int i = 0; i <10 ; i++) {
            lru.put(i,i*i);
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println(lru.get(i).toString());
        }
    }
}
