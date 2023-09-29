import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int search(int[] nums, int target)
    {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left <= right)
        {
            int middle = (left+right) / 2;

            if(nums[middle] == target) {
                return middle;
            }
            else if(nums[middle] > target)
            {
                right = middle - 1;
            }
            else
            {
                left = middle + 1;
            }
        }
        return  -1;

    }
}
