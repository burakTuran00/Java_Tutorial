public class Main
{
    public static void main(String[] args)
    {
        // Shape shape = new Shape("Shape"); // abstract class cannot be instantiated.

        Square square = new Square("Square 1",5);
        Circle circle = new Circle("Circle 1",3);

        Shape shape = new Square("Shape 1",12);

        square.CalculateArea();
        circle.CalculateArea();

        shape.CalculateArea();

        square.CalculateCircumference();
    }
}