import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> myList = new ArrayList<>();

        for(int i = 0; i < 10; i++)
            myList.add(myList.size() - i, i);
        myList.removeIf((e) -> (e < myList.size() / 2));

        System.out.println(myList);


    }
}