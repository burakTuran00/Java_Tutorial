import java.util.Scanner;

public class ToSwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        float number_1 = scanner.nextFloat();

        System.out.print("Enter second number:");
        float number_2 = scanner.nextFloat();

        System.out.println("First number " + number_1 + " and " + " Second number "+ number_2);

        float temporary = number_1;
        number_1 = number_2;
        number_2 = temporary;

        System.out.println("After swap");
        System.out.println("First number " + number_1 + " and " + " Second number "+ number_2);

    }
}
