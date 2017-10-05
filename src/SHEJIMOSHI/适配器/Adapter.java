package SHEJIMOSHI.适配器;

/**
 * 类的适配器模式
 * 继承别的类完善继承接口的类  类的复用
 */
public class Adapter extends Soure implements Tagretable{
    @Override
    public void med2() {
        System.out.println("this is med2 from tagretable.interance");
    }
}
