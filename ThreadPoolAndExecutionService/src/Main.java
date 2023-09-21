import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i = 0; i<5;i++)
        {
            executorService.submit(new Worker((String.valueOf(i)), i));
        }

        executorService.shutdown();
        System.out.println("All task was send!");

        try
        {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("all tasks are finished!");
    }
}