import java.util.ArrayList;
public class IntroductionArraylList
{
    public static void main(String[] args)
    {
        ArrayList<String> arrList = new ArrayList<String>();

        arrList.add("Apple");
        arrList.add("Banana");
        arrList.add("Pineapple");
        arrList.add("Orange");

        System.out.println(arrList.get(1));

        int size = arrList.size();

        arrList.remove("Banana");
        arrList.remove(1);

        System.out.println(arrList.indexOf("Orange"));
        System.out.println(arrList.lastIndexOf("Pineapple"));
        System.out.println(arrList.indexOf("Peace")); // return -1, if it doesn't exist.

        arrList.set(4,"Peace");

        for(String x : arrList)
        {
            System.out.println(x);
        }

        Print(arrList);
    }
    public static void Print(ArrayList<String> arrayList)
    {
        for(int i =0 ; i<arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
    }
}
