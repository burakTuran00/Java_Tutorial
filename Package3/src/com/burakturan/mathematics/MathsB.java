package com.burakturan.mathematics;

public class MathsB implements IMathsB
{

    @Override
    public void sum(int a, int b)
    {
        System.out.println("Sum:"+ (a+ b));
    }

    @Override
    public void sub(int a, int b)
    {
        System.out.println("Subtraction:"+ (a- b));
    }

    @Override
    public void mul(int a, int b)
    {
        System.out.println("Multiplication:"+ (a* b));
    }

    @Override
    public void div(int a, int b)
    {
        System.out.println("Division:"+ ((double)a/ b));
    }
}
