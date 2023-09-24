import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] array1 = {1,3};
        int[] array2 = {2,7};

        System.out.println( findMedianSortedArrays(array1,array2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n +m];
        int k =0;

        for(int i=0; i<n;i++)
        {
            merged[k++] = nums1[i];
        }

        for(int i=0 ; i<m; i++)
        {
            merged[k++] = nums2[i];
        }

        Arrays.sort(merged);


        int totalLength = merged.length;

        if(totalLength % 2 == 1)
        {
            return (double) merged[totalLength / 2];
        }
        else
        {
            int left = merged[(totalLength/2) - 1];
            int right = merged[(totalLength/2)];

            return (double) (left + right) /2.0;
        }
    }
}