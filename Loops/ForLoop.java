import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        /*for (int i= 0; i < 10; i++)
        {
            System.out.println(i);
        }

        for (int i = 0; i != 10; i++)
        {
            System.out.println(i);
        }


        int j = 0 ;

        for (; j <= 5; j++)
        {
            System.out.println("Different using");
        }

        int x = 0;
        int y = 10;

        for (; x < 10 && y > 0; x++,y--)
        {
            System.out.println("x="+x);
            System.out.println("y="+y);
        }*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for calculating factorial:");
        int number = scanner.nextInt();
        int factorial=1;

        for (int i =1; i <= number; i++)
        {
            factorial *= i;
        }

        System.out.println("The factorial of "+ number +" is equal to "+factorial);

    }
}
