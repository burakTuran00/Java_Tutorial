import java.util.Scanner;

public class Passenger implements  IAbroadRules
{
    private int interestCost;
    private boolean politicalban;
    private boolean visestate;

    public Passenger()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much did pay interest cost:");
        this.interestCost = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Do you have political bans (Yes-No):");
        String answer= scanner.nextLine();

        if(answer.equals("Yes"))
        {
            this.politicalban = true;
        }
        else {
            this.politicalban = false;
        }

        System.out.print("Do you have valid visa (Yes-No):");
        String answer2 = scanner.nextLine();

            if(answer2.equals("Yes"))
            {
                this.visestate = true;
            }
            else {
                this.visestate = false;
            }
    }

    @Override
    public boolean abroadInterestCost() {
        if(this.interestCost <15)
        {
            System.out.println("->Please, purchase the whole interest cost!");
            return false;
        }
        else {
            System.out.println("->Interest Cost Valid");
            return true;
        }
    }

    @Override
    public boolean politicalBan() {
        if(this.politicalban)
        {
            System.out.println("->You cannot go abroad because of political ban!");
            return false;
        }
        else{
            System.out.println("->Doesn't have any ban!");
            return true;
        }
    }

    @Override
    public boolean viseState() {
        if(this.visestate)
        {
            System.out.println("->Vise task is completed.");
            return true;
        }
        else {
            System.out.println("->Didn't find the vise for that country");
            return false;
        }
    }
}
