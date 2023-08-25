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
                Developer developer = new Developer("Burak","Turan",74,"C++ & C#");
                String developerOperation = "Developer Operations\n " +
                                            "1- To format\n"+
                                            "2- To show Info"+
                                            "Press q to exit!";
                System.out.println(developerOperation);

                while (true)
                {
                    System.out.print("Select a code of developer operation:");
                    String developerProcess = scanner.nextLine();

                    if (developerProcess.equals("q"))
                    {
                        System.out.println("Leaving in the developer operation!");
                        break;
                    }
                    else if(developerProcess.equals("1"))
                    {
                        System.out.print("Operating System:");
                        String operatingSystem = scanner.nextLine();

                        developer.ToFormat(operatingSystem);
                    }
                    else if(developerProcess.equals("2"))
                    {
                        developer.ShowInfo();
                    }
                    else
                    {
                        System.out.println("Invalid developer operation...");
                    }
                }
            }
            else if(process.equals("2"))
            {
                Manager manager = new Manager("Serhat","Yaşar",3,10);
                String managerOperation = "Manager Operations\n"+
                                            "1- Increase Salary\n"+
                                            "2- Show Info\n"+
                                            "Press q to exit!";
                System.out.println(managerOperation);

                while (true)
                {
                    System.out.print("Select a code of manager operation:");
                    String managerProcess = scanner.nextLine();
                }
            }
            else {
                System.out.println("Invalid operation, Enter valid operation!");
            }
        }
    }
}
