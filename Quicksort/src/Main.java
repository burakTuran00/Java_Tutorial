import java.util.Random;
// partition = bölme
public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("Before:");
        PrintArray(numbers);

        quickSort(numbers);

        System.out.println("After:");
        PrintArray(numbers);
    }
    private static void PrintArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    private static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    private static void quickSort(int[] array)
    {
        quickSort(array,0,array.length-1);
    }
    private static void quickSort(int[] array, int lowIndex, int highIndex)
    {
        if(lowIndex >= highIndex)
        {
            return; // base case of recursive.
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array,pivotIndex,highIndex);

        int leftPointer = partition(array,lowIndex,highIndex,pivot);

        quickSort(array,lowIndex,leftPointer-1);
        quickSort(array,leftPointer+1,highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot)
    {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer)
        {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer)
            {
                leftPointer++;
            }

            while (array[rightPointer] >= pivot && leftPointer < rightPointer)
            {
                rightPointer--;
            }

            swap(array,leftPointer,rightPointer);
        }

        swap(array, leftPointer, highIndex);
        return leftPointer;
    }
}