public class Account {
     private String accountNo;
     private double accountBalance;
     private String accountOwnerName;
     private String accountMail;
     private String accountTelNo;

     public Account()
     {
         /* this.accountNo = "No-Info";
         this.accountBalance = 0.0;
         this.accountNo = "No-Info";
         this.accountMail = "No-Info";
         this.accountTelNo = "No-Info";*/

         this("No-Info", 0.0, "No-Info", "No-Info","No-Info");
     }

     public Account(String accountOwnerName, String accountMail, String accountTelNo){
         this("No-Info", 0.0, accountOwnerName, accountMail, accountTelNo);
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

     public void ShowInfo()
     {
         System.out.println(this.accountNo);
         System.out.println(this.accountBalance);
         System.out.println(this.accountOwnerName);
         System.out.println(this.accountMail);
         System.out.println(this.accountTelNo);
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
