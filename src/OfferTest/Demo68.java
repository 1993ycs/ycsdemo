package OfferTest;

import java.util.Arrays;

public class Demo68 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reOrderArray(arr)));
    }
        public static  int [] reOrderArray ( int[] array){
            int i = 0;
            int j = array.length - 1;
            while (i <= j) {
                while (array[i] % 2 == 1)
                    i++;

                while (array[j] % 2 == 0)
                    j--;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
    return array;
    }

    }

