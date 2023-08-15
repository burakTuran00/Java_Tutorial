import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number:");
        int n = scanner.nextInt();

        switch (n)
        {
            case 1:
                System.out.println("First");
                break;
            case  2:
                System.out.println("Second");
                break;
            case 3:
                System.out.println("Third");
                break;
            case 4:
                System.out.println("Fourth");
                break;
            default:
                System.out.println("No Found!");
                break;
        }
    }
}
