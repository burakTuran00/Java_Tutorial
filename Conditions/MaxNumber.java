import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        //To find max number within three numbers.
        Scanner scanner = new Scanner(System.in);

        System.out.print("To enter first number:");
        int n1 = scanner.nextInt();

        System.out.print("To enter second number:");
        int n2 = scanner.nextInt();

        System.out.print("To enter third number:");
        int n3 = scanner.nextInt();

        int max = 0;

        if (n1 > n2 && n1 > n3)
        {
            max = n1;
        }
        else if (n2 > n1 && n2 > n3)
        {
           max = n2;
        }
        else if (n3 > n1 && n3 > n2)
        {
            max = n3;
        }
        else if (n1 == n2 && n1 == n3 && n2 == n3)
        {
            System.out.println("All of numbers can be equal.");
            max  = n1;
        }

        System.out.println("The biggest number is " + max);
    }
}
