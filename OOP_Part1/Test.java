public class Test
{
    public static void main(String[] args)
    {
        Account account1 = new Account();

        account1.setAccountNo("99999");
        account1.setAccountBalance(1000.0);
        account1.setAccountOwnerName("Jacob");
        account1.setAccountMail("Jacob@gmail.com");
        account1.setAccountTelNo("526 963 99 88");

        Account account2 = new Account("101", 500, "Harry",
                                    "Harry@gmail.com","987 963 55 66");

        account2.InvestMoney(500);
        account2.WithdrawMoney(6000);
    }
}
