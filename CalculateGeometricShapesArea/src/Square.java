public class Square  extends  Shape
{
    private int edge;
    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
    }

    @Override
    void CalculateArea()
    {
        double area = Math.pow(edge,2);
        System.out.println("The are of " +getName() + " is "+area);
    }
}
