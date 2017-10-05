package SHEJIMOSHI.装饰器;

/**
 * 装饰类
 * 装饰器模式的应用场景：
 1、需要扩展一个类的功能。
 2、动态的为一个对象增加功能，而且还能动态撤销。
 （继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 缺点：产生过多相似的对象，不易排
 */
public class Decorator implements Sourceable {
    public  Sourceable source;
    public Decorator(Sourceable source){
        super();
        this.source =source;
    }

    @Override
    public void method() {
        System.out.println("this is start");
        source.method();
        System.out.println("this is end");
    }
}
