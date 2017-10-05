package OfferTest;

/**
 * 替换字符串空格
 */
public class DEMO3 {
    public static void main(String[] args) {
        String str = new String("we are happy hello .");
        System.out.println(Med2(str));
    }
    public static  String Med1(String string){
           String s =  string.replaceAll(" ","%20");
            return  s;
    }


    public static String Med2(String string){
        char[] chars = string.toCharArray();
        System.out.println(chars);
        int len1 = chars.length;
        int blankNum = 0;
        for (char item : chars){
            if (item == ' '){
                blankNum++;
            }
        }
        int len2 = len1+blankNum*2;
        char[] chars1 = new char[len2];
        int indexOfOriginal = len1-1;
        int indexOfNew = len2-1;
        while(indexOfOriginal>=0) {
            if (chars[indexOfOriginal] == ' ') {
                chars1[indexOfNew--] = '0';
                chars1[indexOfNew--] = '2';
                chars1[indexOfNew--] = '%';
                indexOfOriginal--;
            } else {
                chars1[indexOfNew--] = chars[indexOfOriginal--];
            }
        }
        return String.valueOf(chars1);
    }

}
