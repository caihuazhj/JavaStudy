package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class TestThread {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println("I am main Thread");
        }

        /*MyRunnable myRunnable = new MyRunnable();
        //将myRunnable作为创建thread的target
        Thread thread2 = new Thread(myRunnable);
        thread2.start();


        //通过FutureTask来包装MyCallable对象，同时作为了Thread对象的target。
        Callable<Integer> mycallable = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<Integer>(mycallable);
        Thread thread3 = new Thread(ft);
        thread3.start();*/


    }
}
