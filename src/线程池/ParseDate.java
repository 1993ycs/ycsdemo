package 线程池;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ParseDate  implements Runnable {
    private static final SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int i = 0;
        public ParseDate(int i){
        this.i = i;
    }

    @Override
    public void run() {
        try {
            Date t = sdf.parse("2017-03-09 19:29:"+i%60);
            System.out.println(i+":"+t);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    }
}
