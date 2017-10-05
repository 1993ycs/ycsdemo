package SHEJIMOSHI;

/**
 * 多个方法的工厂模式
 */
public class SendFactory {
    public Sender sendEmail(){
        return  new MailSender();

    }
    public  Sender sendSms(){
        return  new SmsSender();
    }
}
