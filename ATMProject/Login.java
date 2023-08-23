import java.util.Scanner;
public class Login {
    public boolean login( Account account)
    {
        Scanner scanner = new Scanner(System.in);
        String userId, userPassword;

        System.out.print("Username:");
        userId = scanner.nextLine();

        System.out.print("Password:");
        userPassword = scanner.next();

        if (account.getId().equals(userId) && account.getPassword().equals(userPassword))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
