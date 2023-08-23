public class ObjectReference {
    public static void main(String[] args)
    {
        Account account1 = new Account("Yasar","Yasar@gmail.com","987 996 9654");

        Account account2 = account1;

        if (account1 == account2)
        {
            System.out.println("Same");
        }
    }
}
