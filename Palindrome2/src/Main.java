public class Main
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-11211));
    }
    public static boolean isPalindrome(int x)
    {
        char[] digits = String.valueOf(x).toCharArray();

        int length = digits.length;

        for(int i=0; i<= (length / 2)  && length != 0;i++)
        {
            if(digits[i] != digits[length-i-1])
            {
                return false;
            }
        }
        return true;
    }
}