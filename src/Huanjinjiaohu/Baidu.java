package Huanjinjiaohu;

/**
 * Created by 余长胜 on 2017/4/27 0027.
 */
public class Baidu {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){

                baidu();
            }
        };

        System.out.printf("hello");
    }
    static synchronized void baidu(){
        System.out.print("baidu");
        int A =  2 ;
        

    }
}
