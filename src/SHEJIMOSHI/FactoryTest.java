package SHEJIMOSHI;

public class FactoryTest {
    public static void main(String[] args) {
      /*
        Sender sender = new SendFactory().sendEmail();
        sender.send();
        Sender sender1 = new SendFactory().sendSms();
        sender1.send();
        Sender sender2 = new SendFactory().sendEmail();
        sender2.send();
    */
      SendFactory factory = new SendFactory();
      Sender  sender = factory.sendEmail();
      sender.send();
      Sender sender1 = factory.sendSms();
        for (int i = 0; i <10 ; i++) {
            sender1.send();
        }
    }

}
