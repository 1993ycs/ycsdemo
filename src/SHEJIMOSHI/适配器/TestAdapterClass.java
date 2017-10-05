package SHEJIMOSHI.适配器;

public class TestAdapterClass {
    public static void main(String[] args) {
        Soure soure = new Soure();
        Tagretable tagretable = new Wrapper(soure);
        tagretable.med2();
        tagretable.med1();
    }
}
