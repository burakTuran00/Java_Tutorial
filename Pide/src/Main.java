import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        Random random = new Random();
        Queue<String> pideQueue = new LinkedList<String>();

        pideQueue.offer("Hasan");
        pideQueue.offer("Mehmet");
        pideQueue.offer("Ali");
        pideQueue.offer("Kemal");
        pideQueue.offer("Ahmet");
        pideQueue.offer("Yaren");
        pideQueue.offer("Ahsen");
        pideQueue.offer("Ezgi");
        pideQueue.offer("Lütfü");
        pideQueue.offer("Kenan");

        int number = 1 +  random.nextInt(10);

        System.out.println("There are " + number +" pide.");
        Thread.sleep(3000);

        while (number != 0)
        {
            System.out.println(pideQueue.poll() + " took his pide.");
            number--;
            Thread.sleep(1000);
        }

        System.out.println("Don't have any pide!");
    }
}