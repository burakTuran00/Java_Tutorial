public class Main
{
    public static void main(String[] args)
    {
        printThing( (p, s) -> System.out.println(p + " Meow "+s)) ;

        printNameFunc((e) -> System.out.println("Burak"));
    }

    static void printThing(Printable thing)
    {
        thing.print("-", "!");
    }

    static void printNameFunc(IPrintName iPrintName)
    {
        iPrintName.printName("");
    }
}