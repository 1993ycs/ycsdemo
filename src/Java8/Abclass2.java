package Java8;

public class Abclass2 extends Abclass {
    public static void main(String[] args) {

        Abclass2 abclass2 = new Abclass2();
        abclass2.med1();
        abclass2.med2();
    }

    @Override
    public void med2() {
        System.out.println("med2");
    }


}
