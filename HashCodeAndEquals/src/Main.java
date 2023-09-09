import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player
{
    private String name;
    private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID:"+this.id +" - "+ "Name:"+ this.name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Player)) return false;
        Player player = (Player) object;
        return id == player.id && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Set<Player> hashSet = new HashSet<Player>();

        Player player1= new Player("Jack",1);
        Player player2 = new Player("John",21);
        Player player3= new Player("Pep",12);
        Player player4 = new Player("Jack",1);

        hashSet.add(player1);
        hashSet.add(player2);
        hashSet.add(player3);
        hashSet.add(player4);

        for(Player p : hashSet)
        {
            System.out.println(p.toString());
        }
    }
}