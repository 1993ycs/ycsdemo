package 搜狐;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
       int n = scanner.nextInt();
       int [] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = scanner.nextInt();
        }

        int [] arr1 = Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(arr1);
       List list =  Arrays.asList(arr);
        //Arrays.asList(arr1);
        System.out.println(list.get(0));
        //System.out.println(Arrays.toString(arr1));
        boolean f1 = huiwen(list);
        while (!f1) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j <= list.size(); j++) {
                    list.add(j, arr1[i]);
                    if (huiwen(list)) {
                        break;
                    } else {
                        list.remove(j);
                    }
                }
            }
        }
        if (f1){
            System.out.println(qiuhe(list));
        }
    }

    public static boolean huiwen(List a){
        if (a.size()<=0||a==null)
            return false;
        if (a.size()==1)
            return true;
        int n = a.size()-1;
        int i =0,j=n;
        boolean flag = true;
        while (i!=j&&i<=n/2){
            flag = false;
            if (a.get(i)!=a.get(j)){

                break;
            }else {
                i++;
                j--;
                flag=true;
            }
        }
        return flag;

    }

    public static int qiuhe(List<Integer> a){
        int sum = 0;
        for (int i = 0; i <a.size() ; i++) {
            sum  = sum+a.get(i);
        }
        return sum;
                }
                }
