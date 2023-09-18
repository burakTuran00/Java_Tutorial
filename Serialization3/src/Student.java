import java.io.Serializable;

public class Student implements Serializable
{
    private String name; // string serileştirme null
    private transient int id; // serilestirme ve gereksiz dosya boyutunu artırma
    private String section;
    private static int counter= 0;
    public Student(String name, int id, String section) {
        this.name = name;
        this.id = id;
        this.section = section;
    }

    @Override
    public String toString()
    {
        String info = "Name:"+this.name +
                "\nID:"+this.id +
                "\nSection:" +this.section;

        return info;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }
}