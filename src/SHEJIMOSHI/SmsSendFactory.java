package SHEJIMOSHI;

public class SmsSendFactory implements Producer{
    @Override
    public Sender pro() {
        return new SmsSender();
    }
}
