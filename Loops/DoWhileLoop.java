import java.util.Scanner;

public class DoWhileLoop {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number:");
    int number = scanner.nextInt();
    int result = 0;
    //98  -> 8, 98/10=9, 9; 8+9= 17
    do
    {
      result += number % 10;
      number /= 10;

    }while (number > 0);

    System.out.println("The result is " + result);
  }
}
