public class StructureOfClass {
    public static void main(String[] args)
    {
        Car car1 = new Car();

        car1.color = "Red";
        car1.modelYear = 2020;
        car1.branch = "Toyota";
        car1.model = "Corolla";
        car1.type = "Sedan";

        System.out.println(car1.type);
    }
}
