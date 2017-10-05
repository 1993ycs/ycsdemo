package SHEJIMOSHI;

/**
 * 静态工场
 */
public class SendStaticFactory {
    public static Sender sendEmail(){
        return  new MailSender();

    }
    public  static Sender sendSms(){
        return  new SmsSender();
    }
}
