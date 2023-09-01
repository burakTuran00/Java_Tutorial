public class Circle extends Shape
{
    private double radius;
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void CalculateArea()
    {
        double area = Math.PI * Math.pow(radius,radius);
        System.out.println("The are of "+getName()+" is "+area);
    }
}
