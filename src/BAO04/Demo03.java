package BAO04;

/**
 * Created by 余长胜 on 2017/4/23 0023.
 */
public class Demo03  extends Base {
    public Demo03(){
        System.out.println("我是构造器");

    }
    {
        System.out.println("我是代码kuai");
    }
    static {
        System.out.println("我是zi类静态代码块");
    }
    public static void main(String[] args) {
        Demo03 ss = new Demo03();
        System.out.println("demo03.class="+Demo03.class);;
    }
}
class Base{
    static {
        System.out.println("我是父类静态代码块");
    }
    static {
        System.out.println("我是父类静态代码块");
    }
    public Base(){
        System.out.println("我是父类构造器");
    }
    {
        System.out.println("我是父类代码块");
    }

}
