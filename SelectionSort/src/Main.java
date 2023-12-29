import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = {9,1,2,4,6,8,7,5};

        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] array)
    {
        int length = array.length;

        for(int i = 0; i < length - 1; i++)
        {
            int min = array[i];
            int indexOfMin = i;

            for(int j = i + 1; j < length; j++)
            {
                if(array[j] < min)
                {
                    min = array[j];
                    indexOfMin = j;
                }
            }
            swap(array, i, indexOfMin);
        }
    }

    private static void swap(int[] array, int a, int b)
    {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}