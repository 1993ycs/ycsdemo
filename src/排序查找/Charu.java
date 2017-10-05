package 排序查找;

public class Charu {

        public static void main(String[] args) {
            int [] a = {2,5,2,3,4,3,6,0,8,1,3,0,1};
            Insertsort2(a);

             print(a);
        }

    static  void print(int [] a){
        for (int i = 0;i<a.length;i++)
            System.out.println(a[i]);
    }
   public static int [] Insertsort2(int a[])
    {
        int i, j;
        for (i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
            {
                int temp = a[i];
                for (j = i - 1; j >= 0 && a[j] > temp; j--)
                    a[j + 1] = a[j];
                a[j + 1] = temp;
            }
            return a;
    }
}
