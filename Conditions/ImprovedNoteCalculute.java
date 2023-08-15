import java.util.Scanner;

public class ImprovedNoteCalculute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float gpa,v1,v2,f;

        System.out.print("To enter your note of vise 1:");
        v1 = scanner.nextFloat();

        System.out.print("To enter your note of vise 2:");
        v2 = scanner.nextFloat();

        System.out.print("To enter your note of final:");
        f = scanner.nextFloat();

        float result = v1 * 0.3f + v2 * 0.3f + f * 0.4f;

        if (result >= 90)
        {
            System.out.println("Grade:AA");
        }
        else if (result >= 85)
        {
            System.out.println("Grade:BA");
        }
        else if (result >= 80) {
            System.out.println("Grade:BB");
        }
        else if (result >= 75)
        {
            System.out.println("Grade:CB");
        }
        else if (result >= 70)
        {
            System.out.println("Grade:CC");
        }
        else if (result >= 65)
        {
            System.out.println("Grade:DC");
        }
        else if (result >= 60)
        {
            System.out.println("Grade:DD");
        }
        else
        {
            System.out.println("Grade:FF");
        }

        System.out.println("The avarage is " + result);
    }
}
