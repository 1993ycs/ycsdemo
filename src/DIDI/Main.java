package DIDI;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(GetUgly(N));
    }

    public static int GetUgly(int n){
        if (n<= 0){
            return 0;
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        int num2 = 0,num3 = 0,num5 = 0;
        while (arrayList.size()<n){
            int n2 = arrayList.get(num2)*2;
            int n3 = arrayList.get(num3)*3;
            int n5 = arrayList.get(num5)*5;
            int min = Math.min(n2,Math.min(n3,n5));
            arrayList.add(min);
            if (min==n2)num2++;
            if (min==n3)num3++;
            if (min==num5)num5++;
        }

        return arrayList.get(arrayList.size()-1);
    }
}
