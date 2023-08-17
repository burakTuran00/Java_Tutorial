import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter a number:");
            int number = scanner.nextInt();

            if (number == -1)
            {
                System.out.println("Left the loop");
                break;
            }
        }

        for (int i=0; i< 10; i++)
        {
            if (i == 3 || i == 5)
            {
                continue;
            }
            System.out.println(i);
        }
        
    }
}
