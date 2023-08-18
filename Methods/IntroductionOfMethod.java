import java.util.Scanner;

public class IntroductionOfMethod {

    public static void Greeting()
    {
        System.out.println("Hello, I came from another function.");
        System.out.println("Function Name: Greeting");
    }

    public static void Factorial()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        int result = 1;

        for (int i= 1; i <= number; i++)
        {
            result *= i;
        }

        System.out.println("The factorial of that number is equal to " + result);
    }
    public static void main(String[] args)
    {
        Greeting();
        Factorial();
    }
}
