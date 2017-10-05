package BAO01;

import java.util.Scanner;

public class Demo37 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in );
            while (scanner.hasNext()) {
                int n = scanner.nextInt();
                int[] nums = new int[n];
                for(int i=0;i<n;i++){
                    nums[i] = scanner.nextInt();
                }
                int Q = scanner.nextInt();
                int[] query = new int[Q];
                for(int i=0;i<Q;i++){
                    query[i] = scanner.nextInt();
                }
                int[] f = new int[2*n];
                f[0] = 1;
                f[1] = 1+nums[0];
                int index = 1;
                for(int i=2;i<2*n;i+=2){
                    f[i] = f[i-1]+1;
                    f[i+1] = f[i-1]+nums[index];
                    index++;
                }
                for(int i=0;i<Q;i++){
                    System.out.println(med(query[i],f,n));
                }
            }
        }
        public static int med(int query,int[] f,int n){
            for(int i=0;i<2*n;i+=2){
                if(query>=f[i]&&query<=f[i+1])
                    return i/2+1;
            }
            return -1;
        }
    }
