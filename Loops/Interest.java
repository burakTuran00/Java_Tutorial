import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How much do you want to invest (interest rate: %6) :");
        double invest = scanner.nextDouble();

        System.out.print("How many year do you want to invest:");
        int year = scanner.nextInt();

        double interest = 0.06;
        double totalMoney = invest;

        for (int i = 1; i <= year; i++)
        {
            totalMoney = (totalMoney * interest ) + totalMoney;
        }

        System.out.print("The total money is equal "+ totalMoney + "at " +year+ " years.");
    }
}
