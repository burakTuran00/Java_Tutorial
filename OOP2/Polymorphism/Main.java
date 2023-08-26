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

    public static void Talkf(Animal animal)
    {
        System.out.println(animal.Talk());
    }
    public static void TalkFunc(Object object)
    {
        // aganist to polymorphism, use it. In this struct we show that what if polymorphism doesn't exist.

        if (object instanceof Dog)
        {
            Dog dog = (Dog) object;
            System.out.println(dog.Talk());
        }
        else if(object instanceof Cat)
        {
            Cat cat = (Cat) object;
            System.out.println(cat.Talk());
        }
        else if(object instanceof Horse)
        {
            Horse horse = (Horse) object;
            System.out.println(horse.Talk());
        }
        else if(object instanceof Animal)
        {
            Animal animal = (Animal)  object;
            System.out.println(animal.Talk());
        }
    }

    public static void main(String[] args)
    {
        Talkf(new Cat("Ole"));
        Talkf(new Dog("Petes"));

        Animal animal = new Horse("Hara");
        System.out.println(animal.Talk());

        Animal animal1 = new Dog("Doggi");
        System.out.println(animal1.Talk());

        Dog dog = new Dog("Karabaş");

        if (dog instanceof  Animal)
        {
            System.out.println(true);
        }



       Dog dogAP = new Dog("karabaş");
        Cat catAP = new Cat("tekir");
        Horse horseAP = new Horse("yaman");
        Animal animalAP = new Animal("Turp");

        TalkFunc(dogAP);
        TalkFunc(catAP);
        TalkFunc(horseAP);
        TalkFunc(animalAP);
    }
}
