package ThreadExercise;

//如果一个类继承Thread，则不适合资源共享。
// 但是如果实现了Runable接口的话，则很容易的实现资源共享。
public class Thread2 implements Runnable {

    private String name;
    public Thread2(String name) {
        this.name=name;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread2 t1 = new Thread2("A");
        Thread2 t2 = new Thread2("B");

        t1.run();
        t2.run();
        new Thread(new Thread2("C")).start();
        new Thread(new Thread2("D")).start();

    }
}
