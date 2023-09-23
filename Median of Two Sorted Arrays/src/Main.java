import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] array1 = {1,2};
        int[] array2 = {3,4};

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

        int sum = 0;

        for(int i = 0; i < merged.length;i++)
        {
            sum += merged[i];
        }

        double avarage = sum / (double)merged.length;

        return avarage;
    }
}