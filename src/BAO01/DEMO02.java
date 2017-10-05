package BAO01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/25 0025.
 */
public class DEMO02 {
    public static void main(String[] args) {
        // Scanner scanner1 = new Scanner(System.in);
        // String[] array = {scanner.nextLine()};
        //  StringBuffer st = new StringBuffer(scanner.nextLine());
        // Integer n =  array[0];
        //int k ,n ;

        int m = 0;
        int n =0;
        int k = 0;
        /*
        while (m < 3) {

            Scanner scanner03 = new Scanner(System.in);
            if (m == 0) {
                //int n ;
                        n = scanner03.nextInt();
            } else if (m == 2) {
                //int k ;
                k = scanner03.nextInt();
            } else
                continue;
            m++;
            scanner03.close();
        }*/
        Scanner sc03 = new Scanner(System.in);
       StringBuffer sr = new StringBuffer(sc03.nextLine());
       n = sr.charAt(0);
       k = sr.charAt(2);
        System.out.println(n+" "
        + k);
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int p =0;
        while (scanner.hasNext()&&p<= n){
            if (!scanner.next().equals(" ")){
                arr.add(Integer.valueOf(scanner.next()));
                p++;
            }

        }
        scanner.close();
        System.out.println(arr);
       // int l = arr.size();
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < n; i++) {
                if (i != n - 1) {

                    int remp = arr.get(i) + arr.get(i+1);
                    arr.set(i,remp);
                } else {
                    int temp = arr.get(0)+arr.get(i);
                    arr.set(i,temp);
                    //arr[i] = arr[0] + arr[i];
                }
                if (arr.get(i) >= 100) {
                    arr.set(i,arr.get(i)/100);
                }


            }
        }
        for (int q = 0; m < n; m++) {
            System.out.print(arr.get(q) + " ");
        }
    }

}

    /*
    public void fun01(ArrayList<Integer> arr ,int l){
        for(int i = 0;i<l;i++){
            if(i!=l-1){

                arr[i] = arr[i]+arr[i+1];

            }else {
                arr[i]=arr[0]+arr[i];
            }
            if(arr[i]>=100){
                arr[i] = arr[i]/100;
            }


        }
    }*/

