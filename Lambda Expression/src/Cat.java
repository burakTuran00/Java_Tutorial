public class Cat implements Printable, IPrintName
{
    @Override
    public void print(String prefix, String suffix)
    {
        System.out.println("Meow");
    }

    @Override
    public void printName(String name)
    {
        System.out.println("Name is " + name);
    }
}
