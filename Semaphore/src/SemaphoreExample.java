import java.util.concurrent.Semaphore;

public class SemaphoreExample
{
    private Semaphore semaphore = new Semaphore(2);

    public void threadFunction(int id)
    {
        try
        {
            semaphore.acquire();
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

        semaphore.release();
    }
}
