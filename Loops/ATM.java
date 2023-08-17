import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        String circumstance = "1- To check money\n"
                             +"2- To withdraw money\n"
                             +"3- To invest money\n"
                             +"4- To exit(q)";

        System.out.println("************************");
        System.out.println(circumstance);
        System.out.println("************************");

        while (true)
        {
            System.out.printf("To select the circumstance you want to do:");
            String process = scanner.nextLine();

            if (process.equals("q"))
            {
                System.out.println("You've left!");
                break;
            }
            else if (process.equals("1"))
            {
                System.out.println("Your Balance:" +balance);
            }
            else if (process.equals("2"))
            {
                System.out.println("Withdrawable Balance:" +balance);
                System.out.print("How much do you want to withdraw:");
                float amount = scanner.nextFloat();

                scanner.nextLine();

                if (balance - amount < 0)
                {
                    System.out.println("There is no enough money at your account!");
                }
                else
                {
                    balance -= amount;
                }

            }
            else if (process.equals("3"))
            {
                System.out.println("Investable Balance:" +balance);
                System.out.print("How much do you want to invest:");
                float amount = scanner.nextFloat();
                balance += amount;
                scanner.nextLine();
            }
            else
            {
                System.out.println("Invalid process!");
            }
        }
    }
}
