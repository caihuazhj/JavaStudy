package Thread.Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenTrantLockTest {
    static class NumberWrapper {
        public int value = 1;
    }

    public static void main(String[] args) {
        // 初始化可重入锁
        final Lock lock = new ReentrantLock();

        final Condition reachThreeCondition = lock.newCondition();

        final Condition reachSixCondition = lock.newCondition();

        final NumberWrapper num = new NumberWrapper();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //获取锁
                lock.lock();
                try {
                    System.out.println("Thread1 start");
                    //线程1输出前三个数
                    while (num.value<=3){
                        System.out.println(num.value);
                        num.value++;
                    }
                    //到3时释放资源给await
                    reachThreeCondition.signal();
                }finally {
                    //释放锁
                    lock.unlock();
                }

                lock.lock();
                try {
                    //等待输出6
                    reachSixCondition.await();
                    System.out.println("threadA start write");
                    // 输出剩余数字
                    while (num.value <= 9) {
                        System.out.println(num.value);
                        num.value++;
                    }
                    System.out.println("threadA start write");
                    // 输出剩余数字
                    while (num.value <= 9) {
                        System.out.println(num.value);
                        num.value++;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //获取锁
                lock.lock();
                try {
                    while (num.value <= 3) {
                        //等待输出三完成信号
                        reachThreeCondition.await();
                    }
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }finally {
                    lock.unlock();
                }
                try {
                    lock.lock();
                    System.out.println("Thread2 start");
                    while (num.value<=6){
                        System.out.println(num.value);
                        num.value++;
                    }
                    reachSixCondition.signal();
                }finally {
                    lock.unlock();
                }

            }
        });
        //启动
        thread1.start();
        thread2.start();

    }
}


