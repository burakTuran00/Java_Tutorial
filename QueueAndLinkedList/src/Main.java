import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<String>();

        queue.offer("java"); // add the element to the queue, if adds then true, else false
        queue.offer("c++");
        queue.offer("python");
        queue.offer("php");

        System.out.println(queue.peek()); // first element in the queue

        System.out.println(queue.poll()); // receive and remove first element in the queue, if no element then return null

        System.out.println("-----------");
        for (String s : queue)
        {
            System.out.println(s);
        }

        while(!queue.isEmpty())
        {
            System.out.println("Removing element of " + queue.poll());
        }
    }
}