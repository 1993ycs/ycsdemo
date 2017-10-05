package SHEJIMOSHI.适配器;

public class TestAdapterInter {
    public static void main(String[] args) {
        Source source = new SourceMed1();
        Source source1 = new SourceMed2();
        source1.med1();
        source1.med2();
        source.med2();;
        source.med1();;
    }
}
