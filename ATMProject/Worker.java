public class Worker
{    // Super or Base class
    private String name;
    private int income;
    private String department;

    public Worker(String name, int income, String department)
    {
        this.name = name;
        this.income = income;
        this.department = department;
    }

    public void Work()
    {
        System.out.println("The worker is working.");
    }

}
