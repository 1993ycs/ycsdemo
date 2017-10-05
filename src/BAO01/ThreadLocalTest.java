package BAO01;


import java.util.Random;

class Student {
    private int age = 0;   //年龄

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

/**
 * 多线程 数据隔离
 * ThreadLocal和Synchonized都用于解决多线程并发访问。????????/
 * 但是ThreadLocal与synchronized有本质的区别。
 * synchronized是利用锁的机制，使变量或代码块在某一时该只能被一个线程访问。
 * 而ThreadLocal为每一个线程都提供了变量的副本，使得每个线程在某一时间访问到的并不是同一个对象，
 * 这样就隔离了多个线程对数据的数据共享。
 * 而Synchronized却正好相反，它用于在多个线程间通信时能够获得数据共享。
 Synchronized用于线程间的数据共享，而ThreadLocal则用于线程间的数据隔离。
 */
public class ThreadLocalTest implements Runnable {
        private final static ThreadLocal threadLocal = new ThreadLocal();
        public static void main(String[] agrs)
        {
            ThreadLocalTest td = new ThreadLocalTest();
            Thread t1 = new Thread(td, "a");
            Thread t2 = new Thread(td, "b");
            t1.start();
            t2.start();
        }

             public void run() {
                  accessStudent();
             }

    /**
     * 示例业务方法，用来测试
     */
    public void accessStudent() {
        //获取当前线程的名字
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName + " is running!");
        //产生一个随机数并打印
        Random random = new Random();
        int age = random.nextInt(100);
        System.out.println("thread " + currentThreadName + " set age to:" + age);
        //获取一个Student对象，并将随机数年龄插入到对象属性中
        Student student = getStudent();
        student.setAge(age);
        System.out.println("thread " + currentThreadName + " first read age is:" + student.getAge());
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("thread " + currentThreadName + " second read age is:" + student.getAge());
    }

    protected Student getStudent() {
        //获取本地线程变量并强制转换为Student类型
        Student student = (Student) threadLocal.get();
        //线程首次执行此方法的时候，studentLocal.get()肯定为null
        if (student == null) {
            //创建一个Student对象，并保存到本地线程变量studentLocal中
            student = new Student();
            threadLocal.set(student);
        }
        return student;
    }

}
