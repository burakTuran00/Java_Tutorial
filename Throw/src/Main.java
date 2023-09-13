import java.util.Scanner;

public class Main
{
    public static void ageCheck(int age)
    {
        if(age < 18)
        {
            throw new ArithmeticException();
        }
        else {
            System.out.println("Welcome!");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        try {
            ageCheck(age);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Grow Up!");
        }

    }
}