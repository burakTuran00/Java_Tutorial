package Composition;

public class Computer
{
    private Monitor monitor;
    private Case _Case;
    private MotherBoard motherBoard;

    public Computer(Monitor monitor, Case _Case, MotherBoard motherBoard) {
        this.setMonitor(monitor);
        this.set_Case(_Case);
        this.setMotherBoard(motherBoard);
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Case get_Case() {
        return _Case;
    }

    public void set_Case(Case _Case) {
        this._Case = _Case;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }
}
