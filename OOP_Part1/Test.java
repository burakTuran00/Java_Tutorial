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

        Account account3 = new Account();

        System.out.println(account3.getAccountMail());

        Account account4 = new Account("Ahmet","Ahmet@gmail.com","852 256 97 79");
         /*  System.out.println(account4.getAccountMail());
        System.out.println(account4.getAccountBalance());*/

        account4.ShowInfo();


    }
}
