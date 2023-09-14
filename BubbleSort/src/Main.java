public class Main
{
    public static int[] bubbleSort(int[] arr)
    {
        for(int i=0; i< arr.length-1;i++)
        {
            for(int j=0; j< arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {9,1,2,4,6,8,7,5};
        int[] sorted = bubbleSort(arr);

        for(int i : bubbleSort(arr))
        {
            System.out.print(i);
        }
    }
}