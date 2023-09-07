public final class Database  // cannot produce any child class, If it's class a final.
{
    public void toConnect(final String username, final String password)  // final parameter
    {
        System.out.println(username);
        System.out.println(password);
    }

    public final void toConnect2(String username, String password) // cannot override in inheritance class.
    {
        // If don't wanna be override this method to another class, use final word!

        System.out.println(username);
        System.out.println(password);
    }
}
