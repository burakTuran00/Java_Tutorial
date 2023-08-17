import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        System.out.print("Enter step number:");
        int step = scanner.nextInt();

        int tempNumber = number;
        int result = 0;

        do
        {
            int stepValue = tempNumber % 10;
            tempNumber /= 10;

            result += Math.pow(stepValue , step);
        }while (tempNumber > 0);

        if (result == number)
        {
            System.out.println("An armstrong number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }

    }
}
