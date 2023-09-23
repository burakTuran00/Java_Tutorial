import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample
{
    private  int counter = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increase()
    {
        for(int i = 0; i<10000;i++)
        {
            counter++;
        }
    }

    public void thread1Function()
    {
        lock.lock();
        System.out.println("Thread 1 is working");
        System.out.println("Thread 1 is waiting for waking up!");

        try
        {
            condition.await();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        System.out.println("Thread 1 woke up and continue to process");
        increase();

        lock.unlock();
    }

    public void thread2Function()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        Scanner scanner = new Scanner(System.in);

        lock.lock();
        System.out.println("Thread 2 is working...");
        increase();
        System.out.println("Press any key to continue?");
        scanner.nextLine();
        condition.signal();
        System.out.println("I go away, I did my job.");

        lock.unlock();
    }

    public void threadOver()
    {
        System.out.println("Counter:"+counter);
    }
}
