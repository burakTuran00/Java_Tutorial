import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Vector<String> vector = new Vector<String>();

        vector.add("java");
        vector.add("python");
        vector.add("c++");
        vector.add("php");

        for(int i=0; i < vector.size(); i++)
        {
            System.out.println(vector.get(i));
        }

        ListIterator<String> iterator = vector.listIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }
        System.out.println("------------");
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println("------------");

        Stack<String> stack = new Stack<String>();

        stack.add("java");
        stack.push("java");
        stack.push("python");
        stack.push("php");
        stack.push("go");

        for(int i=0; i < stack.size(); i++)
        {
            System.out.println(stack.get(i));
        }

        Enumeration<String> enumeration1 = stack.elements();
        while (enumeration1.hasMoreElements())
        {
            System.out.println(enumeration1.nextElement());
        }

        System.out.println("Last elemant:"+stack.peek()); // last element
        System.out.println("Removing last element"+stack.pop()); // remove last element

        System.out.println("------------");
        for(int i=0; i < stack.size(); i++)
        {
            System.out.println(stack.get(i));
        }

        System.out.println(stack.empty()); // false if there's element


        while (!stack.empty())
        {
            System.out.println("Removing element "+stack.pop());
        }
    }
}