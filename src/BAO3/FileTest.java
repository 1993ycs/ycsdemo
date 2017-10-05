package BAO3;

import java.io.File;

/**
 * Created by Administrator on 2017/4/9 0009.
 */
public class FileTest {
    public static void main(String [] srhd){
        File file = new File(".");
        System.out.println(file.getName());
        System.out.print(file.getAbsoluteFile());


    }
}
