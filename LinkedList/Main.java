import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void ShowList(LinkedList<String> paths)
    {
        /*for(String path: paths)
        {
            System.out.println(path);
        }*/

        ListIterator<String> iterator = paths.listIterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public static void AddWithOrdered(LinkedList<String> paths, String newValue)
    {
        ListIterator<String> iterator = paths.listIterator();

        while (iterator.hasNext())
        {
            int compare = iterator.next().compareTo(newValue);  // sort with alpahetic.

            if(compare == 0) // if two value is equal
            {
                System.out.println("There's already this eleman.");
                return;
            }
            else if (compare < 0) //   newValue > iterator.next
            {

            }
            else if (compare > 0)  // iterator.nex > newValue
            {
                iterator.previous();
                iterator.add(newValue);

                return;
            }
        }

        iterator.add(newValue);
    }
    public static void main(String[] args)
    {
        LinkedList<String> paths = new LinkedList<String>();

        paths.add("Super Market");
        paths.add("School");
        paths.add("Library");
        paths.add("GYM");
        paths.add("Home");

        ShowList(paths);

        System.out.println("----------------------------");

        paths.add(3,"Mall");
        paths.remove(1);

        ShowList(paths);
    }

    public void ArrayListSt()
    {
        // ArrayList sonradan eklenen elman diğer elamanları al satıra kaydırtır. performans kaybı.
        ArrayList<String> languages = new ArrayList<String>();

        languages.add("Java");
        languages.add("C++");
        languages.add("Python");

        for(String language : languages)
        {
            System.out.println(language);
        }

        languages.add(1,"C#");

        for(String language : languages)
        {
            System.out.println(language);
        }

    }
}
