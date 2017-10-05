package BAO01;

import java.util.*;

public class Demo36 {
    public static void main(String[] args) {
        Random random = new Random();
        //int n = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new TreeSet<Integer>();
        int n = scanner.nextInt();
        for (int i = 0;i<n;i++){
            set.add(scanner.nextInt());
        }

       // int arr [] = new  int[n];
      /*
        for (int i = 0;i<n;i++){
            set.add(random.nextInt(1000)+1);
        }
        */
        Integer[] arr = new Integer[set.size()];
        System.out.println(set.size());
       arr =  set.toArray(arr);
        Arrays.sort(arr);
        for (int j = 0;j<arr.length;j++){
            if (j==arr.length-1)
                System.out.print(arr[j]);
            else
                System.out.print(arr[j]+" ");
        }


    }
}
