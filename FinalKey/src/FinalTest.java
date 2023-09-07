public class FinalTest
{
    public final int numberOfObject;
    private static int counter = 0;
    private final String name;
    public FinalTest(String name)
    {
        this.name = name;
        counter++;
        numberOfObject = counter;
    }
    public static int getCounter()
    {
         return counter;
    }

    public static void setCounter(int counter)
    {
        FinalTest.counter = counter;
    }
}
