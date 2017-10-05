package 排序查找;

public class ERfeng {

    public static void main(String[] args) {
        int[] src = new int[] {1, 3, 5, 7, 8, 9};
        System.out.println(binarySearch(src, 3));
        System.out.println(sort(src,9,1,src.length-1));
    }
    public static int binarySearch(int[] srcArray, int des) {

        int low = 0;
        int high = srcArray.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (des == srcArray[middle]) {
                return middle;
            } else if (des < srcArray[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static int sort(int []array,int a,int lo,int hi){
        if (lo<=hi){
            int mid = (lo+hi)/2;
            if (array[mid]==a)
                return  mid;
            else if (array[mid]>a)
                return  sort(array,a,lo,mid-1);
            else
                return  sort(array,a,mid+1,hi);



        } return -1;
    }
}