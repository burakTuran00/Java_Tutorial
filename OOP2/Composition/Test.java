package Composition;

public class Test
{
    public static void main(String[] args)
    {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("A-123","Asus,",24,resolution);
        Case newCase = new Case("987SAQ","Asus","Glass");
        MotherBoard motherBoard = new MotherBoard("B874-GM","Asus",10,"Linux");

        Computer computer = new Computer(monitor,newCase,motherBoard);

        computer.get_Case().OpenTheComputer();
        computer.getMonitor().ShutDownMonitor();

        int h = computer.getMonitor().getResolution().getHeight();
        System.out.println(h);
        computer.getMotherBoard().downloadOperatingSystem("Ubuntu");
    }
}
