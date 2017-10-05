package BAO3;

import javax.security.sasl.SaslClient;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
public class Test001 {
    public static void main(String [] args){
        Scanner sca1 = new Scanner(System.in);
        int N = sca1.nextInt();
        int M  =sca1.nextInt();
        //sca1.close();
        Scanner scanner01 = new Scanner(System.in);
        int sun = M+N;
        //System.out.println(M+" "+ N );

        HashMap<Integer,String> map01 = new HashMap<>();
        for (int j = 0;j < N;j++){
            String str01 = scanner01.nextLine().toLowerCase();
            map01.put(j,str01);

        }
        System.out.println(map01.toString());
        HashMap<Integer,String> map02 =new HashMap<>();
        for (int k = 0; k < M ; k++) {
            String str02 = scanner01.nextLine().toLowerCase();
            map02.put(k,str02);
        }
        System.out.println(map02.toString());

        }
    }
