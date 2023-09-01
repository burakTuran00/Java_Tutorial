public class Circle extends Shape
{
    private int radius;
    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void CalculateArea()
    {
        double area = Math.PI * radius * radius;

        System.out.println("The are of " + getName() + " is "+area);
    }
}
