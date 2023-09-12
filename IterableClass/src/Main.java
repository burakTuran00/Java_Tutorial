import java.util.Iterator;

public class Main {
    public static void main(String[] args)
    {
        String[] channels = {"Fiva","Lok","Pop","Rty","Gox"};

        Radio radio = new Radio(channels);

        for(String c : radio) // we did print because of implement of Iterable
        {
            System.out.println(c);
        }

        Iterator<String> iterator = radio.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}