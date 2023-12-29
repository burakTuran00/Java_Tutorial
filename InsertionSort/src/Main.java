public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {9,1,2,4,6,8,7,5};

        insertionSort(arr);

        for(int value : arr)
        {
            System.out.print(value + " ");
        }
    }

    private static void insertionSort(int[] array)
    {
        for(int i = 1; i < array.length; i++)
        {
            int currentValue = array[i];

            int j = i - 1;

            while (j >= 0 && array[j] > currentValue)
            {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = currentValue;
        }
    }
}