package com.burakturan.thread1;

public class Printer extends Thread
{
    private String name;

    public Printer(String name)
    {
        this.name = name;
    }

    @Override
    public void run()
    {
        System.out.println(name+ " is working");

        for(int i=1; i<= 10;i++)
        {
            try
            {
                System.out.println(name + "Typing: "+i);
                Thread.sleep(1000); // 1 second wait;
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread kesintiye uğradı!");
            }
        }

        System.out.println(name + " finished duty!");
    }
}
