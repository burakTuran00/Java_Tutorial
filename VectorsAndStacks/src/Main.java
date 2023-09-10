import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

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
    }
}