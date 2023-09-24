import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                System.out.println("Thread is starting to work");
                int time = random.nextInt(1000)+2000;
                try
                {
                    Thread.sleep(time);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread is leaving now!");
            }
        });

        // ? means that we store the Callable variable. Integer then Integer, String then String.
        // we can return variables, objects.
        // In this example we return time which type of int.

        Future<?> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception
            {
                Random random = new Random();
                System.out.println("Thread is starting to work");
                int time = random.nextInt(1000)+2000;

                if(time > 2500)
                {
                    throw new IOException("Something Went Wrong");
                }

                try
                {
                    Thread.sleep(time);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }

                System.out.println("Thread is leaving now!");
                return  time;
            }
        });

        executorService.shutdown();

        try
        {
            System.out.println("Time:"+future.get());
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        catch (ExecutionException e)
        {
            System.out.println(e);
        }
    }
}