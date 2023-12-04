public class Main {
    public static void main(String[] args)
    {
        Nokia nokia = new Nokia();
        nokia.price = 100;
        System.out.println("--------------");
        Samsung samsung = new Samsung();
        samsung.price = 150;
    }
}
class Phone{
    public int price;

    Phone()
    {
        System.out.println("Constructor of Phone");
    }
}

class SmartPhone extends Phone
{
    SmartPhone()
    {
        System.out.println("Constructor of SmartPhone");
    }
}

class CellPhone extends Phone
{
    CellPhone()
    {
        System.out.println("Constructor of CellPhone");
    }
}

class Samsung extends SmartPhone
{
    Samsung()
    {
        System.out.println("Constructor of Samsung");
    }
}

class Nokia extends CellPhone
{
    Nokia()
    {
        System.out.println("constructor of Nokia");
    }
}