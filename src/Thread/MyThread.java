package Thread;

/**
 * 继承Thread类，重写该类的run()方法。
 * run()方法的方法体代表了线程需要完成的任务，称之为线程执行体。
 * 当创建此线程类对象时一个新的线程得以创建，并进入到线程新建状态。
 * 通过调用线程对象引用的start()方法，使得该线程进入到就绪状态，
 * 此时此线程并不一定会马上得以执行，这取决于CPU调度时机。
 */
public class MyThread extends Thread {

    private  int i=0;
    @Override
    public void run() {
        for (i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
