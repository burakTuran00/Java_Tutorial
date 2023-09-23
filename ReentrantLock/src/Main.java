public class Main {
    public static void main(String[] args)
    {
        ReentrantLockExample reentrantLockExample = new ReentrantLockExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockExample.thread1Function();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                reentrantLockExample.thread2Function();
            }
        });

        thread1.start();
        thread2.start();

        try
        {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        reentrantLockExample.threadOver();
    }
}