package TEstdemo;

public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        son.age = 10;
        son.name = "123";
        System.out.println(son.getClass());
        FOO foo = (FOO)son;
        System.out.println(foo);
        System.out.println(foo.getClass());
    }
}
