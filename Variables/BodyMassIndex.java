import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        // weight / height * height

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight:");
        double w = scanner.nextDouble();

        System.out.print("Enter your height(Like 1,76):");
        double h = scanner.nextDouble();;

        double result = w / (h * h);
        System.out.println("Your Body Mass Index is equal to "+ result);
    }
}
