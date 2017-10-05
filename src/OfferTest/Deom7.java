package OfferTest;
//旋转数组的最小值
//其实二分查找的变种
//两个递增序列 而且左边大于右边
public class Deom7 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(minNumberInRotateArray(arr));
    }
    public static int minNumberInRotateArray(int [] array) {

        if (array.length == 0)
            return 0;
        int index1 = 0;
        int index2 = array.length-1;
        int indexMid = index1;
        while (array[index1] >= array[index2]) {
            if (index2-index1==1) {
                indexMid = index2;
                break;
            }
            indexMid = (index1+index2)/2;
            if(array[indexMid] >= array[index1])
                index1 = indexMid;
            else if (array[indexMid] <= array[index2])
                index2 = indexMid;
        }
        return array[indexMid];

    }
}
