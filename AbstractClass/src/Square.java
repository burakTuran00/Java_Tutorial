public class Square extends Shape
{
    private int edge;

    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
    }

    @Override
    void CalculateArea()
    {
        System.out.println("The are of " +getName()+ " is "+ Math.pow(edge,2));
    }

    public void CalculateCircumference()
    {
        System.out.println("The circumference of "+getName() + " is "+ (4*edge));
    }
}
