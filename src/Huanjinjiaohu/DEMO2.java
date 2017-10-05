package Huanjinjiaohu;

/**
 * Created by 余长胜 on 2017/4/26 0026.
 */
public class DEMO2 {
    public static int test(String strL, String strR) throws Exception
    {
        int iL, iR, iRet=-1;

        try {
            iL = Integer.parseInt(strL);
            iR = Integer.parseInt(strR);
            iRet = iL / iR;
        } catch (NumberFormatException e) {
            System.out.print("N");
        } catch (ArithmeticException e) {
            System.out.print("A");
            throw new Exception("Input value Error");
        } finally {
            System.out.print("F");
        }

        return iRet;
    }
    public static void main(String[] args) {
        try {
            test("100", "abc");
            test("5", "0");
        } catch (Exception e)
        {
            System.out.print("E");
        }
    }
}


