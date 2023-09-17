import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try(FileWriter fileWriter = new FileWriter("languages.txt"))
        {
            Scanner scanner = new Scanner(System.in);

            String language;

            while(true)
            {
                System.out.print("Enter a language:");
                language = scanner.nextLine();

                if(language.equals("-1"))
                {
                    System.out.println("Quit");
                    System.out.println("Check the file!");
                    break;
                }

                fileWriter.write(language +"\n");
            }
        }
        catch (IOException e)
        {
            System.out.println("There is a error when file create!");
        }
    }

    public static void doubleUseFile()
    {
        try(FileWriter fileWriter = new FileWriter("dosya.txt");
            FileWriter fileWriter1 = new FileWriter("dosya2.txt"))
        {
            fileWriter.write("Trying something");
        }
        catch (IOException e)
        {
            System.out.println("There is a error when file create!");
        }
    }
}