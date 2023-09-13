import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void ageCheck(int age) throws IOException
    {
        if(age < 18)
        {
            throw new IOException();
        }
        else {
            System.out.println("Welcome!");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = scanner.nextInt();

        try {
            ageCheck(age);
        }
        catch (IOException ex)
        {
            System.out.println("IOException");
        }
    }
}