public class PrintGenericClass<E>  // definition of generic class
{
    public void Print(E[] arr)
    {
        for(E x : arr)
        {
            System.out.println(x);
        }
    }
}
