package Thread;

/**
 * 实现Runnable接口，同样重写run方法
 */
public class MyRunnable implements Runnable {

    private int i = 0;
    @Override
    public void run() {
        System.out.println("runnable");
        for (i = 0; i < 5; i++) {

            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
