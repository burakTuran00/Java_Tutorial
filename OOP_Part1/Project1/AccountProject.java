package Project1;

public class AccountProject {
    private String id;
    private String password;
    private int balance;

    public AccountProject(String id, String password, int balance)
    {
        this.id = id;
        this.password = password;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void InvestMoney(int amount)
    {
        balance += amount;
        System.out.println("New balance:"+balance);
    }

    public void WithdrawMoney(int amount)
    {
       if (balance - amount < 0)
       {
           System.out.println("There is no enough money.");
       }
       else
       {
           balance -= amount;
           System.out.println("New balance:"+balance);
       }
    }
}
