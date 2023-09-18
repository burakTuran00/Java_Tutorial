import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TypeObject
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Burak",23,"Computer Engineer");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("students.bin")))
        {
            Student.setCounter(100);
            objectOutputStream.writeObject(student1);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
        }
        catch (IOException e)
        {
            System.out.println("IOException when file was opening!");
        }
    }
}