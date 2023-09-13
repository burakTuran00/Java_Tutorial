public class Main {
    public static void main(String[] args)
    {
        //int a = 30/0; // unchecked exception

        /*try
        {
           // int a = 30/0; // arithmetic exception
            int[] arr = {1,2,3}; // ArrayIndexOutOfBounds exception

            System.out.println(arr[5]);
        }
        catch (Exception e)
        {
            System.out.println("Out of Border Error!");
            e.printStackTrace();
        }

        System.out.println("This piece of code is working");*/

        try
        {
            int b = 30/0;
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("a number cannot divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Out of Bounds");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }
    }
}