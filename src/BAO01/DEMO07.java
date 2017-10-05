package BAO01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DEMO07{
    public static void main(String[] args) {
        String a = "nnnn";
        int b = a.length();
        int [] c = new int [10];
        int d = c.length;
        System.out.println("a="+b+"----d="+d);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        System.out.println(date);
        System.out.println(calendar.toString());
        DateFormat dd = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
      String xx = dd.format(date);
        System.out.println(xx);
        //System.out.println(dd.format(calendar).toString());

        }
    }
