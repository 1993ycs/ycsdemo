package SHEJIMOSHI.桥接;

public class MyBridge extends Bridge {
    @Override
    public void method() {
        getSourceable().method();
    }
}
