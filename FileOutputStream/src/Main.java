import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        FileOutputStream fileOutputStream = null;
        File file = new File("dosya.txt");

        try
        {
            fileOutputStream = new FileOutputStream(file,true); // if its true then type onto it, false delete all and type.

            fileOutputStream.write(65);

            byte[] array = {101,75,24,66,68};
            fileOutputStream.write(array);

            String s = "Jacob Linear";
            byte[] sArray = s.getBytes();

            fileOutputStream.write(sArray);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException is created.");
        }
        catch (IOException e)
        {
            System.out.println("There was a error when writing the document!");
        }
        finally
        {
            try
            {
                fileOutputStream.close();
            }
            catch (IOException e)
            {
                System.out.println("There was a error when the document was closed!");
            }
        }

    }
}