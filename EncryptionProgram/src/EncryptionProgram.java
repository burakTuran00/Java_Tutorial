import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class EncryptionProgram
{
    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private  ArrayList<Character> shuffledList;
    private  char character;
    private String line;
    private char[] letters;

    private final int BEGIN_ASCII = 32;
    private final int END_ASCII = 127;

    EncryptionProgram()
    {
        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList<>();
        shuffledList = new ArrayList<>();
        character = ' ';

        newKey();
        askQuestion();
    }

    private void askQuestion()
    {
        while (true)
        {
            System.out.println("**************************************************");
            System.out.println("What do you want to do:");
            System.out.print("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit :");
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));

            switch (response)
            {
                case 'N':
                    newKey();
                    break;
                case  'G':
                    getKey();
                    break;
                case  'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("Not a valid answer!");
            }
        }
    }

    private void newKey()
    {
        character = ' ';
        list.clear();
        shuffledList.clear();

        for(int i = BEGIN_ASCII; i < END_ASCII; i++)
        {
            list.add(Character.valueOf(character));
            character++;
        }

        shuffledList = new ArrayList(list);
        Collections.shuffle(shuffledList);

        System.out.println("*A new key has been generated*");
    }

    private void getKey()
    {
        System.out.println("Key: ");

        for(Character c : list)
        {
            System.out.print(c );
        }

        System.out.println();

        for(Character c : shuffledList)
        {
            System.out.print(c);
        }

        System.out.println();
    }

    private void encrypt()
    {
        System.out.println("Enter a message to be encrypted: ");
        String message = scanner.nextLine();

        letters = message.toCharArray();

        for(int i = 0; i < letters.length; i++)
        {
            for(int j = 0; j < list.size(); j++)
            {
                if(letters[i] == list.get(j))
                {
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }

        System.out.println("Encrypted: ");

        for(char c : letters)
        {
            System.out.print(c);
        }

        System.out.println();
    }

    private void decrypt()
    {
        System.out.println("Enter a message to be decrypted: ");
        String message = scanner.nextLine();

        letters = message.toCharArray();

        for(int i = 0; i < letters.length; i++)
        {
            for(int j = 0; j < shuffledList.size(); j++)
            {
                if(letters[i] == shuffledList.get(j))
                {
                    letters[i] = list.get(j);
                    break;
                }
            }
        }

        System.out.println("Decrypted: ");

        for(char c : letters)
        {
            System.out.print(c);
        }

        System.out.println();
    }

    private void quit()
    {
        System.out.println("Thank you for using the program, have a nice day!");
        System.exit(0);
    }
}
