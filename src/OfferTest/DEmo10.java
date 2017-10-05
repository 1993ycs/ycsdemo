package OfferTest;
//整数的整数次方
public class DEmo10 {
    public static void main(String[] args) {
        System.out.println(Med(2,3));
    }
    public static  int Med(int n,int m){
        if (n == 0){
            return  0;
        }
        if (m == 0){
            return 1;
        }
        int mn;
        if (m<0){
             mn = -m;

        }else {
            mn = m;
        }
        int res = 1;
        for (int i = 0;i< mn;i++){
            res = res*n;

        }
        if (m<0){
            return 1/res;
        }
        return res;
    }
}
