package Project1;

import java.util.Scanner;

public class Logn {
    public boolean login(AccountProject accountProject)
    {
        Scanner scanner = new Scanner(System.in);
        String userId, userPassword;

        System.out.print("Username:");
        userId = scanner.nextLine();

        System.out.print("Password:");
        userPassword = scanner.next();

        if (accountProject.getId().equals(userId) && accountProject.getPassword().equals(userPassword))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
