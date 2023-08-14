import java.util.Scanner;

public class AdjustTaxiPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much does your car burn per kilometer:");
        double cost = scanner.nextDouble();

        System.out.print("How many kilometer are you going:");
        int kilometer = scanner.nextInt();

        System.out.println("The total amount of your cost is about " + (cost * kilometer)+ "$");
    }
}
