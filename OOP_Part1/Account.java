public class Account {
     private String accountNo;
     private double accountBalance;
     private String accountOwnerName;
     private String accountMail;
     private String accountTelNo;

     public Account()
     {
         System.out.println("My own written consturactor.");
     }

     public Account(String accountNo, double accountBalance, String accountOwnerName, String accountMail, String accountTelNo)
     {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        this.accountOwnerName = accountOwnerName;
        this.accountMail = accountMail;
        this.accountTelNo = accountTelNo;
     }

     public void InvestMoney(double amount)
     {
         accountBalance += amount;

         System.out.println("New balance:" + accountBalance);
     }

     public void WithdrawMoney(double amount)
     {
        if (amount > 1500)
        {
            System.out.println("You cannot withdraw over 1500$ in a day.");
        }
        if (accountBalance - amount < 0)
        {
            System.out.println("Doesn't have enough money at your account, Max withdrawable amount is "+accountBalance);
        }
        else
        {
            accountBalance -= amount;
            System.out.println("New balance:"+accountBalance);
        }
     }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public String getAccountMail() {
        return accountMail;
    }

    public void setAccountMail(String accountMail) {
        this.accountMail = accountMail;
    }

    public String getAccountTelNo() {
        return accountTelNo;
    }

    public void setAccountTelNo(String accountTelNo) {
        this.accountTelNo = accountTelNo;
    }
}
