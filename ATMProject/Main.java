public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account("Burak","qwerty",1200);

        atm.Work(account);
    }
}
