public class Main {
    public static void main(String[] args)
    {
        SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckService());

        SignUpManager signUpManager1 = new SignUpManager(new AgeUserCheckService());
        
        signUpManager.signUp(new User(1,"YaJohn",25));
    }
}