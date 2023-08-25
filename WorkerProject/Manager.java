public class Manager extends  Worker
{
    private int numberOfPeople;
    public Manager(String name, String surname, int id, int numberOfPeople) {
        super(name, surname, id);
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println("The manager be in charge of people of " + getNumberOfPeople());
    }

    public void IncreaseTheSalary(int amount)
    {
        System.out.println(getName() + "'s increase" + amount +"$ their employee salary.");
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
