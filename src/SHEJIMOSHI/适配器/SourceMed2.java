package SHEJIMOSHI.适配器;

/**
 * 适配着模式 接口
 * 抽象类实现接口
 * 继承接口 重写需要的方法
 */
public class SourceMed2 extends SoueceAble {
    @Override
    public void med2() {
        System.out.println("this is med2 from interface's med2");
    }
}
