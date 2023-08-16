import  java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for calculating factorial:");
        int number = scanner.nextInt();
        int permanentNumber = number;
        int factorial = 1;

        while (number > 0)
        {
            factorial *= number;
            number--;
        }

        System.out.println("The factorail of "+ permanentNumber + " is equal to " + factorial);
    }
}
