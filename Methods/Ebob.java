import java.util.Scanner;

public class Ebob
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number1 = scanner.nextInt();

        System.out.print("Enter a number:");
        int number2 = scanner.nextInt();

        System.out.print("the ebob of these number is equal to " + ToFindEbob(number1,number2));
    }
    public static int ToFindEbob(int n1, int n2)
    {
        int ebob = 1;

        for (int i = 1; i <= n1 && i <= n2; i++)
        {
            if ((n1 % i == 0) && (n2 % i == 0))
            {
                ebob = i;
            }
        }
        return ebob;
    }
}
