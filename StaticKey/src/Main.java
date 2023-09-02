public class Main {
    public static void main(String[] args) {
        Audience audience1 = new Audience("Jack");
        Audience audience2 = new Audience("John");

        audience1.WathTheGame();

        System.out.println("Total number of Audience:"  +Audience.getNumberAudience()); // class
        System.out.println("Total number of Audience:"  +audience1.getNumberAudience());// object

        SayHello();  // static function can be used in static function.
      // SayHello2(); // non-static function cannot be used in static function.
    }

    public static void SayHello()
    {
        System.out.println("Hello...");
    }

    public void SayHello2()
    {
        System.out.println("Hello...");
    }
}