package BAO01;

 class Threadtest1 extends Thread {

     private String name;

     public Threadtest1(String name) {
         this.name = name;
     }

     public void run() {
         for (int i = 0; i < 5; i++) {
             System.out.println(name + "  " + i);
         }

         try {
             sleep((int) Math.random() * 10);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

 }


public class Threadtest {
    public static void main(String[] args) {
        //     System.out.println((int)Math.random());
        Threadtest1 threadtest = new Threadtest1("a");
        Threadtest1 threadtest1 = new Threadtest1("2");
        System.out.println(threadtest.isAlive());
        System.out.println(threadtest.isDaemon());
        System.out.println(threadtest.isInterrupted()
        );
        threadtest.setPriority(1);
        threadtest1.setPriority(10);
        threadtest.start();
        threadtest1.start();
    }
}