import java.util.Arrays;
import java.util.Scanner;

public class Array_2
{
    public static void main(String[] args)
    {
         int[] arr = FillArray(5);
         ArraySort(arr);

         int[] arr1 = {1,2,3,4,5};
         int[] arr2 = {1,2,3,4,5};

         if(arr1 == arr2)
         {
             System.out.println("Equal");
         }
         else {
             System.out.println("Not equal");
         }

         if (Arrays.equals(arr1,arr2)) // Compare the values of array;
         {
             System.out.println("Content Equal");
         }

         // those two arrays is not equal because of their address.
    }

    public static void PrintArray(int[] arr)
    {
        for(int i=0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int[] FillArray(int n)
    {
        Scanner scanner = new Scanner(System.in);

        int[] output = new int[n];

        for (int i=0; i < n; i++)
        {
            output[i] = scanner.nextInt();
        }

        return output;
    }

    public static void ArraySort(int[] arr)
    {
        Arrays.sort(arr);
        PrintArray(arr);
    }
}
