package TEstdemo;

public class FOO {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FOO{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public  int age;
    public  String name;
}
