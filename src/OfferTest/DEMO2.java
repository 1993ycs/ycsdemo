package OfferTest;

/**
 * 二维数组的查找
 *
 */
public class DEMO2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        //1 是有  0是没有
        System.out.println(find(matrix, 7));    // 要查找的数在数组中
        System.out.println(find(matrix, 5));    // 要查找的数不在数组中
        System.out.println(find(matrix, 1));    // 要查找的数是数组中最小的数字
        System.out.println(find(matrix, 15));   // 要查找的数是数组中最大的数字
        System.out.println(find(matrix, 0));    // 要查找的数比数组中最小的数字还小
        System.out.println(find(matrix, 16));   // 要查找的数比数组中最大的数字还大
        System.out.println(find(null, 16));     // 健壮性测试，输入空指针
    }


    public static int find(int [][] arr,int num){
        if (arr == null || arr.length < 1 || arr[0].length < 1) {
            return 0;
        }
        //当 arr == null 时  col  numCow 会报空指针异常
        int cow = 0;//第一行开始 0
        int col = arr[0].length-1;//最后一列开始 3
        int numCow = arr.length - 1;//总行数 3


        while (col>=0&&cow<=numCow){
            if (arr[cow][col]>num){
                col--;
            }else if (arr[cow][col]<num){
                cow++;
            }else {
                return 1;
            }

        }
        return 0;
    }
}
