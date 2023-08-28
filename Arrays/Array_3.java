import java.util.Scanner;

public class Array_3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[2][2];
        int[][] arr1 = {{10,20},{30,40}};

        System.out.println(arr1[0][1]);

        for(int i=0; i< 2;i++)
        {
            for (int j=0;j < 2;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i< 2;i++)
        {
            for (int j=0;j < 2;j++)
            {
                System.out.print(arr[i][j]);
            }
        }


    }
}
