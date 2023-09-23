import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample
{
    private Account account1 = new Account();
    private Account account2 = new Account();
    private Random random = new Random();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void LockControl(Lock a , Lock b)
    {
        boolean aLock = false;
        boolean  bLock = false;

        while (true)
        {
            aLock = a.tryLock();
            bLock = b.tryLock();

            if(aLock == true && bLock == true)
            {
                return;
            }
            if(aLock == true)
            {
                a.unlock();
            }
            if(bLock == true)
            {
                b.unlock();
            }
        }
    }

    public void thread1Function()
    {
        LockControl(lock1,lock2);

        for(int i=0;i<5000;i++)
        {
            Account.moneyTransfer(account1,account2,random.nextInt(100));
        }

        lock1.unlock();
        lock2.unlock();
    }
    public void thread2Function()
    {
        LockControl(lock2,lock1);

        for(int i=0;i<5000;i++)
        {
            Account.moneyTransfer(account2,account1,random.nextInt(100));
        }

        lock2.unlock();
        lock1.unlock();
    }

    public void threadOver()
    {
        System.out.println("Account 1 balance:"+account1.getBalance());
        System.out.println("Account 2 balance:"+account2.getBalance());
        System.out.println("Total balance:"+(account1.getBalance()+account2.getBalance()));
    }
}
