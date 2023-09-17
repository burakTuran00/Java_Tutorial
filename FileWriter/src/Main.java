import java.io.FileWriter;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        FileWriter fileWriter = null;

        try
        {
            fileWriter = new FileWriter("dosya.txt",true); // type onto it.

            fileWriter.write("Hello, I came from FileWriter\n!");
            fileWriter.write("Burak Turan\n");
        }
        catch (IOException e)
        {
            System.out.println("IOException when file was opening!");
        }
        finally
        {
            if(fileWriter != null)
            {
                try
                {
                    fileWriter.close();
                }
                catch (IOException e)
                {
                    System.out.println("Error when file was closing!");
                }
            }
        }

    }
}