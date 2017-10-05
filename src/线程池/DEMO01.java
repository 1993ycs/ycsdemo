package 线程池;

import java.lang.management.ThreadInfo;
import java.util.concurrent.*;

public class DEMO01 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
        for (int i = 0; i < 100; i++) {
            Mytask mytask = new Mytask(i);
            executor.execute(mytask);
            System.out.println("线程池中数目"+executor.getPoolSize()+"等待执行数目"+
            executor.getQueue().size()+"已执行完的数目"+executor.getCompletedTaskCount());
            executor.shutdown();
        }


    }
}
    class Mytask implements Runnable {
        private int tsakkNum;

        public Mytask(int num) {
            this.tsakkNum = num;
        }

        @Override
        public void run() {
            System.out.println("正在执行task" + tsakkNum);
            try {
                Thread.currentThread().sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task" + tsakkNum + "执行完毕");
        }
    }


