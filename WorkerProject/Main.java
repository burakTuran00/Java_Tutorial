import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------- Welcome To The Workers Program -------");
        String operation = "Select an operation\n" +
                            "1- Developer\n" +
                            "2- Manager\n" +
                            "Press q to exit!";
        System.out.println("----------------------------");
        System.out.println(operation);
        System.out.println("----------------------------");

        while (true)
        {
            System.out.print("Select the code of operation:");
            String process = scanner.nextLine();

            if (process.equals("q"))
            {
                System.out.println("Left the program!");
                break;
            }
            else if(process.equals("1"))
            {
                Deve
            }
            else if(process.equals("2"))
            {

            }
            else {
                System.out.println("Invalid operation, Enter valid operation!");
            }
        }
    }
}
