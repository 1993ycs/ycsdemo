package OfferTest;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字
 */
public class Demo30 {

    public static void main(String[] args) {
        int[] a = {1,1,1,1,2,3,3,3,5,6,2,2,5,6,4,8,9,6,3,2,1,2,2,2,3,2,2,2,2,2,2,2};
        med(a);
    }


    public static void med(int [] arr){
        if (arr==null||arr.length<=0){
            System.out.println("输入数组参数不符合要求");
        }

        int res = arr[0];
        int num = 1;
        for (int i = 1;i<arr.length;i++){
            if (res == arr[i]){
                num ++;
            }else {
                num--;
                {
                    if (num<0)
                    {
                        res = arr[i];
                    }
                }
            }
        }

        System.out.println(res);
    }
}
