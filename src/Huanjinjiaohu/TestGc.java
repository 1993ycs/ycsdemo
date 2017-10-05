package Huanjinjiaohu;

/**
 * Created by 余长胜 on 2017/4/26 0026.
 */
class TestGC {
    private static TestGC m_t;

    public void assign(TestGC t)
    {
        m_t = t;
    }

    public void clear(TestGC t)
    {
        t = null;
    }

    public static void main(String[] args) {
        TestGC t1 = new TestGC();
        TestGC t2 = new TestGC();
        TestGC t3 = new TestGC();

        t1.assign(t2);
        t1 = null;
        t2 = null;
        t3.clear(t3);

        System.out.println("This point");
        System.out.println(t2);
        System.out.println(t1);
        System.out.println(t3);
    }
}
