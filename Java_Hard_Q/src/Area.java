interface MatematikSabitleri{
    double PI = 3.14;
}

abstract class Try1
{
    abstract void makeNoise();
}

public class Area extends Try1 implements MatematikSabitleri
{
    private double yariCap = 6.0;

    public double daireCevreHesapla(){
        return 2 * PI * yariCap;
    }

    public static void main(String[] args) {
        Area a = new Area();
        System.out.println(a.daireCevreHesapla());
        a.makeNoise();
    }

    @Override
    void makeNoise() {
        System.out.println("I'm making weird noise!");
    }
}
