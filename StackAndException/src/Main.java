public class Main
{
    public static void third()
    {
        try {
            int a = 12 / 0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("cannot divide by 0");
        }
    }
    public static void second()
    {
        third();
    }
    public static void first()
    {
        second();
    }
    public static void main(String[] args)
    {
        first();
    }
}