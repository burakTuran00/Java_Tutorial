public class Main {
    public static void main(String[] args)
    {
        System.out.println(myPow(2,10));
        System.out.println(myPow(2,-2));

        System.out.println(myPow(2,-4));
    }

    public static double myPow(double x, int n)
    {
        double pow = 1;

        if(n < 0)
        {
            n = Math.abs(n);

            for(int i = 0; i < n; i++)
            {
                pow /= x;
            }
        }
        else if (n == 0)
        {
            return 1;
        }
        else {
            for(int i = 0; i <n ; i++)
            {
                pow *= x;
            }
        }

        return pow;
    }
}