import java.util.Scanner;

public class UserEnterProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String systemUserName = "hello";
        String systemPassword = "123";

        while (true)
        {
            System.out.print("Enter Username:");
            String username = scanner.nextLine();

            System.out.print("Enter Password:");
            String password = scanner.nextLine();

            if (username.equals(systemUserName) && password.equals(systemPassword))
            {
                System.out.println("You are in!");
                break;
            }
            else
            {
                System.out.println("Something is wrong!\nPlease try again!");
            }

        }
    }
}
