package OfferTest;

/**
 * 数组里有正数也有负数。
 * 数组中一个或连续的多个整数组成一个子数组。
 * 求所有子数组的和的最大值。要求时间复杂度为O(n)。
 */
public class Demo31 {
    public static void main(String[] args) {
        int[] data = {1, -2, 3, 10, -4, 7, 2, -5};
        int[] data2 = {-2, -8, -1, -5, -9};
        int[] data3 = {2, 8, 1, 5, 9};

        System.out.println(FindGreatestSumOfSubArray(data));
        System.out.println(FindGreatestSumOfSubArray(data2));
        System.out.println(FindGreatestSumOfSubArray(data3));


    }


    public static void med(int [] arr){
        if (arr==null||arr.length<0){
            System.out.println("输入数组不符合要求");
        }
        //  int res = arr[0];
        int max = Integer.MIN_VALUE;
        // 当前的和
        int curMax = 0;
        // 数组遍历
        for (int i : arr) {
            // 如果当前和小于等于0，就重新设置当前和
            if (curMax <= 0) {
                curMax = i;
            }
            // 如果当前和大于0，累加当前和
            else {
                curMax += i;
            }

            // 更新记录到的最在的子数组和
            if (max < curMax) {
                max = curMax;
            }
        }


        System.out.println(max);


    }
    // int[] data2 = {-2, -8, -1, -5, -9};
    public static int FindGreatestSumOfSubArray(int[] array) {


        if(array.length == 0||array == null)
            return 0;

        int cSum = 0;
        int result = array[0]; // result存储最大和，不能初始为0，存在负数
        for(int i = 0;i<array.length;++i)
        {
            if(cSum < 0) // 当前和<0，抛弃不要
                cSum = array[i];//   cSum -2 -8 -1 -5  -9

            else                //  res -2 -2 -1   -1  -1
                cSum += array[i];

            if(cSum > result) // 存储最大结果
                result = cSum;
        }
        return result;

    }

}
