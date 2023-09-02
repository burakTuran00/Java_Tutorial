public class Main {
    public static void main(String[] args) {
        Audience audience1 = new Audience("Jack");
        Audience audience2 = new Audience("John");

        audience1.WathTheGame();

        System.out.println("Total number of Audience:"  +Audience.getNumberAudience());
        System.out.println("Total number of Audience:"  +audience1.getNumberAudience());

        SayHello();


    }

    public static void SayHello()
    {
        System.out.println("Hello...");
    }
}