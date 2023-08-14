import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first short edge:");
        double shortEdge1 = scanner.nextDouble();

        System.out.print("Enter the second short edge:");
        double shortEdge2 = scanner.nextDouble();

        double hypotenuse = Math.sqrt(Math.pow(shortEdge1,2) + Math.pow(shortEdge2,2));

        System.out.println("The Hypotenuse or long edge is equal to " + hypotenuse);
    }
}
