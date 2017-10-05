package Huanjinjiaohu;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 余长胜 on 2017/4/24 0024.
 */
public class TestBufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buffer = null;
        while ((buffer=br.readLine())!=null){
         System.out.println("用户键盘输入的是"+buffer);
        }

        System.out.println(buffer);
        String  KK = new String("KJSNSNA");
        System.out.println(buffer);
        System.out.println(br.getClass());
}
}
