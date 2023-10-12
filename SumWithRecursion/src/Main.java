import java.util.List;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        int number = 20;
        int sum = Sum(number);

        System.out.println(sum);

        int facNumber = 5;
        int factorial = Fact(facNumber);

        System.out.println(factorial);
    }

    public static int Sum(int number)
    {
        if(number < 1){
            return 0;
        }
        else
        {
            return number + Sum(number - 1);
        }

    }

    public static int Fact(int number)
    {
        if(number >= 1)
        {
            return number * Fact(number-1);
        }
        else {
            return 1;
        }

    }
}