import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i<numbers.length;i++)
        {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before sorted:");
        printArray(numbers);

        System.out.println("\nAfter sorted:");
        insertionSort(numbers);
        printArray(numbers);
    }
    private static void printArray(int[] arr)
    {
        for(int value : arr)
        {
            System.out.println(value);
        }
    }
    private static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int currentValue = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > currentValue)
            {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = currentValue;
        }
    }
}