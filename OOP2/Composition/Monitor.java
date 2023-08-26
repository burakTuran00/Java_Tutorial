package Composition;

public class Monitor
{
    private String model;
    private String firm;
    private int size;
    private Resolution resolution;

    public Monitor(String model, String firm, int size, Resolution resolution) {
        this.setModel(model);
        this.setFirm(firm);
        this.setSize(size);
        this.setResolution(resolution);
    }

    public void ShutDownMonitor()
    {
        System.out.println("Monitor is shutting down!");
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}
