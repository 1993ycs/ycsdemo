package SHEJIMOSHI;

public class BuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(10);
        builder.produceSmsSender(10);
    }
}
