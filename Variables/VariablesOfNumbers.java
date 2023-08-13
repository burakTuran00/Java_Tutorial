public class VariablesOfNumbers {
    public static void main(String[] args) {

        int a = 5; // storage 32 bit. (-2^31)- (2^31 -1)
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        byte b = 100; // storage 8 bit = 1 byte. (-128) - (127)
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short c = 25; // storage 16 bit (-32768) - (32767)
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        long d = 2000; // storage 64 bit (-2^63) - (2^63 -1)
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        // these types of numbers are whole numbers like 1000.
    }
}
