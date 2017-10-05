package SHEJIMOSHI;

public class TestAbscrtFacort {
    public static void main(String[] args) {
        Producer producer = new MailSendFactory();
        Sender sender = producer.pro();
        sender.send();
        Producer producer1 = new SmsSendFactory();
        Sender sender1 = producer1.pro();
        sender1.send();
    }
}
