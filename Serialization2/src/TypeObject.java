import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class TypeObject
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Burak",23,"Computer Engineer");
        Student student2 = new Student("Jack",2253,"Civil Engineer");
        Student student3 = new Student("Lary",42,"Math");
        Student student4 = new Student("Gary",67,"Medicine");

        Student[] studentsArray ={student1,student2,student3,student4};
        ArrayList<Student> studentsList = new ArrayList<Student>(Arrays.asList(studentsArray));

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("students.bin")))
        {
            objectOutputStream.writeObject(studentsArray);
            objectOutputStream.writeObject(studentsList);
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