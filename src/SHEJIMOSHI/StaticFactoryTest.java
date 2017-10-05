package SHEJIMOSHI;

public class StaticFactoryTest {
    public static void main(String[] args) {
        Sender sender = SendStaticFactory.sendEmail();
        sender.send();
        Sender sender1 = SendStaticFactory.sendSms();
        sender1.send();
    }
}
