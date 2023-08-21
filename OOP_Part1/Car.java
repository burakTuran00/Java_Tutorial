public class Car {
    private String color;
    private int modelYear;
    private String branch;
    private String model;
    private String type;

    public void setModel(String model)
    {
        this.model = model;
    }
    public String getModel()
    {
        return this.model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        if (modelYear < 2000)
        {
            System.out.println("The car is so old. We cannot adjust the process!");
        }
        else {
            this.modelYear = modelYear;
        }
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
