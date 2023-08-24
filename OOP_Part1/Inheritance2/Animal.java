package Inheritance2;

public class Animal
{
    private String name;
    private int weight;
    private int height;
    private int legs;

    public Animal(String name, int weight, int height, int legs)
    {
        this.setName(name);
        this.setWeight(weight);
        this.setHeight(height);
        this.setLegs(legs);
    }

    public void Eat()
    {
        System.out.println("The animal's eating now.")  ;
    }

    public void Move(int speed)
    {
        System.out.println("The animal's moving with "+speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
