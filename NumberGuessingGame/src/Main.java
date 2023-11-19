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
            while(playerGuess != randomNumber)
            {
                System.out.print("Enter a guess (1-99):");
                playerGuess = scanner.nextInt();

                tryCount++;
                storage.add(playerGuess);

                if(playerGuess == randomNumber)
                {
                    System.out.println("Tried:" +tryCount);
                    System.out.println("Tried Numbers: ");

                    for(int s : storage)
                    {
                        System.out.print(s + ",");
                    }
                }
                else if(playerGuess < randomNumber)
                {
                    System.out.println("Guess bigger number!");
                }
                else
                {
                    System.out.println("Guess smaller number!");
                }
            }

            System.out.print("\nWanna play again (yes-no):");
            answer = scanner.next();

            if(answer.equals("yes"))
            {
                randomNumber = random.nextInt(99) + 1;
                playerGuess = 0;
                tryCount = 0;
                storage.clear();
            }
            else if(answer.equals("no"))
                break;
        }
    }
}