public class Main {
    public static void main(String[] args)
    {
        DeadLockExample deadLock = new DeadLockExample();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.thread1Function();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.thread2Function();
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

        deadLock.threadOver();
    }
}