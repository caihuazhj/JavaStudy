package Thread.ThreadPool;


import java.util.Date;
import java.util.concurrent.*;

public class Handle implements Runnable {
    private String name;
    public Handle(String name){
        this.name = "thread"+name;
    }
    @Override
    public void run() {
        System.out.println(name+" Start. Time = "+new Date());
        processCommand();
        System.out.println( name +" End. Time = "+new Date());

    }
    private void processCommand(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return this.name;
    }


    /**
     *  测试newCachedThreadPool
     *  1、主线程的执行与线程池里的线程分开，有可能主线程结束了，但是线程池还在运行
     *  2、放入线程池的线程并不一定会按其放入的先后而顺序执行
     *
     */
    public static void testCachedThreadPool() {

        System.out.println("Main: Starting at: "+ new Date());
        ExecutorService exec = Executors.newCachedThreadPool(); //创建一个缓冲池，缓冲池容量大小为Integer.MAX_VALUE
        for(int i = 0; i < 10; i++) {
            //将线程放入线程池中
            exec.execute(new Handle(String.valueOf(i)));
        }
        exec.shutdown();  //执行到此处并不会马上关闭线程池,但之后不能再往线程池中加线程，否则会报错
        System.out.println("Main: Finished all threads at"+ new Date());


    }

    /**
     * 测试FixThreadPool
     * 建了一个固定大小的线程池，大小为系统的CPU数目.也就说同一时刻最多只有8个线程能运行。
     * 并且线程执行完成后就从线程池中移出。
     * 它也不能保证放入的线程能按顺序执行。
     * 这要看在等待运行的线程的竞争状态了。
     *
     */
    public static void testFixThreadPool() {
        //获取当前系统的CPU 数目
        int cpuNums = Runtime.getRuntime().availableProcessors();
        System.out.println(cpuNums);
        System.out.println("Main Thread: Starting at: "+ new Date());
        //ExecutorService通常根据系统资源情况灵活定义线程池大小
        ExecutorService exec =Executors.newFixedThreadPool(cpuNums);
        for(int i = 0; i < 10; i++) {
            exec.execute(new Handle(String.valueOf(i)));
        }
        exec.shutdown();  //执行到此处并不会马上关闭线程池
        System.out.println("Main Thread: Finished at:"+ new Date());
    }

    /**
     * 测试SingleThreadPool
     * 其实这个就是创建只能运行一条线程的线程池。
     * 它能保证线程的先后顺序执行，并且能保证一条线程执行完成后才开启另一条新的线程
     * 等价于ExecutorService exec = Executors.newFixedThreadPool(1);
     */
    public static void testSingleThreadPool() {
        System.out.println("Main Thread: Starting at: "+ new Date());
        ExecutorService exec = Executors.newSingleThreadExecutor();   //创建大小为1的固定线程池
        for(int i = 0; i < 10; i++) {
            exec.execute(new Handle(String.valueOf(i)));
        }
        exec.shutdown();  //执行到此处并不会马上关闭线程池
        System.out.println("Main Thread: Finished at:"+ new Date());
    }

    public static void testScheduledThreadPool() {
        System.out.println("Main Thread: Starting at: "+ new Date());
        ScheduledThreadPoolExecutor exec = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(10);   //创建大小为10的线程池
        for(int i = 0; i < 10; i++) {
            exec.schedule(new Handle(String.valueOf(i)), 10, TimeUnit.SECONDS);//延迟10秒执行
        }
        exec.shutdown();  //执行到此处并不会马上关闭线程池
        while(!exec.isTerminated()){
            //wait for all tasks to finish
        }
        System.out.println("Main Thread: Finished at:"+ new Date());
    }

    /**
     * 间隔指的是连续两次任务开始执行的间隔。
     * 对于scheduleAtFixedRate方法，
     * 当执行任务的时间大于我们指定的间隔时间时，
     * 它并不会在指定间隔时开辟一个新的线程并发执行这个任务。
     * 而是等待该线程执行完毕。
     *
     */
    public static void executeFixedRate(){
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);
        executorService.scheduleAtFixedRate(new Runnable() { //类似还有个scheduleWithFixedDelay方法
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis());
                try {
                    Thread.sleep(1 * 1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
           // 初始化延迟0ms开始执行，每隔2000ms重新执行一次任务
        },0,2000,TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) {
        executeFixedRate();
    }
}
