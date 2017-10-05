package BAO01;

public class DEmo16 {
    public static void main(String[] args) {
        String a = "aaaa";
        try {
            if (a instanceof  String){
                System.out.println(true);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
