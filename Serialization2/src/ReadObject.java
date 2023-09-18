import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject
{
    public static void main(String[] args)
    {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.bin")))
        {
            Student student1 = (Student) objectInputStream.readObject();
            Student student2 = (Student) objectInputStream.readObject();

            System.out.println(student1);
            System.out.println("---------------");
            System.out.println(student2);


        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
        catch (IOException e)
        {
            System.out.println("IOException when file was opening!");
        } catch
        (ClassNotFoundException e)
        {
            System.out.println("Class not found!");
        }
    }
}