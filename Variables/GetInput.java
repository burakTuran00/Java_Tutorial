import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("To enter your age:");
        int age = scanner1.nextInt();

        System.out.println("To enter your name:");
        String name = scanner2.nextLine();

        System.out.println("Your age is "+ age);
        System.out.println("Your name is "+name);
    }
}
