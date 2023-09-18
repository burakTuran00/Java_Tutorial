import java.io.*;

public class TypeObject
{
    public static void main(String[] args)
    {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.bin")))
        {
            Student student1 = new Student("Burak",35,"Computer Engineer");
            Student student2 = new Student("Berk",24,"Civil Engineer");

            objectOutputStream.writeObject(student1);
            objectOutputStream.writeObject(student2);
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