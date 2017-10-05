package 搜狐;
import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>(n);
        for (int i = 0; i <n ; i++) {
            list.add(scanner.nextInt());
        }
                //System.out.println(list.get(0));
                //System.out.println(Arrays.toString(arr1));
                //  boolean f1 = huiwen(list);
                int l =list.size()-1;
                int i =0,j =l;
                while (i<=l/2&&j>=l/2&&!huiwen(list)){
                if (list.get(i)==list.get(j)){
                i++;
                j--;
                }else if (list.get(i)>list.get(j)){
                list.add(i,list.get(j));
                l++;
                j++;

                }else {
                list.add(j+1,list.get(i));

                j++;
                l++;

                }

                }

                if (huiwen(list)){
                System.out.println(qiuhe(list));
                }else {
                System.out.println("error");
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
