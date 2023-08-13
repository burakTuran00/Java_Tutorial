public class VariablesOfDecimalNumber {
    public static void main(String[] args)
    {
        // double: 64 bit - 8 byte
        // float: 32 bit - 4 byte

        // int -> float -> double

        double a = 5.25;
        float b = 4.75f;

        int  x = 22 / 7;
        float y = 22f / 7f;
        double z = 22d / 7d;

        System.out.println("x:"+ x);
        System.out.println("y:"+ y);
        System.out.println("z:"+ z);

       double i = 3.52;
       float j = (float) i;

       double number1 = 70.25;
       double number2 = 60d;
       double number3 = 80.2;

        System.out.println("Mean: "+ (number1+number2+number3) / 3);
    }
}
