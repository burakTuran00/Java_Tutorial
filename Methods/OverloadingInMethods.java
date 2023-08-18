public class OverloadingInMethods
{
    public static void Add(int a, int b)
    {
        System.out.println("Retsult:"+(a+b));
    }
    public static void Add(int a,int b,int c)
    {
        System.out.println("Result:"+(a+b+c));
    }
    public static void Add(String a, String b)
    {
        System.out.println(a + " " + b);
    }
    public static void main(String[] args)
    {
        Add(3,4,5);
        Add(2,4);
        Add("Juri","Kagazaki");
    }
}
