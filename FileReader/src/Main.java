import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       try(Scanner scanner = new Scanner(new FileReader("students.txt")))
       {
            while (scanner.hasNextLine())
            {
                // print all of students
                System.out.println("Reading Line: " + scanner.nextLine());

                // print just computer engineer
                String studentInfo = scanner.nextLine();
                String[] array = studentInfo.split(",");

                if(array[1].equals("Computer Engineer"))
                {
                    System.out.println("Student Info: "+studentInfo);
                }
            }
       }
       catch (FileNotFoundException e)
       {
           System.out.println("File didn't find!");
       }

    }

    public static void bufferReaderUse() throws FileNotFoundException {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("students.txt")))
        {
            while (scanner.hasNextLine())
            {
                // print all of students
                System.out.println("Reading Line: " + scanner.nextLine());

                // print just computer engineer
                String studentInfo = scanner.nextLine();
                String[] array = studentInfo.split(",");

                if(array[1].equals("Computer Engineer"))
                {
                    System.out.println("Student Info: "+studentInfo);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File didn't find!");
        }
    }
}