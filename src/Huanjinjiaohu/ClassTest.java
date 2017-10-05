package Huanjinjiaohu;

import jdk.nashorn.internal.runtime.ECMAException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by 余长胜 on 2017/4/25 0025.
 */
public class ClassTest {
    private ClassTest(){

    }
    private ClassTest(String name,Integer name1){
        System.out.println("执行有参数的构造器");
    }
    public ClassTest(Integer name){

    }
    public  void info(){
        System.out.println("无参数的info方法");
    }
    public  void info(String name){
        System.out.println("定义有参数的info方法"+",其实name参数值："+name);
    }
    class innerClasa{

    }

    public static void main(String[] args) throws Exception {
        Class<ClassTest> cla = ClassTest.class;
        Constructor [ ] ctors = cla.getDeclaredConstructors();
        System.out.println("ClassTest全部构造器如下");
        for (Constructor c : ctors
             ) {
            System.out.println(c);

        }
        Constructor [ ] publicCtors = cla.getConstructors();
        System.out.println("ClassTest的全部public构造器如下：");
        for (Constructor c : publicCtors
             ) {
            System.out.println(c);

        }
        Method[] mtds = cla.getMethods();
        System.out.println("classtest的全部方法如下");
        for (Method c: mtds
             ) {
            System.out.println(c);

        }
        System.out.println("ClassTest里带一个字符串的info方法如下："+cla.getMethod("info",String.class));
    }

}
