package ThreadExercise;

/**
 * 方法一 继承thread
 */
public class Thread1 extends Thread {
    private String name;
    private Thread1(String name){
        this.name = name;
    }

//    public void run(){
//        for (int i=0;i<5;i++){
//            System.out.println(name+"runs："+i);
//            try {
//                sleep((long) Math.random() *10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程"+name + "运行 : " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
    }


    public static void main(String[] args) {
        //         start()方法的调用后并不是立即执行多线程代码，而是使得该线程变为可运行态（Runnable），什么时候运行是由操作系统决定的。
        //        从程序运行的结果可以发现，多线程程序是乱序执行。因此，只有乱序执行的代码才有必要设计为多线程。
        System.out.println(Thread.currentThread().getName()+"主线程运行开始!");

        Thread1 t1 = new Thread1("A");
        Thread1 t2 = new Thread1("B");

        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName()+ "主线程运行结束!");
        //但是start方法重复调用的话，会出现java.lang.IllegalThreadStateException异常。
//        Thread1 t3 = t1;
//        t1.start();
//        t3.start();
    }
}

