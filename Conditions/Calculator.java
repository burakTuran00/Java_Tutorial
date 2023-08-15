import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("To select a process (+-*/):");
        String process = scanner.nextLine();

        System.out.print("To enter first number:");
        float n1 = scanner.nextFloat();

        System.out.print("To enter second number:");
        float n2 = scanner.nextFloat();

        float result;

        switch (process)
        {
            case  "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case  "/":
                result = n1 / n2;
                break;
            default:
                result = 0;
                System.out.println("Not Defined! Something went wrong!");
        }

        System.out.println(n1 + " " + process + " " + n2 + " = " +result);
    }
}
