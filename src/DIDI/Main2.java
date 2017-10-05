
package DIDI;
import java.util.Scanner;

public class Main2{

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n  = scanner.nextInt();
        String str=scanner.nextLine();
        String[] string=str.split(" ");

        int start=0;
        int count=0;

        for(int i=0; i<string.length; i++){
            if(Integer.parseInt(string[i]) == 0){
                count++;
                start=i + 1;
                continue;
            }

            for(int j=start;j<i;j++){
                int flag=0;
                for(int k=j; k<=i; k++)
                    flag ^= Integer.parseInt(string[k]);
                if(flag == 0){
                    count ++;
                    start=i + 1;
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}