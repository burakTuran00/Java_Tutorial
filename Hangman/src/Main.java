import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Random random = new Random();
        Scanner scanner = new Scanner(new File("D:/Projects/Java_Tutorial/Hangman/wordList.txt"));
        Scanner keyboard = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        while (scanner.hasNext())
        {
            words.add(scanner.nextLine());
        }

        String word = words.get(random.nextInt(words.size()));
        System.out.println(word);

        List<Character> playerGuesses = new ArrayList<>();

        int wrongCount = 0;

        while (true)
        {
            printHangedMan(wrongCount);

            if(wrongCount >= 6)
            {
                System.out.println("You lose!");
                break;
            }

            printWordState(word, playerGuesses);
            if(!getPlayerGuess(keyboard, word, playerGuesses))
            {
                wrongCount++;
            }

            if(printWordState(word, playerGuesses))
            {
                System.out.println("You win!");
                break;
            }

            System.out.print("Please enter your guess for the word:");

            if(keyboard.nextLine().equals(word))
            {
                System.out.println("You win!");
                break;
            }
            else
            {
                System.out.println("Try again!");
            }
        }
    }

    private static boolean printWordState(String word, List<Character> playerGuesses)
    {
        int correctCount = 0;

        for(int i = 0; i < word.length(); i++)
        {
            if(playerGuesses.contains(word.charAt(i)))
            {
                System.out.print(word.charAt(i));
                correctCount++;
            }
            else
            {
                System.out.print("-");
            }
        }

        System.out.println();

        return (word.length() == correctCount);
    }

    private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses)
    {
        System.out.print("Please enter a letter:");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));

        return word.contains(letterGuess);
    }

    private static void printHangedMan(Integer wrongCount)
    {
        System.out.println(" -------");
        System.out.println(" |      |");

        if(wrongCount >= 1)
        {
            System.out.println(" O");
        }
        if(wrongCount >= 2)
        {
            System.out.print("\\ ");
            if(wrongCount >= 3)
                System.out.println("/");
            else
                System.out.println();
        }
        if(wrongCount >= 4)
        {
            System.out.println(" |");
        }
        if(wrongCount >= 5)
        {
            System.out.print("/ ");
            if(wrongCount >= 6)
                System.out.println("\\");
            else
                System.out.println();
        }
    }
}