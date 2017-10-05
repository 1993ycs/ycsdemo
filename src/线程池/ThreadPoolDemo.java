package 线程池;

import java.util.concurrent.*;

public class ThreadPoolDemo  {
    public  static class Mytask implements Runnable{
        @Override
        public void run() {
            System.out.println(System.currentTimeMillis()+":thread id"+
            Thread.currentThread().getId());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Mytask mytask = new Mytask();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                10,20,1, TimeUnit.HOURS,new ArrayBlockingQueue<Runnable>(100));
        //ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i <10 ; i++) {
            threadPoolExecutor.execute(mytask);
        }
    }
}
