package Composition;

public class Case  // kasa
{
    private String model;
    private String firm;
    private String material;

    public Case(String model, String firm, String material)
    {
        this.setModel(model);
        this.setFirm(firm);
        this.setMaterial(material);
    }

    public void OpenTheComputer()
    {
        System.out.println("The computer is opening!");
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
