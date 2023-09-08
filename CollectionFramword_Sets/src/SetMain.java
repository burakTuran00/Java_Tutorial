import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain
{
    public static void main(String[] args)
    {
        Set<String> set1 = new HashSet<String>();  // random sorting
        Set<String> set2 = new LinkedHashSet<String>(); // not sorting, just same
        Set<String> set3 = new TreeSet<String>();  // sorting alphabetic

        // HashSet
        set1.add("java");
        set1.add("python");
        set1.add("c++");
        set1.add("php");
        set1.add("c#");

        // LinkedHashSet
        set2.add("java");
        set2.add("python");
        set2.add("c++");
        set2.add("php");
        set2.add("c#");

        // TreeSet
        set3.add("java");
        set3.add("python");
        set3.add("c++");
        set3.add("php");
        set3.add("c#");

        System.out.println("------HashSet------");
        for(String s : set1)
        {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("------LinkedHashSet------");
        for(String s : set2)
        {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("------TreeSet------");
        for(String s : set3)
        {
            System.out.println(s);
        }
    }
}
