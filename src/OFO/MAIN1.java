package OFO;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MAIN1 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int[][] fill(int n, int m) {

        if (n<=0||m<=0)
            return null;
        int array [][] = new int [n][m];
        int num = 1;
        int layers = (Math.min(n,m)-1)/2+1;
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++){
                array[i][k] = num++;
            }
            for(int j=i+1;j<n-i;j++){
                array[j][m-i-1] = num++;
            }
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--){
                array[n-i-1][k]=num++;
            }
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--){
                array[j][i] = num++;
            }
        }
        return array;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] res;

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        res = fill(_n, _m);
        int res_rowLength = res.length;
        int res_colLength = res[0].length;
        for(int res_i=0; res_i < res_rowLength; res_i++) {
            for(int res_j=0; res_j < res_colLength; res_j++) {
                System.out.print(String.valueOf(res[res_i][res_j]) + " ");
            }
            System.out.println();
        }

    }
}
