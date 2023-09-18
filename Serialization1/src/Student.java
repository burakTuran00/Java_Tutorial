import java.io.Serializable;

public class Student implements Serializable
{
    private static final long serialVerisonUID = 1000;
    private String name;
    private int id;
    private String section;
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
}
