package BAO3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/4/9 0009.
 */
public class FindGroup {
    public static void main(String[] args){
        Matcher m = Pattern.compile("\\w+").matcher("java is very easy!");
        while(m.find()){
            System.out.println(m.group());
        }
        int i =0;
        while(m.find(i)){
            System.out.print(m.group()+"\t");
            i++;
        }
    }
}
