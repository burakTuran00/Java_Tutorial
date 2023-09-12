import java.util.*;

public class Main
{
    // Iterator : Set, Queue, List interface, doesn't have previous method
    // ListIterator: Just List interface, next and previous, add

    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();

        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) // both direction
        {
            System.out.println(iterator.next());
        }

        while(iterator.hasPrevious())
        {
            System.out.println(iterator.previous());
        }

        while(iterator.hasNext())
        {
            String value = iterator.next();

            if(value.equals("go"))
            {
                iterator.remove(); // remove that element
            }
        }

        set.add("java");
        set.add("python");
        set.add("c++");
        set.add("go");

        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("go");

        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = list.iterator();

        while (iterator1.hasNext())  // just we can go forward
        {
            System.out.println(iterator1.next());
        }

        System.out.println("---------------------");

        while(iterator2.hasNext())
        {
            System.out.println(iterator2.next());
        }

        System.out.println("---------------------");



    }
}