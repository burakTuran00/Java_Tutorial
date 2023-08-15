import  java.util.Scanner;
public class IfElseIfAndElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = scanner.nextInt();

        if (n == 0)
        {
            System.out.println("0 result.");
        }
        else if (n == 1)
        {
            System.out.println("1 result.");
        }
        else if (n == 2)
        {
            System.out.println("2 result.");
        }
        else if (n ==3)
        {
            System.out.println("3 result.");
        }
        else
        {
            System.out.println("Not found.");
        }



    }
}
