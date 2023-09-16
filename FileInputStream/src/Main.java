import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        FileInputStream fileInputStream = null;
        try
        {
            fileInputStream = new FileInputStream("dosya.txt");

            System.out.println("First Char:" + (char)(fileInputStream.read())); // J
            System.out.println("Second Char:" + (char)(fileInputStream.read()));  // a
            System.out.println("Third Char:" + (char)(fileInputStream.read())); // v

            // just reading one byte.

            fileInputStream.skip(5);
            System.out.println("Reading Char:" + (char)fileInputStream.read()); // P
            System.out.println("Next Char:" + (char)fileInputStream.read()); // r

            // read all of char
            int value;
            String string  = "";

            while((value = fileInputStream.read()) != -1)
            {
                string += (char)value;
            }

            // read certain number of char!
            int counter = 0;
            fileInputStream.skip(5);

            while ((value = fileInputStream.read()) != -1)
            {
                string += (char) value;

                counter++;

                if(counter == 11)
                {
                    break;
                }
            }

            System.out.println(string);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File doesn't found!");
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong when reading the document!");
        }
        finally
        {
            try
            {
                if(fileInputStream != null)
                {
                    fileInputStream.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("Something went wrong when document was closing!");
            }
        }
    }
}