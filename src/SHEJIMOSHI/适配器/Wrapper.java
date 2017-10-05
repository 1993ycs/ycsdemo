package SHEJIMOSHI.适配器;


/**
 * 对象的适配器模式
 * 不是继承 是拥有实例 完善当前类
 */
public class Wrapper implements Tagretable {

    private Soure soure;

    public Wrapper(Soure source){
        super();
        this.soure = source;
    }
    @Override
    public void med2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void med1() {
        soure.med1();
    }
}
