package SHEJIMOSHI.桥接;

public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        Sourceable sourceable =  new SourceMed1();

        bridge.setSourceable(sourceable);
        bridge.method();
        Sourceable sourceable1 =  new SourceMed2();
        bridge.setSourceable(sourceable1);
        bridge.method();
    }
}
