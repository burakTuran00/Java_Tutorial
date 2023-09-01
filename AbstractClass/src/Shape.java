public abstract class Shape
{
    private String name;

    public Shape(String name)
    {
        this.setName(name);
    }

    public void TellYourName()
    {
        System.out.println("The name of this object is" + this.getName());
    }

    abstract void CalculateArea();// child classes must type this function in their area.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
