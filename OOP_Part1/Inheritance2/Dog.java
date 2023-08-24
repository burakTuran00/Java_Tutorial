package Inheritance2;

public class Dog extends  Animal
{
    private int teeth;
    public Dog(String name, int weight, int height, int legs, int teeth)
    {
        super(name,weight,height,legs);
        this.teeth = teeth;
    }

    public void Move(int speed)
    {
        System.out.println("The dog's moving with speed of "+ speed);
    }
    public void Run(int speed)
    {
        System.out.println("The dog's running.");
        super.Move(speed); // in animal class wil execute
        Move(speed); // in dog class will execute
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }
}
