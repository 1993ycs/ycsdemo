package OFO;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static long MaxSum(int[] a) {
        int size = a.length;
        int i = 0;
        int j = size-1;
        long sum1 = 0;
        long sum2 = 0;

        while (i<=j)

        {
            if (a[i] >= a[j]) {
                sum1 += a[i];
                i += 2;


            } else {
                sum1 += a[j];
                j -= 2;

            }

        }

        return sum1;

        }


    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long res;

        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }

        res = MaxSum(_a);
        System.out.println(String.valueOf(res));

    }
}
