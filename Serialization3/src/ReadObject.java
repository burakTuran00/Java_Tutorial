import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject
{
    public static void main(String[] args)
    {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("students.bin")))
        {
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student.toString());

            System.out.println("Student number:"+Student.getCounter());

        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
        catch (IOException e)
        {
            System.out.println("IOException when file was opening!");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class not found!");
        }
    }
}