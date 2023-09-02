import java.util.Scanner;

public class Mathematics
{
    private double PI = Math.PI;

    public class Factorial
    {
        public void calculateFactorial()
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            int fact = 1;

            for (int i = 2; i <= number; i++)
            {
                fact *= i;
            }

            System.out.println("Factorial:" + fact);
        }
    }

    public class Prime
    {
        public boolean isPrime(int number)
        {
            int i = 2;

            while (i < number)
            {
                if(number % i == 0)
                {
                    return false;
                }

                i++;
            }

            return true;
        }
    }

    public class Area
    {
        public class CircleArea
        {
            public void CalculateCircleArea(int radius)
            {
                double area = PI * radius * radius;
                System.out.println("Area of Circle: "+area);
            }
        }
    }
}
