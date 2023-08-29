import java.util.ArrayList;

public class AutoBoxingAndUnboxing
{
    public static void main(String[] args)
    {
        /*
            Wrapper Class

            boolean => Boolean
            char => Character
            byte => Byte
            int => Integer
            long => Long
            float => Float
            double => Double
         */

        ArrayList<String> arrayList1 = new ArrayList<String>();

        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();

        for (int i=0; i < 10; i++)
        {
            arrayList2.add(Integer.valueOf(i*4)); // Autoboxing
        }

        for (int i= 0; i <arrayList2.size(); i++)
        {
            System.out.println(arrayList2.get(i).intValue()); // Unboxing
        }
    }
}
