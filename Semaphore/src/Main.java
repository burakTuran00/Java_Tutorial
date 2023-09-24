import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        SemaphoreExample semaphoreExample = new SemaphoreExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphoreExample.threadFunction(1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphoreExample.threadFunction(2);
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphoreExample.threadFunction(3);
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphoreExample.threadFunction(4);
            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphoreExample.threadFunction(5);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
    }
}