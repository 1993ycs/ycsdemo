package SHEJIMOSHI.装饰器;

/**
 * 被装饰类
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is method from source");
    }
}
