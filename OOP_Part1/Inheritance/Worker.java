package Inheritance;

public class Worker
{    // Super or Base class
    private String name;
    private int income;
    private String department;

    public Worker(String name, int income, String department)
    {
        this.setName(name);
        this.setIncome(income);
        this.setDepartment(department);
    }

    public void Work()
    {
        System.out.println("The worker is working.");
    }

    public void ShowInfo()
    {
        System.out.println("Name:"+ getName());
        System.out.println("Income:"+ getIncome());
        System.out.println("Department:"+ getDepartment());
    }

    public void ChangeDepartment(String newDepartment)
    {
        this.setDepartment(newDepartment);
        System.out.println("New department:" + this.getDepartment());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
