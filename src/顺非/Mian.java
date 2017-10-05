package 顺非;

public class Mian {

    static int[] solve(int[] a) {
        int [] arr = new int[a.length];
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i] = a[i]+a[i+1];
        }
        arr[a.length-1] = a[a.length-1];
            return arr;
    }
}
