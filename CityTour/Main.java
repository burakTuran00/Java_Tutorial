import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main
{
    public static void ShowProcess()
    {
        System.out.println("0-Show Process");
        System.out.println("1-Visit Next City");
        System.out.println("2-Visit Previous City");
        System.out.println("3-Ouit");
    }
    public static void VisitCity(LinkedList<String> cities)
    {
        ListIterator<String> iterator = cities.listIterator();

        int process;
        ShowProcess();

        Scanner scanner = new Scanner(System.in);

        if(!iterator.hasNext())
        {
            System.out.println("There'n no city!");
        }

        boolean exit =false;
        boolean forward = true;

        while (!exit)
        {
            System.out.print("Select a process:");
            process = scanner.nextInt();

            switch (process)
            {
                case 0:
                    ShowProcess();
                    break;
                case  1:
                    if(!forward)
                    {
                        if(iterator.hasNext())
                        {
                            iterator.next();
                        }

                        forward = true;
                    }

                    if(iterator.hasNext())
                    {
                        System.out.println("visiting the city:" +iterator.next());
                    }
                    else
                    {
                        System.out.println("There's no city to visit!");
                        forward = true;
                    }
                    break;
                case 2:
                    if(forward)
                    {
                        if(iterator.hasPrevious())
                        {
                            iterator.previous();
                        }
                        forward = false;
                    }

                    if(iterator.hasPrevious())
                    {
                        System.out.println("visiting the cit:"+iterator.previous());
                    }
                    else {
                        System.out.println("City tour is already started!");
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Leavnig the app!");
                    break;
            }
        }
    }
    public static void main(String[] args)
    {
        LinkedList<String> cities = new LinkedList<String>();
        cities.add("New York");
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Bakü");

        VisitCity(cities);
    }
}