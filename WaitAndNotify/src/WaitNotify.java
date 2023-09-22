import java.util.Objects;
import java.util.Scanner;

public class WaitNotify
{
    private Object lock = new Object();
    public void thread1Function()
    {
        synchronized (lock)
        {
            System.out.println("Thread 1 is working...");
            System.out.println("Thread 1 is waiting for waking up");

            try
            {
                lock.wait();
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

            System.out.println("Thread 1 did wake up and continue!");
        }
    }
    public void thread2Function()
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        synchronized (lock)
        {
            System.out.println("Thread 2 is working now!");
            System.out.println("Press a key to continue?");
            scanner.nextLine();

            lock.notify();
            System.out.println("Thread 1 is waking now :D");
        }
    }

}
