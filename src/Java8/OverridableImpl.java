package Java8;

public class OverridableImpl implements Defaulable {
    @Override
    public String notRequired() {
        return "Overridden implementation";

    }

    public static void main(String[] args) {
        OverridableImpl o = new OverridableImpl();
        System.out.println(o.notRequired());
    }
}
