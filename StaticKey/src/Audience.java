public class Audience
{
    private String name;
    private static int numberAudience = 0;
    public Audience(String name) {
        this.setName(name);
        numberAudience++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void WathTheGame()
    {
        System.out.println(getName() + "'s watching the game.");
    }

    public static int getNumberAudience()
    {
        return numberAudience;
    }
}
