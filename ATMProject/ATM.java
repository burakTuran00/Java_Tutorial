import java.util.Scanner;

public class ATM {
    public void Work(Account account)
    {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        int enterence_right = 3;

        while(true)
        {
            if(login.login(account))
            {
                System.out.println("The entrance is successful.");
                break;
            }
            else
            {
                System.out.println("Unsuccessful entrance!");

                enterence_right -= 1;
                System.out.println(enterence_right + " remained entrance right.");

            }

            if (enterence_right <= 0)
            {
                System.out.println("There is no entrance right!");
                return;
            }
        }

        System.out.println("****************************************");
        String conditions = "1. Show Balance\n" +
                            "2. Invest Money\n" +
                            "3. Withdraw Money\n" +
                            "Press 'q' for exit";
        System.out.println(conditions);
        System.out.println("****************************************");

        while (true)
        {
            System.out.print("Select the condition:");
            String process = scanner.nextLine();

            if(process.equals("q")){
                break;
            }
            else if (process.equals("1"))
            {
                System.out.println("Balance:" +account.getBalance());
            }
            else if (process.equals("2"))
            {
                System.out.print("How much do you want to invest:");
                int invest = scanner.nextInt();
                scanner.nextLine();

                account.InvestMoney(invest);
            }
            else if (process.equals("3"))
            {
                System.out.print("How much do you want to withdraw:");
                int withdraw = scanner.nextInt();
                scanner.nextLine();

                account.WithdrawMoney(withdraw);
            }
            else
            {
                System.out.println("Something went wrong!");
            }
        }
    }
}
