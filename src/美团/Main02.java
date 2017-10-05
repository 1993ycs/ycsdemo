package 美团;
import java.util.Scanner;
public class Main02 {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            int n=scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=scanner .nextInt();
            }
            int k = scanner .nextInt();
            int maxNum = 0;
            for(int i=0;i<n;i++)
            {
                int sum=0;
                for(int j=i;j<n;j++)
                {
                    sum+=arr[j];
                    if(sum%k==0)
                    {
                        maxNum=Math.max(maxNum, j-i+1);
                    }
                }
            }
            System.out.println(maxNum);
        }
    }

