interface MatematikSabitleri{
    double PI = 3.14;
}
public class Area implements MatematikSabitleri
{
    private double yariCap = 6.0;

    public double daireCevreHesapla(){
        return 2 * PI * yariCap;
    }

    public static void main(String[] args) {
        Area a = new Area();
        System.out.println(a.daireCevreHesapla());
    }
}
