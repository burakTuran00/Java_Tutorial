import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String processPrint = "1- To calculate area of Square\n"
                        +"2- To calculate area of Triangle\n"
                        +"3- To calculate area of Circle\n"
                        +"To press q to exit";

        while (true)
        {
            System.out.println(processPrint);
            System.out.println("What type of shape, do you want to calculate:");
            String type = scanner.nextLine();

            Shape shape = null;

            if(type.equals("q"))
            {
                System.out.println("Exiting into program!");
                break;
            }
            else if(type.equals("1"))
            {
                System.out.print("Enter edge of Square:");
                int edge = scanner.nextInt();
                scanner.nextLine();

                shape = new Square("Square",edge);
                shape.CalculateArea();
            }
            else if (type.equals("2"))
            {
                System.out.print("Edge 1:");
                int edge1 = scanner.nextInt();

                System.out.print("Edge 2:");
                int edge2 = scanner.nextInt();

                System.out.print("Edge 3:");
                int edge3 = scanner.nextInt();

                scanner.nextLine();

                shape = new Triangle("Triangle",edge1,edge2,edge3);
                shape.CalculateArea();
            }
            else if(type.equals("3"))
            {
                System.out.print("Enter radius of Circle:");
                double radius = scanner.nextDouble();
                scanner.nextLine();

                shape = new Circle("Circle",radius);
                shape.CalculateArea();
            }
        }
    }
}