import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListWorker
{
    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void addValueToListOne()
    {
        synchronized (lock1) {
            try
            {
                Thread.sleep(1);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(100));
        }
    }
    public void addValueToListTwo()
    {
        synchronized (lock2) {
            try
            {
                Thread.sleep(1);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            list1.add(random.nextInt(100));
        }
    }

    public void adjustValue()
    {
        for(int i =0; i< 1000; i++)
        {
            addValueToListOne();
            addValueToListTwo();
        }
    }

    public void StartAll()
    {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                adjustValue();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                adjustValue();
            }
        });

        long start = System.currentTimeMillis();

        try
        {
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }

        System.out.println("List 1 Size:"+list1.size());
        System.out.println("List 2 Size:"+list2.size());

        long end = System.currentTimeMillis();
        System.out.println("Time:"+(end-start));

    }
}
