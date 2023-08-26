package Composition;

public class MotherBoard
{
    private String model;
    private String firm;
    private int number;
    private String operatingSystem;

    public MotherBoard(String model, String firm, int number, String operatingSystem) {
        this.model = model;
        this.firm = firm;
        this.number = number;
        this.operatingSystem = operatingSystem;
    }

    public void downloadOperatingSystem(String operatingSystem)
    {
        this.operatingSystem = operatingSystem;

        System.out.println(operatingSystem +" operating system is downloaded.");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
