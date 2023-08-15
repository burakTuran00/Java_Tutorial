import java.util.Scanner;

public class BodyMassIndexWithIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("To enter your weight:");
        double w = scanner.nextDouble();

        System.out.print("To enter your height (Like 1,72):");
        double h = scanner.nextDouble();

        double index = w / (h * h);

        if (index < 18.5)
        {
            System.out.println("You are weak or slim.");
        }
        else if (18.5 <= index && index < 25)
        {
            System.out.println("You are normal");
        }
        else if (25 <= index && index < 30)
        {
            System.out.println("You are fat.");
        }
        else
        {
            System.out.println("You are obez.");
        }
    }
}
