public class InvalidAgeException extends  ArithmeticException
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
    @Override
    public void printStackTrace() {
        System.out.println("This is a invalid age exception!");
    }
}
