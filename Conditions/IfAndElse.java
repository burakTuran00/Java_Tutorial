import java.util.Scanner;

public class IfAndElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        if (age  >= 18)
        {
            System.out.println("You are an adult.");
        }
        else
        {
            System.out.println("You aren't an adult.");
        }

        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        if (number < 0)
        {
            System.out.println(number + " is negative.");
        }
        else if (number > 0)
        {
            System.out.print(number + " is positive.");
        }
        else
        {
            System.out.print(number + " is neutral");
        }
    }
}
