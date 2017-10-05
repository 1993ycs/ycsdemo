package SHEJIMOSHI;

public class MailSendFactory implements Producer {
    @Override
    public Sender pro() {
        return new MailSender();
    }
}
