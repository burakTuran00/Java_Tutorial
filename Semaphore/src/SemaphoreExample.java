import java.util.concurrent.Semaphore;

public class SemaphoreExample
{
    // we define how much thread will come in.
    private Semaphore semaphore = new Semaphore(2); // 2 thread come in

    public void threadFunction(int id)
    {
        try
        {
            semaphore.acquire(); // control the space
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        System.out.println("Thread is starting, ID:"+id);

        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        System.out.println(id+". thread is finished.");

        semaphore.release(); // if thread duty is finished, then remove it and take new one.
    }
}
