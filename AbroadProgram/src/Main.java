import java.lang.InterruptedException;
import java.lang.Thread;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to the Airport!");

        String conditions = "-Rules of Go Abroad-\n"
                            +"Doesn't have any political ban.\n"
                            +"Purchase 15$ for interest cost\n"
                            +"Need vise for that country";
        String message = "You have to provide all conditions.";

        while (true)
        {
            System.out.println("********************************");
            System.out.println(conditions);
            System.out.println("********************************");


            Passenger passenger = new Passenger();

            System.out.println("Checking the interest cost, just wait for a moment!");
            Thread.sleep(3000);

            if(!passenger.abroadInterestCost())
            {
                System.out.println(message);
                continue;
            }

            System.out.println("Checking political ban, just wait for a moment!");
            Thread.sleep(3000);

            if(!passenger.politicalBan())
            {
                System.out.println(message);
                continue;
            }

            System.out.println("Checking the visa statment, just wait for a moment!");
            Thread.sleep(3000);

            if(!passenger.viseState())
            {
                System.out.println(message);
                continue;
            }

            System.out.println("You've provided all conditions, Have a nice fly!");
            break;
        }
    }
}