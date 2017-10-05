package BAO01;

public class Demo06 {
    public static void main(String[] args) {
        System.out.println(Demo06.test());
       // System.out.println(Demo06.test());
        //System.out.println();
    }
    static  int test(){
        int x = 1;
       try{
           System.out.println("你好");
           return  x;
          // System.out.println("niahoo");
       }finally {
           ++x;
           System.out.println(x+"你好");
           return x;

       }
       }
}
