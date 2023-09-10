import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
class Player implements Comparable<Player>
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
    public int compareTo(Player player) {
        if(this.id < player.id)
        {
            return -1;
        }
        else if(this.id > player.id)
        {
            return 1;
        }
        else {
            return 0;
        }
    }
}


public class Main
{
    public static void main(String[] args)
    {
        List<String>  listString = new ArrayList<String>();

        listString.add("java");
        listString.add("c++");
        listString.add("python");
        listString.add("php");
        listString.add("go");

        Collections.sort(listString);

        for(String s : listString)
        {
            System.out.println(s);
        }

        List<Player> listPlayer = new ArrayList<Player>();

        listPlayer.add(new Player("Murat",5));
        listPlayer.add(new Player("Kerem",1));
        listPlayer.add(new Player("Jacob",11));
        listPlayer.add(new Player("Luna",231));

        Player p1 = new Player("Murat" ,1);
        Player p2 = new Player("Yusuf",24);

        System.out.println(p1.compareTo(p2));

        Collections.sort(listPlayer);

        for(Player p : listPlayer)
        {
            System.out.println(p.toString());
        }
    }
}