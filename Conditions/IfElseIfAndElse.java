import  java.util.Scanner;
public class IfElseIfAndElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your note:");
        int n = scanner.nextInt();

        if (n >= 90)
        {
            System.out.println("Grade:AA");
        }
        else if (n >= 85)
        {
            System.out.println("Grade:BA");
        }
        else if (n >= 80) {
            System.out.println("Grade:BB");
        }
        else if (n >= 75)
        {
            System.out.println("Grade:CB");
        }
        else if (n >= 70)
        {
            System.out.println("Grade:CC");
        }
        else if (n >= 65)
        {
            System.out.println("Grade:DC");
        }
        else if (n >= 60)
        {
            System.out.println("Grade:DD");
        }
        else
        {
            System.out.println("Grade:FF");
        }
    }
}
