package SHEJIMOSHI;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者 模式在抽象工厂模式基础上 根据需要一次创建多个类
 */
public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count){
        for(int i=0; i<count; i++){
            list.add(new MailSender());
            System.out.println(i);
        }
    }

    public void produceSmsSender(int count){
        for(int i=0; i<count; i++){
            list.add(new SmsSender());
            System.out.println(i);
        }
    }
}
