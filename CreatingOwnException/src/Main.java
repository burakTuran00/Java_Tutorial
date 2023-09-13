public class Main
{
    public static void ageCheck(int age)
    {
        if(age < 18)
        {
            throw new InvalidAgeException("Invalid Age");
        }
        else
        {
            System.out.println("Welcome!");
        }
    }
    public static void main(String[] args)
    {
        try {
            ageCheck(12);
        }
        catch (InvalidAgeException e)
        {
            e.printStackTrace();
        }
    }
}