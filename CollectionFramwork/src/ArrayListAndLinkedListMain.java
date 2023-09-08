import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedListMain
{
    // both have a lot of common method such as add,remove. Because, they implemented List interface.

    public static void main(String[] args)
    {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        toCalculateTheTime("LinkedList",linkedList);
        toCalculateTheTime("ArrayList",arrayList);
    }
    public static void toCalculateTheTime(String datatype, List<Integer> list)
    {
        // add value at the end of the list

        long  start, end;

        start = System.currentTimeMillis(); // first second before the loop

        for (int i=0 ; i < 1000000;i++)
        {
            list.add(i); // To add end of the list, faster ArrayList;
            list.add(0,1); // To add first of the list, faster LinkedList;
        }

        end = System.currentTimeMillis(); // last second after the loop

        System.out.println(datatype +" Time:" + (end-start) + "ms");

        // ArrayList is faster than LinkedList : adding end of the list
        // LinkedList is faster than ArrayList : adding first of the list
    }
}
