package Thread.sync;

public class AccountingSync implements Runnable {

    static int i =0;
    /**
     * synchronized 修饰实例方法
     */
    public synchronized void increase(){
        i++;
    }
    @Override
    public void run() {
        for(int j=0;j<10000;j++){
            increase();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AccountingSync instance=new AccountingSync();
        Thread t1=new Thread(instance);
        Thread t2=new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
    /**
     * 输出结果:
     * 2000000
     *
     * 述代码中，我们开启两个线程操作同一个共享资源即变量i，
     * 由于i++;操作并不具备原子性，该操作是先读取值，然后写回一个新值，相当于原来的值加上1，分两步完成，
     * 如果第二个线程在第一个线程读取旧值和写回新值期间读取i的域值，
     * 那么第二个线程就会与第一个线程一起看到同一个值，并执行相同值的加1操作，这也就造成了线程安全失败，
     * 因此对于increase方法必须使用synchronized修饰，以便保证线程安全。
     */
}
