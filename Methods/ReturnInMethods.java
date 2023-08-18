public class ReturnInMethods {
    private static int Addition(int a, int b, int c)
    {
        return (a+b+c);
    }
    public static int ToMultipleTwo(int a)
    {
        return 2 * a;
    }
    public static void main(String[] args)
    {
        int resutl = Addition(1,2,3); // 6
        System.out.println(resutl + Addition(1,2,3)); // 6 + 6 = 12

    }
}
