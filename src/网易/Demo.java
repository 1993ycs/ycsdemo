package 网易;
import java.util.*;
public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();//租金
        int f = scanner.nextInt();//f个水果
        int d = scanner.nextInt();//d元钱
        int p = scanner.nextInt();//p元每个

        med(x, f, d, p);
    }

    public  static  void  med(int x,int f,int d,int p){
        int count =0;
        while(true){
            if(f>=1){
                f--;
            }else{
                if(f==0){
                    if(d>=p){
                        d-=p;
                    }else {
                        break;
                    }
                }
            }
            if(d>=x){
                d-=x;
            }else{
                break;
            }
            count++;
        }
        System.out.println(count);

    }


}
