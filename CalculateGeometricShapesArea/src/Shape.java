public abstract class Shape
{
    private String name;
    public Shape(String name) {
        this.setName(name);
    }

    abstract void CalculateArea();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
