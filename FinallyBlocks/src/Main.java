public class Main {
    public static void main(String[] args)
    {
        // it's always working, whatever make exception or not.

        try {
            String s = null;
            System.out.println(s.hashCode());
        }
        catch (NullPointerException e)
        {
            System.out.println("Null reference error!");
        }
        finally {
            System.out.println("Finally block is working!"); // must work 
        }
    }
}