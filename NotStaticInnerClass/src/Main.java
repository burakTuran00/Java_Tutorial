import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Mathematics.Factorial factorial = new Mathematics().new Factorial();
        Mathematics.Prime prime = new Mathematics().new Prime();
        Mathematics.Area.CircleArea area = new Mathematics().new Area().new CircleArea();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if(prime.isPrime(number))
        {
            System.out.println(number + " is a prime!");
        }
        else {
            System.out.println("Not prime");
        }

        factorial.calculateFactorial();

        System.out.println("Enter a radius:");
        int radius = scanner.nextInt();

        area.CalculateCircleArea(radius);

    }
}