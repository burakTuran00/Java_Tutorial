public class Main
{


    public static void main(String[] args)
    {
        String a = "Yaşar";
        String b  = new String("Kemal"); // redundant

        System.out.println(a.length());
        System.out.println("Value of 0 index is " +  a.charAt(0));
        System.out.println("Last elemant is "+ a.charAt(a.length()-1));

        for (int i=0; i < b.length();i++)
        {
            System.out.println(b.charAt(i));
        }

        System.out.println(b.startsWith("Ke"));
        System.out.println(b.endsWith("mal"));

        System.out.println(a.indexOf('ş'));

        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        String x = "1090";
        int y = Integer.parseInt(x); // convert string to int

        System.out.println(y);

        int z = 1078;
        String m = String.valueOf(z); // convert int to string

        String s1 = "Mustafa";
        String s2 = "Mustafa";

        if(s1 == s2)
        {
            System.out.println("Same");
        }

        String s3 = new String("Mustafa");
        String s4 = new String("Mustafa");

        if(s3 == s4)
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not same");
        }
    }
}
