package com.burakturan.thread3;


public class Main
{
    public static void main(String[] args)
    {
        // anonymous class
        Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run()
            {
                System.out.println("Thread is working...");

                for(int i=1;i <= 10; i++)
                {
                    try
                    {
                        System.out.println("Typing:" +i);
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e)
                    {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        printer1.start();

        System.out.println("Main Thread is working!");
    }
}
