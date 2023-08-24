package Inheritance;

public class Manager extends Worker
{
    // Subclass

    private int howManyPeople; // extra feature.

    public Manager(String name, int income, String department, int howManyPeople)
    {
        super(name,income,department); // super class dan miras aldığım consturactoru kullanmak için.

        this.setHowManyPeople(howManyPeople);
    }

    public void IncreaseSallary(int amount)
    {
        System.out.println("Amount of rise is " + amount);
    }

    public void ShowInfo()
    {
        /*System.out.println("Name:"+ getName());
        System.out.println("Income:"+ getIncome());
        System.out.println("Department:"+ getDepartment());*/

        super.ShowInfo(); // In worker class, show us the ShowInfo class.

        System.out.println("People in charge:" + getHowManyPeople());

    }

    public int getHowManyPeople() {
        return howManyPeople;
    }

    public void setHowManyPeople(int howManyPeople) {
        this.howManyPeople = howManyPeople;
    }
}
