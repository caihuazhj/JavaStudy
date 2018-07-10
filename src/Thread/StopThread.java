package Thread;

import javafx.collections.ObservableSet;

import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public class StopThread {
    private static boolean stopRequested;

    private static synchronized  void requestStop(){
        stopRequested = true;
    }

    public static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while (!stopRequested()){
                    i++;
                    System.out.println(i);
                }
            }
        });
        backgroundThread.start();;
        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }
}
