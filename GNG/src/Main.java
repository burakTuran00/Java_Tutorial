import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> storage = new ArrayList<>();
        int tryCount = 0 , playerGuess = 0;
        int randomNumber = random.nextInt(99) + 1;
        String answer;

        while(true)
        {
            System.out.print("Enter a number between 1 and 99:");
            playerGuess = scanner.nextInt();

            tryCount++;
            storage.add(playerGuess);

            if(playerGuess == randomNumber)
            {
                break;
            }
            else if(playerGuess < randomNumber)
            {
                System.out.println("Enter bigger number!");
                continue;
            }
            else
            {
                System.out.println("Enter smaller number!");
               continue;
            }
            
        }
    }
}