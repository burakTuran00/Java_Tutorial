public class Array_1
{
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        float[] arr2;
        int[] arr3 = {10,20,30,40,50};
        double[] arr4 = {25.4,24,21,90.7};

        for (int i= 0; i < arr1.length; i++)
        {
            arr1[i] = i;
        }

        for(int x : arr1)
        {
            System.out.println(x);
        }

        System.out.println("----------------------------");
        PrintArray(arr1);

        System.out.println("----------------------------");
        System.out.println(AverageOfArray(arr4));
    }

    public static void PrintArray(int[] arr)
    {
        for(int i=0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static double AverageOfArray(double[] arr)
    {
        double sum = 0;
        for (int i=0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        return  (sum / arr.length);
    }
}
