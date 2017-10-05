package SHEJIMOSHI.装饰器;

public class TestSecor {
    public static void main(String[] args) {
        Sourceable sourceable = new Source();
        Sourceable sourceable1 = new Decorator(sourceable);
        sourceable1.method();
    }
}
