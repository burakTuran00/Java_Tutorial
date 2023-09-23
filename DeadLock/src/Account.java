public class Account
{
    private int balance = 10000;

    public void  withdraw(int amount)
    {
        balance-=amount;
    }
    public void  invest(int amount)
    {
        balance+=amount;
    }
    public static void moneyTransfer(Account account1,Account account2,int amount)
    {
        account1.withdraw(amount);
        account2.invest(amount);
    }
    public int getBalance()
    {
        return balance;
    }
    public void setBalance(int balance)
    {
        this.balance = balance;
    }
}
