package Polymorphism;

class Animal
{
    private String name;
    public Animal(String name) {
        this.setName(name);
    }
    public String Talk()
    {
        return  "Animal is talking";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends  Animal
{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String Talk() {
        return this.getName() + " meow!";
    }
}

class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }

    @Override
    public String Talk()
    {
        return this.getName() + " bark";
    }
}

class Horse extends Animal
{
    public Horse(String name)
    {
        super(name);
    }
    @Override
    public String Talk()
    {
        return this.getName() + " run";
    }
}



public class Main {

    public static void TalkFunc(Animal animal)
    {
        System.out.println(animal.Talk());
    }
    public static void main(String[] args)
    {
        TalkFunc(new Cat("Ole"));
        TalkFunc(new Dog("Petes"));

        Animal animal = new Horse("Hara");
        System.out.println(animal.Talk());

        Animal animal1 = new Dog("Doggi");
        System.out.println(animal1.Talk());
    }
}
