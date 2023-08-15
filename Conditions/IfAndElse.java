import java.util.Scanner;

public class IfAndElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        if (age  >= 18)
        {
            System.out.println("You are in.");
        }
        else
        {
            System.out.println("You cannot come in, Grow up.");
        }
    }
}
