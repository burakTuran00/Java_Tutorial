import java.util.Scanner;
import java.util.Calendar;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("Name-Surname and Age:");
        String sentence = scanner.nextLine();

        String[] names = sentence.split(" ");

       int age = Integer.parseInt(names[names.length -1]);

       for(int i = 0; i <names.length - 1; i++)
       {
           System.out.print(names[i].toUpperCase() + " ");
       }

        int birthDate = currentYear  - age;
        System.out.print(", " + birthDate + " yilinda dogdu.");
    }
}