import java.util.ArrayList;

public class Main
{
    public static boolean isPalindrome(int x)
    {
        String number = String.valueOf(x);


        for(int i = 0; i < number.length(); i++)
        {
            if(number.charAt(number.length() - i) != number.charAt(i))
            {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(121));
    }


}