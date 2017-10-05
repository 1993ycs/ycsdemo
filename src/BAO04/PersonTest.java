package BAO04;



/**
 * Created by 余长胜 on 2017/4/23 0023.
 */
public class PersonTest {
    public  static void main(String[]args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "nnn";
        p2.name = "mmm";
        p1.num = 5;
        p2.num = 55;
        System.out.println(p1.num);
        System.out.println(p2.num);
        System.out.println(Person.name);
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1 instanceof Person);


    }
}
 class Person{
    public int num;
    public  static String name;

}
