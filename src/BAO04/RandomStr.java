package BAO04;

/**
 * Created by 余长胜 on 2017/4/22 0022.
 */
public class RandomStr {
    public  static void main(String[] args){
        String res = "";
        for (int i = 0; i <6 ; i++) {
            int intVal = (int)(Math.random()*26+97);
            System.out.println(intVal);
            res = res+(char)intVal;
        }
        System.out.println(res);
        int a = -8;
        System.out.println(a>>2);
        System.out.println(a<<2);
        System.out.println(a);
        int [] aa = new int[10];
        System.out.println(aa.length);
    }

}
